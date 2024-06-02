package interfaces;

public interface GetSrcAttribute extends ExplicitWait {
    default String getSrcAttribute( String locator ) {
        return waitElement( locator ).getAttribute( "src" );
    }
}
