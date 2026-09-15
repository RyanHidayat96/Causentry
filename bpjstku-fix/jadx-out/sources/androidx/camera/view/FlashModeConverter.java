package androidx.camera.view;

/* JADX INFO: loaded from: classes5.dex */
final class FlashModeConverter {
    private FlashModeConverter() {
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    public static int valueOf(String str) {
        byte b;
        if (str == null) {
            throw new NullPointerException("name cannot be null");
        }
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != 2527) {
            if (iHashCode != 78159) {
                if (iHashCode == 2020783 && str.equals("AUTO")) {
                    b = 2;
                } else {
                    b = -1;
                }
            } else if (str.equals("OFF")) {
                b = 1;
            } else {
                b = -1;
            }
        } else if (str.equals("ON")) {
            b = 0;
        } else {
            b = -1;
        }
        if (b == 0) {
            return 1;
        }
        if (b == 1) {
            return 2;
        }
        if (b == 2) {
            return 0;
        }
        throw new IllegalArgumentException("Unknown flash mode name ".concat(String.valueOf(str)));
    }

    public static String nameOf(int i) {
        if (i == 0) {
            return "AUTO";
        }
        if (i == 1) {
            return "ON";
        }
        if (i == 2) {
            return "OFF";
        }
        throw new IllegalArgumentException("Unknown flash mode ".concat(String.valueOf(i)));
    }
}
