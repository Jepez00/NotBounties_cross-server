package me.jadenp.notbounties.utils.tasks;

import java.util.UUID;

public class SkinRequest extends CancelableTask {


    private int index = 0;
    private final UUID[] skinsToSend;

    public SkinRequest(UUID[] skinsToSend) {
        super();
        this.skinsToSend = skinsToSend;
    }

    @Override
    public void run() {
        if (index >= skinsToSend.length) {
            this.cancel();
            return;
        }
        // Proxy functionality removed
        index++;
        if (index >= skinsToSend.length) {
            this.cancel();
        }

    }
}
