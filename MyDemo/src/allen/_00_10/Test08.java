package allen._00_10;

class Annoyance extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;}


class Sneeze extends Annoyance {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;}


 
class Test08 {
 
    public static void main(String[] args) throws Exception {
        try {
            try {
                throw new Sneeze();
            } 
            catch ( Annoyance a ) {
                System.out.println("Caught Annoyance");
                throw a;
            }
        } 
        catch ( Sneeze s ) {
            System.out.println("Caught Sneeze");
            return ;
        }
        finally {
            System.out.println("Hello World!");
        }
    }
}
