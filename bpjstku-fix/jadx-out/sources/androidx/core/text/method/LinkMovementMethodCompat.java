package androidx.core.text.method;

import android.text.method.LinkMovementMethod;

/* JADX INFO: loaded from: classes6.dex */
public class LinkMovementMethodCompat extends LinkMovementMethod {
    private static LinkMovementMethodCompat sInstance;

    private LinkMovementMethodCompat() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (r0 <= r3.getLineRight(r1)) goto L17;
     */
    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.widget.TextView r7, android.text.Spannable r8, android.view.MotionEvent r9) {
        /*
            r6 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            if (r0 >= r1) goto L56
            int r0 = r9.getAction()
            r1 = 1
            if (r0 == r1) goto Lf
            if (r0 != 0) goto L56
        Lf:
            float r0 = r9.getX()
            int r0 = (int) r0
            float r1 = r9.getY()
            int r1 = (int) r1
            int r2 = r7.getTotalPaddingLeft()
            int r3 = r7.getTotalPaddingTop()
            int r4 = r7.getScrollX()
            int r1 = r1 - r3
            int r3 = r7.getScrollY()
            int r1 = r1 + r3
            android.text.Layout r3 = r7.getLayout()
            if (r1 < 0) goto L4e
            int r5 = r3.getHeight()
            if (r1 > r5) goto L4e
            int r1 = r3.getLineForVertical(r1)
            int r0 = r0 - r2
            int r0 = r0 + r4
            float r0 = (float) r0
            float r2 = r3.getLineLeft(r1)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L4e
            float r1 = r3.getLineRight(r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L56
        L4e:
            android.text.Selection.removeSelection(r8)
            boolean r7 = android.text.method.Touch.onTouchEvent(r7, r8, r9)
            return r7
        L56:
            boolean r7 = super.onTouchEvent(r7, r8, r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.text.method.LinkMovementMethodCompat.onTouchEvent(android.widget.TextView, android.text.Spannable, android.view.MotionEvent):boolean");
    }

    public static LinkMovementMethodCompat getInstance() {
        if (sInstance == null) {
            sInstance = new LinkMovementMethodCompat();
        }
        return sInstance;
    }
}
