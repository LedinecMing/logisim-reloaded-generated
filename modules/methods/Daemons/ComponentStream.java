package modules.methods.Daemons;
public class ComponentStream extends Thread{
    public ComponentStream(){
        setDaemon(true);
        start();
    }
    @Override
    public void run(){}
}