package com.causentry.zygote;

/** Entry point invoked by ZygoteLoader in system_server only. */
public final class ZygoteEntry {
    private ZygoteEntry() {}

    public static void premain() {
        // Required by ZygoteLoader. Work begins after system_server is available.
    }

    public static void main() {
        SystemServerBackend.start();
    }
}
