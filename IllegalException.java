
public class IllegalException extends Exception{
	private String errormsg;
    IllegalException(String errormsg){
        this.errormsg=errormsg;
    }

    public String getErrormsg() {
        return errormsg;
    }

    public void setErrormsg(String errormsg) {
        this.errormsg = errormsg;
    
}
	
	
	
	
}
