package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"LgetRepeatMode;", "", "<init>", "()V", "Landroid/graphics/drawable/Drawable;", "p0", "Landroid/graphics/Bitmap$Config;", "p1", "LonQueueTitleChanged;", "p2", "Lcoil/size/Scale;", "p3", "", "p4", "Landroid/graphics/Bitmap;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap$Config;LonQueueTitleChanged;Lcoil/size/Scale;Z)Landroid/graphics/Bitmap;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getRepeatMode {
    public static final getRepeatMode INSTANCE = new getRepeatMode();

    private getRepeatMode() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        if (defpackage.MediaBrowserCompatApi23.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r9, r1, r2, r3, r8) == 1.0d) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap TuitionPaymentFragmentspecialinlinedviewModeldefault3(android.graphics.drawable.Drawable r5, android.graphics.Bitmap.Config r6, defpackage.onQueueTitleChanged r7, coil.size.Scale r8, boolean r9) {
        /*
            boolean r0 = r5 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L59
            r0 = r5
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            android.graphics.Bitmap$Config r1 = r0.getConfig()
            if (r6 == 0) goto L19
            boolean r2 = defpackage.fastForward.TuitionPaymentFragmentspecialinlinedviewModeldefault3(r6)
            if (r2 != 0) goto L19
            r2 = r6
            goto L1b
        L19:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
        L1b:
            if (r1 != r2) goto L59
            if (r9 == 0) goto L20
            goto L58
        L20:
            int r9 = r0.getWidth()
            int r1 = r0.getHeight()
            boolean r2 = defpackage.onExtrasChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault1(r7)
            if (r2 == 0) goto L33
            int r2 = r0.getWidth()
            goto L3b
        L33:
            onEvent r2 = r7.getTuitionPaymentFragmentspecialinlinedviewModeldefault1()
            int r2 = defpackage.getRatingType.TuitionPaymentFragmentspecialinlinedviewModeldefault3(r2, r8)
        L3b:
            boolean r3 = defpackage.onExtrasChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault1(r7)
            if (r3 == 0) goto L46
            int r3 = r0.getHeight()
            goto L4e
        L46:
            onEvent r3 = r7.getTuitionPaymentFragmentspecialinlinedviewModeldefault3()
            int r3 = defpackage.getRatingType.TuitionPaymentFragmentspecialinlinedviewModeldefault3(r3, r8)
        L4e:
            double r1 = defpackage.MediaBrowserCompatApi23.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r9, r1, r2, r3, r8)
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r9 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r9 != 0) goto L59
        L58:
            return r0
        L59:
            android.graphics.drawable.Drawable r5 = r5.mutate()
            int r9 = defpackage.getRatingType.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r5)
            r0 = 512(0x200, float:7.17E-43)
            if (r9 > 0) goto L66
            r9 = r0
        L66:
            int r1 = defpackage.getRatingType.TuitionPaymentFragmentbindingInflater1(r5)
            if (r1 <= 0) goto L6d
            r0 = r1
        L6d:
            boolean r1 = defpackage.onExtrasChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault1(r7)
            if (r1 == 0) goto L75
            r1 = r9
            goto L7d
        L75:
            onEvent r1 = r7.getTuitionPaymentFragmentspecialinlinedviewModeldefault1()
            int r1 = defpackage.getRatingType.TuitionPaymentFragmentspecialinlinedviewModeldefault3(r1, r8)
        L7d:
            boolean r2 = defpackage.onExtrasChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault1(r7)
            if (r2 == 0) goto L85
            r7 = r0
            goto L8d
        L85:
            onEvent r7 = r7.getTuitionPaymentFragmentspecialinlinedviewModeldefault3()
            int r7 = defpackage.getRatingType.TuitionPaymentFragmentspecialinlinedviewModeldefault3(r7, r8)
        L8d:
            double r7 = defpackage.MediaBrowserCompatApi23.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r9, r0, r1, r7, r8)
            double r1 = (double) r9
            double r1 = r1 * r7
            int r9 = kotlin.math.MathKt.roundToInt(r1)
            double r0 = (double) r0
            double r7 = r7 * r0
            int r7 = kotlin.math.MathKt.roundToInt(r7)
            if (r6 == 0) goto La6
            boolean r8 = defpackage.fastForward.TuitionPaymentFragmentspecialinlinedviewModeldefault3(r6)
            if (r8 != 0) goto La6
            goto La8
        La6:
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888
        La8:
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r9, r7, r6)
            android.graphics.Rect r8 = r5.getBounds()
            int r0 = r8.left
            int r1 = r8.top
            int r2 = r8.right
            int r8 = r8.bottom
            r3 = 0
            r5.setBounds(r3, r3, r9, r7)
            android.graphics.Canvas r7 = new android.graphics.Canvas
            r7.<init>(r6)
            r5.draw(r7)
            r5.setBounds(r0, r1, r2, r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getRepeatMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, onQueueTitleChanged, coil.size.Scale, boolean):android.graphics.Bitmap");
    }
}
