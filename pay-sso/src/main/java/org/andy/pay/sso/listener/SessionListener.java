package org.andy.pay.sso.listener;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.SessionListenerAdapter;
import org.springframework.stereotype.Component;

/**
 * 创建用户时出现的问题
 * Created by andy on 16-12-2.
 */
@Component("sessionListener")
public class SessionListener extends SessionListenerAdapter {

    @Override
    public void onStart(Session session) {
        super.onStart(session);
        System.out.println("session onstart!");
    }

    @Override
    public void onStop(Session session) {
        super.onStop(session);
        System.out.println("session onStop!");
    }

    @Override
    public void onExpiration(Session session) {
        super.onExpiration(session);
        System.out.println("session onExpiration!");
    }
}
