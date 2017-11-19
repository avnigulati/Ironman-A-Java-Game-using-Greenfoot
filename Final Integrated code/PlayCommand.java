
/**
 * Write a description of class PlayCommand here.
 * 
 * @author Rucha Apte
 * @version (a version number or a date)
 */

public class PlayCommand implements ButtonCommand
{
    Receiver playReceiver;
    
    public void setReceiver(Receiver newRec)
    {
        this.playReceiver = newRec;
        
    }
    public void executeCommand()
    {
        playReceiver.performAction();
        
    }
}