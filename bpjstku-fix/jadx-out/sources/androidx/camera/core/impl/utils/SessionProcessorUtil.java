package androidx.camera.core.impl.utils;

import androidx.camera.core.impl.SessionProcessor;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class SessionProcessorUtil {
    private SessionProcessorUtil() {
    }

    public static boolean isOperationSupported(SessionProcessor sessionProcessor, int... iArr) {
        if (sessionProcessor == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return sessionProcessor.getSupportedCameraOperations().containsAll(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (r3 == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.camera.core.FocusMeteringAction getModifiedFocusMeteringAction(androidx.camera.core.impl.SessionProcessor r5, androidx.camera.core.FocusMeteringAction r6) {
        /*
            if (r5 == 0) goto L82
            androidx.camera.core.FocusMeteringAction$Builder r0 = new androidx.camera.core.FocusMeteringAction$Builder
            r0.<init>(r6)
            java.util.List r1 = r6.getMeteringPointsAf()
            boolean r1 = r1.isEmpty()
            r2 = 2
            r3 = 1
            if (r1 != 0) goto L22
            int[] r1 = new int[]{r3, r2}
            boolean r1 = isOperationSupported(r5, r1)
            if (r1 != 0) goto L22
            r0.removePoints(r3)
            r1 = r3
            goto L23
        L22:
            r1 = 0
        L23:
            java.util.List r4 = r6.getMeteringPointsAe()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L3c
            r4 = 3
            int[] r4 = new int[]{r4}
            boolean r4 = isOperationSupported(r5, r4)
            if (r4 != 0) goto L3c
            r0.removePoints(r2)
            goto L3d
        L3c:
            r3 = r1
        L3d:
            java.util.List r1 = r6.getMeteringPointsAwb()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L56
            r1 = 4
            int[] r2 = new int[]{r1}
            boolean r5 = isOperationSupported(r5, r2)
            if (r5 != 0) goto L56
            r0.removePoints(r1)
            goto L59
        L56:
            if (r3 != 0) goto L59
            goto L82
        L59:
            androidx.camera.core.FocusMeteringAction r5 = r0.build()
            java.util.List r6 = r5.getMeteringPointsAf()
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L7d
            java.util.List r6 = r5.getMeteringPointsAe()
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L7d
            java.util.List r5 = r5.getMeteringPointsAwb()
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L7d
            r5 = 0
            return r5
        L7d:
            androidx.camera.core.FocusMeteringAction r5 = r0.build()
            return r5
        L82:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.SessionProcessorUtil.getModifiedFocusMeteringAction(androidx.camera.core.impl.SessionProcessor, androidx.camera.core.FocusMeteringAction):androidx.camera.core.FocusMeteringAction");
    }
}
