package hibernate.bookstore.book.store.hiber;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
   
    {
    	Book book1 = new Book();
    	book1.setBookId(101);
    	book1.setBookName("Wings of Fire");
    	Book book2 = new Book();
    	book2.setBookId(102);
    	book2.setBookName("Geethanjali");
    	
    	
    	
    	Author author1=new Author();
    	author1.setAuthorId(1);
    	author1.setAuthorName("APJ Abdul Kalam");
    	Author author2 = new Author();
    	author2.setAuthorId(2);
    	author2.setAuthorName("Rabindranath Tagore");
    	
    	List<Book> list = Arrays.asList(book1,book2);
    	
    	User user1 = new User();
    	user1.setUserId(111);
    	user1.setUserName("Akhila");
    	User user2 = new User();
    	user2.setUserId(222);
    	user2.setUserName("Akhil");
    	
    	//user1.setBooks(list);
    	author1.setBook(book1);
//    	book1.getUsers().add(user1);//ManyToMany
    	//book1.setUser(users);
    	
    	List<User> users= new ArrayList();
        users.add(user1);//OneToMany
        
        book1.setUs(users);//ManyToOne
    	
    	
    	
    	
Configuration config = new Configuration().configure().addAnnotatedClass(Book.class).addAnnotatedClass(User.class).addAnnotatedClass(Author.class);
    	
    	
    	
    	 SessionFactory factory = config.buildSessionFactory();
    	
    	Session session = factory.openSession();
    	Transaction tx = session.beginTransaction();
    	
    	 session.save(book1);
    	 session.save(user1);
    	 session.save(author1);
    	 session.save(book2);
    	 session.save(author2);
    	 session.save(user2);
    	tx.commit();
//    	 session.getTransaction().commit();
    	//System.out.println(book1);
    }
}
