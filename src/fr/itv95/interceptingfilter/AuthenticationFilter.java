package fr.itv95.interceptingfilter;

/**
 * Created by Luc on 17/10/2016.
 */
public class AuthenticationFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("Authenticating request: "+request);
    }
}
