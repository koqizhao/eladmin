package org.mydotey.artemis.admin;

import org.springframework.context.SmartLifecycle;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.Ordered;

@ComponentScan("org.mydotey.artemis.admin")
public class AdminAutoConfiguration implements SmartLifecycle, Ordered {

    private volatile boolean running;

    private int order = 1;

    @Override
    public void start() {

    }

    @Override
    public void stop() {
        this.running = false;
    }

    @Override
    public boolean isRunning() {
        return this.running;
    }

    @Override
    public int getPhase() {
        return 0;
    }

    @Override
    public boolean isAutoStartup() {
        return true;
    }

    @Override
    public int getOrder() {
        return this.order;
    }

}
