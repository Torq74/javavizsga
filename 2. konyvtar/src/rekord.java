import org.w3c.dom.ranges.RangeException;

public abstract class rekord {
    private String ISBN;

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) throws RangeException {

        if (ISBN.length() !=10 && ISBN.length()!=13){
            System.out.println(ISBN.length());
            throw new RangeException((short)1,"Az ISBN értéke 10 vagy 13 hosszú számsor lehet csak!");
           // System.out.println("Az ISBN értéke 10 vagy 13 hosszú számsor lehet csak");
        }

            this.ISBN = ISBN;

    }
}
