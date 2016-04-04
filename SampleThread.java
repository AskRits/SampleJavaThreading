import java.util.ArrayList;
import java.lang.Thread;
import java.util.concurrent.*;

/**
 * Created by Ritesh on 4/4/2016.
 */
public class SampleThread {
    public static void main(String args[]){
        SampleThread st = new SampleThread();
        st.runThreads();
    }

    public void runThreads(){

        Runnable rt = () -> {  System.out.println(Thread.currentThread().getName()); };
        ArrayList<Thread> thrds = new ArrayList<Thread>() {{
            add(new Thread(rt));
            add(new Thread(rt));
            add(new Thread(rt));
            add(new Thread(rt));
            add(new Thread(rt));
            add(new Thread(rt));
        }};
        thrds.forEach(t -> {
            try {
                t.start();
            }catch(Exception ex){
                System.out.println("Exception:"+ex);
            }
        });
    }



}
