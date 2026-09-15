package defpackage;

import android.hardware.Camera;
import com.journeyapps.barcodescanner.camera.CameraSettings;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class Identifier {
    static {
        Pattern.compile(";");
    }

    public static void b(Camera.Parameters parameters, CameraSettings.FocusMode focusMode, boolean z) {
        String strB;
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (z || focusMode == CameraSettings.FocusMode.AUTO) {
            strB = b("focus mode", supportedFocusModes, "auto");
        } else if (focusMode == CameraSettings.FocusMode.CONTINUOUS) {
            strB = b("focus mode", supportedFocusModes, "continuous-picture", "continuous-video", "auto");
        } else if (focusMode == CameraSettings.FocusMode.INFINITY) {
            strB = b("focus mode", supportedFocusModes, "infinity");
        } else {
            strB = focusMode == CameraSettings.FocusMode.MACRO ? b("focus mode", supportedFocusModes, "macro") : null;
        }
        if (!z && strB == null) {
            strB = b("focus mode", supportedFocusModes, "macro", "edof");
        }
        if (strB == null || strB.equals(parameters.getFocusMode())) {
            return;
        }
        parameters.setFocusMode(strB);
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Camera.Parameters parameters, boolean z) {
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        String strB = z ? b("flash mode", supportedFlashModes, "torch", "on") : b("flash mode", supportedFlashModes, "off");
        if (strB == null || strB.equals(parameters.getFlashMode())) {
            return;
        }
        parameters.setFlashMode(strB);
    }

    private static String b(String str, Collection<String> collection, String... strArr) {
        Arrays.toString(strArr);
        Objects.toString(collection);
        if (collection == null) {
            return null;
        }
        for (String str2 : strArr) {
            if (collection.contains(str2)) {
                return str2;
            }
        }
        return null;
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Camera.Parameters parameters) {
        int[] next;
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        if (supportedPreviewFpsRange != null && !supportedPreviewFpsRange.isEmpty()) {
            StringBuilder sb = new StringBuilder("[");
            Iterator<int[]> it = supportedPreviewFpsRange.iterator();
            while (it.hasNext()) {
                sb.append(Arrays.toString(it.next()));
                if (it.hasNext()) {
                    sb.append(", ");
                }
            }
            sb.append(']');
            sb.toString();
        }
        if (supportedPreviewFpsRange == null || supportedPreviewFpsRange.isEmpty()) {
            return;
        }
        Iterator<int[]> it2 = supportedPreviewFpsRange.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            int i = next[0];
            int i2 = next[1];
            if (i >= 10000 && i2 <= 20000) {
                break;
            }
        }
        if (next != null) {
            int[] iArr = new int[2];
            parameters.getPreviewFpsRange(iArr);
            if (Arrays.equals(iArr, next)) {
                Arrays.toString(next);
            } else {
                Arrays.toString(next);
                parameters.setPreviewFpsRange(next[0], next[1]);
            }
        }
    }
}
