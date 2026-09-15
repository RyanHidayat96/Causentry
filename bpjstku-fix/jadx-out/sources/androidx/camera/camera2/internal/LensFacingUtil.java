package androidx.camera.camera2.internal;

/* JADX INFO: loaded from: classes5.dex */
public class LensFacingUtil {
    private LensFacingUtil() {
    }

    public static int getCameraSelectorLensFacing(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        StringBuilder sb = new StringBuilder("The given lens facing integer: ");
        sb.append(i);
        sb.append(" can not be recognized.");
        throw new IllegalArgumentException(sb.toString());
    }

    public static int getLensFacingInt(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        StringBuilder sb = new StringBuilder("The given lens facing: ");
        sb.append(i);
        sb.append(" can not be recognized.");
        throw new IllegalArgumentException(sb.toString());
    }
}
