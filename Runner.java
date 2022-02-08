import org.w3c.dom.Text;

// import Review; 
public class Runner {
  public static void main(String[] args){
    System.out.println(Review.starRating("jamesLove.txt"));

    double num = Review.sentimentVal("warm");

    // System.out.println(Review.totalSentiment("SimpleReview.txt"));
  }
}
