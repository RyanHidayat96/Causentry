package defpackage;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.firebase.sessions.dagger.internal.Providers;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public class lambdaonInputSurface2androidxcameracoreprocessingDefaultSurfaceProcessor extends failAllPendingSnapshots {
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char[] b;
    private SocketChannel TuitionPaymentFragmentbindingInflater1;
    private static final byte[] $$c = {91, -17, 90, 37};
    private static final int $$d = 168;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {93, -122, -23, -24};
    private static final int $$b = 36;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            int r7 = r7 * 3
            int r0 = r7 + 1
            int r6 = r6 + 97
            byte[] r1 = defpackage.lambdaonInputSurface2androidxcameracoreprocessingDefaultSurfaceProcessor.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2c
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L21:
            int r8 = r8 + 1
            r4 = r1[r8]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lambdaonInputSurface2androidxcameracoreprocessingDefaultSurfaceProcessor.c(int, byte, int, java.lang.Object[]):void");
    }

    public lambdaonInputSurface2androidxcameracoreprocessingDefaultSurfaceProcessor(SocketChannel socketChannel) throws IOException {
        super(socketChannel);
        this.TuitionPaymentFragmentbindingInflater1 = socketChannel;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.TuitionPaymentFragmentbindingInflater1.read(byteBuffer);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    @Override // defpackage.failAllPendingSnapshots
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        boolean zIsConnected;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            zIsConnected = this.TuitionPaymentFragmentbindingInflater1.isConnected();
            int i3 = 35 / 0;
        } else {
            zIsConnected = this.TuitionPaymentFragmentbindingInflater1.isConnected();
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return zIsConnected;
    }

    @Override // defpackage.failAllPendingSnapshots
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault2(ByteBuffer[] byteBufferArr) throws IOException {
        int iWrite;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            iWrite = (int) this.TuitionPaymentFragmentbindingInflater1.write(byteBufferArr);
            int i3 = 68 / 0;
        } else {
            iWrite = (int) this.TuitionPaymentFragmentbindingInflater1.write(byteBufferArr);
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            return iWrite;
        }
        throw null;
    }

    @Override // defpackage.failAllPendingSnapshots
    public final void b() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.TuitionPaymentFragmentbindingInflater1.socket().shutdownOutput();
                return;
            }
            this.TuitionPaymentFragmentbindingInflater1.socket().shutdownOutput();
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Exception unused) {
        }
    }

    @Override // java.nio.channels.ScatteringByteChannel
    public long read(ByteBuffer[] byteBufferArr) throws IOException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            this.TuitionPaymentFragmentbindingInflater1.read(byteBufferArr);
            throw null;
        }
        long j = this.TuitionPaymentFragmentbindingInflater1.read(byteBufferArr);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        return j;
    }

    @Override // java.nio.channels.ScatteringByteChannel
    public long read(ByteBuffer[] byteBufferArr, int i, int i2) throws IOException {
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        long j = this.TuitionPaymentFragmentbindingInflater1.read(byteBufferArr, i, i2);
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        int i7 = i6 % 2;
        return j;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i4 = $10 + 53;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(b[i + i6])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), ((byte) KeyEvent.getModifierMetaStateMask()) + 2188, 40 - TextUtils.getTrimmedLength(""), 841711447, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33017 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 3011 - View.getDefaultSize(0, 0), 26 - TextUtils.getOffsetBefore("", 0), 321985076, false, $$e(b4, b5, (byte) (b5 + 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36506 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 3376 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 17 - TextUtils.getOffsetAfter("", 0), -968507904, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i7 = $11 + 125;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                try {
                    Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (36505 - (ViewConfiguration.getFadingEdgeLength() >> 16)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3375, 18 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -968507904, false, $$e(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    throw null;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr6 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                byte b10 = (byte) 0;
                byte b11 = b10;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 36504), 3377 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 17 - Color.red(0), -968507904, false, $$e(b10, b11, (byte) (b11 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0d1a  */
    /* JADX WARN: Code duplicated, block: B:143:0x0e63  */
    /* JADX WARN: Code duplicated, block: B:202:0x11d2  */
    /* JADX WARN: Code duplicated, block: B:204:0x11e6  */
    /* JADX WARN: Code duplicated, block: B:207:0x11ec  */
    /* JADX WARN: Code duplicated, block: B:208:0x11ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:211:0x11f5 A[Catch: all -> 0x1290, IOException -> 0x129c, TryCatch #31 {IOException -> 0x129c, all -> 0x1290, blocks: (B:191:0x11b3, B:192:0x11b6, B:196:0x11c9, B:205:0x11e9, B:209:0x11ef, B:211:0x11f5, B:214:0x1209, B:218:0x124e), top: B:606:0x11b3 }] */
    /* JADX WARN: Code duplicated, block: B:213:0x1207 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:214:0x1209 A[Catch: all -> 0x1290, IOException -> 0x129c, TryCatch #31 {IOException -> 0x129c, all -> 0x1290, blocks: (B:191:0x11b3, B:192:0x11b6, B:196:0x11c9, B:205:0x11e9, B:209:0x11ef, B:211:0x11f5, B:214:0x1209, B:218:0x124e), top: B:606:0x11b3 }] */
    /* JADX WARN: Code duplicated, block: B:216:0x124b  */
    /* JADX WARN: Code duplicated, block: B:218:0x124e A[Catch: all -> 0x1290, IOException -> 0x129c, TRY_LEAVE, TryCatch #31 {IOException -> 0x129c, all -> 0x1290, blocks: (B:191:0x11b3, B:192:0x11b6, B:196:0x11c9, B:205:0x11e9, B:209:0x11ef, B:211:0x11f5, B:214:0x1209, B:218:0x124e), top: B:606:0x11b3 }] */
    /* JADX WARN: Code duplicated, block: B:221:0x125e A[LOOP:18: B:217:0x124c->B:221:0x125e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:232:0x1288  */
    /* JADX WARN: Code duplicated, block: B:281:0x13a7  */
    /* JADX WARN: Code duplicated, block: B:359:0x1a9f  */
    /* JADX WARN: Code duplicated, block: B:362:0x2686  */
    /* JADX WARN: Code duplicated, block: B:365:0x2697 A[Catch: all -> 0x0270, TryCatch #13 {all -> 0x0270, blocks: (B:6:0x0177, B:8:0x0184, B:9:0x01bc, B:24:0x0326, B:26:0x0333, B:27:0x0374, B:34:0x047b, B:36:0x0489, B:37:0x04c9, B:62:0x0705, B:64:0x070b, B:65:0x074c, B:67:0x0859, B:69:0x0866, B:71:0x08b0, B:76:0x0ab8, B:78:0x0ac5, B:79:0x0b05, B:88:0x0c19, B:90:0x0c26, B:91:0x0c66, B:92:0x0c6d, B:156:0x0eb8, B:158:0x0ec5, B:159:0x0f07, B:169:0x106c, B:171:0x1079, B:172:0x10b2, B:176:0x10c1, B:178:0x10ce, B:179:0x1111, B:299:0x1463, B:301:0x1470, B:302:0x14ad, B:318:0x15e5, B:320:0x15f2, B:321:0x1634, B:328:0x16fe, B:330:0x1704, B:331:0x173d, B:334:0x17d3, B:336:0x17e5, B:337:0x1827, B:347:0x1941, B:349:0x194e, B:350:0x1990, B:352:0x1999, B:354:0x19b1, B:355:0x19f5, B:397:0x289e, B:399:0x28ab, B:400:0x28ea, B:417:0x2daf, B:419:0x2dbc, B:421:0x2dff, B:427:0x2ebb, B:429:0x2ec8, B:430:0x2efc, B:528:0x36bf, B:530:0x36cc, B:531:0x36fe, B:403:0x28f6, B:405:0x290e, B:406:0x2952, B:363:0x268a, B:365:0x2697, B:367:0x26eb, B:95:0x0c87, B:97:0x0c94, B:98:0x0cd9, B:42:0x05c8, B:44:0x05d2, B:46:0x061c, B:52:0x0678, B:54:0x0685, B:55:0x06c8), top: B:568:0x0177 }] */
    /* JADX WARN: Code duplicated, block: B:366:0x26e3  */
    /* JADX WARN: Code duplicated, block: B:389:0x27ed  */
    /* JADX WARN: Code duplicated, block: B:393:0x2830  */
    /* JADX WARN: Code duplicated, block: B:394:0x2845  */
    /* JADX WARN: Code duplicated, block: B:51:0x0644  */
    /* JADX WARN: Code duplicated, block: B:54:0x0685 A[Catch: all -> 0x0270, TryCatch #13 {all -> 0x0270, blocks: (B:6:0x0177, B:8:0x0184, B:9:0x01bc, B:24:0x0326, B:26:0x0333, B:27:0x0374, B:34:0x047b, B:36:0x0489, B:37:0x04c9, B:62:0x0705, B:64:0x070b, B:65:0x074c, B:67:0x0859, B:69:0x0866, B:71:0x08b0, B:76:0x0ab8, B:78:0x0ac5, B:79:0x0b05, B:88:0x0c19, B:90:0x0c26, B:91:0x0c66, B:92:0x0c6d, B:156:0x0eb8, B:158:0x0ec5, B:159:0x0f07, B:169:0x106c, B:171:0x1079, B:172:0x10b2, B:176:0x10c1, B:178:0x10ce, B:179:0x1111, B:299:0x1463, B:301:0x1470, B:302:0x14ad, B:318:0x15e5, B:320:0x15f2, B:321:0x1634, B:328:0x16fe, B:330:0x1704, B:331:0x173d, B:334:0x17d3, B:336:0x17e5, B:337:0x1827, B:347:0x1941, B:349:0x194e, B:350:0x1990, B:352:0x1999, B:354:0x19b1, B:355:0x19f5, B:397:0x289e, B:399:0x28ab, B:400:0x28ea, B:417:0x2daf, B:419:0x2dbc, B:421:0x2dff, B:427:0x2ebb, B:429:0x2ec8, B:430:0x2efc, B:528:0x36bf, B:530:0x36cc, B:531:0x36fe, B:403:0x28f6, B:405:0x290e, B:406:0x2952, B:363:0x268a, B:365:0x2697, B:367:0x26eb, B:95:0x0c87, B:97:0x0c94, B:98:0x0cd9, B:42:0x05c8, B:44:0x05d2, B:46:0x061c, B:52:0x0678, B:54:0x0685, B:55:0x06c8), top: B:568:0x0177 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x06d3  */
    /* JADX WARN: Code duplicated, block: B:592:0x341d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:60:0x06ee  */
    /* JADX WARN: Code duplicated, block: B:636:0x3420 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:654:0x1276 A[EDGE_INSN: B:654:0x1276->B:226:0x1276 BREAK  A[LOOP:16: B:201:0x11d0->B:225:0x126e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:655:0x1276 A[EDGE_INSN: B:655:0x1276->B:226:0x1276 BREAK  A[LOOP:16: B:201:0x11d0->B:225:0x126e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:659:0x1263 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:660:0x1261 A[SYNTHETIC] */
    public static Object[] TuitionPaymentFragmentbindingInflater1(Context context, int i, int i2, int i3) throws Throwable {
        String str;
        int i4;
        int i5;
        int i6;
        char c;
        int modifierMetaStateMask;
        int iLastIndexOf;
        int i7;
        int i8;
        int i9;
        String str2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str3;
        int i10;
        int i11;
        int i12;
        String str4;
        int i13;
        Object objInvoke;
        int i14;
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2;
        int i15;
        int i16;
        int i17;
        int i18;
        BufferedInputStream bufferedInputStream3;
        BufferedInputStream bufferedInputStream4;
        BufferedInputStream bufferedInputStream5;
        BufferedInputStream bufferedInputStream6;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        byte[] bArr;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        String[] strArr;
        Object obj;
        int i30;
        long j;
        long j2;
        String[][] strArr2;
        StringBuilder sb;
        int i31;
        int i32;
        int i33;
        int i34;
        long j3;
        int i35;
        Object[] objArr;
        String[] strArr3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        String str5;
        int i36;
        boolean z;
        int i37;
        String str6;
        int i38;
        String str7;
        int i39;
        String[][] strArr4;
        BufferedInputStream bufferedInputStream7;
        String[] strArr5;
        String str8;
        int i40;
        int i41;
        BufferedInputStream bufferedInputStream8;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46 = i;
        int i47 = 2 % 2;
        String str9 = "";
        char c2 = '0';
        int iIndexOf = 907 - TextUtils.indexOf((CharSequence) "", '0');
        int i48 = 0;
        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0);
        int iTuitionPaymentFragmentbindingInflater1 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
        int i49 = (absoluteGravity * (-167)) - 1336;
        int i50 = ~absoluteGravity;
        int i51 = ~((i50 ^ (-9)) | (i50 & (-9)));
        int i52 = ~iTuitionPaymentFragmentbindingInflater1;
        int i53 = ~((i52 & (-9)) | ((-9) ^ i52));
        int i54 = -(-(((i51 & i53) | (i51 ^ i53)) * 168));
        int i55 = i49 ^ i54;
        int i56 = i49 & i54;
        int i57 = 1;
        int i58 = i55 + (i56 << 1);
        int i59 = (i50 ^ (-9)) | (i50 & (-9));
        int i60 = (~((i59 & iTuitionPaymentFragmentbindingInflater1) | (i59 ^ iTuitionPaymentFragmentbindingInflater1))) * 168;
        int i61 = (i58 ^ i60) + ((i60 & i58) << 1);
        int i62 = ~iTuitionPaymentFragmentbindingInflater1;
        int i63 = ~((i62 & i50) | (i50 ^ i62));
        int i64 = ~absoluteGravity;
        int i65 = ~((i64 & 8) | (i64 ^ 8));
        int i66 = (i63 & i65) | (i63 ^ i65);
        int i67 = (absoluteGravity & (-9)) | ((-9) ^ absoluteGravity);
        int i68 = ~((i67 & iTuitionPaymentFragmentbindingInflater1) | (i67 ^ iTuitionPaymentFragmentbindingInflater1));
        int i69 = -(-(((i68 & i66) | (i66 ^ i68)) * 168));
        int i70 = (i61 & i69) + (i69 | i61);
        int i71 = -TextUtils.indexOf("", "", 0);
        Object[] objArr2 = new Object[1];
        a(iIndexOf, i70, (char) ((i71 ^ 27819) + ((i71 & 27819) << 1)), objArr2);
        String str10 = (String) objArr2[0];
        new ArrayList();
        int doubleTapTimeout = ViewConfiguration.getDoubleTapTimeout() >> 16;
        int i72 = -(-Color.green(0));
        Object[] objArr3 = new Object[1];
        a(doubleTapTimeout, (i72 & 27) + (i72 | 27), (char) (ViewConfiguration.getTouchSlop() >> 8), objArr3);
        String str11 = (String) objArr3[0];
        int i73 = -View.MeasureSpec.getMode(0);
        int i74 = (i73 ^ 27) + ((i73 & 27) << 1);
        int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0);
        int i75 = ~iLastIndexOf2;
        int i76 = ~(i75 | (-27));
        int i77 = ~i46;
        int i78 = ~(((-27) ^ i77) | ((-27) & i77));
        int i79 = (((((iLastIndexOf2 * (-167)) - 4342) - (~(-(-(((i76 ^ i78) | (i78 & i76)) * 168))))) - 1) - (~(-(-((~(((i75 ^ (-27)) | (i75 & (-27))) | i46)) * 168))))) - 1;
        int i80 = ~iLastIndexOf2;
        int i81 = ~i46;
        int i82 = ~(i80 | i81);
        int i83 = ~((i75 ^ 26) | (i75 & 26));
        int i84 = (i82 ^ i83) | (i82 & i83);
        int i85 = ((-27) & iLastIndexOf2) | ((-27) ^ iLastIndexOf2);
        int i86 = ~((i85 & i46) | (i85 ^ i46));
        int i87 = ((i86 & i84) | (i84 ^ i86)) * 168;
        Object[] objArr4 = new Object[1];
        a(i74, (i79 ^ i87) + ((i87 & i79) << 1), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr4);
        String str12 = (String) objArr4[0];
        Object[] objArr5 = new Object[1];
        a(51 - (~(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 17 - (~(-TextUtils.getOffsetBefore("", 0))), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), objArr5);
        String str13 = (String) objArr5[0];
        Object[] objArr6 = new Object[1];
        a(69 - (~(ViewConfiguration.getJumpTapTimeout() >> 16)), 26 - (~(-(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))))), (char) (16657 - (~(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))))), objArr6);
        String[] strArr6 = {str11, str12, str13, (String) objArr6[0]};
        int i88 = 0;
        while (true) {
            if (i88 >= 4) {
                str = str9;
                i4 = i81;
                i5 = i46;
                break;
            }
            try {
                Object[] objArr7 = {strArr6[i88]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cGreen = (char) Color.green(i48);
                    int i89 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 992;
                    int iIndexOf2 = TextUtils.indexOf(str9, c2, i48, i48) + 9;
                    byte b2 = (byte) i48;
                    byte b3 = b2;
                    Object[] objArr8 = new Object[i57];
                    c(b2, b3, (byte) (b3 - 1), objArr8);
                    String str14 = (String) objArr8[i48];
                    Class[] clsArr = new Class[i57];
                    clsArr[i48] = String.class;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cGreen, i89, iIndexOf2, 349342683, false, str14, clsArr);
                }
                long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr7)).longValue();
                long j4 = 959766271;
                int i90 = i88;
                i4 = i81;
                long j5 = -502;
                String[] strArr7 = strArr6;
                str = str9;
                long j6 = -1;
                long j7 = jLongValue ^ j6;
                long jElapsedRealtime = (int) SystemClock.elapsedRealtime();
                long j8 = (((long) (-501)) * j4) + (((long) TypedValues.PositionType.TYPE_PERCENT_WIDTH) * jLongValue) + ((((j7 | jElapsedRealtime) ^ j6) | ((jLongValue | j4) ^ j6)) * j5) + (j5 * (((j7 | (jElapsedRealtime ^ j6)) | j4) ^ j6)) + (((long) TypedValues.PositionType.TYPE_DRAWPATH) * (j7 | (j6 ^ (jElapsedRealtime | (j4 ^ j6))))) + ((long) (-1806844876));
                int i91 = (-1038145356) + (((~(22718681 | i77)) | (-1465843422)) * (-245));
                int i92 = ~(22718681 | i46);
                int i93 = ((int) (j8 >> 32)) & (i91 + (i92 * (-245)) + ((i92 | 1459945092) * 245));
                int i94 = ((int) j8) & (514232564 + (((~((-772534414) | i77)) | 2085206472) * (-235)) + (((~((-772534414) | i46)) | 2085206472) * (-470)) + (((~((-33701894) | i46)) | 1346373952) * 235));
                if (((i93 & i94) | (i93 ^ i94)) != 0) {
                    i5 = i46 ^ ((i90 ^ 190) + ((i90 & 190) << 1));
                    break;
                }
                i88 = i90 + 1;
                i81 = i4;
                strArr6 = strArr7;
                str9 = str;
                c2 = '0';
                i48 = 0;
                i57 = 1;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i95 = 3;
        String[] strArr8 = new String[3];
        int i96 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
        int i97 = (i96 & 98) + (i96 | 98);
        int i98 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
        Object[] objArr9 = new Object[1];
        a(i97, ((i98 | 12) << 1) - (i98 ^ 12), (char) ((-2) - ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) ^ (-1))), objArr9);
        strArr8[0] = (String) objArr9[0];
        String str15 = str;
        int i99 = -(-TextUtils.indexOf((CharSequence) str15, '0', 0));
        Object[] objArr10 = new Object[1];
        a((i99 ^ 111) + ((i99 & 111) << 1), 12 - (~(-ExpandableListView.getPackedPositionGroup(0L))), (char) TextUtils.getTrimmedLength(str15), objArr10);
        strArr8[1] = (String) objArr10[0];
        int i100 = -View.MeasureSpec.makeMeasureSpec(0, 0);
        int i101 = ((i100 | 123) << 1) - (i100 ^ 123);
        int i102 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i102 % 128;
        if (i102 % 2 != 0) {
            modifierMetaStateMask = 17 >> ((byte) KeyEvent.getModifierMetaStateMask());
            i6 = 1;
            c = 0;
            iLastIndexOf = (-1) % TextUtils.lastIndexOf(str15, '^', 1, 0);
        } else {
            i6 = 1;
            c = 0;
            modifierMetaStateMask = 17 - ((byte) KeyEvent.getModifierMetaStateMask());
            iLastIndexOf = (-TextUtils.lastIndexOf(str15, '0', 0, 0)) - 1;
        }
        Object[] objArr11 = new Object[i6];
        a(i101, modifierMetaStateMask, (char) iLastIndexOf, objArr11);
        strArr8[2] = (String) objArr11[c];
        int i103 = 0;
        while (true) {
            if (i103 >= i95) {
                i7 = i77;
                i8 = i46;
                break;
            }
            Object[] objArr12 = {strArr8[i103]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) str15, '0') + 1);
                int iIndexOf3 = TextUtils.indexOf(str15, str15, 0) + 993;
                int scrollBarFadeDuration = 8 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                byte b4 = (byte) 1;
                byte b5 = (byte) (b4 - 1);
                Object[] objArr13 = new Object[1];
                c(b4, b5, (byte) (b5 - 1), objArr13);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, iIndexOf3, scrollBarFadeDuration, 410748506, false, (String) objArr13[0], new Class[]{String.class});
            }
            long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr12)).longValue();
            long j9 = 86661928;
            String[] strArr9 = strArr8;
            long j10 = 399;
            long j11 = (j10 * j9) + (j10 * jLongValue2);
            long j12 = 398;
            i7 = i77;
            long j13 = -1;
            long j14 = ((j9 ^ j13) | jLongValue2) ^ j13;
            long j15 = jLongValue2 ^ j13;
            long j16 = (j15 | j9) ^ j13;
            long j17 = i46;
            long j18 = j11 + ((j14 | j16 | ((j15 | j17) ^ j13)) * j12) + (((long) (-1194)) * (j9 | jLongValue2)) + (j12 * (((j15 | (j17 ^ j13)) ^ j13) | j14 | j16)) + ((long) (-287580165));
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i104 = ((int) (j18 >> 32)) & ((-1153123274) + (((~iFreeMemory) | 1437324971) * 1444) + (((~(iFreeMemory | 2143231807)) | (~((-706005397) | iFreeMemory)) | 49280) * (-1444)) + 1633455848);
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i105 = ((int) j18) & (2072280017 + ((~((~startUptimeMillis) | (-5243345))) * (-116)) + (((-22692306) | startUptimeMillis) * 116) + (((~(startUptimeMillis | 1414534104)) | (-1431983066)) * 116));
            if (((i105 & i104) | (i104 ^ i105)) != 0) {
                i8 = i46 ^ (i103 + 270);
                break;
            }
            i103 = ((i103 | 1) << 1) - (i103 ^ 1);
            strArr8 = strArr9;
            i77 = i7;
            i95 = 3;
        }
        int i106 = (~(i46 & i5)) & (i46 | i5);
        int i107 = -i106;
        int i108 = ((i106 & i107) | (i106 ^ i107)) >> 31;
        int i109 = (i5 & i108) | (i8 & (~i108));
        int i110 = 141 - (~TextUtils.lastIndexOf(str15, '0', 0, 0));
        int i111 = -(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
        Object[] objArr14 = new Object[1];
        a(i110, (i111 ^ 14) + ((i111 & 14) << 1), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr14);
        Object[] objArr15 = {(String) objArr14[0]};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
            int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 993;
            int scrollBarFadeDuration2 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 8;
            byte b6 = (byte) 0;
            Object[] objArr16 = new Object[1];
            c((byte) 6, b6, (byte) (b6 - 1), objArr16);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(threadPriority, doubleTapTimeout2, scrollBarFadeDuration2, -545305915, false, (String) objArr16[0], new Class[]{String.class});
        }
        long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr15)).longValue();
        long j19 = -54569385;
        long j20 = 495;
        long j21 = -493;
        long j22 = (j20 * j19) + (j21 * jLongValue3);
        long j23 = -988;
        long j24 = -1;
        long j25 = jLongValue3 ^ j24;
        long j26 = j22 + ((j19 | j25) * j23);
        long j27 = 494;
        long j28 = j19 ^ j24;
        long j29 = ((long) ((int) Runtime.getRuntime().totalMemory())) ^ j24;
        long j30 = j26 + ((jLongValue3 | j28 | j29) * j27) + ((((j19 | jLongValue3) ^ j24) | ((j28 | j25) ^ j24) | ((j29 | jLongValue3) ^ j24)) * j27) + ((long) 675028669);
        if (((((int) (j30 >> 32)) & ((-2092286) + ((~((-806879239) | i46)) * (-301)) + (((~(974653518 | i46)) | (~(i7 | (-1883087367)))) * (-301)) + ((974653518 | (~(1883087366 | i46))) * 301))) | (((int) j30) & (1370861463 + (((~((-1852254560) | i46)) | 1140926729 | (~(1005486326 | i46))) * (-754)) + (((~((-1140926730) | i46)) | (~(i7 | 2146413055))) * (-754)) + (((-1852254560) | i7) * 754)))) != 0) {
            i9 = i7;
            int i112 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i113 = (i112 & 61) + (i112 | 61);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i113 % 128;
            int i114 = i113 % 2;
            i10 = (i46 & (-267)) | (i9 & 266);
            j27 = j27;
            str2 = str15;
        } else {
            i9 = i7;
            str2 = str15;
            Object[] objArr17 = new Object[1];
            a(154 - (~(-(Process.myTid() >> 22))), 25 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) str2, '0', 0, 0) + 28551), objArr17);
            Object[] objArr18 = {(String) objArr17[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char mirror = (char) (33650 - AndroidCharacter.getMirror('0'));
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 3085;
                int iIndexOf4 = TextUtils.indexOf((CharSequence) str2, '0', 0) + 27;
                byte b7 = (byte) 1;
                byte b8 = (byte) (b7 - 1);
                Object[] objArr19 = new Object[1];
                c(b7, b8, (byte) (b8 - 1), objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mirror, jumpTapTimeout, iIndexOf4, 1411172903, false, (String) objArr19[0], new Class[]{String.class});
            }
            String str16 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr18);
            if (str16 != null) {
                int i115 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i116 = (i115 ^ 83) + ((i115 & 83) << 1);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i116 % 128;
                int i117 = i116 % 2;
                if (str16.isEmpty()) {
                    int i118 = -(-(ViewConfiguration.getEdgeSlop() >> 16));
                    int i119 = 23 - (~(-View.resolveSizeAndState(0, 0, 0)));
                    int i120 = -(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                    Object[] objArr20 = new Object[1];
                    a(((i118 | 179) << 1) - (i118 ^ 179), i119, (char) (((i120 | 48945) << 1) - (i120 ^ 48945)), objArr20);
                    Object[] objArr21 = {(String) objArr20[0]};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c3 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 33601);
                        int i121 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3084;
                        int offsetBefore = TextUtils.getOffsetBefore(str2, 0) + 26;
                        byte b9 = (byte) 1;
                        byte b10 = (byte) (b9 - 1);
                        Object[] objArr22 = new Object[1];
                        c(b9, b10, (byte) (b10 - 1), objArr22);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c3, i121, offsetBefore, 1411172903, false, (String) objArr22[0], new Class[]{String.class});
                    }
                    str3 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr21);
                    if (str3 != null) {
                        int i122 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i123 = (i122 ^ 69) + ((i122 & 69) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i123 % 128;
                        int i124 = i123 % 2;
                        if (str3.isEmpty()) {
                            i10 = i46;
                        } else {
                            i10 = (i46 & (-268)) | (i9 & 267);
                        }
                    } else {
                        i10 = i46;
                    }
                } else {
                    i10 = (i46 & (-268)) | (i9 & 267);
                }
            } else {
                int i1110 = -(-(ViewConfiguration.getEdgeSlop() >> 16));
                int i1111 = 23 - (~(-View.resolveSizeAndState(0, 0, 0)));
                int i125 = -(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                Object[] objArr23 = new Object[1];
                a(((i1110 | 179) << 1) - (i1110 ^ 179), i1111, (char) (((i125 | 48945) << 1) - (i125 ^ 48945)), objArr23);
                Object[] objArr24 = {(String) objArr23[0]};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char c4 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 33601);
                    int i126 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3084;
                    int offsetBefore2 = TextUtils.getOffsetBefore(str2, 0) + 26;
                    byte b11 = (byte) 1;
                    byte b12 = (byte) (b11 - 1);
                    Object[] objArr25 = new Object[1];
                    c(b11, b12, (byte) (b12 - 1), objArr25);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c4, i126, offsetBefore2, 1411172903, false, (String) objArr25[0], new Class[]{String.class});
                }
                str3 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr24);
                if (str3 != null) {
                    int i127 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i128 = (i127 ^ 69) + ((i127 & 69) << 1);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i128 % 128;
                    int i129 = i128 % 2;
                    if (str3.isEmpty()) {
                        i10 = (i46 & (-268)) | (i9 & 267);
                    } else {
                        i10 = i46;
                    }
                } else {
                    i10 = i46;
                }
            }
        }
        int i130 = ((~i109) & i46) | (i109 & i9);
        int i131 = -i130;
        int i132 = ((i130 & i131) | (i130 ^ i131)) >> 31;
        int i133 = i10 & (~i132);
        int i134 = i109 & i132;
        int i135 = (i134 & i133) | (i133 ^ i134);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2061288340);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char c5 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 56826);
            int i136 = 2813 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 9;
            byte b13 = (byte) 1;
            byte b14 = (byte) (b13 - 1);
            Object[] objArr26 = new Object[1];
            c(b13, b14, (byte) (b14 - 1), objArr26);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c5, i136, keyRepeatDelay, -1639816125, false, (String) objArr26[0], new Class[0]);
        }
        long jLongValue4 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, null)).longValue();
        long j31 = 1387880216;
        long j32 = -947;
        long j33 = 949;
        long j34 = (j32 * j31) + (j33 * jLongValue4);
        long j35 = -948;
        long j36 = j31 ^ j24;
        long j37 = jLongValue4 ^ j24;
        long j38 = i46;
        long j39 = j38 ^ j24;
        long j40 = j34 + ((j36 | ((j37 | j38) ^ j24)) * j35) + ((((j36 | j37) | j39) ^ j24) * j35);
        long j41 = 948;
        long j42 = j40 + ((j37 | j31) * j41) + ((long) 725476290);
        int startUptimeMillis2 = (int) Process.getStartUptimeMillis();
        int i137 = ~startUptimeMillis2;
        int i138 = ((int) (j42 >> 32)) & (1314992390 + ((93546815 | startUptimeMillis2) * (-859)) + (((~((-1206316) | startUptimeMillis2)) | (~(93546815 | i137))) * 859) + (((~((-1343679596) | i137)) | 1342473280) * 859));
        int i139 = (int) j42;
        int i140 = (-257406738) + (((~((-1667939702) | i9)) | 553652501) * (-245));
        int i141 = ~((-1667939702) | i46);
        int i142 = i139 & (i140 + (i141 * (-245)) + ((i141 | 1189801184) * 245));
        int i143 = (i138 & i142) | (i138 ^ i142);
        int i144 = (i143 + 199) ^ i46;
        int i145 = -i143;
        int i146 = ((i143 & i145) | (i143 ^ i145)) >> 31;
        int i147 = (~i146) & i46;
        int i148 = i146 & i144;
        int i149 = (i148 & i147) | (i147 ^ i148);
        int i150 = (~(i46 & i135)) & (i46 | i135);
        int i151 = -i150;
        int i152 = ((i150 & i151) | (i150 ^ i151)) >> 31;
        int i153 = (i135 & i152) | (i149 & (~i152));
        int i154 = -View.MeasureSpec.getMode(0);
        Object[] objArr27 = new Object[1];
        a((i154 ^ 203) + ((i154 & 203) << 1), 19 - (~(-TextUtils.getOffsetBefore(str2, 0))), (char) (2706 - (~(-(-KeyEvent.keyCodeFromString(str2))))), objArr27);
        String str17 = (String) objArr27[0];
        Object[] objArr28 = new Object[1];
        a(222 - (~(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))), TextUtils.indexOf(str2, str2) + 6, (char) ExpandableListView.getPackedPositionGroup(0L), objArr28);
        Object[] objArr29 = {str17, (String) objArr28[0]};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
            int iCombineMeasuredStates = 2385 - View.combineMeasuredStates(0, 0);
            int mirror2 = AndroidCharacter.getMirror('0') - 16;
            byte b15 = (byte) 1;
            byte b16 = (byte) (b15 - 1);
            Object[] objArr30 = new Object[1];
            c(b15, b16, (byte) (b16 - 1), objArr30);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cRgb, iCombineMeasuredStates, mirror2, -1207062455, false, (String) objArr30[0], new Class[]{String.class, String.class});
        }
        long jLongValue5 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr29)).longValue();
        long j43 = 858290101;
        long j44 = jLongValue5 ^ j24;
        long jMyTid = Process.myTid();
        long j45 = jMyTid ^ j24;
        long j46 = (((long) (-830)) * j43) + (((long) 832) * jLongValue5) + (((long) (-831)) * (((j44 | j45) ^ j24) | (((j43 | jLongValue5) | jMyTid) ^ j24))) + (((long) (-1662)) * (((j44 | j43) | jMyTid) ^ j24)) + (((long) 831) * ((((j43 ^ j24) | j45) ^ j24) | ((j43 | jMyTid) ^ j24) | ((jLongValue5 | jMyTid) ^ j24))) + ((long) 1118753227);
        int i155 = ((int) (j46 >> 32)) & (552539726 + (((~((-347267889) | i46)) | (~(1425535866 | i9))) * (-406)) + ((~((-335577345) | i9)) * (-406)) + (((~((-1089958523) | i46)) | (~(347267888 | i9))) * 406));
        int i156 = ~((-450366764) | i9);
        int i157 = ((int) j46) & (((537018452 | i156) * (-374)) + 1754062349 + ((i156 | (-987385216)) * 374));
        int i158 = (i157 & i155) | (i155 ^ i157);
        int i159 = -i158;
        int i160 = ((i158 & i159) | (i158 ^ i159)) >> 31;
        int i161 = (~i160) & i46;
        int i162 = i160 & (i46 ^ 262);
        int i163 = (i162 & i161) | (i161 ^ i162);
        int i164 = i46 ^ i153;
        int i165 = -i164;
        int i166 = ((i164 & i165) | (i164 ^ i165)) >> 31;
        int i167 = i163 & (~i166);
        int i168 = i153 & i166;
        int i169 = (i168 & i167) | (i167 ^ i168);
        int i170 = -(-TextUtils.lastIndexOf(str2, '0', 0));
        int i171 = ((i170 | 230) << 1) - (i170 ^ 230);
        int i172 = -TextUtils.getOffsetAfter(str2, 0);
        Object[] objArr31 = new Object[1];
        a(i171, (i172 ^ 31) + ((i172 & 31) << 1), (char) ExpandableListView.getPackedPositionType(0L), objArr31);
        String str18 = (String) objArr31[0];
        int iMyPid = Process.myPid() >> 22;
        int i173 = (iMyPid * (-523)) + 68380;
        int i174 = ~iMyPid;
        int i175 = (~((i174 & 260) | (i174 ^ 260))) | (~(((-261) ^ iMyPid) | ((-261) & iMyPid)));
        int i176 = ~(((-261) ^ i46) | ((-261) & i46));
        int i177 = -(-(((i175 & i176) | (i175 ^ i176)) * 262));
        int i178 = (i173 ^ i177) + ((i173 & i177) << 1);
        int i179 = (~(((-261) ^ iMyPid) | ((-261) & iMyPid))) * (-786);
        int i180 = (i178 & i179) + (i179 | i178);
        int i181 = ~((-261) | i9);
        int i182 = ~iMyPid;
        int i183 = ~((i182 & 260) | (i182 ^ 260));
        int i184 = (i181 & i183) | (i181 ^ i183);
        int i185 = ~(iMyPid | (-261));
        int i186 = -(-(((i185 & i184) | (i184 ^ i185)) * 262));
        int i187 = ((i180 | i186) << 1) - (i186 ^ i180);
        int i188 = 22 - (~(-Gravity.getAbsoluteGravity(0, 0)));
        int i189 = -View.resolveSizeAndState(0, 0, 0);
        Object[] objArr32 = new Object[1];
        a(i187, i188, (char) (((i189 | 16051) << 1) - (i189 ^ 16051)), objArr32);
        String str19 = (String) objArr32[0];
        int edgeSlop = 283 - (ViewConfiguration.getEdgeSlop() >> 16);
        int i190 = -Color.green(0);
        Object[] objArr33 = new Object[1];
        a(edgeSlop, (i190 ^ 28) + ((i190 & 28) << 1), (char) View.resolveSize(0, 0), objArr33);
        String str20 = (String) objArr33[0];
        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 311;
        int i191 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
        int i192 = (i191 ^ 14) + ((i191 & 14) << 1);
        int threadPriority2 = Process.getThreadPriority(0);
        int i193 = -(-(threadPriority2 * (-747)));
        int i194 = (7500 ^ i193) + ((i193 & 7500) << 1);
        int i195 = ~(((-21) & threadPriority2) | ((-21) ^ threadPriority2));
        int i196 = ~((i9 ^ 20) | (i9 & 20));
        int i197 = (i194 - (~(((i195 & i196) | (i195 ^ i196)) * (-374)))) - 1;
        int i198 = ~threadPriority2;
        int i199 = i197 + ((~((i198 ^ 20) | (i198 & 20))) * 748);
        int i200 = ~((i198 & (-21)) | ((-21) ^ i198));
        int i201 = ~((i4 ^ 20) | (i4 & 20));
        int i202 = ((i200 & i201) | (i200 ^ i201)) * 374;
        Object[] objArr34 = new Object[1];
        a(fadingEdgeLength, i192, (char) (((i199 ^ i202) + ((i199 & i202) << 1)) >> 6), objArr34);
        String[] strArr10 = {str18, str19, str20, (String) objArr34[0]};
        int i203 = 0;
        while (true) {
            if (i203 >= 4) {
                i11 = i169;
                i12 = i46;
                str4 = str2;
                i13 = i12;
                break;
            }
            Object[] objArr35 = {strArr10[i203]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) str2, '0'));
                int iAlpha = Color.alpha(0) + 993;
                int capsMode = TextUtils.getCapsMode(str2, 0, 0) + 8;
                byte b17 = (byte) 1;
                byte b18 = (byte) (b17 - 1);
                Object[] objArr36 = new Object[1];
                c(b17, b18, (byte) (b18 - 1), objArr36);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cIndexOf2, iAlpha, capsMode, 410748506, false, (String) objArr36[0], new Class[]{String.class});
            }
            long jLongValue6 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr35)).longValue();
            long j47 = 1803429238;
            String[] strArr11 = strArr10;
            str4 = str2;
            int i204 = i203;
            long j48 = jLongValue6 ^ j24;
            i11 = i169;
            long jUptimeMillis = ((long) ((int) SystemClock.uptimeMillis())) ^ j24;
            long j49 = 933;
            long j50 = (((long) 934) * j47) + (((long) (-932)) * jLongValue6) + (((long) (-933)) * (j48 | (((j47 ^ j24) | jUptimeMillis) ^ j24))) + ((((j48 | jUptimeMillis) ^ j24) | ((j48 | j47) ^ j24)) * j49) + (j49 * ((j47 | jLongValue6) ^ j24)) + ((long) (-2004347475));
            i12 = i;
            int i205 = ((int) (j50 >> 32)) & (2038856378 + (((~((-1481269809) | i12)) | (~(2146365373 | i9))) * 920) + (((~((-2102321977) | i9)) | 1481269808) * 920) + (((~((-1481269809) | i9)) | (~((-621052169) | i12)) | (~(2146365373 | i12))) * 920));
            int i206 = ((int) j50) & ((-1754753727) + (((~((-11174093) | i9)) | (-1426052318)) * (-828)) + (((-11174093) | i9) * (-828)) + 662213584);
            if (((i205 & i206) | (i205 ^ i206)) != 0) {
                int i207 = ((i204 | 252) << 1) - (i204 ^ 252);
                i13 = ((~i207) & i12) | (i207 & i9);
                break;
            }
            int i208 = (i204 ^ 96) + ((i204 & 96) << 1);
            i203 = (i208 & (-95)) + (i208 | (-95));
            i46 = i12;
            str2 = str4;
            i169 = i11;
            strArr10 = strArr11;
        }
        int i209 = (~(i12 & i11)) & (i12 | i11);
        int i210 = (i209 | (-i209)) >> 31;
        int i211 = i13 & (~i210);
        int i212 = i210 & i11;
        int i213 = (i211 & i212) | (i211 ^ i212);
        int i214 = -Color.alpha(0);
        int i215 = (i214 & 325) + (i214 | 325);
        int scrollBarFadeDuration3 = ViewConfiguration.getScrollBarFadeDuration();
        int i216 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i216 % 128;
        if (i216 % 2 != 0) {
            Object[] objArr37 = new Object[1];
            a(i215, 13 >> (scrollBarFadeDuration3 / 52), (char) KeyEvent.normalizeMetaState(0), objArr37);
            Object[] objArr38 = {(String) objArr37[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cResolveSizeAndState = (char) (33602 - View.resolveSizeAndState(0, 0, 0));
                int i217 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 3086;
                int iIndexOf5 = TextUtils.indexOf(str4, str4, 0, 0) + 26;
                byte b19 = (byte) 1;
                byte b20 = (byte) (b19 - 1);
                Object[] objArr39 = new Object[1];
                c(b19, b20, (byte) (b20 - 1), objArr39);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cResolveSizeAndState, i217, iIndexOf5, 1411172903, false, (String) objArr39[0], new Class[]{String.class});
            }
            objInvoke = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr38);
        } else {
            int i218 = -(scrollBarFadeDuration3 >> 16);
            Object[] objArr40 = new Object[1];
            a(i215, (i218 & 13) + (i218 | 13), (char) KeyEvent.normalizeMetaState(0), objArr40);
            Object[] objArr41 = {(String) objArr40[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cMyPid = (char) (33602 - (Process.myPid() >> 22));
                int i219 = 3086 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                int windowTouchSlop = 26 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                byte b21 = (byte) 1;
                byte b22 = (byte) (b21 - 1);
                Object[] objArr42 = new Object[1];
                c(b21, b22, (byte) (b22 - 1), objArr42);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cMyPid, i219, windowTouchSlop, 1411172903, false, (String) objArr42[0], new Class[]{String.class});
            }
            objInvoke = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr41);
        }
        String str21 = (String) objInvoke;
        if (str21 != null) {
            int i220 = -(-(Process.myTid() >> 22));
            Object[] objArr43 = new Object[1];
            a((i220 & 338) + (i220 | 338), 8 - (~(-(ViewConfiguration.getScrollDefaultDelay() >> 16))), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr43);
            if (str21.contains((String) objArr43[0])) {
                i14 = (~(i12 & ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION)) & (i12 | ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
            } else {
                i14 = i12;
            }
        } else {
            i14 = i12;
        }
        int i221 = ((~i213) & i12) | (i213 & i9);
        int i222 = (i221 | (-i221)) >> 31;
        int i223 = i14 & (~i222);
        int i224 = i213 & i222;
        int i225 = (i224 & i223) | (i223 ^ i224);
        int threadPriority3 = Process.getThreadPriority(0);
        int i226 = ((threadPriority3 & 20) + (threadPriority3 | 20)) >> 6;
        int i227 = ((i226 | 347) << 1) - (i226 ^ 347);
        int i228 = -(-Color.argb(0, 0, 0, 0));
        Object[] objArr44 = new Object[1];
        a(i227, (i228 & 17) + (i228 | 17), (char) (30179 - (~(-ExpandableListView.getPackedPositionChild(0L)))), objArr44);
        String str22 = (String) objArr44[0];
        int i229 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
        int i230 = ((i229 | 365) << 1) - (i229 ^ 365);
        int windowTouchSlop2 = ViewConfiguration.getWindowTouchSlop() >> 8;
        int i231 = (windowTouchSlop2 & 6) + (windowTouchSlop2 | 6);
        int i232 = -(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
        Object[] objArr45 = new Object[1];
        a(i230, i231, (char) ((i232 ^ 61647) + ((i232 & 61647) << 1)), objArr45);
        byte[] bytes = ((String) objArr45[0]).getBytes();
        int length = bytes.length;
        if (length == 0) {
            i15 = i12 ^ 251;
        } else {
            try {
                bufferedInputStream2 = new BufferedInputStream(new FileInputStream(str22));
                int i233 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i234 = (i233 & 53) + (i233 | 53);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i234 % 128;
                int i235 = i234 % 2;
                int i236 = 4096;
                try {
                    byte[] bArr2 = new byte[4096];
                    int i237 = 0;
                    while (true) {
                        int i238 = bufferedInputStream2.read(bArr2, 0, i236);
                        if (i238 > 0) {
                            int i239 = 0;
                            while (i237 < length && i239 < i238) {
                                int i240 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i241 = ((i240 | 113) << 1) - (i240 ^ 113);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i241 % 128;
                                if (i241 % 2 == 0) {
                                    byte b23 = bArr2[i239];
                                    byte b24 = bytes[i237];
                                    Object obj2 = null;
                                    obj2.hashCode();
                                    throw null;
                                }
                                if (bArr2[i239] == bytes[i237]) {
                                    i237 = ((i237 | 1) << 1) - (i237 ^ 1);
                                } else {
                                    if (i237 != 0) {
                                        int i242 = (i237 ^ (-1)) + (i237 << 1);
                                        while (true) {
                                            if (i242 <= 0) {
                                                i16 = i238;
                                                i237 = 0;
                                                break;
                                            }
                                            int i243 = 0;
                                            while (true) {
                                                if (i243 >= i242) {
                                                    i16 = i238;
                                                    i237 = i242;
                                                    break;
                                                }
                                                i17 = i238;
                                                int i244 = -i242;
                                                int i245 = (i237 ^ i244) + ((i244 & i237) << 1);
                                                if (bytes[i243] != bytes[((i245 | i243) << 1) - (i245 ^ i243)]) {
                                                    break;
                                                }
                                                int i246 = i243 - 62;
                                                i243 = ((i246 & 63) << 1) + (i246 ^ 63);
                                                i238 = i17;
                                            }
                                            int i247 = ((i242 | (-26)) << 1) - (i242 ^ (-26));
                                            i242 = (i247 ^ 25) + ((i247 & 25) << 1);
                                            i238 = i17;
                                        }
                                    }
                                    i238 = i16;
                                }
                                i16 = i238;
                                int i248 = i239 - 67;
                                i239 = (i248 ^ 68) + ((i248 & 68) << 1);
                                i238 = i16;
                            }
                            i236 = 4096;
                        } else {
                            boolean z2 = i237 == length;
                            try {
                                bufferedInputStream2.close();
                            } catch (IOException unused) {
                            }
                            if (z2) {
                                i15 = i12 ^ 251;
                            }
                        }
                        i15 = i12;
                    }
                } catch (IOException unused2) {
                    if (bufferedInputStream2 != null) {
                        try {
                            bufferedInputStream2.close();
                        } catch (IOException unused3) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedInputStream = bufferedInputStream2;
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused5) {
                bufferedInputStream2 = null;
            } catch (Throwable th3) {
                th = th3;
                bufferedInputStream = null;
            }
        }
        int i249 = (~(i12 & i225)) & (i12 | i225);
        int i250 = -i249;
        int i251 = ((i249 & i250) | (i249 ^ i250)) >> 31;
        int i252 = i15 & (~i251);
        int i253 = i225 & i251;
        int i254 = (i253 & i252) | (i252 ^ i253);
        int i255 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
        Object[] objArr46 = new Object[1];
        a(((i255 | 370) << 1) - (i255 ^ 370), 23 - (~(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))), (char) (ViewConfiguration.getLongPressTimeout() >> 16), objArr46);
        Object[] objArr47 = {(String) objArr46[0]};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf(str4, '0', 0, 0) + 33603);
            int i256 = 3086 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            int iKeyCodeFromString = 26 - KeyEvent.keyCodeFromString(str4);
            byte b25 = (byte) 1;
            byte b26 = (byte) (b25 - 1);
            Object[] objArr48 = new Object[1];
            c(b25, b26, (byte) (b26 - 1), objArr48);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cLastIndexOf, i256, iKeyCodeFromString, 1411172903, false, (String) objArr48[0], new Class[]{String.class});
        }
        String lowerCase = ((String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr47)).toLowerCase();
        int iMyPid2 = (Process.myPid() >> 22) + 393;
        int maxKeyCode = KeyEvent.getMaxKeyCode() >> 16;
        Object[] objArr49 = new Object[1];
        a(iMyPid2, (maxKeyCode ^ 4) + ((maxKeyCode & 4) << 1), (char) (36833 - (~(-ImageFormat.getBitsPerPixel(0)))), objArr49);
        int i257 = i12 ^ i254;
        int i258 = (i257 | (-i257)) >> 31;
        int i259 = (lowerCase.contains((String) objArr49[0]) ? (i12 & (-265)) | (i9 & 264) : i12) & (~i258);
        int i260 = i254 & i258;
        int i261 = (i260 & i259) | (i259 ^ i260);
        int iIndexOf6 = TextUtils.indexOf((CharSequence) str4, '0', 0);
        int i262 = (iIndexOf6 & 398) + (iIndexOf6 | 398);
        int i263 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
        Object[] objArr50 = new Object[1];
        a(i262, (i263 ^ 42) + ((i263 & 42) << 1), (char) (0 - (~(-(-((byte) KeyEvent.getModifierMetaStateMask()))))), objArr50);
        String str23 = (String) objArr50[0];
        int i264 = -(KeyEvent.getMaxKeyCode() >> 16);
        Object[] objArr51 = new Object[1];
        a((i264 ^ 439) + ((i264 & 439) << 1), 39 - (~(-Color.alpha(0))), (char) View.MeasureSpec.getMode(0), objArr51);
        String str24 = (String) objArr51[0];
        int i265 = -View.resolveSizeAndState(0, 0, 0);
        int i266 = (i265 & 479) + (i265 | 479);
        int i267 = -(Process.myTid() >> 22);
        Object[] objArr52 = new Object[1];
        a(i266, (i267 ^ 27) + ((i267 & 27) << 1), (char) (30654 - (~(-View.combineMeasuredStates(0, 0)))), objArr52);
        String str25 = (String) objArr52[0];
        Object[] objArr53 = new Object[1];
        a(505 - (~(-Color.red(0))), 26 - (~KeyEvent.getDeadChar(0, 0)), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr53);
        String str26 = (String) objArr53[0];
        int iIndexOf7 = TextUtils.indexOf((CharSequence) str4, '0', 0, 0);
        int i268 = ((iIndexOf7 | 534) << 1) - (iIndexOf7 ^ 534);
        int i269 = 25 - (~(-Process.getGidForName(str4)));
        int i270 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
        Object[] objArr54 = new Object[1];
        a(i268, i269, (char) ((i270 ^ 30880) + ((i270 & 30880) << 1)), objArr54);
        String str27 = (String) objArr54[0];
        int iAxisFromString = 559 - MotionEvent.axisFromString(str4);
        int iIndexOf8 = 27 - TextUtils.indexOf(str4, str4);
        int iLastIndexOf3 = TextUtils.lastIndexOf(str4, '0', 0);
        char c6 = (char) ((iLastIndexOf3 & 1) + (iLastIndexOf3 | 1));
        Object[] objArr55 = new Object[1];
        a(iAxisFromString, iIndexOf8, c6, objArr55);
        String[] strArr12 = {str23, str24, str25, str26, str27, (String) objArr55[0]};
        int i271 = 6;
        int i272 = 0;
        while (true) {
            if (i272 >= i271) {
                i18 = i12;
                break;
            }
            int i273 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i274 = ((i273 | 73) << 1) - (i273 ^ 73);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i274 % 128;
            if (i274 % 2 == 0) {
                Object[] objArr56 = {strArr12[i272]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char pressedStateDuration = (char) (33602 - (ViewConfiguration.getPressedStateDuration() >> 16));
                    int iLastIndexOf4 = 3084 - TextUtils.lastIndexOf(str4, '0', 0, 0);
                    int iAlpha2 = 26 - Color.alpha(0);
                    byte b27 = (byte) 1;
                    byte b28 = (byte) (b27 - 1);
                    Object[] objArr57 = new Object[1];
                    c(b27, b28, (byte) (b28 - 1), objArr57);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(pressedStateDuration, iLastIndexOf4, iAlpha2, 1411172903, false, (String) objArr57[0], new Class[]{String.class});
                }
                String str28 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).invoke(null, objArr56);
                if (str28 != null && !str28.isEmpty()) {
                    i18 = (i12 & (-266)) | (i9 & 265);
                    break;
                }
                i272 = (i272 ^ (-91)) + ((i272 & (-91)) << 1) + 92;
                i271 = 6;
            } else {
                Object[] objArr58 = {strArr12[i272]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cLastIndexOf2 = (char) (TextUtils.lastIndexOf(str4, '0', 0) + 33603);
                    int defaultSize = 3085 - View.getDefaultSize(0, 0);
                    int size = View.MeasureSpec.getSize(0) + 26;
                    byte b29 = (byte) 1;
                    byte b30 = (byte) (b29 - 1);
                    Object[] objArr59 = new Object[1];
                    c(b29, b30, (byte) (b30 - 1), objArr59);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cLastIndexOf2, defaultSize, size, 1411172903, false, (String) objArr59[0], new Class[]{String.class});
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        }
        int i275 = i12 ^ i261;
        int i276 = -i275;
        int i277 = ((i275 & i276) | (i275 ^ i276)) >> 31;
        int i278 = i18 & (~i277);
        int i279 = i261 & i277;
        int i280 = (i279 & i278) | (i278 ^ i279);
        int i281 = -(ViewConfiguration.getScrollBarSize() >> 8);
        int i282 = ((i281 | 347) << 1) - (i281 ^ 347);
        int i283 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
        int i284 = (i283 & 17) + (i283 | 17);
        int i285 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
        Object[] objArr60 = new Object[1];
        a(i282, i284, (char) ((i285 ^ 30181) + ((i285 & 30181) << 1)), objArr60);
        String str29 = (String) objArr60[0];
        int i286 = -(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
        int i287 = (i286 & 586) + (i286 | 586);
        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0);
        Object[] objArr61 = new Object[1];
        a(i287, (iNormalizeMetaState & 6) + (iNormalizeMetaState | 6), (char) Color.alpha(0), objArr61);
        byte[] bytes2 = ((String) objArr61[0]).getBytes();
        int length2 = bytes2.length;
        if (length2 == 0) {
            i19 = (~(i12 & 260)) & (i12 | 260);
        } else {
            try {
                bufferedInputStream4 = new BufferedInputStream(new FileInputStream(str29));
                int i288 = 4096;
                try {
                    byte[] bArr3 = new byte[4096];
                    int i289 = 0;
                    while (true) {
                        int i290 = bufferedInputStream4.read(bArr3, 0, i288);
                        int i291 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i291 % 128;
                        if (i291 % 2 != 0) {
                            int i292 = 45 / 0;
                            if (i290 <= 0) {
                                break;
                            }
                            i22 = 0;
                            while (i289 < length2) {
                                int i293 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                i23 = ((i293 | 95) << 1) - (i293 ^ 95);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i23 % 128;
                                if (i23 % 2 != 0) {
                                    int i294 = 96 / 0;
                                    if (i22 < i290) {
                                        break;
                                    }
                                    if (bArr3[i22] == bytes2[i289]) {
                                        int i295 = ((i289 | 128) << 1) - (i289 ^ 128);
                                        i289 = ((i295 | ComposerKt.defaultsKey) << 1) - (i295 ^ ComposerKt.defaultsKey);
                                    } else {
                                        if (i289 != 0) {
                                            int i296 = ~i289;
                                            int i297 = ~i289;
                                            bArr = bArr3;
                                            int i298 = ~((i297 ^ (-1)) | i297);
                                            int i299 = (i296 ^ i298) | (i298 & i296);
                                            i24 = i290;
                                            int i300 = ~((i297 ^ i12) | (i297 & i12));
                                            int i301 = 523 + (i289 * 263) + (((i299 ^ i300) | (i299 & i300)) * 262);
                                            int i302 = (i297 ^ (-1)) | i297;
                                            int i303 = i301 + ((~i302) * (-786));
                                            int i304 = ~((i297 & i4) | (i297 ^ i4));
                                            int i305 = (i304 & i296) | (i304 ^ i296);
                                            int i306 = ~i302;
                                            int i307 = ((i305 & i306) | (i305 ^ i306)) * 262;
                                            i25 = (i303 & i307) + (i307 | i303);
                                            while (true) {
                                                if (i25 > 0) {
                                                    i289 = 0;
                                                    break;
                                                }
                                                i26 = 0;
                                                while (true) {
                                                    if (i26 < i25) {
                                                        i289 = i25;
                                                        break;
                                                    }
                                                    if (bytes2[i26] != bytes2[((i289 - (~(-i25))) - 1) + i26]) {
                                                        break;
                                                    }
                                                    i26++;
                                                }
                                                i25--;
                                            }
                                        }
                                        bArr3 = bArr;
                                        i290 = i24;
                                    }
                                    bArr = bArr3;
                                    i24 = i290;
                                    i22 = (i22 ^ (-109)) + ((i22 & (-109)) << 1) + 110;
                                    bArr3 = bArr;
                                    i290 = i24;
                                } else {
                                    if (i22 >= i290) {
                                        break;
                                    }
                                    if (bArr3[i22] == bytes2[i289]) {
                                        int i2910 = ((i289 | 128) << 1) - (i289 ^ 128);
                                        i289 = ((i2910 | ComposerKt.defaultsKey) << 1) - (i2910 ^ ComposerKt.defaultsKey);
                                    } else {
                                        if (i289 != 0) {
                                            int i2911 = ~i289;
                                            int i2912 = ~i289;
                                            bArr = bArr3;
                                            int i2913 = ~((i2912 ^ (-1)) | i2912);
                                            int i2914 = (i2911 ^ i2913) | (i2913 & i2911);
                                            i24 = i290;
                                            int i308 = ~((i2912 ^ i12) | (i2912 & i12));
                                            int i309 = 523 + (i289 * 263) + (((i2914 ^ i308) | (i2914 & i308)) * 262);
                                            int i3010 = (i2912 ^ (-1)) | i2912;
                                            int i3011 = i309 + ((~i3010) * (-786));
                                            int i3012 = ~((i2912 & i4) | (i2912 ^ i4));
                                            int i3013 = (i3012 & i2911) | (i3012 ^ i2911);
                                            int i3014 = ~i3010;
                                            int i3015 = ((i3013 & i3014) | (i3013 ^ i3014)) * 262;
                                            i25 = (i3011 & i3015) + (i3015 | i3011);
                                            while (true) {
                                                if (i25 > 0) {
                                                    i289 = 0;
                                                    break;
                                                    break;
                                                }
                                                i26 = 0;
                                                while (true) {
                                                    if (i26 < i25) {
                                                        i289 = i25;
                                                        break;
                                                        break;
                                                    }
                                                    if (bytes2[i26] != bytes2[((i289 - (~(-i25))) - 1) + i26]) {
                                                        break;
                                                    }
                                                    i26++;
                                                }
                                                i25--;
                                            }
                                        }
                                        bArr3 = bArr;
                                        i290 = i24;
                                    }
                                    bArr = bArr3;
                                    i24 = i290;
                                    i22 = (i22 ^ (-109)) + ((i22 & (-109)) << 1) + 110;
                                    bArr3 = bArr;
                                    i290 = i24;
                                }
                            }
                            bArr3 = bArr3;
                            i288 = 4096;
                        } else {
                            if (i290 <= 0) {
                                break;
                            }
                            i22 = 0;
                            while (i289 < length2) {
                                int i2915 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                i23 = ((i2915 | 95) << 1) - (i2915 ^ 95);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i23 % 128;
                                if (i23 % 2 != 0) {
                                    int i2916 = 96 / 0;
                                    if (i22 < i290) {
                                        break;
                                        break;
                                    }
                                    if (bArr3[i22] == bytes2[i289]) {
                                        int i2917 = ((i289 | 128) << 1) - (i289 ^ 128);
                                        i289 = ((i2917 | ComposerKt.defaultsKey) << 1) - (i2917 ^ ComposerKt.defaultsKey);
                                    } else {
                                        if (i289 != 0) {
                                            int i2918 = ~i289;
                                            int i2919 = ~i289;
                                            bArr = bArr3;
                                            int i29110 = ~((i2919 ^ (-1)) | i2919);
                                            int i29111 = (i2918 ^ i29110) | (i29110 & i2918);
                                            i24 = i290;
                                            int i3016 = ~((i2919 ^ i12) | (i2919 & i12));
                                            int i3017 = 523 + (i289 * 263) + (((i29111 ^ i3016) | (i29111 & i3016)) * 262);
                                            int i3018 = (i2919 ^ (-1)) | i2919;
                                            int i3019 = i3017 + ((~i3018) * (-786));
                                            int i30110 = ~((i2919 & i4) | (i2919 ^ i4));
                                            int i30111 = (i30110 & i2918) | (i30110 ^ i2918);
                                            int i30112 = ~i3018;
                                            int i30113 = ((i30111 & i30112) | (i30111 ^ i30112)) * 262;
                                            i25 = (i3019 & i30113) + (i30113 | i3019);
                                            while (true) {
                                                if (i25 > 0) {
                                                    i289 = 0;
                                                    break;
                                                    break;
                                                }
                                                i26 = 0;
                                                while (true) {
                                                    if (i26 < i25) {
                                                        i289 = i25;
                                                        break;
                                                        break;
                                                    }
                                                    if (bytes2[i26] != bytes2[((i289 - (~(-i25))) - 1) + i26]) {
                                                        break;
                                                    }
                                                    i26++;
                                                }
                                                i25--;
                                            }
                                        }
                                        bArr3 = bArr;
                                        i290 = i24;
                                    }
                                    bArr = bArr3;
                                    i24 = i290;
                                    i22 = (i22 ^ (-109)) + ((i22 & (-109)) << 1) + 110;
                                    bArr3 = bArr;
                                    i290 = i24;
                                } else {
                                    if (i22 >= i290) {
                                        break;
                                        break;
                                    }
                                    if (bArr3[i22] == bytes2[i289]) {
                                        int i29112 = ((i289 | 128) << 1) - (i289 ^ 128);
                                        i289 = ((i29112 | ComposerKt.defaultsKey) << 1) - (i29112 ^ ComposerKt.defaultsKey);
                                    } else {
                                        if (i289 != 0) {
                                            int i29113 = ~i289;
                                            int i29114 = ~i289;
                                            bArr = bArr3;
                                            int i29115 = ~((i29114 ^ (-1)) | i29114);
                                            int i29116 = (i29113 ^ i29115) | (i29115 & i29113);
                                            i24 = i290;
                                            int i30114 = ~((i29114 ^ i12) | (i29114 & i12));
                                            int i30115 = 523 + (i289 * 263) + (((i29116 ^ i30114) | (i29116 & i30114)) * 262);
                                            int i30116 = (i29114 ^ (-1)) | i29114;
                                            int i30117 = i30115 + ((~i30116) * (-786));
                                            int i30118 = ~((i29114 & i4) | (i29114 ^ i4));
                                            int i30119 = (i30118 & i29113) | (i30118 ^ i29113);
                                            int i301110 = ~i30116;
                                            int i301111 = ((i30119 & i301110) | (i30119 ^ i301110)) * 262;
                                            i25 = (i30117 & i301111) + (i301111 | i30117);
                                            while (true) {
                                                if (i25 > 0) {
                                                    i289 = 0;
                                                    break;
                                                    break;
                                                }
                                                i26 = 0;
                                                while (true) {
                                                    if (i26 < i25) {
                                                        i289 = i25;
                                                        break;
                                                        break;
                                                    }
                                                    if (bytes2[i26] != bytes2[((i289 - (~(-i25))) - 1) + i26]) {
                                                        break;
                                                    }
                                                    i26++;
                                                }
                                                i25--;
                                            }
                                        }
                                        bArr3 = bArr;
                                        i290 = i24;
                                    }
                                    bArr = bArr3;
                                    i24 = i290;
                                    i22 = (i22 ^ (-109)) + ((i22 & (-109)) << 1) + 110;
                                    bArr3 = bArr;
                                    i290 = i24;
                                }
                            }
                            bArr3 = bArr3;
                            i288 = 4096;
                        }
                    }
                    boolean z3 = i289 == length2;
                    try {
                        bufferedInputStream4.close();
                    } catch (IOException unused6) {
                    }
                    if (z3) {
                        i19 = (~(i12 & 260)) & (i12 | 260);
                    } else {
                        int i310 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        int i311 = -(-Color.blue(0));
                        Object[] objArr62 = new Object[1];
                        a((i310 & 594) + (i310 | 594), (i311 ^ 13) + ((i311 & 13) << 1), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), objArr62);
                        String str30 = (String) objArr62[0];
                        int i312 = -TextUtils.lastIndexOf(str4, '0');
                        int i313 = (i312 ^ TypedValues.MotionType.TYPE_ANIMATE_RELATIVE_TO) + ((i312 & TypedValues.MotionType.TYPE_ANIMATE_RELATIVE_TO) << 1);
                        int keyRepeatDelay2 = ViewConfiguration.getKeyRepeatDelay() >> 16;
                        int i314 = (keyRepeatDelay2 ^ 9) + ((keyRepeatDelay2 & 9) << 1);
                        int jumpTapTimeout2 = ViewConfiguration.getJumpTapTimeout() >> 16;
                        Object[] objArr63 = new Object[1];
                        a(i313, i314, (char) ((jumpTapTimeout2 & 38848) + (jumpTapTimeout2 | 38848)), objArr63);
                        byte[] bytes3 = ((String) objArr63[0]).getBytes();
                        int length3 = bytes3.length;
                        if (length3 == 0) {
                            i19 = (i12 & (-262)) | (i9 & 261);
                        } else {
                            try {
                                bufferedInputStream6 = new BufferedInputStream(new FileInputStream(str30));
                                int i315 = 4096;
                                try {
                                    byte[] bArr4 = new byte[4096];
                                    int i316 = 0;
                                    while (true) {
                                        int i317 = bufferedInputStream6.read(bArr4, 0, i315);
                                        if (i317 > 0) {
                                            int i318 = 0;
                                            while (i316 < length3 && i318 < i317) {
                                                int i319 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                int i320 = (i319 ^ 29) + ((i319 & 29) << 1);
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i320 % 128;
                                                if (i320 % 2 == 0) {
                                                    byte b31 = bArr4[i318];
                                                    byte b32 = bytes3[i316];
                                                    Object obj4 = null;
                                                    obj4.hashCode();
                                                    throw null;
                                                }
                                                if (bArr4[i318] == bytes3[i316]) {
                                                    int i321 = ((i316 | (-93)) << 1) - (i316 ^ (-93));
                                                    i316 = (i321 & 94) + (i321 | 94);
                                                } else {
                                                    if (i316 != 0) {
                                                        int i322 = (i316 ^ (-1)) + (i316 << 1);
                                                        while (true) {
                                                            if (i322 <= 0) {
                                                                i20 = i317;
                                                                i316 = 0;
                                                                break;
                                                            }
                                                            int i323 = 0;
                                                            while (true) {
                                                                if (i323 >= i322) {
                                                                    i20 = i317;
                                                                    i316 = i322;
                                                                    break;
                                                                }
                                                                i21 = i317;
                                                                int i324 = -i322;
                                                                int i325 = (i316 ^ i324) + ((i324 & i316) << 1);
                                                                if (bytes3[i323] != bytes3[(i325 ^ i323) + ((i325 & i323) << 1)]) {
                                                                    break;
                                                                }
                                                                i323++;
                                                                i317 = i21;
                                                            }
                                                            i322--;
                                                            i317 = i21;
                                                        }
                                                    }
                                                    i317 = i20;
                                                }
                                                i20 = i317;
                                                i318 = ((i318 | 1) << 1) - (i318 ^ 1);
                                                i317 = i20;
                                            }
                                            i315 = 4096;
                                        } else {
                                            boolean z4 = i316 == length3;
                                            try {
                                                bufferedInputStream6.close();
                                            } catch (IOException unused7) {
                                            }
                                            if (z4) {
                                                i19 = (i12 & (-262)) | (i9 & 261);
                                            }
                                        }
                                        i19 = i12;
                                    }
                                } catch (IOException unused8) {
                                    if (bufferedInputStream6 != null) {
                                        try {
                                            bufferedInputStream6.close();
                                        } catch (IOException unused9) {
                                        }
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    bufferedInputStream5 = bufferedInputStream6;
                                    if (bufferedInputStream5 != null) {
                                        try {
                                            bufferedInputStream5.close();
                                        } catch (IOException unused10) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (IOException unused11) {
                                bufferedInputStream6 = null;
                            } catch (Throwable th5) {
                                th = th5;
                                bufferedInputStream5 = null;
                            }
                        }
                    }
                } catch (IOException unused12) {
                    if (bufferedInputStream4 != null) {
                        try {
                            bufferedInputStream4.close();
                        } catch (IOException unused13) {
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    bufferedInputStream3 = bufferedInputStream4;
                    if (bufferedInputStream3 != null) {
                        try {
                            bufferedInputStream3.close();
                        } catch (IOException unused14) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused15) {
                bufferedInputStream4 = null;
            } catch (Throwable th7) {
                th = th7;
                bufferedInputStream3 = null;
            }
        }
        int i326 = (~(i12 & i280)) & (i12 | i280);
        int i327 = -i326;
        int i328 = ((i326 & i327) | (i326 ^ i327)) >> 31;
        int i329 = i19 & (~i328);
        int i330 = i280 & i328;
        int i331 = (i330 & i329) | (i329 ^ i330);
        if ((i2 & 8) == 0) {
            int i332 = -(ViewConfiguration.getPressedStateDuration() >> 16);
            int i333 = -View.MeasureSpec.getSize(0);
            int i334 = (i333 & 43) + (i333 | 43);
            int i335 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            Object[] objArr64 = new Object[1];
            a(((i332 | 615) << 1) - (i332 ^ 615), i334, (char) ((i335 ^ (-1)) + (i335 << 1)), objArr64);
            String str31 = (String) objArr64[0];
            int iIndexOf9 = TextUtils.indexOf((CharSequence) str4, '0', 0);
            int i336 = (iIndexOf9 & 659) + (iIndexOf9 | 659);
            int windowTouchSlop3 = ViewConfiguration.getWindowTouchSlop() >> 8;
            Object[] objArr65 = new Object[1];
            a(i336, (windowTouchSlop3 & 41) + (windowTouchSlop3 | 41), (char) TextUtils.getOffsetBefore(str4, 0), objArr65);
            String str32 = (String) objArr65[0];
            int i337 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 699;
            int i338 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            Object[] objArr66 = new Object[1];
            a(i337, ((i338 | 37) << 1) - (i338 ^ 37), (char) (10694 - (~(-(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))))), objArr66);
            String[] strArr13 = {str31, str32, (String) objArr66[0]};
            int i339 = 0;
            while (true) {
                if (i339 >= 3) {
                    i44 = i331;
                    i45 = i12;
                    break;
                }
                Object[] objArr67 = {strArr13[i339]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char c7 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                    int trimmedLength = 993 - TextUtils.getTrimmedLength(str4);
                    int trimmedLength2 = TextUtils.getTrimmedLength(str4) + 8;
                    byte b33 = (byte) 0;
                    byte b34 = b33;
                    Object[] objArr68 = new Object[1];
                    c(b33, b34, (byte) (b34 - 1), objArr68);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(c7, trimmedLength, trimmedLength2, 349342683, false, (String) objArr68[0], new Class[]{String.class});
                }
                long jLongValue7 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).invoke(null, objArr67)).longValue();
                long j51 = -429067619;
                String[] strArr14 = strArr13;
                long j52 = j51 ^ j24;
                i44 = i331;
                long jElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                long j53 = jLongValue7 | jElapsedRealtime2;
                long j54 = (((long) (-464)) * j51) + (((long) (-929)) * jLongValue7) + (((long) (-465)) * (j52 | (j53 ^ j24))) + (((long) 930) * (jLongValue7 | ((jElapsedRealtime2 | j52) ^ j24))) + (((long) 465) * (j53 | j52)) + ((long) (-418010986));
                int i340 = ((int) (j54 >> 32)) & (((~((-336625665) | i9)) * 130) + 549372778 + (((~((-336625665) | i12)) | 1090847008) * 130));
                int i341 = ((int) j54) & (((1153123995 + ((1785583198 | i9) * 1444)) + ((((~((-1628313253) | i12)) | 1611404804) | (~(191086842 | i12))) * (-1444))) - 700880878);
                if (((i340 & i341) | (i340 ^ i341)) != 0) {
                    int i342 = ((i339 | 280) << 1) - (i339 ^ 280);
                    i45 = (i342 & i9) | ((~i342) & i12);
                    break;
                }
                i339++;
                strArr13 = strArr14;
                i331 = i44;
            }
            int i343 = (~(i12 & i44)) & (i12 | i44);
            int i344 = i343 | (-i343);
            int i345 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i346 = (i345 & 79) + (i345 | 79);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i346 % 128;
            int i347 = i346 % 2 != 0 ? i344 * 31 : i344 >> 31;
            i331 = (i45 & (~i347)) | (i347 & i44);
        }
        int threadPriority4 = Process.getThreadPriority(0);
        int i348 = -(-(((threadPriority4 ^ 20) + ((threadPriority4 & 20) << 1)) >> 6));
        int i349 = (i348 & 737) + (i348 | 737);
        int i350 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
        Object[] objArr69 = new Object[1];
        a(i349, (i350 ^ 40) + ((i350 & 40) << 1), (char) (ImageFormat.getBitsPerPixel(0) + 1), objArr69);
        String str33 = (String) objArr69[0];
        int i351 = 777 - (~(-(ViewConfiguration.getPressedStateDuration() >> 16)));
        int i352 = -(-Color.argb(0, 0, 0, 0));
        int i353 = (i352 & 30) + (i352 | 30);
        int i354 = -Gravity.getAbsoluteGravity(0, 0);
        Object[] objArr70 = new Object[1];
        a(i351, i353, (char) (((i354 | 46563) << 1) - (i354 ^ 46563)), objArr70);
        String[] strArr15 = {str33, (String) objArr70[0]};
        int i355 = 2;
        int i356 = 0;
        while (true) {
            if (i356 >= i355) {
                i27 = i12;
                break;
            }
            int i357 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 33;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i357 % 128;
            int i358 = i357 % i355;
            Object[] objArr71 = {strArr15[i356]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                char edgeSlop2 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                int scrollBarSize = 993 - (ViewConfiguration.getScrollBarSize() >> 8);
                int iRgb = (-16777208) - Color.rgb(0, 0, 0);
                byte b35 = (byte) 1;
                byte b36 = (byte) (b35 - 1);
                Object[] objArr72 = new Object[1];
                c(b35, b36, (byte) (b36 - 1), objArr72);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(edgeSlop2, scrollBarSize, iRgb, 410748506, false, (String) objArr72[0], new Class[]{String.class});
            }
            long jLongValue8 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).invoke(null, objArr71)).longValue();
            long j55 = 1674555895;
            String[] strArr16 = strArr15;
            long j56 = j55 ^ j24;
            long j57 = jLongValue8 ^ j24;
            long j58 = ((j57 | j55) | j38) ^ j24;
            long j59 = (((long) 714) * j55) + (((long) (-712)) * jLongValue8) + (((long) (-713)) * (((j56 | j39) ^ j24) | ((j56 | jLongValue8) ^ j24) | j58)) + (((long) 1426) * j58) + (((long) 713) * ((j57 | j39) ^ j24)) + ((long) (-1875474132));
            int iNextInt = new Random().nextInt(1294110090);
            int i359 = ((int) (j59 >> 32)) & ((((~((-1532700997) | iNextInt)) | (-1592523486)) * 262) + 935632506 + (((~((~iNextInt) | (-1532700997))) | (-1592523486)) * 262));
            int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
            int i360 = (-966250604) + (((~((~iFreeMemory2) | (-491951005))) | 273711364) * (-245));
            int i361 = ~(iFreeMemory2 | (-491951005));
            int i362 = ((int) j59) & (i360 + (i361 * (-245)) + ((i361 | (-1929177415)) * 245));
            if (((i359 & i362) | (i359 ^ i362)) != 0) {
                i27 = (((i356 | 288) << 1) - (i356 ^ 288)) ^ i12;
                break;
            }
            i356++;
            strArr15 = strArr16;
            i355 = 2;
        }
        int i363 = (~(i12 & i331)) & (i12 | i331);
        int i364 = -i363;
        int i365 = ((i363 & i364) | (i363 ^ i364)) >> 31;
        int i366 = (i331 & i365) | (i27 & (~i365));
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-555308653);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
            char scrollBarSize2 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
            int iNormalizeMetaState2 = 3526 - KeyEvent.normalizeMetaState(0);
            int defaultSize2 = View.getDefaultSize(0, 0) + 23;
            byte b37 = (byte) 1;
            byte b38 = (byte) (b37 - 1);
            Object[] objArr73 = new Object[1];
            c(b37, b38, (byte) (b38 - 1), objArr73);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(scrollBarSize2, iNormalizeMetaState2, defaultSize2, 980946500, false, (String) objArr73[0], new Class[0]);
        }
        long jLongValue9 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).invoke(null, null)).longValue();
        long j60 = 1237346555;
        long j61 = -964;
        long j62 = (((long) (-963)) * j60) + j61 + (((long) 965) * jLongValue9);
        long j63 = jLongValue9 ^ j24;
        long jUptimeMillis2 = (int) SystemClock.uptimeMillis();
        long j64 = j62 + (((j60 ^ j24) | ((j63 | jUptimeMillis2) ^ j24)) * j61) + (j61 * ((((jUptimeMillis2 ^ j24) | j63) ^ j24) | ((j63 | j60) ^ j24))) + ((long) (-1417669193));
        int i367 = ((int) (j64 >> 32)) & ((((~(1156605586 | i9)) | 553976128 | (~((-1701135299) | i9))) * (-397)) + 1981966554 + ((563422544 | i12) * 397));
        int i368 = (int) j64;
        int i369 = ~Process.myTid();
        if ((i367 | (i368 & (((1019428157 + (((~(i369 | (-27267110))) | (~((-268976385) | i369))) * (-184))) + ((((-866734952) | (~(597758567 | i369))) | (~(839467842 | i369))) * 184)) - 1891213352))) != 1) {
            Object[] objArr74 = {1};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1331892133);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                char maxKeyCode2 = (char) (KeyEvent.getMaxKeyCode() >> 16);
                int threadPriority5 = ((Process.getThreadPriority(0) + 20) >> 6) + 2673;
                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 16;
                byte b39 = (byte) 1;
                byte b40 = (byte) (b39 - 1);
                Object[] objArr75 = new Object[1];
                c(b39, b40, (byte) (b40 - 1), objArr75);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(maxKeyCode2, threadPriority5, keyRepeatTimeout, -1409439630, false, (String) objArr75[0], new Class[]{Integer.TYPE});
            }
            long jLongValue10 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).invoke(null, objArr74)).longValue();
            long j65 = 1805015543;
            long elapsedCpuTime = (int) Process.getElapsedCpuTime();
            long j66 = elapsedCpuTime ^ j24;
            long j67 = 521;
            long j68 = j65 ^ j24;
            long j69 = (((long) 522) * j65) + (((long) (-520)) * jLongValue10) + (((long) (-1042)) * (j65 | ((j66 | jLongValue10) ^ j24))) + ((jLongValue10 | elapsedCpuTime) * j67) + (j67 * (((j68 | (jLongValue10 ^ j24)) ^ j24) | ((j68 | elapsedCpuTime) ^ j24) | (((j66 | j65) | jLongValue10) ^ j24))) + ((long) 62683137);
            int i370 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i370 % 128;
            int i371 = i370 % 2;
            int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
            int i372 = ~elapsedCpuTime2;
            int i373 = ((int) (j69 >> 32)) & ((-1717432780) + ((~(1964678577 | i372)) * 979) + (((-893062308) | elapsedCpuTime2) * (-979)) + (((~(elapsedCpuTime2 | 1964678577)) | (~(i372 | (-893062308)))) * 979));
            i28 = i;
            int i374 = 620285501 + (((~((-711084681) | i9)) | (~(720527305 | i28))) * 520);
            int i375 = ~((-720527306) | i9);
            int i376 = ~(2137213580 | i28);
            int i377 = (i373 | (((int) j69) & ((i374 + ((i375 | i376) * (-1040))) + ((((~((-2137213581) | i9)) | 9442625) | i376) * 520)))) != 0 ? (~(i28 & 220)) & (i28 | 220) : i28;
            int i378 = i28 ^ i366;
            int i379 = -i378;
            int i380 = ((i378 & i379) | (i378 ^ i379)) >> 31;
            int i381 = (i377 & (~i380)) | (i366 & i380);
            int iRgb2 = Color.rgb(0, 0, 0);
            int i382 = (iRgb2 ^ 16777586) + ((iRgb2 & 16777586) << 1);
            int maxKeyCode3 = KeyEvent.getMaxKeyCode();
            int i383 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i384 = (i383 & 75) + (i383 | 75);
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i384 % 128;
            if (i384 % 2 == 0) {
                KeyEvent.getModifierMetaStateMask();
                Object[] objArr76 = new Object[1];
                a(i382, maxKeyCode3 * 368, (char) 0, objArr76);
                obj = objArr76[0];
            } else {
                int i385 = 22 - (~(-(-(maxKeyCode3 >> 16))));
                byte modifierMetaStateMask2 = (byte) KeyEvent.getModifierMetaStateMask();
                Object[] objArr77 = new Object[1];
                a(i382, i385, (char) ((modifierMetaStateMask2 ^ 1) + ((modifierMetaStateMask2 & 1) << 1)), objArr77);
                obj = objArr77[0];
            }
            Object[] objArr78 = {(String) obj};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                char fadingEdgeLength2 = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 33602);
                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 3085;
                int iKeyCodeFromString2 = 26 - KeyEvent.keyCodeFromString(str4);
                byte b41 = (byte) 1;
                byte b42 = (byte) (b41 - 1);
                Object[] objArr79 = new Object[1];
                c(b41, b42, (byte) (b42 - 1), objArr79);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(fadingEdgeLength2, scrollDefaultDelay, iKeyCodeFromString2, 1411172903, false, (String) objArr79[0], new Class[]{String.class});
            }
            Object objInvoke2 = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).invoke(null, objArr78);
            if (objInvoke2 != null) {
                Object[] objArr80 = {objInvoke2, 42};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                    char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                    int doubleTapTimeout3 = 3393 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int iAlpha3 = 9 - Color.alpha(0);
                    byte b43 = (byte) 1;
                    byte b44 = (byte) (b43 - 1);
                    Object[] objArr81 = new Object[1];
                    c(b43, b44, (byte) (b44 - 1), objArr81);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(packedPositionChild, doubleTapTimeout3, iAlpha3, 1203525406, false, (String) objArr81[0], new Class[]{String.class, Integer.TYPE});
                }
                long jLongValue11 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).invoke(null, objArr80)).longValue();
                long j70 = 1036299101;
                long j71 = 628;
                long j72 = (j71 * j70) + (j71 * jLongValue11);
                long j73 = -627;
                long j74 = j72 + ((jLongValue11 | j38 | (j70 ^ j24)) * j73) + (j73 * (j70 | (((jLongValue11 ^ j24) | j38) ^ j24))) + (((long) 627) * (((j39 | jLongValue11) ^ j24) | ((j70 | j38) ^ j24))) + ((long) (-1038368978));
                int i386 = ((int) (j74 >> 32)) & ((-2075533230) + (((~(1402326954 | i9)) | 34899456) * 220) + (((~(1117048322 | i9)) | 320178088) * (-440)) + ((1402326954 | i28) * 220));
                int i387 = ((int) j74) & (171983653 + (((~((-286895113) | i9)) | (~((-1724121523) | i28))) * (-272)) + (((~(1860453366 | i28)) | (-2147348479)) * (-272)) + (((~((-1860453367) | i28)) | 423226956) * 272));
                if (((i386 & i387) | (i386 ^ i387)) == 1986687685) {
                    i30 = i4;
                    j3 = j32;
                    j2 = j20;
                    strArr3 = null;
                } else {
                    int i388 = 369 - (~(-TextUtils.indexOf(str4, str4, 0)));
                    int iIndexOf10 = TextUtils.indexOf(str4, str4);
                    Object[] objArr82 = new Object[1];
                    a(i388, (iIndexOf10 & 23) + (iIndexOf10 | 23), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), objArr82);
                    String str34 = (String) objArr82[0];
                    int capsMode2 = TextUtils.getCapsMode(str4, 0, 0);
                    int i389 = (capsMode2 ^ 808) + ((capsMode2 & 808) << 1);
                    int i390 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    Object[] objArr83 = new Object[1];
                    a(i389, ((i390 | 11) << 1) - (i390 ^ 11), (char) ((-1) - ImageFormat.getBitsPerPixel(0)), objArr83);
                    String str35 = (String) objArr83[0];
                    int iMyTid = Process.myTid() >> 22;
                    Object[] objArr84 = new Object[1];
                    a((iMyTid & 818) + (iMyTid | 818), TextUtils.lastIndexOf(str4, '0') + 8, (char) (ViewConfiguration.getTouchSlop() >> 8), objArr84);
                    String str36 = (String) objArr84[0];
                    int i391 = 824 - (~(-(ViewConfiguration.getScrollBarSize() >> 8)));
                    int i392 = -(-KeyEvent.getDeadChar(0, 0));
                    Object[] objArr85 = new Object[1];
                    a(i391, (i392 & 8) + (i392 | 8), (char) Color.red(0), objArr85);
                    String[] strArr17 = {str34, str35, str36, (String) objArr85[0]};
                    Object[] objArr86 = new Object[1];
                    a((-16776384) - (~(-Color.rgb(0, 0, 0))), 15 - (~(-(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))))), (char) View.MeasureSpec.getSize(0), objArr86);
                    String str37 = (String) objArr86[0];
                    Object[] objArr87 = new Object[1];
                    a(849 - MotionEvent.axisFromString(str4), Color.argb(0, 0, 0, 0) + 7, (char) (46597 - (~Process.getGidForName(str4))), objArr87);
                    String str38 = (String) objArr87[0];
                    int i393 = 856 - (~(-(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))));
                    int i394 = -KeyEvent.getDeadChar(0, 0);
                    Object[] objArr88 = new Object[1];
                    a(i393, (i394 & 7) + (i394 | 7), (char) (51891 - (~(ViewConfiguration.getTapTimeout() >> 16))), objArr88);
                    String str39 = (String) objArr88[0];
                    Object[] objArr89 = new Object[1];
                    a(863 - (~(-((Process.getThreadPriority(0) + 20) >> 6))), 9 - (~(-(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))))), (char) KeyEvent.getDeadChar(0, 0), objArr89);
                    String str40 = (String) objArr89[0];
                    Object[] objArr90 = new Object[1];
                    a(875 - (~((byte) KeyEvent.getModifierMetaStateMask())), 14 - View.resolveSize(0, 0), (char) View.combineMeasuredStates(0, 0), objArr90);
                    String[] strArr18 = {str37, str38, str39, str40, (String) objArr90[0]};
                    int packedPositionType = 889 - ExpandableListView.getPackedPositionType(0L);
                    int i395 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    Object[] objArr91 = new Object[1];
                    a(packedPositionType, (i395 & 17) + (i395 | 17), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr91);
                    String str41 = (String) objArr91[0];
                    int i396 = -(Process.myTid() >> 22);
                    int i397 = (i396 ^ TypedValues.Custom.TYPE_DIMENSION) + ((i396 & TypedValues.Custom.TYPE_DIMENSION) << 1);
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0);
                    Object[] objArr92 = new Object[1];
                    a(i397, (absoluteGravity2 ^ 3) + ((absoluteGravity2 & 3) << 1), (char) ((-2) - (~(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))), objArr92);
                    String str42 = (String) objArr92[0];
                    int i398 = -(-(ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    Object[] objArr93 = new Object[1];
                    a((i398 & 916) + (i398 | 916), 22 - View.getDefaultSize(0, 0), (char) ((-2) - ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) ^ (-1))), objArr93);
                    String str43 = (String) objArr93[0];
                    int i399 = -(-TextUtils.indexOf((CharSequence) str4, '0'));
                    int i400 = (i399 ^ 939) + ((i399 & 939) << 1);
                    int edgeSlop3 = 25 - (ViewConfiguration.getEdgeSlop() >> 16);
                    int i401 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    Object[] objArr94 = new Object[1];
                    a(i400, edgeSlop3, (char) ((i401 ^ 1933) + ((i401 & 1933) << 1)), objArr94);
                    String str44 = (String) objArr94[0];
                    int i402 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int i403 = (i402 & 963) + (i402 | 963);
                    int i404 = -Drawable.resolveOpacity(0, 0);
                    int iTuitionPaymentFragmentbindingInflater2 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
                    int i405 = ~i404;
                    int i406 = ~(i405 | (-29));
                    int i407 = ~iTuitionPaymentFragmentbindingInflater2;
                    int i408 = ~(((-29) ^ i407) | ((-29) & i407));
                    int i409 = (((i404 * (-445)) - 12460) - (~(-(-(((i406 ^ i408) | (i408 & i406)) * 446))))) - 1;
                    int i410 = ~((i405 ^ 28) | (i405 & 28));
                    int i411 = ~(iTuitionPaymentFragmentbindingInflater2 | (-29) | i404);
                    int i412 = ((i410 & i411) | (i410 ^ i411)) * 446;
                    int i413 = (i409 ^ i412) + ((i412 & i409) << 1);
                    int i414 = ~i404;
                    int i415 = (~((i414 & (-29)) | (i414 ^ (-29)))) * 446;
                    Object[] objArr95 = new Object[1];
                    a(i403, ((i413 | i415) << 1) - (i415 ^ i413), (char) (51974 - (~(-(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))))), objArr95);
                    i30 = i4;
                    j = j32;
                    String[] strArr19 = {str41, str42, str10, str43, str44, (String) objArr95[0]};
                    int iGreen = 991 - Color.green(0);
                    int i416 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                    int i417 = (i416 ^ 11) + ((i416 & 11) << 1);
                    int scrollBarSize3 = ViewConfiguration.getScrollBarSize() >> 8;
                    Object[] objArr96 = new Object[1];
                    a(iGreen, i417, (char) ((scrollBarSize3 & 47699) + (scrollBarSize3 | 47699)), objArr96);
                    String str45 = (String) objArr96[0];
                    int i418 = -(-(KeyEvent.getMaxKeyCode() >> 16));
                    int i419 = ((i418 | 1002) << 1) - (i418 ^ 1002);
                    int i420 = -Drawable.resolveOpacity(0, 0);
                    j2 = j20;
                    Object[] objArr97 = new Object[1];
                    a(i419, (i420 ^ 8) + ((i420 & 8) << 1), (char) (36862 - (~Gravity.getAbsoluteGravity(0, 0))), objArr97);
                    String str46 = (String) objArr97[0];
                    int i421 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    int i422 = (i421 & PointerIconCompat.TYPE_COPY) + (i421 | PointerIconCompat.TYPE_COPY);
                    int i423 = -View.MeasureSpec.getMode(0);
                    int i424 = ((i423 | 6) << 1) - (i423 ^ 6);
                    int threadPriority6 = (Process.getThreadPriority(0) + 20) >> 6;
                    Object[] objArr98 = new Object[1];
                    a(i422, i424, (char) ((43785 & threadPriority6) + (threadPriority6 | 43785)), objArr98);
                    String str47 = (String) objArr98[0];
                    int iLastIndexOf5 = TextUtils.lastIndexOf(str4, '0');
                    int i425 = ((iLastIndexOf5 | PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW) << 1) - (iLastIndexOf5 ^ PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW);
                    int iLastIndexOf6 = 5 - TextUtils.lastIndexOf(str4, '0', 0);
                    int i426 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    Object[] objArr99 = new Object[1];
                    a(i425, iLastIndexOf6, (char) (((i426 | 61258) << 1) - (i426 ^ 61258)), objArr99);
                    String[] strArr20 = {str45, str46, str47, (String) objArr99[0]};
                    int i427 = 1021 - (~(-(ViewConfiguration.getScrollBarFadeDuration() >> 16)));
                    int i428 = -View.combineMeasuredStates(0, 0);
                    int i429 = ((i428 | 16) << 1) - (i428 ^ 16);
                    int i430 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    Object[] objArr100 = new Object[1];
                    a(i427, i429, (char) (((48381 | i430) << 1) - (i430 ^ 48381)), objArr100);
                    String str48 = (String) objArr100[0];
                    int i431 = -View.getDefaultSize(0, 0);
                    Object[] objArr101 = new Object[1];
                    a(((i431 | 857) << 1) - (i431 ^ 857), 6 - (~(-Color.alpha(0))), (char) (51891 - (~Color.blue(0))), objArr101);
                    String str49 = (String) objArr101[0];
                    int offsetAfter = TextUtils.getOffsetAfter(str4, 0);
                    int i432 = ((offsetAfter | 825) << 1) - (offsetAfter ^ 825);
                    int i433 = -KeyEvent.keyCodeFromString(str4);
                    Object[] objArr102 = new Object[1];
                    a(i432, (i433 ^ 8) + ((i433 & 8) << 1), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), objArr102);
                    String[] strArr21 = {str48, str49, (String) objArr102[0]};
                    int i434 = 1037 - (~(-(-(Process.myTid() >> 22))));
                    int i435 = 14 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int i436 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    Object[] objArr103 = new Object[1];
                    a(i434, i435, (char) ((i436 ^ 1) + ((i436 & 1) << 1)), objArr103);
                    String str50 = (String) objArr103[0];
                    int i437 = -View.getDefaultSize(0, 0);
                    Object[] objArr104 = new Object[1];
                    a(((i437 | 1052) << 1) - (i437 ^ 1052), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 19478), objArr104);
                    String[] strArr22 = {str50, (String) objArr104[0]};
                    int i438 = -(-Color.blue(0));
                    int i439 = ((i438 | 1053) << 1) - (i438 ^ 1053);
                    int i440 = -Color.alpha(0);
                    int i441 = (i440 * 375) - 6723;
                    int i442 = ~i440;
                    int i443 = ~((i442 & 9) | (i442 ^ 9));
                    int i444 = ~((i9 ^ i440) | (i9 & i440));
                    int i445 = ((i443 & i444) | (i443 ^ i444)) * (-374);
                    int i446 = (i441 & i445) + (i441 | i445);
                    int i447 = -(-((~(((-10) ^ i440) | ((-10) & i440))) * 748));
                    int i448 = (i446 ^ i447) + ((i447 & i446) << 1);
                    int i449 = ~((~i440) | (-10));
                    int i450 = ~((i440 & i30) | (i30 ^ i440));
                    Object[] objArr105 = new Object[1];
                    a(i439, (i448 - (~(((i450 & i449) | (i449 ^ i450)) * 374))) - 1, (char) (30787 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr105);
                    String str51 = (String) objArr105[0];
                    int i451 = -TextUtils.indexOf(str4, str4, 0, 0);
                    Object[] objArr106 = new Object[1];
                    a((i451 ^ 1062) + ((i451 & 1062) << 1), -TextUtils.lastIndexOf(str4, '0', 0, 0), (char) ((-2) - (~(-TextUtils.indexOf((CharSequence) str4, '0', 0)))), objArr106);
                    String[] strArr23 = {str51, (String) objArr106[0]};
                    int iNormalizeMetaState3 = KeyEvent.normalizeMetaState(0);
                    Object[] objArr107 = new Object[1];
                    a(((iNormalizeMetaState3 | 1063) << 1) - (iNormalizeMetaState3 ^ 1063), (ViewConfiguration.getPressedStateDuration() >> 16) + 16, (char) (30103 - (~(-((byte) KeyEvent.getModifierMetaStateMask())))), objArr107);
                    String str52 = (String) objArr107[0];
                    int offsetBefore3 = TextUtils.getOffsetBefore(str4, 0);
                    int iTuitionPaymentFragmentbindingInflater3 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
                    int i452 = ~offsetBefore3;
                    int i453 = ~((i452 ^ TypedValues.Custom.TYPE_DIMENSION) | (i452 & TypedValues.Custom.TYPE_DIMENSION));
                    int i454 = ~iTuitionPaymentFragmentbindingInflater3;
                    int i455 = ~((i454 & TypedValues.Custom.TYPE_DIMENSION) | (i454 ^ TypedValues.Custom.TYPE_DIMENSION));
                    int i456 = (((offsetBefore3 * 595) - 1074235) - (~(((i455 & i453) | (i453 ^ i455)) * (-1188)))) - 1;
                    int i457 = ~(i452 | TypedValues.Custom.TYPE_DIMENSION);
                    int i458 = ~((-906) | iTuitionPaymentFragmentbindingInflater3);
                    int i459 = (i457 & i458) | (i457 ^ i458);
                    int i460 = ~iTuitionPaymentFragmentbindingInflater3;
                    int i461 = ~(i460 | offsetBefore3);
                    int i462 = ((i459 & i461) | (i459 ^ i461)) * 594;
                    int i463 = ((i456 | i462) << 1) - (i462 ^ i456);
                    int i464 = -(-(((~(((-906) ^ i460) | (i460 & (-906)))) | (~(((-906) ^ offsetBefore3) | ((-906) & offsetBefore3))) | (~(offsetBefore3 | i454))) * 594));
                    int i465 = (i463 & i464) + (i464 | i463);
                    int i466 = -(-TextUtils.getTrimmedLength(str4));
                    Object[] objArr108 = new Object[1];
                    a(i465, ((i466 | 3) << 1) - (i466 ^ 3), (char) View.resolveSizeAndState(0, 0, 0), objArr108);
                    String str53 = (String) objArr108[0];
                    int i467 = -(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    int i468 = (i467 ^ 849) + ((i467 & 849) << 1);
                    int i469 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    Object[] objArr109 = new Object[1];
                    a(i468, (i469 & 7) + (i469 | 7), (char) (46598 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr109);
                    String str54 = (String) objArr109[0];
                    int i470 = -(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    int i471 = (i470 & 1079) + (i470 | 1079);
                    int i472 = 7 - (~(-(ViewConfiguration.getKeyRepeatDelay() >> 16)));
                    int iIndexOf11 = TextUtils.indexOf((CharSequence) str4, '0', 0, 0);
                    char c8 = (char) ((iIndexOf11 & 1) + (iIndexOf11 | 1));
                    Object[] objArr110 = new Object[1];
                    a(i471, i472, c8, objArr110);
                    String str55 = (String) objArr110[0];
                    int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 864;
                    int iIndexOf12 = TextUtils.indexOf((CharSequence) str4, '0', 0, 0);
                    Object[] objArr111 = new Object[1];
                    a(iResolveSizeAndState, (iIndexOf12 ^ 12) + ((iIndexOf12 & 12) << 1), (char) ((-2) - (~(-ImageFormat.getBitsPerPixel(0)))), objArr111);
                    String str56 = (String) objArr111[0];
                    int i473 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                    Object[] objArr112 = new Object[1];
                    a(((i473 | 875) << 1) - (i473 ^ 875), 13 - (~(-(-(ViewConfiguration.getFadingEdgeLength() >> 16)))), (char) View.getDefaultSize(0, 0), objArr112);
                    String[] strArr24 = {str52, str53, str54, str55, str56, (String) objArr112[0]};
                    int i474 = -(-(ViewConfiguration.getTapTimeout() >> 16));
                    int i475 = (i474 ^ 1087) + ((i474 & 1087) << 1);
                    char mirror3 = AndroidCharacter.getMirror('0');
                    int i476 = (mirror3 * 371) - 10388;
                    int i477 = ~((27 ^ i9) | (27 & i9));
                    int i478 = ~mirror3;
                    int i479 = ~((i478 & i28) | (i478 ^ i28));
                    int i480 = ((i477 & i479) | (i477 ^ i479)) * (-370);
                    int i481 = (i476 & i480) + (i476 | i480);
                    int i482 = ~mirror3;
                    int i483 = (~((i482 & i9) | (i482 ^ i9))) | (~((27 ^ i28) | (27 & i28)));
                    int i484 = (mirror3 & 65508) | (mirror3 ^ 65508);
                    int i485 = ~i484;
                    int i486 = ((i483 & i485) | (i483 ^ i485)) * (-370);
                    int i487 = ((((i481 | i486) << 1) - (i486 ^ i481)) - (~(-(-((~i484) * 370))))) - 1;
                    int i488 = -TextUtils.lastIndexOf(str4, '0', 0);
                    int iTuitionPaymentFragmentbindingInflater4 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
                    int i489 = i488 * (-464);
                    int i490 = ((i489 | 929) << 1) - (i489 ^ 929);
                    int i491 = -(-((~i488) * (-465)));
                    int i492 = ((i490 | i491) << 1) - (i491 ^ i490);
                    int i493 = ~i488;
                    int i494 = ~((i493 ^ iTuitionPaymentFragmentbindingInflater4) | (i493 & iTuitionPaymentFragmentbindingInflater4));
                    int i495 = (i494 | (i494 ^ (-1))) * 930;
                    int i496 = iTuitionPaymentFragmentbindingInflater4 | (iTuitionPaymentFragmentbindingInflater4 ^ (-1));
                    char c9 = (char) ((((i492 | i495) << 1) - (i495 ^ i492)) + (((i493 & i496) | (i496 ^ i493)) * 465));
                    Object[] objArr113 = new Object[1];
                    a(i475, i487, c9, objArr113);
                    String str57 = (String) objArr113[0];
                    int i497 = -TextUtils.lastIndexOf(str4, '0', 0);
                    int iTuitionPaymentFragmentbindingInflater5 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
                    int i498 = i497 * (-716);
                    int i499 = ((1587110 | i498) << 1) - (1587110 ^ i498);
                    int i500 = ~i497;
                    int i501 = ((i500 ^ 1106) | (i500 & 1106)) * (-1434);
                    int i502 = (i499 ^ i501) + ((i501 & i499) << 1);
                    int i503 = ~iTuitionPaymentFragmentbindingInflater5;
                    int i504 = ~((i503 & 1106) | (i503 ^ 1106));
                    int i505 = ~(i497 | 1106);
                    int i506 = (i504 & i505) | (i504 ^ i505);
                    int i507 = (~i497) | (-1107);
                    int i508 = ~((i507 & iTuitionPaymentFragmentbindingInflater5) | (i507 ^ iTuitionPaymentFragmentbindingInflater5));
                    int i509 = i502 + (((i506 & i508) | (i506 ^ i508)) * 717);
                    int i510 = i500 | (-1107);
                    int i511 = ~iTuitionPaymentFragmentbindingInflater5;
                    int i512 = (~((i497 & 1106) | (i497 ^ 1106))) | (~((i510 & i511) | (i510 ^ i511)));
                    int i513 = ~(iTuitionPaymentFragmentbindingInflater5 | 1106);
                    Object[] objArr114 = new Object[1];
                    a(i509 + (((i512 & i513) | (i512 ^ i513)) * 717), TextUtils.lastIndexOf(str4, '0', 0, 0) + 20, (char) View.MeasureSpec.getSize(0), objArr114);
                    String str58 = (String) objArr114[0];
                    int i514 = 1125 - (~(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                    int i515 = 30 - (~(-Color.alpha(0)));
                    int iIndexOf13 = TextUtils.indexOf(str4, str4);
                    Object[] objArr115 = new Object[1];
                    a(i514, i515, (char) (((iIndexOf13 | 25170) << 1) - (iIndexOf13 ^ 25170)), objArr115);
                    String str59 = (String) objArr115[0];
                    int i516 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int i517 = (i516 & 1157) + (i516 | 1157);
                    int i518 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
                    int i519 = (i518 & 26) + (i518 | 26);
                    int i520 = -(-(ViewConfiguration.getTapTimeout() >> 16));
                    Object[] objArr116 = new Object[1];
                    a(i517, i519, (char) (((46155 | i520) << 1) - (i520 ^ 46155)), objArr116);
                    String str60 = (String) objArr116[0];
                    int i521 = -(-TextUtils.getTrimmedLength(str4));
                    int i522 = ((i521 | 1183) << 1) - (i521 ^ 1183);
                    int i523 = -(-View.MeasureSpec.getMode(0));
                    Object[] objArr117 = new Object[1];
                    a(i522, (i523 & 23) + (i523 | 23), (char) (25060 - Drawable.resolveOpacity(0, 0)), objArr117);
                    String str61 = (String) objArr117[0];
                    int iIndexOf14 = TextUtils.indexOf(str4, str4, 0, 0);
                    int i524 = (iIndexOf14 ^ 1206) + ((iIndexOf14 & 1206) << 1);
                    int i525 = -AndroidCharacter.getMirror('0');
                    Object[] objArr118 = new Object[1];
                    a(i524, (i525 & 81) + (i525 | 81), (char) (55225 - Color.argb(0, 0, 0, 0)), objArr118);
                    String[] strArr25 = {str57, str58, str59, str60, str61, (String) objArr118[0], str10};
                    int i526 = -AndroidCharacter.getMirror('0');
                    int i527 = (i526 & 1287) + (i526 | 1287);
                    int i528 = -View.combineMeasuredStates(0, 0);
                    Object[] objArr119 = new Object[1];
                    a(i527, (i528 ^ 13) + ((i528 & 13) << 1), (char) (TextUtils.lastIndexOf(str4, '0') + 1), objArr119);
                    String str62 = (String) objArr119[0];
                    byte modifierMetaStateMask3 = (byte) KeyEvent.getModifierMetaStateMask();
                    int i529 = (modifierMetaStateMask3 ^ 819) + ((modifierMetaStateMask3 & 819) << 1);
                    int i530 = 6 - (~(-Color.alpha(0)));
                    int gidForName = Process.getGidForName(str4);
                    int i531 = (gidForName * (-947)) + 949;
                    int i532 = ((~gidForName) | (~(((-2) ^ i28) | ((-2) & i28)))) * (-948);
                    int i533 = (i531 & i532) + (i531 | i532);
                    int i534 = ~gidForName;
                    int i535 = (i534 & (-2)) | (i534 ^ (-2));
                    Object[] objArr120 = new Object[1];
                    a(i529, i530, (char) ((((i533 - (~(-(-((~((i535 & i9) | (i535 ^ i9))) * (-948)))))) - 1) - (~(-(-(((gidForName & (-2)) | (gidForName ^ (-2))) * 948))))) - 1), objArr120);
                    String[] strArr26 = {str62, (String) objArr120[0]};
                    int i536 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    int i537 = (i536 ^ 1252) + ((i536 & 1252) << 1);
                    int i538 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                    int i539 = (i538 & 30) + (i538 | 30);
                    int i540 = -(KeyEvent.getMaxKeyCode() >> 16);
                    Object[] objArr121 = new Object[1];
                    a(i537, i539, (char) ((i540 ^ 10355) + ((i540 & 10355) << 1)), objArr121);
                    String str63 = (String) objArr121[0];
                    Object[] objArr122 = new Object[1];
                    a(1280 - (~(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 11 - ExpandableListView.getPackedPositionGroup(0L), (char) (29732 - ExpandableListView.getPackedPositionGroup(0L)), objArr122);
                    String[] strArr27 = {str63, (String) objArr122[0]};
                    int pressedStateDuration2 = 1293 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    int i541 = -TextUtils.getOffsetBefore(str4, 0);
                    Object[] objArr123 = new Object[1];
                    a(pressedStateDuration2, (i541 & 19) + (i541 | 19), (char) (64238 - (~(ViewConfiguration.getFadingEdgeLength() >> 16))), objArr123);
                    String str64 = (String) objArr123[0];
                    int i542 = -(-(ViewConfiguration.getJumpTapTimeout() >> 16));
                    Object[] objArr124 = new Object[1];
                    a(((i542 | 1312) << 1) - (i542 ^ 1312), 4 - (~(-Color.red(0))), (char) ExpandableListView.getPackedPositionGroup(0L), objArr124);
                    String[] strArr28 = {str64, (String) objArr124[0]};
                    int i543 = 1315 - (~(-Process.getGidForName(str4)));
                    int i544 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                    Object[] objArr125 = new Object[1];
                    a(i543, (i544 ^ 19) + ((i544 & 19) << 1), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr125);
                    String[] strArr29 = {(String) objArr125[0]};
                    int i545 = 1334 - (~(-(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))));
                    int i546 = 15 - (~(-(-(ViewConfiguration.getKeyRepeatTimeout() >> 16))));
                    int i547 = -(-Process.getGidForName(str4));
                    Object[] objArr126 = new Object[1];
                    a(i545, i546, (char) (((i547 | 17131) << 1) - (i547 ^ 17131)), objArr126);
                    String[] strArr30 = {(String) objArr126[0]};
                    int i548 = 1350 - (~(-(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))));
                    int i549 = -(-(Process.myTid() >> 22));
                    int i550 = (i549 & 19) + (i549 | 19);
                    int i551 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    Object[] objArr127 = new Object[1];
                    a(i548, i550, (char) (((60742 | i551) << 1) - (i551 ^ 60742)), objArr127);
                    String[] strArr31 = {(String) objArr127[0]};
                    int i552 = 1370 - (~View.MeasureSpec.getMode(0));
                    int i553 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                    int i554 = (i553 ^ 19) + ((i553 & 19) << 1);
                    int gidForName2 = Process.getGidForName(str4);
                    Object[] objArr128 = new Object[1];
                    a(i552, i554, (char) ((63951 ^ gidForName2) + ((gidForName2 & 63951) << 1)), objArr128);
                    String[] strArr32 = {(String) objArr128[0]};
                    int i555 = -ExpandableListView.getPackedPositionChild(0L);
                    int i556 = ((i555 | 1389) << 1) - (i555 ^ 1389);
                    int i557 = -View.resolveSize(0, 0);
                    Object[] objArr129 = new Object[1];
                    a(i556, (i557 & 23) + (i557 | 23), (char) (TextUtils.lastIndexOf(str4, '0', 0) + 50248), objArr129);
                    String[] strArr33 = {(String) objArr129[0]};
                    int i558 = 1412 - (~(Process.myTid() >> 22));
                    int windowTouchSlop4 = ViewConfiguration.getWindowTouchSlop() >> 8;
                    int i559 = (windowTouchSlop4 ^ 21) + ((windowTouchSlop4 & 21) << 1);
                    int edgeSlop4 = ViewConfiguration.getEdgeSlop() >> 16;
                    Object[] objArr130 = new Object[1];
                    a(i558, i559, (char) (((42191 | edgeSlop4) << 1) - (edgeSlop4 ^ 42191)), objArr130);
                    String[] strArr34 = {(String) objArr130[0]};
                    int iRed = Color.red(0);
                    Object[] objArr131 = new Object[1];
                    a((iRed & 1434) + (iRed | 1434), 22 - (~(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (char) ((-1) - ImageFormat.getBitsPerPixel(0)), objArr131);
                    String[] strArr35 = {(String) objArr131[0], str10};
                    int i560 = -(-(ViewConfiguration.getTapTimeout() >> 16));
                    Object[] objArr132 = new Object[1];
                    a((i560 & 1458) + (i560 | 1458), (ViewConfiguration.getLongPressTimeout() >> 16) + 28, (char) (0 - (~TextUtils.lastIndexOf(str4, '0'))), objArr132);
                    String[] strArr36 = {(String) objArr132[0], str10};
                    int i561 = 1485 - (~(-(-Drawable.resolveOpacity(0, 0))));
                    int i562 = -(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                    Object[] objArr133 = new Object[1];
                    a(i561, (i562 ^ 27) + ((i562 & 27) << 1), (char) (58594 - (~TextUtils.indexOf(str4, str4, 0))), objArr133);
                    String[] strArr37 = {(String) objArr133[0], str10};
                    int i563 = 1512 - (~KeyEvent.getDeadChar(0, 0));
                    int i564 = -(ViewConfiguration.getTouchSlop() >> 8);
                    int i565 = (i564 * 70) - 2108;
                    int i566 = ~i564;
                    int i567 = ~((i566 ^ (-32)) | (i566 & (-32)) | i28);
                    int i568 = i564 | 31;
                    int i569 = ~((i568 ^ i28) | (i568 & i28));
                    int i570 = ((i567 ^ i569) | (i567 & i569)) * 69;
                    int i571 = ((i565 | i570) << 1) - (i565 ^ i570);
                    int i572 = ~((i566 ^ 31) | (i566 & 31));
                    int i573 = ~((i566 & i28) | (i566 ^ i28));
                    int i574 = ((i572 & i573) | (i572 ^ i573) | (~((i28 ^ 31) | (i28 & 31)))) * (-69);
                    int i575 = ((i571 | i574) << 1) - (i574 ^ i571);
                    int i576 = -(-((~(i564 | (-32))) * 69));
                    int i577 = (i575 ^ i576) + ((i576 & i575) << 1);
                    int defaultSize3 = View.getDefaultSize(0, 0);
                    Object[] objArr134 = new Object[1];
                    a(i563, i577, (char) ((defaultSize3 & 3089) + (defaultSize3 | 3089)), objArr134);
                    String[] strArr38 = {(String) objArr134[0], str10};
                    int threadPriority7 = Process.getThreadPriority(0);
                    int i578 = -((((threadPriority7 | 20) << 1) - (threadPriority7 ^ 20)) >> 6);
                    int i579 = (i578 & 1544) + (i578 | 1544);
                    int i580 = 26 - (~(-(Process.myPid() >> 22)));
                    char mirror4 = AndroidCharacter.getMirror('0');
                    char c10 = (char) (((33506 | mirror4) << 1) - (mirror4 ^ 33506));
                    Object[] objArr135 = new Object[1];
                    a(i579, i580, c10, objArr135);
                    String[] strArr39 = {(String) objArr135[0], str10};
                    int i581 = 1570 - (~Color.alpha(0));
                    int edgeSlop5 = ViewConfiguration.getEdgeSlop() >> 16;
                    Object[] objArr136 = new Object[1];
                    a(i581, (edgeSlop5 & 32) + (edgeSlop5 | 32), (char) (58616 - KeyEvent.getDeadChar(0, 0)), objArr136);
                    strArr2 = new String[][]{strArr17, strArr18, strArr19, strArr20, strArr21, strArr22, strArr23, strArr24, strArr25, strArr26, strArr27, strArr28, strArr29, strArr30, strArr31, strArr32, strArr33, strArr34, strArr35, strArr36, strArr37, strArr38, strArr39, new String[]{(String) objArr136[0], str10}};
                    int i582 = 1601 - (~(-Process.getGidForName(str4)));
                    int i583 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    int i584 = -(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    Object[] objArr137 = new Object[1];
                    a(i582, i583, (char) ((i584 & 31982) + (i584 | 31982)), objArr137);
                    i31 = 0;
                    sb = new StringBuilder((String) objArr137[0]);
                    i32 = i28;
                    i33 = 0;
                    i34 = 0;
                    while (i33 < 24) {
                        String[] strArr40 = strArr2[i33];
                        Object[] objArr138 = {strArr40[i31]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char cAlpha = (char) (33602 - Color.alpha(i31));
                            int maxKeyCode4 = (KeyEvent.getMaxKeyCode() >> 16) + 3085;
                            int iNormalizeMetaState4 = KeyEvent.normalizeMetaState(0) + 26;
                            byte b45 = (byte) 1;
                            byte b46 = (byte) (b45 - 1);
                            Object[] objArr139 = new Object[1];
                            c(b45, b46, (byte) (b46 - 1), objArr139);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAlpha, maxKeyCode4, iNormalizeMetaState4, 1411172903, false, (String) objArr139[0], new Class[]{String.class});
                        }
                        str5 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr138);
                        String[] strArr41 = (String[]) Arrays.copyOfRange(strArr40, 1, strArr40.length);
                        if (str5 != null || str5.isEmpty()) {
                            i32 = i32;
                        } else {
                            if (strArr40.length != 1) {
                                int length4 = strArr41.length;
                                int i585 = 0;
                                while (true) {
                                    if (i585 >= length4) {
                                        z = false;
                                        break;
                                    }
                                    if (str5.contains(strArr41[i585])) {
                                        z = true;
                                        break;
                                    }
                                    int i586 = (i585 ^ 67) + ((i585 & 67) << 1);
                                    i585 = (i586 ^ (-66)) + ((i586 & (-66)) << 1);
                                }
                                if (!z) {
                                    i32 = i32;
                                }
                            }
                            int i587 = 6149 - (~(i33 * (-613)));
                            int i588 = ~(((-11) & i33) | ((-11) ^ i33));
                            int i589 = (i588 & i28) | (i28 ^ i588);
                            int i590 = ~i33;
                            int i591 = ~((i590 ^ 10) | (i590 & 10));
                            int i592 = -(-(((i589 & i591) | (i589 ^ i591)) * 614));
                            int i593 = (i587 & i592) + (i587 | i592);
                            int i594 = (~(((-11) & i33) | ((-11) ^ i33))) | (~((-11) | i9));
                            int i595 = ~((i9 ^ i33) | (i9 & i33));
                            int i596 = ((i594 & i595) | (i594 ^ i595)) * (-1228);
                            int i597 = (i593 ^ i596) + ((i596 & i593) << 1);
                            int i598 = ~(((-11) & i590) | ((-11) ^ i590) | i30);
                            int i599 = ~(i30 | 10 | i33);
                            int i600 = ((i598 & i599) | (i598 ^ i599)) * 614;
                            int i601 = (i597 ^ i600) + ((i600 & i597) << 1);
                            i32 = ((~i601) & i28) | (i601 & i9);
                            i34++;
                            if (i34 > 1) {
                                Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
                                i36 = 0;
                                Object[] objArr140 = new Object[1];
                                a((ViewConfiguration.getScrollDefaultDelay() >> 16) + 1604, 1 - (~(-TextUtils.getTrimmedLength(str4))), (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), objArr140);
                                sb.append((String) objArr140[0]);
                            } else {
                                i36 = 0;
                            }
                            sb.append(strArr40[i36]);
                            int capsMode3 = 1606 - TextUtils.getCapsMode(str4, i36, i36);
                            int i602 = -(-(ViewConfiguration.getLongPressTimeout() >> 16));
                            Object[] objArr141 = new Object[1];
                            a(capsMode3, (i602 & 1) + (i602 | 1), (char) (49046 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), objArr141);
                            sb.append((String) objArr141[0]);
                            sb.append(str5);
                        }
                        i33++;
                        strArr2 = strArr2;
                        j = j;
                        i381 = i381;
                        i31 = 0;
                    }
                    int i603 = i381;
                    j3 = j;
                    i35 = i32;
                    int scrollDefaultDelay2 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1607;
                    int i604 = -Color.red(0);
                    Object[] objArr142 = new Object[1];
                    a(scrollDefaultDelay2, (i604 ^ 1) + ((i604 & 1) << 1), (char) (7374 - (~(-TextUtils.indexOf(str4, str4)))), objArr142);
                    sb.append((String) objArr142[0]);
                    objArr = new Object[2];
                    if (i34 > 2) {
                        objArr[0] = new int[1];
                        String[] strArr42 = {sb.toString()};
                        ((int[]) objArr[0])[0] = i35;
                        objArr[1] = strArr42;
                    } else {
                        objArr[0] = new int[]{i28};
                        int i605 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 115;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i605 % 128;
                        int i606 = i605 % 2;
                        objArr[1] = new String[0];
                    }
                    int i607 = ((int[]) objArr[0])[0];
                    int i608 = (~(i28 & i603)) & (i28 | i603);
                    int i609 = (i608 | (-i608)) >> 31;
                    int i610 = i607 & (~i609);
                    int i611 = i603 & i609;
                    strArr3 = (String[]) objArr[1];
                    i381 = (i610 & i611) | (i610 ^ i611);
                }
            } else {
                int i3810 = 369 - (~(-TextUtils.indexOf(str4, str4, 0)));
                int iIndexOf15 = TextUtils.indexOf(str4, str4);
                Object[] objArr810 = new Object[1];
                a(i3810, (iIndexOf15 & 23) + (iIndexOf15 | 23), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), objArr810);
                String str310 = (String) objArr810[0];
                int capsMode4 = TextUtils.getCapsMode(str4, 0, 0);
                int i3811 = (capsMode4 ^ 808) + ((capsMode4 & 808) << 1);
                int i3910 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                Object[] objArr811 = new Object[1];
                a(i3811, ((i3910 | 11) << 1) - (i3910 ^ 11), (char) ((-1) - ImageFormat.getBitsPerPixel(0)), objArr811);
                String str311 = (String) objArr811[0];
                int iMyTid2 = Process.myTid() >> 22;
                Object[] objArr812 = new Object[1];
                a((iMyTid2 & 818) + (iMyTid2 | 818), TextUtils.lastIndexOf(str4, '0') + 8, (char) (ViewConfiguration.getTouchSlop() >> 8), objArr812);
                String str312 = (String) objArr812[0];
                int i3911 = 824 - (~(-(ViewConfiguration.getScrollBarSize() >> 8)));
                int i3912 = -(-KeyEvent.getDeadChar(0, 0));
                Object[] objArr813 = new Object[1];
                a(i3911, (i3912 & 8) + (i3912 | 8), (char) Color.red(0), objArr813);
                String[] strArr110 = {str310, str311, str312, (String) objArr813[0]};
                Object[] objArr814 = new Object[1];
                a((-16776384) - (~(-Color.rgb(0, 0, 0))), 15 - (~(-(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))))), (char) View.MeasureSpec.getSize(0), objArr814);
                String str313 = (String) objArr814[0];
                Object[] objArr815 = new Object[1];
                a(849 - MotionEvent.axisFromString(str4), Color.argb(0, 0, 0, 0) + 7, (char) (46597 - (~Process.getGidForName(str4))), objArr815);
                String str314 = (String) objArr815[0];
                int i3913 = 856 - (~(-(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))));
                int i3914 = -KeyEvent.getDeadChar(0, 0);
                Object[] objArr816 = new Object[1];
                a(i3913, (i3914 & 7) + (i3914 | 7), (char) (51891 - (~(ViewConfiguration.getTapTimeout() >> 16))), objArr816);
                String str315 = (String) objArr816[0];
                Object[] objArr817 = new Object[1];
                a(863 - (~(-((Process.getThreadPriority(0) + 20) >> 6))), 9 - (~(-(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))))), (char) KeyEvent.getDeadChar(0, 0), objArr817);
                String str410 = (String) objArr817[0];
                Object[] objArr910 = new Object[1];
                a(875 - (~((byte) KeyEvent.getModifierMetaStateMask())), 14 - View.resolveSize(0, 0), (char) View.combineMeasuredStates(0, 0), objArr910);
                String[] strArr111 = {str313, str314, str315, str410, (String) objArr910[0]};
                int packedPositionType2 = 889 - ExpandableListView.getPackedPositionType(0L);
                int i3915 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                Object[] objArr911 = new Object[1];
                a(packedPositionType2, (i3915 & 17) + (i3915 | 17), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr911);
                String str411 = (String) objArr911[0];
                int i3916 = -(Process.myTid() >> 22);
                int i3917 = (i3916 ^ TypedValues.Custom.TYPE_DIMENSION) + ((i3916 & TypedValues.Custom.TYPE_DIMENSION) << 1);
                int absoluteGravity3 = Gravity.getAbsoluteGravity(0, 0);
                Object[] objArr912 = new Object[1];
                a(i3917, (absoluteGravity3 ^ 3) + ((absoluteGravity3 & 3) << 1), (char) ((-2) - (~(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))), objArr912);
                String str412 = (String) objArr912[0];
                int i3918 = -(-(ViewConfiguration.getKeyRepeatTimeout() >> 16));
                Object[] objArr913 = new Object[1];
                a((i3918 & 916) + (i3918 | 916), 22 - View.getDefaultSize(0, 0), (char) ((-2) - ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) ^ (-1))), objArr913);
                String str413 = (String) objArr913[0];
                int i3919 = -(-TextUtils.indexOf((CharSequence) str4, '0'));
                int i4010 = (i3919 ^ 939) + ((i3919 & 939) << 1);
                int edgeSlop6 = 25 - (ViewConfiguration.getEdgeSlop() >> 16);
                int i4011 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                Object[] objArr914 = new Object[1];
                a(i4010, edgeSlop6, (char) ((i4011 ^ 1933) + ((i4011 & 1933) << 1)), objArr914);
                String str414 = (String) objArr914[0];
                int i4012 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                int i4013 = (i4012 & 963) + (i4012 | 963);
                int i4014 = -Drawable.resolveOpacity(0, 0);
                int iTuitionPaymentFragmentbindingInflater6 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
                int i4015 = ~i4014;
                int i4016 = ~(i4015 | (-29));
                int i4017 = ~iTuitionPaymentFragmentbindingInflater6;
                int i4018 = ~(((-29) ^ i4017) | ((-29) & i4017));
                int i4019 = (((i4014 * (-445)) - 12460) - (~(-(-(((i4016 ^ i4018) | (i4018 & i4016)) * 446))))) - 1;
                int i4110 = ~((i4015 ^ 28) | (i4015 & 28));
                int i4111 = ~(iTuitionPaymentFragmentbindingInflater6 | (-29) | i4014);
                int i4112 = ((i4110 & i4111) | (i4110 ^ i4111)) * 446;
                int i4113 = (i4019 ^ i4112) + ((i4112 & i4019) << 1);
                int i4114 = ~i4014;
                int i4115 = (~((i4114 & (-29)) | (i4114 ^ (-29)))) * 446;
                Object[] objArr915 = new Object[1];
                a(i4013, ((i4113 | i4115) << 1) - (i4115 ^ i4113), (char) (51974 - (~(-(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))))), objArr915);
                i30 = i4;
                j = j32;
                String[] strArr112 = {str411, str412, str10, str413, str414, (String) objArr915[0]};
                int iGreen2 = 991 - Color.green(0);
                int i4116 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                int i4117 = (i4116 ^ 11) + ((i4116 & 11) << 1);
                int scrollBarSize4 = ViewConfiguration.getScrollBarSize() >> 8;
                Object[] objArr916 = new Object[1];
                a(iGreen2, i4117, (char) ((scrollBarSize4 & 47699) + (scrollBarSize4 | 47699)), objArr916);
                String str415 = (String) objArr916[0];
                int i4118 = -(-(KeyEvent.getMaxKeyCode() >> 16));
                int i4119 = ((i4118 | 1002) << 1) - (i4118 ^ 1002);
                int i4210 = -Drawable.resolveOpacity(0, 0);
                j2 = j20;
                Object[] objArr917 = new Object[1];
                a(i4119, (i4210 ^ 8) + ((i4210 & 8) << 1), (char) (36862 - (~Gravity.getAbsoluteGravity(0, 0))), objArr917);
                String str416 = (String) objArr917[0];
                int i4211 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                int i4212 = (i4211 & PointerIconCompat.TYPE_COPY) + (i4211 | PointerIconCompat.TYPE_COPY);
                int i4213 = -View.MeasureSpec.getMode(0);
                int i4214 = ((i4213 | 6) << 1) - (i4213 ^ 6);
                int threadPriority8 = (Process.getThreadPriority(0) + 20) >> 6;
                Object[] objArr918 = new Object[1];
                a(i4212, i4214, (char) ((43785 & threadPriority8) + (threadPriority8 | 43785)), objArr918);
                String str417 = (String) objArr918[0];
                int iLastIndexOf7 = TextUtils.lastIndexOf(str4, '0');
                int i4215 = ((iLastIndexOf7 | PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW) << 1) - (iLastIndexOf7 ^ PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW);
                int iLastIndexOf8 = 5 - TextUtils.lastIndexOf(str4, '0', 0);
                int i4216 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                Object[] objArr919 = new Object[1];
                a(i4215, iLastIndexOf8, (char) (((i4216 | 61258) << 1) - (i4216 ^ 61258)), objArr919);
                String[] strArr210 = {str415, str416, str417, (String) objArr919[0]};
                int i4217 = 1021 - (~(-(ViewConfiguration.getScrollBarFadeDuration() >> 16)));
                int i4218 = -View.combineMeasuredStates(0, 0);
                int i4219 = ((i4218 | 16) << 1) - (i4218 ^ 16);
                int i4310 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                Object[] objArr1010 = new Object[1];
                a(i4217, i4219, (char) (((48381 | i4310) << 1) - (i4310 ^ 48381)), objArr1010);
                String str418 = (String) objArr1010[0];
                int i4311 = -View.getDefaultSize(0, 0);
                Object[] objArr1011 = new Object[1];
                a(((i4311 | 857) << 1) - (i4311 ^ 857), 6 - (~(-Color.alpha(0))), (char) (51891 - (~Color.blue(0))), objArr1011);
                String str419 = (String) objArr1011[0];
                int offsetAfter2 = TextUtils.getOffsetAfter(str4, 0);
                int i4312 = ((offsetAfter2 | 825) << 1) - (offsetAfter2 ^ 825);
                int i4313 = -KeyEvent.keyCodeFromString(str4);
                Object[] objArr1012 = new Object[1];
                a(i4312, (i4313 ^ 8) + ((i4313 & 8) << 1), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), objArr1012);
                String[] strArr211 = {str418, str419, (String) objArr1012[0]};
                int i4314 = 1037 - (~(-(-(Process.myTid() >> 22))));
                int i4315 = 14 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int i4316 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                Object[] objArr1013 = new Object[1];
                a(i4314, i4315, (char) ((i4316 ^ 1) + ((i4316 & 1) << 1)), objArr1013);
                String str510 = (String) objArr1013[0];
                int i4317 = -View.getDefaultSize(0, 0);
                Object[] objArr1014 = new Object[1];
                a(((i4317 | 1052) << 1) - (i4317 ^ 1052), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 19478), objArr1014);
                String[] strArr212 = {str510, (String) objArr1014[0]};
                int i4318 = -(-Color.blue(0));
                int i4319 = ((i4318 | 1053) << 1) - (i4318 ^ 1053);
                int i4410 = -Color.alpha(0);
                int i4411 = (i4410 * 375) - 6723;
                int i4412 = ~i4410;
                int i4413 = ~((i4412 & 9) | (i4412 ^ 9));
                int i4414 = ~((i9 ^ i4410) | (i9 & i4410));
                int i4415 = ((i4413 & i4414) | (i4413 ^ i4414)) * (-374);
                int i4416 = (i4411 & i4415) + (i4411 | i4415);
                int i4417 = -(-((~(((-10) ^ i4410) | ((-10) & i4410))) * 748));
                int i4418 = (i4416 ^ i4417) + ((i4417 & i4416) << 1);
                int i4419 = ~((~i4410) | (-10));
                int i4510 = ~((i4410 & i30) | (i30 ^ i4410));
                Object[] objArr1015 = new Object[1];
                a(i4319, (i4418 - (~(((i4510 & i4419) | (i4419 ^ i4510)) * 374))) - 1, (char) (30787 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr1015);
                String str511 = (String) objArr1015[0];
                int i4511 = -TextUtils.indexOf(str4, str4, 0, 0);
                Object[] objArr1016 = new Object[1];
                a((i4511 ^ 1062) + ((i4511 & 1062) << 1), -TextUtils.lastIndexOf(str4, '0', 0, 0), (char) ((-2) - (~(-TextUtils.indexOf((CharSequence) str4, '0', 0)))), objArr1016);
                String[] strArr213 = {str511, (String) objArr1016[0]};
                int iNormalizeMetaState5 = KeyEvent.normalizeMetaState(0);
                Object[] objArr1017 = new Object[1];
                a(((iNormalizeMetaState5 | 1063) << 1) - (iNormalizeMetaState5 ^ 1063), (ViewConfiguration.getPressedStateDuration() >> 16) + 16, (char) (30103 - (~(-((byte) KeyEvent.getModifierMetaStateMask())))), objArr1017);
                String str512 = (String) objArr1017[0];
                int offsetBefore4 = TextUtils.getOffsetBefore(str4, 0);
                int iTuitionPaymentFragmentbindingInflater7 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
                int i4512 = ~offsetBefore4;
                int i4513 = ~((i4512 ^ TypedValues.Custom.TYPE_DIMENSION) | (i4512 & TypedValues.Custom.TYPE_DIMENSION));
                int i4514 = ~iTuitionPaymentFragmentbindingInflater7;
                int i4515 = ~((i4514 & TypedValues.Custom.TYPE_DIMENSION) | (i4514 ^ TypedValues.Custom.TYPE_DIMENSION));
                int i4516 = (((offsetBefore4 * 595) - 1074235) - (~(((i4515 & i4513) | (i4513 ^ i4515)) * (-1188)))) - 1;
                int i4517 = ~(i4512 | TypedValues.Custom.TYPE_DIMENSION);
                int i4518 = ~((-906) | iTuitionPaymentFragmentbindingInflater7);
                int i4519 = (i4517 & i4518) | (i4517 ^ i4518);
                int i4610 = ~iTuitionPaymentFragmentbindingInflater7;
                int i4611 = ~(i4610 | offsetBefore4);
                int i4612 = ((i4519 & i4611) | (i4519 ^ i4611)) * 594;
                int i4613 = ((i4516 | i4612) << 1) - (i4612 ^ i4516);
                int i4614 = -(-(((~(((-906) ^ i4610) | (i4610 & (-906)))) | (~(((-906) ^ offsetBefore4) | ((-906) & offsetBefore4))) | (~(offsetBefore4 | i4514))) * 594));
                int i4615 = (i4613 & i4614) + (i4614 | i4613);
                int i4616 = -(-TextUtils.getTrimmedLength(str4));
                Object[] objArr1018 = new Object[1];
                a(i4615, ((i4616 | 3) << 1) - (i4616 ^ 3), (char) View.resolveSizeAndState(0, 0, 0), objArr1018);
                String str513 = (String) objArr1018[0];
                int i4617 = -(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                int i4618 = (i4617 ^ 849) + ((i4617 & 849) << 1);
                int i4619 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                Object[] objArr1019 = new Object[1];
                a(i4618, (i4619 & 7) + (i4619 | 7), (char) (46598 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr1019);
                String str514 = (String) objArr1019[0];
                int i4710 = -(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                int i4711 = (i4710 & 1079) + (i4710 | 1079);
                int i4712 = 7 - (~(-(ViewConfiguration.getKeyRepeatDelay() >> 16)));
                int iIndexOf16 = TextUtils.indexOf((CharSequence) str4, '0', 0, 0);
                char c11 = (char) ((iIndexOf16 & 1) + (iIndexOf16 | 1));
                Object[] objArr1110 = new Object[1];
                a(i4711, i4712, c11, objArr1110);
                String str515 = (String) objArr1110[0];
                int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0) + 864;
                int iIndexOf17 = TextUtils.indexOf((CharSequence) str4, '0', 0, 0);
                Object[] objArr1111 = new Object[1];
                a(iResolveSizeAndState2, (iIndexOf17 ^ 12) + ((iIndexOf17 & 12) << 1), (char) ((-2) - (~(-ImageFormat.getBitsPerPixel(0)))), objArr1111);
                String str516 = (String) objArr1111[0];
                int i4713 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                Object[] objArr1112 = new Object[1];
                a(((i4713 | 875) << 1) - (i4713 ^ 875), 13 - (~(-(-(ViewConfiguration.getFadingEdgeLength() >> 16)))), (char) View.getDefaultSize(0, 0), objArr1112);
                String[] strArr214 = {str512, str513, str514, str515, str516, (String) objArr1112[0]};
                int i4714 = -(-(ViewConfiguration.getTapTimeout() >> 16));
                int i4715 = (i4714 ^ 1087) + ((i4714 & 1087) << 1);
                char mirror5 = AndroidCharacter.getMirror('0');
                int i4716 = (mirror5 * 371) - 10388;
                int i4717 = ~((27 ^ i9) | (27 & i9));
                int i4718 = ~mirror5;
                int i4719 = ~((i4718 & i28) | (i4718 ^ i28));
                int i4810 = ((i4717 & i4719) | (i4717 ^ i4719)) * (-370);
                int i4811 = (i4716 & i4810) + (i4716 | i4810);
                int i4812 = ~mirror5;
                int i4813 = (~((i4812 & i9) | (i4812 ^ i9))) | (~((27 ^ i28) | (27 & i28)));
                int i4814 = (mirror5 & 65508) | (mirror5 ^ 65508);
                int i4815 = ~i4814;
                int i4816 = ((i4813 & i4815) | (i4813 ^ i4815)) * (-370);
                int i4817 = ((((i4811 | i4816) << 1) - (i4816 ^ i4811)) - (~(-(-((~i4814) * 370))))) - 1;
                int i4818 = -TextUtils.lastIndexOf(str4, '0', 0);
                int iTuitionPaymentFragmentbindingInflater8 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
                int i4819 = i4818 * (-464);
                int i4910 = ((i4819 | 929) << 1) - (i4819 ^ 929);
                int i4911 = -(-((~i4818) * (-465)));
                int i4912 = ((i4910 | i4911) << 1) - (i4911 ^ i4910);
                int i4913 = ~i4818;
                int i4914 = ~((i4913 ^ iTuitionPaymentFragmentbindingInflater8) | (i4913 & iTuitionPaymentFragmentbindingInflater8));
                int i4915 = (i4914 | (i4914 ^ (-1))) * 930;
                int i4916 = iTuitionPaymentFragmentbindingInflater8 | (iTuitionPaymentFragmentbindingInflater8 ^ (-1));
                char c12 = (char) ((((i4912 | i4915) << 1) - (i4915 ^ i4912)) + (((i4913 & i4916) | (i4916 ^ i4913)) * 465));
                Object[] objArr1113 = new Object[1];
                a(i4715, i4817, c12, objArr1113);
                String str517 = (String) objArr1113[0];
                int i4917 = -TextUtils.lastIndexOf(str4, '0', 0);
                int iTuitionPaymentFragmentbindingInflater9 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
                int i4918 = i4917 * (-716);
                int i4919 = ((1587110 | i4918) << 1) - (1587110 ^ i4918);
                int i5010 = ~i4917;
                int i5011 = ((i5010 ^ 1106) | (i5010 & 1106)) * (-1434);
                int i5012 = (i4919 ^ i5011) + ((i5011 & i4919) << 1);
                int i5013 = ~iTuitionPaymentFragmentbindingInflater9;
                int i5014 = ~((i5013 & 1106) | (i5013 ^ 1106));
                int i5015 = ~(i4917 | 1106);
                int i5016 = (i5014 & i5015) | (i5014 ^ i5015);
                int i5017 = (~i4917) | (-1107);
                int i5018 = ~((i5017 & iTuitionPaymentFragmentbindingInflater9) | (i5017 ^ iTuitionPaymentFragmentbindingInflater9));
                int i5019 = i5012 + (((i5016 & i5018) | (i5016 ^ i5018)) * 717);
                int i5110 = i5010 | (-1107);
                int i5111 = ~iTuitionPaymentFragmentbindingInflater9;
                int i5112 = (~((i4917 & 1106) | (i4917 ^ 1106))) | (~((i5110 & i5111) | (i5110 ^ i5111)));
                int i5113 = ~(iTuitionPaymentFragmentbindingInflater9 | 1106);
                Object[] objArr1114 = new Object[1];
                a(i5019 + (((i5112 & i5113) | (i5112 ^ i5113)) * 717), TextUtils.lastIndexOf(str4, '0', 0, 0) + 20, (char) View.MeasureSpec.getSize(0), objArr1114);
                String str518 = (String) objArr1114[0];
                int i5114 = 1125 - (~(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                int i5115 = 30 - (~(-Color.alpha(0)));
                int iIndexOf18 = TextUtils.indexOf(str4, str4);
                Object[] objArr1115 = new Object[1];
                a(i5114, i5115, (char) (((iIndexOf18 | 25170) << 1) - (iIndexOf18 ^ 25170)), objArr1115);
                String str519 = (String) objArr1115[0];
                int i5116 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int i5117 = (i5116 & 1157) + (i5116 | 1157);
                int i5118 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
                int i5119 = (i5118 & 26) + (i5118 | 26);
                int i5210 = -(-(ViewConfiguration.getTapTimeout() >> 16));
                Object[] objArr1116 = new Object[1];
                a(i5117, i5119, (char) (((46155 | i5210) << 1) - (i5210 ^ 46155)), objArr1116);
                String str65 = (String) objArr1116[0];
                int i5211 = -(-TextUtils.getTrimmedLength(str4));
                int i5212 = ((i5211 | 1183) << 1) - (i5211 ^ 1183);
                int i5213 = -(-View.MeasureSpec.getMode(0));
                Object[] objArr1117 = new Object[1];
                a(i5212, (i5213 & 23) + (i5213 | 23), (char) (25060 - Drawable.resolveOpacity(0, 0)), objArr1117);
                String str66 = (String) objArr1117[0];
                int iIndexOf19 = TextUtils.indexOf(str4, str4, 0, 0);
                int i5214 = (iIndexOf19 ^ 1206) + ((iIndexOf19 & 1206) << 1);
                int i5215 = -AndroidCharacter.getMirror('0');
                Object[] objArr1118 = new Object[1];
                a(i5214, (i5215 & 81) + (i5215 | 81), (char) (55225 - Color.argb(0, 0, 0, 0)), objArr1118);
                String[] strArr215 = {str517, str518, str519, str65, str66, (String) objArr1118[0], str10};
                int i5216 = -AndroidCharacter.getMirror('0');
                int i5217 = (i5216 & 1287) + (i5216 | 1287);
                int i5218 = -View.combineMeasuredStates(0, 0);
                Object[] objArr1119 = new Object[1];
                a(i5217, (i5218 ^ 13) + ((i5218 & 13) << 1), (char) (TextUtils.lastIndexOf(str4, '0') + 1), objArr1119);
                String str67 = (String) objArr1119[0];
                byte modifierMetaStateMask4 = (byte) KeyEvent.getModifierMetaStateMask();
                int i5219 = (modifierMetaStateMask4 ^ 819) + ((modifierMetaStateMask4 & 819) << 1);
                int i5310 = 6 - (~(-Color.alpha(0)));
                int gidForName3 = Process.getGidForName(str4);
                int i5311 = (gidForName3 * (-947)) + 949;
                int i5312 = ((~gidForName3) | (~(((-2) ^ i28) | ((-2) & i28)))) * (-948);
                int i5313 = (i5311 & i5312) + (i5311 | i5312);
                int i5314 = ~gidForName3;
                int i5315 = (i5314 & (-2)) | (i5314 ^ (-2));
                Object[] objArr1210 = new Object[1];
                a(i5219, i5310, (char) ((((i5313 - (~(-(-((~((i5315 & i9) | (i5315 ^ i9))) * (-948)))))) - 1) - (~(-(-(((gidForName3 & (-2)) | (gidForName3 ^ (-2))) * 948))))) - 1), objArr1210);
                String[] strArr216 = {str67, (String) objArr1210[0]};
                int i5316 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int i5317 = (i5316 ^ 1252) + ((i5316 & 1252) << 1);
                int i5318 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                int i5319 = (i5318 & 30) + (i5318 | 30);
                int i5410 = -(KeyEvent.getMaxKeyCode() >> 16);
                Object[] objArr1211 = new Object[1];
                a(i5317, i5319, (char) ((i5410 ^ 10355) + ((i5410 & 10355) << 1)), objArr1211);
                String str68 = (String) objArr1211[0];
                Object[] objArr1212 = new Object[1];
                a(1280 - (~(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 11 - ExpandableListView.getPackedPositionGroup(0L), (char) (29732 - ExpandableListView.getPackedPositionGroup(0L)), objArr1212);
                String[] strArr217 = {str68, (String) objArr1212[0]};
                int pressedStateDuration3 = 1293 - (ViewConfiguration.getPressedStateDuration() >> 16);
                int i5411 = -TextUtils.getOffsetBefore(str4, 0);
                Object[] objArr1213 = new Object[1];
                a(pressedStateDuration3, (i5411 & 19) + (i5411 | 19), (char) (64238 - (~(ViewConfiguration.getFadingEdgeLength() >> 16))), objArr1213);
                String str69 = (String) objArr1213[0];
                int i5412 = -(-(ViewConfiguration.getJumpTapTimeout() >> 16));
                Object[] objArr1214 = new Object[1];
                a(((i5412 | 1312) << 1) - (i5412 ^ 1312), 4 - (~(-Color.red(0))), (char) ExpandableListView.getPackedPositionGroup(0L), objArr1214);
                String[] strArr218 = {str69, (String) objArr1214[0]};
                int i5413 = 1315 - (~(-Process.getGidForName(str4)));
                int i5414 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                Object[] objArr1215 = new Object[1];
                a(i5413, (i5414 ^ 19) + ((i5414 & 19) << 1), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr1215);
                String[] strArr219 = {(String) objArr1215[0]};
                int i5415 = 1334 - (~(-(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))));
                int i5416 = 15 - (~(-(-(ViewConfiguration.getKeyRepeatTimeout() >> 16))));
                int i5417 = -(-Process.getGidForName(str4));
                Object[] objArr1216 = new Object[1];
                a(i5415, i5416, (char) (((i5417 | 17131) << 1) - (i5417 ^ 17131)), objArr1216);
                String[] strArr310 = {(String) objArr1216[0]};
                int i5418 = 1350 - (~(-(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))));
                int i5419 = -(-(Process.myTid() >> 22));
                int i5510 = (i5419 & 19) + (i5419 | 19);
                int i5511 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                Object[] objArr1217 = new Object[1];
                a(i5418, i5510, (char) (((60742 | i5511) << 1) - (i5511 ^ 60742)), objArr1217);
                String[] strArr311 = {(String) objArr1217[0]};
                int i5512 = 1370 - (~View.MeasureSpec.getMode(0));
                int i5513 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                int i5514 = (i5513 ^ 19) + ((i5513 & 19) << 1);
                int gidForName4 = Process.getGidForName(str4);
                Object[] objArr1218 = new Object[1];
                a(i5512, i5514, (char) ((63951 ^ gidForName4) + ((gidForName4 & 63951) << 1)), objArr1218);
                String[] strArr312 = {(String) objArr1218[0]};
                int i5515 = -ExpandableListView.getPackedPositionChild(0L);
                int i5516 = ((i5515 | 1389) << 1) - (i5515 ^ 1389);
                int i5517 = -View.resolveSize(0, 0);
                Object[] objArr1219 = new Object[1];
                a(i5516, (i5517 & 23) + (i5517 | 23), (char) (TextUtils.lastIndexOf(str4, '0', 0) + 50248), objArr1219);
                String[] strArr313 = {(String) objArr1219[0]};
                int i5518 = 1412 - (~(Process.myTid() >> 22));
                int windowTouchSlop5 = ViewConfiguration.getWindowTouchSlop() >> 8;
                int i5519 = (windowTouchSlop5 ^ 21) + ((windowTouchSlop5 & 21) << 1);
                int edgeSlop7 = ViewConfiguration.getEdgeSlop() >> 16;
                Object[] objArr1310 = new Object[1];
                a(i5518, i5519, (char) (((42191 | edgeSlop7) << 1) - (edgeSlop7 ^ 42191)), objArr1310);
                String[] strArr314 = {(String) objArr1310[0]};
                int iRed2 = Color.red(0);
                Object[] objArr1311 = new Object[1];
                a((iRed2 & 1434) + (iRed2 | 1434), 22 - (~(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (char) ((-1) - ImageFormat.getBitsPerPixel(0)), objArr1311);
                String[] strArr315 = {(String) objArr1311[0], str10};
                int i5610 = -(-(ViewConfiguration.getTapTimeout() >> 16));
                Object[] objArr1312 = new Object[1];
                a((i5610 & 1458) + (i5610 | 1458), (ViewConfiguration.getLongPressTimeout() >> 16) + 28, (char) (0 - (~TextUtils.lastIndexOf(str4, '0'))), objArr1312);
                String[] strArr316 = {(String) objArr1312[0], str10};
                int i5611 = 1485 - (~(-(-Drawable.resolveOpacity(0, 0))));
                int i5612 = -(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                Object[] objArr1313 = new Object[1];
                a(i5611, (i5612 ^ 27) + ((i5612 & 27) << 1), (char) (58594 - (~TextUtils.indexOf(str4, str4, 0))), objArr1313);
                String[] strArr317 = {(String) objArr1313[0], str10};
                int i5613 = 1512 - (~KeyEvent.getDeadChar(0, 0));
                int i5614 = -(ViewConfiguration.getTouchSlop() >> 8);
                int i5615 = (i5614 * 70) - 2108;
                int i5616 = ~i5614;
                int i5617 = ~((i5616 ^ (-32)) | (i5616 & (-32)) | i28);
                int i5618 = i5614 | 31;
                int i5619 = ~((i5618 ^ i28) | (i5618 & i28));
                int i5710 = ((i5617 ^ i5619) | (i5617 & i5619)) * 69;
                int i5711 = ((i5615 | i5710) << 1) - (i5615 ^ i5710);
                int i5712 = ~((i5616 ^ 31) | (i5616 & 31));
                int i5713 = ~((i5616 & i28) | (i5616 ^ i28));
                int i5714 = ((i5712 & i5713) | (i5712 ^ i5713) | (~((i28 ^ 31) | (i28 & 31)))) * (-69);
                int i5715 = ((i5711 | i5714) << 1) - (i5714 ^ i5711);
                int i5716 = -(-((~(i5614 | (-32))) * 69));
                int i5717 = (i5715 ^ i5716) + ((i5716 & i5715) << 1);
                int defaultSize4 = View.getDefaultSize(0, 0);
                Object[] objArr1314 = new Object[1];
                a(i5613, i5717, (char) ((defaultSize4 & 3089) + (defaultSize4 | 3089)), objArr1314);
                String[] strArr318 = {(String) objArr1314[0], str10};
                int threadPriority9 = Process.getThreadPriority(0);
                int i5718 = -((((threadPriority9 | 20) << 1) - (threadPriority9 ^ 20)) >> 6);
                int i5719 = (i5718 & 1544) + (i5718 | 1544);
                int i5810 = 26 - (~(-(Process.myPid() >> 22)));
                char mirror6 = AndroidCharacter.getMirror('0');
                char c13 = (char) (((33506 | mirror6) << 1) - (mirror6 ^ 33506));
                Object[] objArr1315 = new Object[1];
                a(i5719, i5810, c13, objArr1315);
                String[] strArr319 = {(String) objArr1315[0], str10};
                int i5811 = 1570 - (~Color.alpha(0));
                int edgeSlop8 = ViewConfiguration.getEdgeSlop() >> 16;
                Object[] objArr1316 = new Object[1];
                a(i5811, (edgeSlop8 & 32) + (edgeSlop8 | 32), (char) (58616 - KeyEvent.getDeadChar(0, 0)), objArr1316);
                strArr2 = new String[][]{strArr110, strArr111, strArr112, strArr210, strArr211, strArr212, strArr213, strArr214, strArr215, strArr216, strArr217, strArr218, strArr219, strArr310, strArr311, strArr312, strArr313, strArr314, strArr315, strArr316, strArr317, strArr318, strArr319, new String[]{(String) objArr1316[0], str10}};
                int i5812 = 1601 - (~(-Process.getGidForName(str4)));
                int i5813 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                int i5814 = -(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                Object[] objArr1317 = new Object[1];
                a(i5812, i5813, (char) ((i5814 & 31982) + (i5814 | 31982)), objArr1317);
                i31 = 0;
                sb = new StringBuilder((String) objArr1317[0]);
                i32 = i28;
                i33 = 0;
                i34 = 0;
                while (i33 < 24) {
                    String[] strArr43 = strArr2[i33];
                    Object[] objArr1318 = {strArr43[i31]};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char cAlpha2 = (char) (33602 - Color.alpha(i31));
                        int maxKeyCode5 = (KeyEvent.getMaxKeyCode() >> 16) + 3085;
                        int iNormalizeMetaState6 = KeyEvent.normalizeMetaState(0) + 26;
                        byte b47 = (byte) 1;
                        byte b48 = (byte) (b47 - 1);
                        Object[] objArr1319 = new Object[1];
                        c(b47, b48, (byte) (b48 - 1), objArr1319);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAlpha2, maxKeyCode5, iNormalizeMetaState6, 1411172903, false, (String) objArr1319[0], new Class[]{String.class});
                    }
                    str5 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr1318);
                    String[] strArr44 = (String[]) Arrays.copyOfRange(strArr43, 1, strArr43.length);
                    if (str5 != null) {
                        i32 = i32;
                    } else {
                        i32 = i32;
                    }
                    i33++;
                    strArr2 = strArr2;
                    j = j;
                    i381 = i381;
                    i31 = 0;
                }
                int i6010 = i381;
                j3 = j;
                i35 = i32;
                int scrollDefaultDelay3 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1607;
                int i6011 = -Color.red(0);
                Object[] objArr143 = new Object[1];
                a(scrollDefaultDelay3, (i6011 ^ 1) + ((i6011 & 1) << 1), (char) (7374 - (~(-TextUtils.indexOf(str4, str4)))), objArr143);
                sb.append((String) objArr143[0]);
                objArr = new Object[2];
                if (i34 > 2) {
                    objArr[0] = new int[1];
                    String[] strArr45 = {sb.toString()};
                    ((int[]) objArr[0])[0] = i35;
                    objArr[1] = strArr45;
                } else {
                    objArr[0] = new int[]{i28};
                    int i6012 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 115;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6012 % 128;
                    int i6013 = i6012 % 2;
                    objArr[1] = new String[0];
                }
                int i6014 = ((int[]) objArr[0])[0];
                int i6015 = (~(i28 & i6010)) & (i28 | i6010);
                int i6016 = (i6015 | (-i6015)) >> 31;
                int i612 = i6014 & (~i6016);
                int i613 = i6010 & i6016;
                strArr3 = (String[]) objArr[1];
                i381 = (i612 & i613) | (i612 ^ i613);
            }
            int trimmedLength3 = 889 - TextUtils.getTrimmedLength(str4);
            int i614 = -(ViewConfiguration.getScrollBarSize() >> 8);
            Object[] objArr144 = new Object[1];
            a(trimmedLength3, (i614 & 16) + (i614 | 16), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr144);
            Object[] objArr145 = {(String) objArr144[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                char c14 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33602);
                int iKeyCodeFromString3 = KeyEvent.keyCodeFromString(str4) + 3085;
                int touchSlop = 26 - (ViewConfiguration.getTouchSlop() >> 8);
                byte b49 = (byte) 1;
                byte b50 = (byte) (b49 - 1);
                Object[] objArr146 = new Object[1];
                c(b49, b50, (byte) (b50 - 1), objArr146);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(c14, iKeyCodeFromString3, touchSlop, 1411172903, false, (String) objArr146[0], new Class[]{String.class});
            }
            Object objInvoke3 = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).invoke(null, objArr145);
            if (objInvoke3 == null) {
                i37 = 0;
            } else {
                Object[] objArr147 = {objInvoke3, 42};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                    char c15 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int i615 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3392;
                    int iMyTid3 = (Process.myTid() >> 22) + 9;
                    byte b51 = (byte) 1;
                    byte b52 = (byte) (b51 - 1);
                    Object[] objArr148 = new Object[1];
                    c(b51, b52, (byte) (b52 - 1), objArr148);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(c15, i615, iMyTid3, 1203525406, false, (String) objArr148[0], new Class[]{String.class, Integer.TYPE});
                }
                long jLongValue12 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).invoke(null, objArr147)).longValue();
                long j75 = 669018838;
                long j76 = (j3 * j75) + (j33 * jLongValue12);
                long j77 = j75 ^ j24;
                long j78 = jLongValue12 ^ j24;
                long jMyPid = Process.myPid();
                long j79 = j76 + ((j77 | ((j78 | jMyPid) ^ j24)) * j35) + ((((j77 | j78) | (jMyPid ^ j24)) ^ j24) * j35) + ((j75 | j78) * j41) + ((long) (-671088715));
                int i616 = ((int) (j79 >> 32)) & ((-982421566) + (((~((-1796446732) | i28)) | R.attr.theme | (~((-359220321) | i28))) * (-754)) + (((~((-16842753) | i28)) | (~((-342377569) | i9))) * (-754)) + (((-1796446732) | i9) * 754));
                int iNextInt2 = new Random().nextInt();
                int i617 = ((int) j79) & (702282261 + (((~((~iNextInt2) | (-534140267))) | (-1971366677)) * (-235)) + (((~((-534140267) | iNextInt2)) | (-1971366677)) * (-470)) + (((~(iNextInt2 | (-360710401))) | (-2144796543)) * 235));
                i37 = (i616 ^ i617) | (i616 & i617);
            }
            if (i37 == 1986687685 || i37 == -1514516938) {
                strArr3 = strArr3;
            } else {
                int i618 = -(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                int i619 = ((i618 | 1608) << 1) - (i618 ^ 1608);
                int i620 = -(-Color.green(0));
                Object[] objArr149 = new Object[1];
                a(i619, ((i620 | 14) << 1) - (i620 ^ 14), (char) (9720 - (~(-Color.green(0)))), objArr149);
                String str70 = (String) objArr149[0];
                int i621 = -(-((byte) KeyEvent.getModifierMetaStateMask()));
                Object[] objArr150 = new Object[1];
                a((i621 & 1623) + (i621 | 1623), 25 - TextUtils.lastIndexOf(str4, '0', 0), (char) (50098 - (~(-Process.getGidForName(str4)))), objArr150);
                String str71 = (String) objArr150[0];
                int iRgb3 = Color.rgb(0, 0, 0);
                int i622 = (iRgb3 & 16778864) + (iRgb3 | 16778864);
                int i623 = 16 - (~(ViewConfiguration.getKeyRepeatDelay() >> 16));
                int i624 = -(-Color.rgb(0, 0, 0));
                Object[] objArr151 = new Object[1];
                a(i622, i623, (char) ((i624 & 16777216) + (i624 | 16777216)), objArr151);
                String str72 = (String) objArr151[0];
                int jumpTapTimeout3 = ViewConfiguration.getJumpTapTimeout() >> 16;
                Object[] objArr152 = new Object[1];
                a(((jumpTapTimeout3 | 1665) << 1) - (jumpTapTimeout3 ^ 1665), 17 - View.resolveSizeAndState(0, 0, 0), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr152);
                String str73 = (String) objArr152[0];
                int i625 = -TextUtils.indexOf(str4, str4);
                int i626 = (i625 ^ 1682) + ((i625 & 1682) << 1);
                int i627 = -TextUtils.indexOf((CharSequence) str4, '0');
                int i628 = (i627 & 14) + (i627 | 14);
                int i629 = -(-ExpandableListView.getPackedPositionChild(0L));
                Object[] objArr153 = new Object[1];
                a(i626, i628, (char) ((i629 & 30259) + (i629 | 30259)), objArr153);
                String str74 = (String) objArr153[0];
                int i630 = -(-Gravity.getAbsoluteGravity(0, 0));
                int i631 = ((i630 | 1697) << 1) - (i630 ^ 1697);
                int i632 = 36 - (~(-View.MeasureSpec.getMode(0)));
                int i633 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                Object[] objArr154 = new Object[1];
                a(i631, i632, (char) (((i633 | 1) << 1) - (i633 ^ 1)), objArr154);
                String str75 = (String) objArr154[0];
                int iRgb4 = (-16775482) - Color.rgb(0, 0, 0);
                int i634 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                Object[] objArr155 = new Object[1];
                a(iRgb4, (i634 ^ 12) + ((i634 & 12) << 1), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr155);
                String str76 = (String) objArr155[0];
                int i635 = -(-Color.alpha(0));
                Object[] objArr156 = new Object[1];
                a((i635 ^ 1746) + ((i635 & 1746) << 1), 13 - (~(-(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))))), (char) (Process.myTid() >> 22), objArr156);
                String str77 = (String) objArr156[0];
                int size2 = 1759 - View.MeasureSpec.getSize(0);
                int maximumFlingVelocity = 22 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int iGreen3 = Color.green(0);
                Object[] objArr157 = new Object[1];
                a(size2, maximumFlingVelocity, (char) (((iGreen3 | 62865) << 1) - (iGreen3 ^ 62865)), objArr157);
                String str78 = (String) objArr157[0];
                int i636 = 1780 - (~(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24)));
                int i637 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                Object[] objArr158 = new Object[1];
                a(i636, ((i637 | 31) << 1) - (i637 ^ 31), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), objArr158);
                String str79 = (String) objArr158[0];
                int i638 = -ExpandableListView.getPackedPositionGroup(0L);
                int i639 = (i638 & 1812) + (i638 | 1812);
                int i640 = -(ViewConfiguration.getScrollBarSize() >> 8);
                int iTuitionPaymentFragmentbindingInflater10 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
                int i641 = i640 * (-381);
                int i642 = (((i641 | 2304) << 1) - (i641 ^ 2304)) + ((~i640) * (-191)) + (((~(iTuitionPaymentFragmentbindingInflater10 | 12)) | i640) * 191);
                int i643 = ~i640;
                int i644 = ~((i643 & 12) | (i643 ^ 12));
                int i645 = ~iTuitionPaymentFragmentbindingInflater10;
                int i646 = ~((i645 & 12) | (i645 ^ 12));
                int i647 = ((i644 & i646) | (i644 ^ i646)) * 191;
                Object[] objArr159 = new Object[1];
                a(i639, (i642 ^ i647) + ((i647 & i642) << 1), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr159);
                String str80 = (String) objArr159[0];
                int iArgb = Color.argb(0, 0, 0, 0) + 1824;
                int i648 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                Object[] objArr160 = new Object[1];
                a(iArgb, (i648 & 13) + (i648 | 13), (char) (19669 - TextUtils.indexOf(str4, str4)), objArr160);
                String str81 = (String) objArr160[0];
                int i649 = -(ViewConfiguration.getScrollBarSize() >> 8);
                int i650 = (i649 & 1836) + (i649 | 1836);
                int i651 = -(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                Object[] objArr161 = new Object[1];
                a(i650, (i651 ^ 13) + ((i651 & 13) << 1), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr161);
                String str82 = (String) objArr161[0];
                int i652 = 1847 - (~KeyEvent.keyCodeFromString(str4));
                int gidForName5 = Process.getGidForName(str4);
                Object[] objArr162 = new Object[1];
                a(i652, (gidForName5 & 13) + (gidForName5 | 13), (char) ((Process.getThreadPriority(0) + 20) >> 6), objArr162);
                String str83 = (String) objArr162[0];
                int i653 = -(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                int i654 = (i653 ^ 1860) + ((i653 & 1860) << 1);
                int i655 = -Color.argb(0, 0, 0, 0);
                Object[] objArr163 = new Object[1];
                a(i654, ((i655 | 12) << 1) - (i655 ^ 12), (char) (28011 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), objArr163);
                String str84 = (String) objArr163[0];
                int i656 = -TextUtils.getOffsetAfter(str4, 0);
                Object[] objArr164 = new Object[1];
                a((i656 ^ 1872) + ((i656 & 1872) << 1), TextUtils.indexOf(str4, str4, 0, 0) + 14, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr164);
                String str85 = (String) objArr164[0];
                int i657 = 1884 - (~(-(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))));
                int bitsPerPixel = ImageFormat.getBitsPerPixel(0);
                int i658 = ((bitsPerPixel | 13) << 1) - (bitsPerPixel ^ 13);
                int gidForName6 = Process.getGidForName(str4);
                int iTuitionPaymentFragmentbindingInflater11 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
                int i659 = gidForName6 * (-337);
                int i660 = ((i659 | 15199065) << 1) - (i659 ^ 15199065);
                int i661 = ~gidForName6;
                int i662 = ~iTuitionPaymentFragmentbindingInflater11;
                int i663 = ~((i661 ^ i662) | (i661 & i662));
                int i664 = ~((-44836) | gidForName6);
                int i665 = (i663 ^ i664) | (i663 & i664);
                int i666 = ~(gidForName6 | iTuitionPaymentFragmentbindingInflater11);
                int i667 = i660 + (((i665 ^ i666) | (i665 & i666)) * (-338));
                int i668 = -(-((~(i661 | 44835)) * 338));
                int i669 = (i667 & i668) + (i668 | i667);
                int i670 = ~gidForName6;
                int i671 = ~((i670 & i662) | (i670 ^ i662));
                int i672 = ~((gidForName6 & 44835) | (gidForName6 ^ 44835) | iTuitionPaymentFragmentbindingInflater11);
                Object[] objArr165 = new Object[1];
                a(i657, i658, (char) (i669 + (((i672 & i671) | (i671 ^ i672)) * 338)), objArr165);
                String str86 = (String) objArr165[0];
                int i673 = -(-TextUtils.getCapsMode(str4, 0, 0));
                int i674 = ((i673 | 1898) << 1) - (i673 ^ 1898);
                int i675 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                Object[] objArr166 = new Object[1];
                a(i674, (i675 & 25) + (i675 | 25), (char) KeyEvent.getDeadChar(0, 0), objArr166);
                String str87 = (String) objArr166[0];
                int iAxisFromString2 = 1921 - MotionEvent.axisFromString(str4);
                int i676 = -AndroidCharacter.getMirror('0');
                Object[] objArr167 = new Object[1];
                a(iAxisFromString2, ((i676 | 76) << 1) - (i676 ^ 76), (char) (38370 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr167);
                String[] strArr46 = {str70, str71, str72, str73, str74, str75, str76, str77, str78, str79, str80, str81, str82, str83, str84, str85, str86, str87, (String) objArr167[0]};
                int i677 = 0;
                while (true) {
                    if (i677 >= 19) {
                        strArr3 = strArr3;
                        i43 = -1;
                        break;
                    }
                    String str88 = strArr46[i677];
                    Object[] objArr168 = {str88};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                        char offsetBefore5 = (char) TextUtils.getOffsetBefore(str4, 0);
                        int windowTouchSlop6 = 993 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int iIndexOf20 = 8 - TextUtils.indexOf(str4, str4);
                        byte b53 = (byte) 0;
                        Object[] objArr169 = new Object[1];
                        c((byte) 6, b53, (byte) (b53 - 1), objArr169);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(offsetBefore5, windowTouchSlop6, iIndexOf20, -545305915, false, (String) objArr169[0], new Class[]{String.class});
                    }
                    long jLongValue13 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).invoke(null, objArr168)).longValue();
                    long j80 = -473638053;
                    long j81 = 530;
                    long j82 = ((long) 1058) + (j81 * j80) + (j81 * jLongValue13);
                    long j83 = 529;
                    long j84 = j82 + ((((j39 | j80) ^ j24) | ((j80 | jLongValue13) ^ j24)) * j83) + (j83 * ((jLongValue13 ^ j24) | ((j80 | j38) ^ j24))) + ((long) 1094097337);
                    int i678 = ((int) (j84 >> 32)) & ((-2005432166) + (((~(1036359070 | i28)) | (-2111149503)) * 104) + ((~((-746591383) | i9)) * (-104)) + (((-1821381815) | i28) * 104));
                    int startUptimeMillis3 = (int) Process.getStartUptimeMillis();
                    int i679 = ~startUptimeMillis3;
                    int i680 = ((int) j84) & ((((~(2075099071 | i679)) | (~((-1479301813) | startUptimeMillis3))) * 988) + 179122701 + (((~(startUptimeMillis3 | 2033023669)) | 42075402 | (~(i679 | (-1479301813)))) * 988));
                    if (((i678 & i680) | (i678 ^ i680)) == 0) {
                        int i681 = -(-TextUtils.getCapsMode(str4, 0, 0));
                        Object[] objArr170 = new Object[1];
                        a(((i681 | 1872) << 1) - (i681 ^ 1872), 15 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) ExpandableListView.getPackedPositionType(0L), objArr170);
                        if (str88.equals((String) objArr170[0])) {
                            Object[] objArr171 = {str88};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                                char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                                int iMakeMeasureSpec = 993 - View.MeasureSpec.makeMeasureSpec(0, 0);
                                int iCombineMeasuredStates2 = 8 - View.combineMeasuredStates(0, 0);
                                byte b54 = (byte) 0;
                                byte b55 = b54;
                                Object[] objArr172 = new Object[1];
                                c(b54, b55, (byte) (b55 - 1), objArr172);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(cResolveOpacity, iMakeMeasureSpec, iCombineMeasuredStates2, 349342683, false, (String) objArr172[0], new Class[]{String.class});
                            }
                            long jLongValue14 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).invoke(null, objArr171)).longValue();
                            long j85 = 566358664;
                            long j86 = jLongValue14 ^ j24;
                            long j87 = j85 ^ j24;
                            long jNextInt = ((long) new Random().nextInt()) ^ j24;
                            long j88 = (j2 * j85) + (j21 * jLongValue14) + ((j85 | j86) * j23) + ((jLongValue14 | j87 | jNextInt) * j27) + ((((j87 | j86) ^ j24) | ((jNextInt | jLongValue14) ^ j24) | ((jLongValue14 | j85) ^ j24)) * j27) + ((long) (-1413437269));
                            int iUptimeMillis = (int) SystemClock.uptimeMillis();
                            int i682 = ~((-921163190) | iUptimeMillis);
                            int i683 = ~iUptimeMillis;
                            int i684 = ((int) (j88 >> 32)) & ((-1595911126) + ((i682 | (~(1055391733 | i683))) * (-406)) + ((~((-539328513) | i683)) * (-406)) + (((~(iUptimeMillis | (-516063222))) | (~(921163189 | i683))) * 406));
                            int i685 = ~((-1107842929) | i28);
                            int i686 = ((int) j88) & ((-1130617255) + ((33555728 | i685) * (-280)) + ((i685 | (~((-1749897958) | i28))) * 140) + (((~((-1074287201) | i28)) | (~((-33555729) | i9)) | (~((-675610758) | i9))) * 140));
                            if (((i684 & i686) | (i684 ^ i686)) != 0) {
                            }
                        }
                        int i687 = (i677 ^ 33) + ((i677 & 33) << 1);
                        i677 = (i687 ^ (-32)) + ((i687 & (-32)) << 1);
                        strArr46 = strArr46;
                        strArr3 = strArr3;
                    }
                    i43 = i677;
                    break;
                }
                int i688 = i43 + 130;
                int i689 = (i688 | i28) & (~(i28 & i688));
                int i690 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i691 = ((i690 | 23) << 1) - (i690 ^ 23);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i691 % 128;
                int i692 = i691 % 2;
                int i693 = ~i43;
                int i694 = -i693;
                int i695 = ((i693 & i694) | (i693 ^ i694)) >> 31;
                int i696 = (~i695) & i28;
                int i697 = i689 & i695;
                int i698 = (i697 & i696) | (i696 ^ i697);
                int i699 = (~(i28 & i381)) & (i28 | i381);
                int i700 = -i699;
                int i701 = ((i699 & i700) | (i699 ^ i700)) >> 31;
                int i702 = i698 & (~i701);
                int i703 = i381 & i701;
                i381 = (i703 & i702) | (i702 ^ i703);
                Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
                Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
            }
            int i704 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int iTuitionPaymentFragmentbindingInflater12 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
            int i705 = i704 * 881;
            int i706 = ((i705 | 1717950) << 1) - (i705 ^ 1717950);
            int i707 = ~i704;
            int i708 = (~((i707 & iTuitionPaymentFragmentbindingInflater12) | (i707 ^ iTuitionPaymentFragmentbindingInflater12))) | (~((i707 ^ (-1951)) | (i707 & (-1951))));
            int i709 = ~(((-1951) & iTuitionPaymentFragmentbindingInflater12) | ((-1951) ^ iTuitionPaymentFragmentbindingInflater12));
            int i710 = i706 + (((i708 & i709) | (i708 ^ i709)) * (-880));
            int i711 = ~i704;
            int i712 = ~iTuitionPaymentFragmentbindingInflater12;
            int i713 = ~((i711 & i712) | (i711 ^ i712));
            int i714 = (i713 & 1950) | (i713 ^ 1950);
            int i715 = ~((i704 & iTuitionPaymentFragmentbindingInflater12) | (i704 ^ iTuitionPaymentFragmentbindingInflater12));
            int i716 = -(-(((i714 ^ i715) | (i714 & i715)) * (-880)));
            int i717 = ((i710 | i716) << 1) - (i716 ^ i710);
            int i718 = -(-(i715 * 880));
            int i719 = ((i717 | i718) << 1) - (i718 ^ i717);
            int size3 = View.MeasureSpec.getSize(0);
            Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
            int i720 = -size3;
            Object[] objArr173 = new Object[1];
            a(i719, (13 & i720) + (i720 | 13), (char) (0 - (~(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))))), objArr173);
            int i721 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            Object[] objArr174 = new Object[1];
            a((i721 & 1963) + (i721 | 1963), ((byte) KeyEvent.getModifierMetaStateMask()) + 6, (char) KeyEvent.getDeadChar(0, 0), objArr174);
            String[] strArr47 = {(String) objArr173[0], (String) objArr174[0]};
            int jumpTapTimeout4 = ViewConfiguration.getJumpTapTimeout() >> 16;
            int i722 = (jumpTapTimeout4 & 1968) + (jumpTapTimeout4 | 1968);
            int iIndexOf21 = TextUtils.indexOf((CharSequence) str4, '0', 0, 0);
            int i723 = ((iIndexOf21 | 16) << 1) - (iIndexOf21 ^ 16);
            int scrollDefaultDelay4 = ViewConfiguration.getScrollDefaultDelay() >> 16;
            Object[] objArr175 = new Object[1];
            a(i722, i723, (char) (((scrollDefaultDelay4 | 56870) << 1) - (scrollDefaultDelay4 ^ 56870)), objArr175);
            String str89 = (String) objArr175[0];
            Object[] objArr176 = new Object[1];
            a(1982 - (~(-(ViewConfiguration.getWindowTouchSlop() >> 8))), 18 - (~(-ExpandableListView.getPackedPositionGroup(0L))), (char) View.resolveSize(0, 0), objArr176);
            String str90 = (String) objArr176[0];
            Object[] objArr177 = new Object[1];
            a(2002 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 13 - (~(ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (char) Color.blue(0), objArr177);
            byte modifierMetaStateMask5 = (byte) KeyEvent.getModifierMetaStateMask();
            int i724 = ((modifierMetaStateMask5 | 2017) << 1) - (modifierMetaStateMask5 ^ 2017);
            int i725 = -Drawable.resolveOpacity(0, 0);
            int i726 = ((i725 | 21) << 1) - (i725 ^ 21);
            int i727 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            Object[] objArr178 = new Object[1];
            a(i724, i726, (char) ((i727 ^ 1) + ((i727 & 1) << 1)), objArr178);
            String str91 = (String) objArr178[0];
            Object[] objArr179 = new Object[1];
            a((-16775179) - Color.rgb(0, 0, 0), ExpandableListView.getPackedPositionGroup(0L) + 10, (char) Drawable.resolveOpacity(0, 0), objArr179);
            int jumpTapTimeout5 = 2047 - (ViewConfiguration.getJumpTapTimeout() >> 16);
            int iLastIndexOf9 = TextUtils.lastIndexOf(str4, '0', 0) + 12;
            int i728 = -(-Gravity.getAbsoluteGravity(0, 0));
            Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
            Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
            Object[] objArr180 = new Object[1];
            a(jumpTapTimeout5, iLastIndexOf9, (char) ((i728 ^ 12243) + ((i728 & 12243) << 1)), objArr180);
            int i729 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            int i730 = ((i729 | 588) << 1) - (i729 ^ 588);
            int i731 = -(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
            Object[] objArr181 = new Object[1];
            a(i730, (i731 ^ 5) + ((i731 & 5) << 1), (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr181);
            String[] strArr48 = {(String) objArr180[0], (String) objArr181[0]};
            int i732 = -Color.green(0);
            int i733 = (i732 ^ 2058) + ((i732 & 2058) << 1);
            int size4 = View.MeasureSpec.getSize(0);
            int i734 = (size4 & 28) + (size4 | 28);
            int i735 = -(ViewConfiguration.getTouchSlop() >> 8);
            Object[] objArr182 = new Object[1];
            a(i733, i734, (char) ((i735 ^ 46104) + ((i735 & 46104) << 1)), objArr182);
            String str92 = (String) objArr182[0];
            int iRgb5 = (-16775179) - Color.rgb(0, 0, 0);
            int i736 = -TextUtils.lastIndexOf(str4, '0', 0, 0);
            Object[] objArr183 = new Object[1];
            a(iRgb5, ((i736 | 9) << 1) - (i736 ^ 9), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr183);
            char c16 = 0;
            String[][] strArr49 = {strArr47, new String[]{str89, str90, (String) objArr177[0]}, new String[]{str91, (String) objArr179[0]}, strArr48, new String[]{str92, (String) objArr183[0]}};
            int i737 = 0;
            int i738 = -1;
            while (true) {
                if (i737 < 5) {
                    String[] strArr50 = strArr49[i737];
                    String str93 = strArr50[c16];
                    String[] strArr51 = (String[]) Arrays.copyOfRange(strArr50, 1, strArr50.length);
                    int length5 = strArr51.length;
                    int i739 = i738;
                    int i740 = 0;
                    while (true) {
                        if (i740 < length5) {
                            int i741 = i739 + 1;
                            byte[] bytes4 = strArr51[i740].getBytes();
                            int length6 = bytes4.length;
                            if (length6 == 0) {
                                str6 = str4;
                            } else {
                                try {
                                    try {
                                        strArr4 = strArr49;
                                        try {
                                            bufferedInputStream8 = new BufferedInputStream(new FileInputStream(str93));
                                            int i742 = 4096;
                                            strArr5 = strArr51;
                                            try {
                                                try {
                                                    byte[] bArr5 = new byte[4096];
                                                    str8 = str93;
                                                    i40 = length5;
                                                    i41 = i741;
                                                    int i743 = 0;
                                                    while (true) {
                                                        try {
                                                            int i744 = bufferedInputStream8.read(bArr5, 0, i742);
                                                            if (i744 <= 0) {
                                                                break;
                                                            }
                                                            int i745 = 0;
                                                            while (i743 < length6 && i745 < i744) {
                                                                byte[] bArr6 = bArr5;
                                                                if (bArr5[i745] == bytes4[i743]) {
                                                                    i743 = (((i743 | (-32)) << 1) - (i743 ^ (-32))) + 33;
                                                                } else {
                                                                    if (i743 != 0) {
                                                                        int iTuitionPaymentFragmentbindingInflater13 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
                                                                        int i746 = 948 - (~(-(-(i743 * (-949)))));
                                                                        i42 = i744;
                                                                        int i747 = ~i743;
                                                                        str6 = str4;
                                                                        int i748 = ~iTuitionPaymentFragmentbindingInflater13;
                                                                        int i749 = ((~((i747 ^ i748) | (i748 & i747))) | (~iTuitionPaymentFragmentbindingInflater13)) * 1900;
                                                                        int i750 = (i746 ^ i749) + ((i746 & i749) << 1);
                                                                        int i751 = ~iTuitionPaymentFragmentbindingInflater13;
                                                                        int i752 = ((~((i743 ^ iTuitionPaymentFragmentbindingInflater13) | (iTuitionPaymentFragmentbindingInflater13 & i743))) | (~((i751 ^ (-1)) | i751))) * (-950);
                                                                        int i753 = ((((i750 | i752) << 1) - (i752 ^ i750)) - (~(-(-((~((i751 ^ i743) | (i751 & i743))) * 950))))) - 1;
                                                                        while (true) {
                                                                            if (i753 <= 0) {
                                                                                i743 = 0;
                                                                                break;
                                                                            }
                                                                            int i754 = 0;
                                                                            while (true) {
                                                                                if (i754 >= i753) {
                                                                                    i743 = i753;
                                                                                    break;
                                                                                }
                                                                                try {
                                                                                    int i755 = -i753;
                                                                                    int i756 = (i743 & i755) + (i755 | i743);
                                                                                    if (bytes4[i754] != bytes4[(i756 ^ i754) + ((i756 & i754) << 1)]) {
                                                                                        break;
                                                                                    }
                                                                                    int i757 = (i754 & (-39)) + (i754 | (-39));
                                                                                    i754 = ((i757 | 40) << 1) - (i757 ^ 40);
                                                                                } catch (IOException unused16) {
                                                                                    if (bufferedInputStream8 != null) {
                                                                                        try {
                                                                                            bufferedInputStream8.close();
                                                                                        } catch (IOException unused17) {
                                                                                        }
                                                                                    }
                                                                                    i740 = (i740 & 1) + (i740 | 1);
                                                                                    strArr51 = strArr5;
                                                                                    strArr49 = strArr4;
                                                                                    length5 = i40;
                                                                                    str93 = str8;
                                                                                    i739 = i41;
                                                                                    str4 = str6;
                                                                                }
                                                                            }
                                                                            i753--;
                                                                        }
                                                                    }
                                                                    bArr5 = bArr6;
                                                                    i744 = i42;
                                                                    str4 = str6;
                                                                }
                                                                str6 = str4;
                                                                i42 = i744;
                                                                int i758 = (i745 ^ ComposerKt.defaultsKey) + ((i745 & ComposerKt.defaultsKey) << 1);
                                                                i745 = ((i758 | 128) << 1) - (i758 ^ 128);
                                                                bArr5 = bArr6;
                                                                i744 = i42;
                                                                str4 = str6;
                                                            }
                                                            bArr5 = bArr5;
                                                            str4 = str4;
                                                            i742 = 4096;
                                                        } catch (IOException unused18) {
                                                            str6 = str4;
                                                        }
                                                    }
                                                    str6 = str4;
                                                    boolean z5 = i743 == length6;
                                                    try {
                                                        bufferedInputStream8.close();
                                                    } catch (IOException unused19) {
                                                    }
                                                    if (!z5) {
                                                        i740 = (i740 & 1) + (i740 | 1);
                                                        strArr51 = strArr5;
                                                        strArr49 = strArr4;
                                                        length5 = i40;
                                                        str93 = str8;
                                                        i739 = i41;
                                                        str4 = str6;
                                                    }
                                                } catch (Throwable th8) {
                                                    th = th8;
                                                    bufferedInputStream7 = bufferedInputStream8;
                                                    if (bufferedInputStream7 != null) {
                                                        try {
                                                            bufferedInputStream7.close();
                                                        } catch (IOException unused20) {
                                                        }
                                                    }
                                                    throw th;
                                                }
                                            } catch (IOException unused21) {
                                                str8 = str93;
                                                i40 = length5;
                                                str6 = str4;
                                                i41 = i741;
                                            }
                                        } catch (IOException unused22) {
                                            strArr5 = strArr51;
                                            str8 = str93;
                                            i40 = length5;
                                            str6 = str4;
                                            i41 = i741;
                                            bufferedInputStream8 = null;
                                            if (bufferedInputStream8 != null) {
                                                bufferedInputStream8.close();
                                            }
                                            i740 = (i740 & 1) + (i740 | 1);
                                            strArr51 = strArr5;
                                            strArr49 = strArr4;
                                            length5 = i40;
                                            str93 = str8;
                                            i739 = i41;
                                            str4 = str6;
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                        bufferedInputStream7 = null;
                                    }
                                } catch (IOException unused23) {
                                    strArr4 = strArr49;
                                }
                            }
                            int i759 = 994527795 - (~(((~(((-1729350269) ^ i9) | ((-1729350269) & i9))) | 1091668516) * 98));
                            int i760 = ~(((-1055547737) & i30) | ((-1055547737) ^ i30));
                            int i761 = (i760 & (-1729350269)) | ((-1729350269) ^ i760);
                            int i762 = ~((1055547736 & i28) | (1055547736 ^ i28));
                            int i763 = i759 + (((i761 & i762) | (i761 ^ i762)) * (-49));
                            int i764 = ~(((-1729350269) & i28) | ((-1729350269) ^ i28));
                            int i765 = ((i764 & (-2147216253)) | (i764 ^ (-2147216253))) * 49;
                            int i766 = ((i763 | i765) << 1) - (i765 ^ i763);
                            int iTuitionPaymentFragmentbindingInflater14 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
                            int i767 = (-56471248) | (~iTuitionPaymentFragmentbindingInflater14);
                            int i768 = ~((i767 & 603496860) | (i767 ^ 603496860));
                            int i769 = ~((603828191 & iTuitionPaymentFragmentbindingInflater14) | (603828191 ^ iTuitionPaymentFragmentbindingInflater14));
                            int i770 = -(-(((i768 & i769) | (i768 ^ i769)) * 988));
                            int i771 = ((-44605545) & i770) + (i770 | (-44605545));
                            int i772 = (i771 & 327356016) + (327356016 | i771);
                            int i773 = (~(((-56471248) & iTuitionPaymentFragmentbindingInflater14) | ((-56471248) ^ iTuitionPaymentFragmentbindingInflater14))) | 56139916;
                            int i774 = ~iTuitionPaymentFragmentbindingInflater14;
                            int i775 = (i774 & 603496860) | (i774 ^ 603496860);
                            int i776 = ~((i775 & 56471247) | (i775 ^ 56471247));
                            int i777 = ((i776 & i773) | (i773 ^ i776)) * 988;
                            if (i766 > (i772 & i777) + (i777 | i772)) {
                                int i778 = i739 - 12110;
                                i38 = (~(i28 & i778)) & (i28 | i778);
                            } else {
                                int i779 = i739 + 171;
                                i38 = ((~i779) & i28) | (i779 & i9);
                            }
                        } else {
                            String[][] strArr52 = strArr49;
                            int i780 = (i737 & (-10)) + (i737 | (-10));
                            i737 = (i780 ^ 11) + ((i780 & 11) << 1);
                            i738 = i739;
                            strArr49 = strArr52;
                            c16 = 0;
                        }
                    }
                } else {
                    str6 = str4;
                    i38 = i28;
                }
                int i781 = i28 ^ i381;
                int i782 = -i781;
                int i783 = ((i781 & i782) | (i781 ^ i782)) >> 31;
                int i784 = i38 & (~i783);
                int i785 = i381 & i783;
                int i786 = (i784 ^ i785) | (i785 & i784);
                try {
                    int i787 = 2085 - (~(KeyEvent.getMaxKeyCode() >> 16));
                    str7 = str6;
                    try {
                        int i788 = -TextUtils.indexOf(str7, str7);
                        Object[] objArr184 = new Object[1];
                        a(i787, ((i788 | 13) << 1) - (i788 ^ 13), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr184);
                        String str94 = (String) objArr184[0];
                        int iIndexOf22 = 2099 - TextUtils.indexOf(str7, str7);
                        int i789 = -Color.alpha(0);
                        int iTuitionPaymentFragmentbindingInflater15 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
                        int i790 = (i789 ^ iTuitionPaymentFragmentbindingInflater15) | (i789 & iTuitionPaymentFragmentbindingInflater15);
                        int i791 = ((i789 * 677) - 5400) + (((i790 & (-9)) | (i790 ^ (-9))) * (-676));
                        int i792 = ~(((-9) & i789) | ((-9) ^ i789));
                        int i793 = ~iTuitionPaymentFragmentbindingInflater15;
                        int i794 = ~((i793 ^ i789) | (i793 & i789));
                        int i795 = -(-(((i792 & i794) | (i792 ^ i794)) * 676));
                        int i796 = ((i791 | i795) << 1) - (i791 ^ i795);
                        int i797 = ~i789;
                        int i798 = ~((i797 & (-9)) | (i797 ^ (-9)));
                        int i799 = ~(((-9) ^ i793) | (i793 & (-9)));
                        int i800 = (i798 & i799) | (i798 ^ i799);
                        int i801 = (i789 & 8) | (i789 ^ 8);
                        int i802 = ~((i801 & iTuitionPaymentFragmentbindingInflater15) | (i801 ^ iTuitionPaymentFragmentbindingInflater15));
                        Object[] objArr185 = new Object[1];
                        a(iIndexOf22, (i796 - (~(((i802 & i800) | (i800 ^ i802)) * 676))) - 1, (char) (41949 - TextUtils.getOffsetAfter(str7, 0)), objArr185);
                        try {
                            Object[] objArr186 = {str94, (String) objArr185[0]};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                                char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                                int capsMode5 = TextUtils.getCapsMode(str7, 0, 0) + 2385;
                                int scrollBarSize5 = 32 - (ViewConfiguration.getScrollBarSize() >> 8);
                                byte b56 = (byte) 1;
                                byte b57 = (byte) (b56 - 1);
                                Object[] objArr187 = new Object[1];
                                c(b56, b57, (byte) (b57 - 1), objArr187);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(packedPositionGroup, capsMode5, scrollBarSize5, -1207062455, false, (String) objArr187[0], new Class[]{String.class, String.class});
                            }
                            long jLongValue15 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).invoke(null, objArr186)).longValue();
                            long j89 = 579197262;
                            long j90 = 184;
                            long j91 = j89 ^ j24;
                            long j92 = (((long) (-183)) * j89) + (((long) 185) * jLongValue15) + ((((j91 | jLongValue15) ^ j24) | ((j39 | jLongValue15) ^ j24)) * j90) + (((long) (-184)) * (r50 | (((jLongValue15 ^ j24) | j89) ^ j24))) + (j90 * ((j91 | j39) ^ j24)) + ((long) 1397846066);
                            int i803 = (int) (j92 >> 32);
                            int iFreeMemory3 = (int) Runtime.getRuntime().freeMemory();
                            int i804 = ~iFreeMemory3;
                            int i805 = i803 & ((-1623188566) + (((~(i804 | 437623493)) | (~((-999602918) | i804)) | 562044960) * 464) + (((-437557958) | iFreeMemory3) * (-464)) + (((~(iFreeMemory3 | 437623493)) | 562044960) * 464));
                            int i806 = ((int) j92) & (2005432269 + (((~(1140670328 | i28)) | (-1409105786)) * 104) + ((~((-28120625) | i9)) * (-104)) + (((-296556082) | i28) * 104));
                            if (((i805 & i806) | (i805 ^ i806)) != 0) {
                                int iTuitionPaymentFragmentbindingInflater16 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
                                int i807 = ~(((-1358439662) & iTuitionPaymentFragmentbindingInflater16) | ((-1358439662) ^ iTuitionPaymentFragmentbindingInflater16));
                                int i808 = ~iTuitionPaymentFragmentbindingInflater16;
                                int i809 = (i808 & (-1358439662)) | ((-1358439662) ^ i808);
                                int i810 = ~((i809 & (-1076650958)) | (i809 ^ (-1076650958)));
                                int i811 = 1180253023 + (((i807 & 282068000) | (282068000 ^ i807)) * 576) + (((i810 & (-1358718958)) | ((-1358718958) ^ i810)) * 576);
                                int i812 = (i811 & (-737589248)) + ((-737589248) | i811);
                                int i813 = 772501735 - (~(((2142600702 & i9) | (2142600702 ^ i9)) * (-369)));
                                int i814 = ~(((-1453620703) & i30) | ((-1453620703) ^ i30));
                                int i815 = -(-(((i814 & 800422966) | (800422966 ^ i814)) * (-369)));
                                int i816 = (i813 & i815) + (i815 | i813);
                                int i817 = ~(1453620702 | i28);
                                int i818 = (i817 & 688980000) | (688980000 ^ i817);
                                int i819 = ~(800422966 | ((-1453620703) & i9) | ((-1453620703) ^ i9));
                                int i820 = -(-(((i818 & i819) | (i818 ^ i819)) * 369));
                                i39 = i812 <= (i816 & i820) + (i820 | i816) ? (~(i28 & 9589)) & (i28 | 9589) : (i28 & (-151)) | (i9 & 150);
                            } else {
                                i39 = i28;
                            }
                        } catch (Throwable th10) {
                            Throwable cause2 = th10.getCause();
                            if (cause2 != null) {
                                throw cause2;
                            }
                            throw th10;
                        }
                    } catch (Exception unused24) {
                        i39 = i28 ^ 151;
                    }
                } catch (Exception unused25) {
                    str7 = str6;
                }
                int i821 = i28 ^ i786;
                int i822 = -i821;
                int i823 = ((i821 & i822) | (i821 ^ i822)) >> 31;
                int i824 = i39 & (~i823);
                int i825 = i786 & i823;
                int i826 = (i824 & i825) | (i824 ^ i825);
                int i827 = 2106 - (~(-(ViewConfiguration.getTapTimeout() >> 16)));
                int i828 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                Object[] objArr188 = new Object[1];
                a(i827, ((i828 | 47) << 1) - (i828 ^ 47), (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr188);
                Object[] objArr189 = {(String) objArr188[0]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                    char trimmedLength4 = (char) TextUtils.getTrimmedLength(str7);
                    int iResolveSize = View.resolveSize(0, 0) + 993;
                    int iBlue = 8 - Color.blue(0);
                    byte b58 = (byte) 0;
                    byte b59 = b58;
                    Object[] objArr190 = new Object[1];
                    c(b58, b59, (byte) (b59 - 1), objArr190);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(trimmedLength4, iResolveSize, iBlue, 349342683, false, (String) objArr190[0], new Class[]{String.class});
                }
                long jLongValue16 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).invoke(null, objArr189)).longValue();
                long j93 = 751180029;
                long j94 = (((long) 980) * j93) + (((long) (-978)) * jLongValue16);
                long j95 = 979;
                long j96 = jLongValue16 ^ j24;
                long jMaxMemory = (int) Runtime.getRuntime().maxMemory();
                long j97 = jMaxMemory ^ j24;
                long j98 = j94 + (((j96 | j97) ^ j24) * j95) + (((long) (-979)) * (j93 | jMaxMemory)) + (j95 * (((j96 | jMaxMemory) ^ j24) | ((j97 | j93) ^ j24))) + ((long) (-1598258634));
                int i829 = (-2100673110) + (((~((-142911076) | i28)) | 1580137486) * 672) + (((~(142911075 | i9)) | (~(1580137486 | i28))) * (-672)) + (((~((-1580137487) | i9)) | 134521858) * 672);
                int i830 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i831 = ((i830 | 17) << 1) - (i830 ^ 17);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i831 % 128;
                int i832 = i831 % 2;
                int i833 = ((int) (j98 >> 32)) & i829;
                int i834 = ((int) j98) & ((-1370274299) + ((~(2069220966 | i9)) * (-560)) + ((~((-78254474) | i28)) * (-560)) + (((~(788519919 | i9)) | 1358955520) * 560));
                int i835 = ((i833 & i834) | (i833 ^ i834)) * 263;
                int i836 = i28 ^ i826;
                int i837 = (i836 | (-i836)) >> 31;
                int i838 = (i835 | i28) & (~(i28 & i835)) & (~i837);
                int i839 = i826 & i837;
                i29 = (i839 & i838) | (i838 ^ i839);
                strArr = strArr3;
            }
        } else {
            i28 = i12;
            i29 = i366;
            strArr = null;
        }
        int i840 = i28 ^ i29;
        int i841 = -i840;
        int i842 = (((i840 & i841) | (i840 ^ i841)) >> 31) & 16;
        int i843 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i844 = (i843 ^ 21) + ((i843 & 21) << 1);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i844 % 128;
        int i845 = i844 % 2;
        Object[] objArr191 = {new int[1], new int[]{i29}, null, new int[]{i28}, strArr};
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i846 = -(-(2120244961 + (((~((-164528205) | iElapsedRealtime)) | (~((~iElapsedRealtime) | 1609551439))) * (-318)) + (((~(265210959 | iElapsedRealtime)) | 1344340480) * (-318)) + (((~(iElapsedRealtime | (-265210960))) | (-1508868685)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + i842));
        int i847 = (i3 ^ i846) + ((i3 & i846) << 1);
        int i848 = i847 << 13;
        int i849 = (i848 | i847) & (~(i847 & i848));
        int i850 = i849 >>> 17;
        int i851 = ((~i849) & i850) | ((~i850) & i849);
        int i852 = i851 << 5;
        ((int[]) objArr191[0])[0] = (i851 | i852) & (~(i851 & i852));
        return objArr191;
    }

    static {
        char[] cArr = new char[2154];
        ByteBuffer.wrap("±³û\t$\u001bQ9\u009awÇNpU½gæp\u0013\u0083\\\u009f\u0089´2¸\u007fþ¨ÓÕç\u001eèKïõ\u000b>\fk;\u0094\u0006ÁY\nK·eàv-\u0083±³û\t$\u001bQ9\u009awÇNpU½gæp\u0013\u0083\\\u009f\u0089´2¸\u007fþ¨ÂÕê\u001eüKøõ1>\u001bk8\u0094+ÁI\nO·`±³û\t$\u001bQ9\u009awÇNpU½gæp\u0013\u0083\\\u009f\u0089´2¸\u007fþ¨ÁÕú\u001eâKþð¢º\u000fe\u0016\u0010-Ûf\u0086U1Dü~§pR\u0098\u001d\u0082Èùs¦>ßéÏ\u0094ö_û\nå´\f\u007f\u0006*\u0006Õ*\u0080ZK^öa¡al\u0085\u0017\u009f±³û\b$\nQ,\u009awÇMp]½%æd\u0013\u0097\\\u0099\u0089·±³û\b$\nQ,\u009awÇZpS½fæ:\u0013\u0095\\\u0084\u0089¨2 ±³û\u001e$\u001aQ,\u009a9Ç[p^½$æF\u0013£\\»\u0089¨2¦\u007fÄ¨öÕâ\u001eøKü±³û\t$\u001fQ;\u009a9Ç\u0006p\u0014½hæd\u0013\u0090\\\u009f\u0089©2¶\u007fÎÞh\u0094\u0084KÖ>«õ±¨À\u001fÈÒ£\u0089à|\u00063\u0014æ3]9\u0010NÇPºZqd$~\u009a\u009cQ¦\u0004ªû±®ße\u008c\u000eÜD0\u009bbî\u001f%\u0005xtÏ|\u0002\u0017YT¬²ã 6\u0087\u008d\u008dÀú\u0017äjî¡ÐôÊJ(\u0081\u0012Ô\u001e+\u0005~kµ;» ñ\u008d.\u0094[¯\u0090¿ÍßzÄ··ìë\u0019\u001fV\u0007\u0083{8/u[¢Cß~\u0014}A ÿ\u008e4\u0083±þû\u0004$\u0019Q!\u009a7ÇQ±³û\u001e$\u0007Q<\u009a,ÇLpW½$æv\u0013\u008c\\\u0098\u0089è2¾\u007fÄ¨ßÕö\u001eÚKÐõC>\u0011k-\u00944Á_\n\u0016·gàz-\u0088V\u0083\u0083²Ì¾yÎ\u008f\u0000Å\u00ad\u001a´o\u008f¤\u009fùÿNä\u0083\u0097ØÅ-?b+·[\f\rAw\u0096lëE iucËð\u0000¼U\u0089ª\u0085ÿé±³û\u001e$\u0007Q<\u009a,ÇLpW½$æx\u0013\u008c\\\u0094\u0089è2¼\u007fÈ¨ÐÕí\u001eéKðõ\u001b>)k\u0005\u0094)ÁX\nT·tà;-\u0095V\u0098±³û\t$\u001bQ9\u009awÇGp_½fæa\u0013\u0082\\\u0083\u0089¢2£\u007fÕ±îû\u0002$PQ-\u009a-Ç@pV½oæ:\u0013\u008d\\\u0099\u0089´2¤±òû\b$\u001fQ<\u009a=Ç\u0007pT½næ`ÄV\u008eøQé$ÅïÞ²ã\u0005¹È\u0087\u0093\u009dfe)`ü[GF\n0Ý2 \u000bk\u001aA=\u000bÇÔÜ¡õjä7\u0080±îû\u0002$PQ?\u009a*ÇFp^½~æw\u0013\u0091\\Ø\u0089ª2±\u007fÏ¨ÇÕå\u001eíKþõ\u001a>\nk:\u0094<ÁX>\u0018të«óÞÕ±ìû\b$\fQ<\u009a1ÇZpN½%æg\u0013\u009c\\\u0085\u0089é2²\u007fÅ¨\u009cÕç\u001eéKÿõ\u001b>\u0018kf\u0094>ÁZ\nN·*às-\u0087V\u009c\u0083¥Ì\u008eyÅ¢ÃïÉ\u0018ÒEì\u008f\n8\u0016e-®?ÛY\u0004Q±w±ìû\b$\fQ<\u009a1ÇZpN½%æg\u0013\u009c\\\u0085\u0089é2²\u007fÅ¨\u009cÕç\u001eéKÿõ\u001b>\u0018kf\u0094>ÁZ\nN·*às-\u0087V\u009c\u0083¥Ì\u008eyÅ¢ÃïÉ\u0018ÒEè\u008f\n8\u0016e-®5ÛYÆS\u008c·S³&\u0083í\u008e°å\u0007ñÊ\u009a\u0091Ød#+:þVE\r\bzß#¢XiV<@\u0082¤I§\u001cÙã\u0094¶ú}ªÀØ\u0097ÛZ0±ìû\b$\fQ<\u009a1ÇZpN½%æg\u0013\u009c\\\u0085\u0089é2²\u007fÅ¨\u009cÕç\u001eéKÿõ\u001b>\u0018kf\u0094+ÁE\n\u0015·hàt-\u0085ÉM\u0083©\\\u00ad)\u009dâ\u0090¿û\bïÅ\u0084\u009eÆk=$$ñHJ\u0013\u0007dÐ=\u00adFfH3^\u008dºF¹\u0013Çì\u008a¹är´ÏÈ\u0098×U$±ìû\b$\fQ<\u009a1ÇZpN½%æg\u0013\u009c\\\u0085\u0089é2²\u007fÅ¨\u009cÕç\u001eéKÿõ\u001b>\u0018kf\u0094+ÁE\n\u0015·ià{-\u0085±êû\u000f$\u0011Q7\u009a+ÇO±³û\u001d$\fQ \u009a;Ç\u0006pW½dæp\u0013\u0090\\\u009a\u0089¢2£&*lÏ³ÑÆ÷\rÿP\u009cç\u009f*¸q ±³û\u001e$\u0007Q<\u009a,ÇLpW½$ær\u0013\u0097\\\u0097\u0089ª2µ\u007fÖ¨ÝÕñ\u001eçK²õ\u0019>\u0016k&\u0094=ÁE\nL·wà8-\u0095V\u008e\u0083³Ì¥yÇ¢Þïã\u0018þEû\u008f\u001d8\u000ee,®(Û\u0005\u0004^±dúd±³û\u001b$\u001bQ!\u009a<ÇFpH½$æx\u0013\u008c\\\u0094\u0089ñ2ä\u007f\u008e¨ÚÕô\u001e£Küõ\u001b>\u001bk!\u00946Á\u0004\nK·và|-\u008bV\u0096\u0083²Ì¨y\u008c¢ÄïÕ\u0018ãEú\u008f\u00008\u000fe:®tÛX\u0004[\u0098tÒÜ\rÜxæ³ûî\u0081Y\u008f\u0094ãÏ¿:KuS 6\u001b#VI\u0081\u001dü37db2ÜÞ\u0017ÛBà½óè\u009d#\u0093\u009e°É·\u0004S\u007f\u001eªpå\u007fP\u000b\u008b\u0010Æ\u00141=l*¦\u0086\u0011ÌLá±³û\u001e$\u0007Q<\u009a,ÇLpW½$æx\u0013\u008c\\\u0094\u0089ñ2ä\u007f\u008e¨ÑÕï\u001eãKèõ\n> k)\u00940ÁN\nW·[à|-\u0088V\u0083\u0083¥Ì£yÄ¢Òïß\u0018èE³\u008f\f8\be9®tÛX\u0004[\u0004PNë\u0091éäÏ/\u0094r£Å·\b\u0081S\u0083¦)é|<J\u0087ZÊ6\u001d\u007f`\u0003«\u0003þ\u0011@ø\u008bøÞØ!ßt»¿®\u0002\u008eU\u0095\u0098`ã:6QyQ±Ûû\b$\u0010Q6\u009a5ÇFpN½bæ{\u0013\u008b±éû\u0003$\u0015Q!\u009a7Ç^pT±ÿû\u0005$\fQ \u009a5Ç@pO½f±îû\u0002$PQ?\u009a*ÇFp^½~æw\u0013\u0091\\Ø\u0089£2µ\u007f×¨ÛÕà\u001eé\u0007ïM\n\u0092\u0014ç2,eq\u001aÆO{O1¼î¤\u009b\u009eP\u009e\rôºí±ûû\b$\u0010Q*\u009a*Ç@pY½Tæl\u0013Ý\\À±ûû\b$\u0010Q*\u009a*Ç@pY½Tæl\u0013Ý\\À\u0089\u00982æ\u007f\u0095±îû\u0002$PQ?\u009a*ÇFp^½~æw\u0013\u0091\\Ø\u0089ª2¿\u007fÅ¨×Õï±ïû\t$\u0015ÝR\u0097«H =\u0088ö\u0092«ö\u001cþÑÒ±Ýû\u001d$\u000eQo\u009a\nÇ\\pT½\u007fæ}\u0013\u0088\\\u0093\u0089ç2¶\u007fÎ¨ÀÕ£\u001eÏKõõ\u001c>\u0010k%\u0094<¶Pü\u008e#\u0097V°\u009dºÀÍwÓº¦áÊ\u0014,[0\u008ej5?xY¯VÒb\u0019uL0ò\u00859\u009dl·\u0093ôÆß\r\u008e°¿zÛ0\u0005ï\u001c\u009a;Q1\fF»Xv--AØ§\u0097»Báù´´ÒcÝ\u001eéÕþ\u0080»>\u000eõ\u0016 <_\u007f\nTÁ\u0005|4+LæÖ\u009dÅ\u000b½AQ\u009e\u0003ët j}\bÊ\r\u0007/\\&©ÄæÀ>\u0004tý«íÞÔ\u0015ÁH¿ÿ¶2\u009c\u001aãP\u0006\u008f\u0018ú>1il\u0016^¤\u0014FËZ¾fuz(\u0016\r\u0012Gþ\u0098¬íÃ&Ö{ºÌ¢\u0001\u0082Z\u008b¯mà$5Y\u008e^Ã<\u0014 i\u001b±îû\u0002$PQ$\u009a=Ç[pT½næx\u0013Ë\\\u0087\u0089¢2½\u007fÔý»É¬\u0083@\\\u0012)~â\u007f¿\b\b\rÅ;\u009e3±¬Äw\u008e\u009bQÉ$´ï´²Ù\u0005ÏÈö\u0093£f\f)\u001dü1G-\nMÝH n±úû\u0018$\u0012Q#\u009a\u0007ÇQp\u0002½=±îû\u0002$PQ-\u009a-Ç@pV½oæ:\u0013\u0083\\\u009f\u0089©2·\u007fÄ¨ÀÕó\u001eþKôõ\u0000>\u000b±ûû\b$\u0010Q*\u009a*Ç@pY½$æg\u0013\u0081\\\u009d\u0089è2·\u007fÄ¨ÜÕæ\u001eþKôõ\rÓ©\u0099ZFB3xøx¥\u0012\u0012\u000bß\u0006\u0084>q\u008f>\u0092ëºPñ\u001d\u0097Ê\u008b·\u008e|¦)÷\u0097\n\\\u0002\t}ön£\u0016h\fÕ$\u0082.O×4úáê®»\u001bÆ\u0005°OC\u0090[åa.as\u000bÄ\u0012\toR8§ÁèÒ=ë\u0086÷Ë\u008f\u001c¦a»ª£ÿ½A\n\u008aSßf |u\u0004¾\u0002\u0003&T=Ð\u001f\u009aìEô0ÎûÎ¦¤\u0011½ÜÀ\u0087\u0086rc=}è[S\f\u001esÉ&´H\u007f\u001e*\u001b\u0094å_ã\n\u0094õ\u008b ¾fB,»ó¨\u0086\u0091M\u008d\u0010õ§¬jÁ1ÉÄ7\u008b\u0010^\u0019å\u0019¨p\u007fd\u0002TÉP\u009c{\"¯éþ¼ÇCÏ\u0016ôÝç`Ó7Éú-\u0081'T\u001a\u001b7®cu283±îû\u0002$PQ-\u009a7ÇFpN½gæ{\u0013\u0084\\\u0092\u0089¢2¢\u0099\u009dÓq\f#y^²Dï5X=\u0095\u0011Î\n;÷tâ¡Ñ\u001a\u008dW°\u0080´ý\u00996\u0093c\u008aÝ3\u0016jCR¼Dé>\"-\u009f\u0005È\u0016\u0005ç~í«ÝäÖÅù\u008f'P>%\u0019î\u0013³d\u0004zÉ\u0002\u0092Hgù(äK\u0001\u0001íÞ¿«Â`Â=¯\u008a¹G\u0080\u001cÕén¦ps[ÈO\u0085\"R</\u0015äM±\u001b\u000få±èû\b$\rQ;\u009au±õû\u0003$\u0017Q;\u009avÇZpL½hæ:\u0013\u0094\\\u0093\u0089ª2¥\u007f\u008c¨ÂÕñ\u001eãKíõ\u001dó\u0007¹âfù\u0013ÐØ\u009c\u0085«2§ÿÏ¤\u0093Qn\u001euËCpQ=.ê!\u0097\u001a\\ª\u0016OÉT¼}w1*\u001d\u009d\u001bPb\u000b5þÃ±ÚdåßÈ\u0092\u0085E\u00948©ó®¦¨\u0018HH#\u0002ÆÝÝ¨ôc¸>\u0094\u0089\u0092Dë\u001f¶êH¥\\pVËz\u0086\nQ\u0012,>ç+²'\fÙu©?Eà\u0017\u0095c^z\u0003\u001c´\u0013y)\"?×\u008c\u0098ÐMîöó»\u0094l\u009a\u0011\u00adÚ¯\u008fô1Xú]¯bPk\u0005\t\u0015!_Í\u0080\u009fõâ>øc\u0089Ô\u0081\u0019êBª·OøT-}\u00961Û\u000f\f\u000bq(º\u001cï<QÀ\u009aÝÏâ±îû\u0002$PQ \u009a<ÇDp\u0014½iæa\u0013\u008c\\\u009a\u0089£2þ\u007fÇ¨ÛÕí\u001eëKøõ\u001c>\u000fk:\u00940ÁD\nO±îû\u0002$PQ?\u009a*ÇFp^½~æw\u0013\u0091\\Ø\u0089¥2¥\u007fÈ¨ÞÕç\u001e¢Kûõ\u0007>\u0011k/\u0094<ÁX\nK·và|-\u0088V\u0083U\r\u001fáÀ³µß~Â#¹\u0094\u00adY\u008d\u0002\u009a÷(¸wmQÖZ\u009b.L51Nú\t¯\u0017\u0011ãÚû\u008fÎpÈ%¹îªS\u008e\u0004\u0098Éq½ÿ÷\u0013(A]-\u00960ËK|_±\u007fêh\u001f«P\u0082\u0085®>µs\u009e¤ÁÙç\u0012ôGàù\u001b2@g?\u0098!ÍU\u0006M»pìv!\u0087Z\u0094\u008f¸À®uÇ2üx\u0010§BÒ+\u0019/DUóL>vet\u0090Ùß\u0086\n ±«üß+ÄV¿\u009døÈæv\u0012½\nè?\u00179BH\u0089[4\u007fci®\u0080U\u0016\u001fúÀ¨µÁ~Å#¿\u0094¦Y\u009c\u0002\u009e÷B¸jmSÖC\u009b4Ld1\u0019ú\u0001¯\f\u0011úÚã\u008f\u009epÇ%»î\u00adS\u009b\u0004\u0088Él²\u007fgJ(@\u009d4F?Í[±°ûM\u000e0\u00adz\u0094JÞð\u0001âtÀ¿\u008eâ¡U¦\u0098\u009fÃ\u00986Cy\u007f¬W\u0017YZ=r\u00078½ç¯\u0092\u008dYÃ\u0004î³á~Ü%ËÐ4\u009f6J\\ñ\u0006¼tku\u0016RÝZ\u0088H6´ý¯¨£W\u008a\u0002ûÉátÉ#Å±³û\t$\u001bQ9\u009awÇZpU½hæ\u007f\u0013\u0080\\\u0082\u0089è2·\u007fÄ¨ÜÕú\u001eè±³û\t$\u001bQ9\u009awÇZpU½hæ\u007f\u0013\u0080\\\u0082\u0089è2¡\u007fÄ¨ßÕö\u001eèÇ\u0081\u008d,R5'\u000eìE±j\u0006mËT\u0090Se\u0088*°ÿ\u0087D\u0083\tðÞå±³û\u001e$\u0007Q<\u009a,ÇLpW½$æx\u0013\u008c\\\u0094\u0089è2¼\u007fÈ¨ÐÕà\u001eÓKðõ\u000f>\u0013k$\u00946ÁI\nd·`àp-\u0084V\u0082\u0083§Ì\u008eyÓ¢ÖïÑ\u0018øE°\u008f\u001c8\u0017±³û\t$\u001bQ9\u009awÇKpI½\u007fæK\u0013\u0082\\\u0086\u0089´±³û\t$\u001bQ9\u009awÇKpI½\u007fæK\u0013\u0091\\\u009f\u0089ª2µD\"\u000e\u0098Ñ\u008a¤¨oæ2Ë\u0085ÄHù\u0013îæ\u0011©\u0013|yÇ#\u008aC]W tër¾`\u0000\u009bË\u008b\u009e«a¬±³û\u001e$\u0007Q<\u009a,ÇLpW½$æx\u0013\u008c\\\u0094\u0089è2¼\u007fÈ¨ÐÕá\u001eÿKéõ\b>\u0010k$\u0094=ÁO\nI·[à\u007f-\u0088V\u009e\u0083îÌ¢yÍ±³û\t$\u001bQ9\u009awÇKpI½\u007fæu\u0013\u0086\\\u0095\u0089¢ýf·ÜhÎ\u001dìÖ¢\u008b\u009e<\u009cñªª¦_I\u0010QÅ}±³û\t$\u001bQ9\u009awÇKpI½\u007fæy\u0013\u0080\\\u0091\u0089©±³û\t$\u001bQ9\u009awÇKpI½\u007fæ{\u0013\u0097\\\u009f\u0089¢ÜØ\u0096bIp<R÷\u001cª \u001d\"Ð\u0014\u008b\t~ã1îäË±³û\t$\u001bQ9\u009awÇKpI½\u007fæd\u0013\u0082\\\u0097\u0089®2 \u007fÂ\u001e\u0091T+\u008b9þ\u001b5Uhißk\u0012]Ii¼®ó¹&\u0080±³û\t$\u001fQ;\u009a9Ç\u0006p^½dæc\u0013\u008b\\\u009a\u0089¨2±\u007fÅ¨ÁÕ¬\u001e¢Kåõ\f>Pk*\u0094*Á^\nP$Pnã±óÄØ\u000f\u0094R½å°(\u0086s\u0093\u0086iÉb\u001cW§\u001cê\u0000=\"@\u0014\u008b<Þ\u0016`ì«îþÎ\u0001ÞT\u008f\u009f·\"\u008bu\u0092¸`Ãf±³û\u001d$\fQ \u009a;Ç\u0006pS½dæd\u0013\u008a\\\u0084\u0089³2£±¬û\u000b$\u0018Qo\u009abo\u0095%;ú*\u008f\u0006D\u001d\u0019 ®ocH8^Í¥\u0082ÿW\u008cì\u0097¡÷vç±ûû\u001f$\u001fQ#\u009a4ÇFpY½%æs\u0013\u008a\\\u009a\u0089£2¶\u007fÈ¨ÁÕë\u001e¢Kîõ\u0001±ðû\u0004$\u001cQ\b\u009a\u0014Çlpi½Tæv\u0013\u0096\\\u0082\u0089é2£\u007fÎ±³û\b$\nQ,\u009awÇDp_½oæ}\u0013\u0084\\©\u0089¤2¿\u007fÅ¨×Õà\u001eÿK³õ\u0016>\u0012k$±þû\u0001$\u000bQ*\u009a+Ç]p[½hæ\u007f\u0013\u0096\u009e`ÔÛ\u000bÙ~ÿµ¤è\u0097_\u0086\u0092\u00adÉ©<BsV\u0005«O\u0011\u0090\u0007å#.!s\u001eÄF\t|R{§\u0093è\u0082=°\u0086©ËÝ\u001cÙa´ªºÿáA\u0006\u008aHß1 1uB¾P\u00032Tu\u0099\u0093â\u0083±³û\u001d$\fQ \u009a;Ç\u0006pY½{æa\u0013\u008c\\\u0098\u0089¡2¿\u0012\u0006Xß\u0087Ïòö9ãd\u009dÓ\u0094\u001e¾±³û\t$\u001fQ;\u009a9Ç\u0006pW½bæg\u0013\u0086\\Ù\u0089·2¢\u007fÎ¨ÔÕê\u001eàKøõ\u001d>Pk+\u0094,ÁX\n\u0014·4à:-\u0085V\u0098\u0083\u00adÌÿyÏ¢Úïß\u0018ÿEñ\u008f\u00198\u0011e;®.Û\u0005\u0004Y±`ú{'\u0092P\u0099\u009d¬Æ·".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2154);
        b = cArr;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -7699108755291047059L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(byte r6, short r7, int r8) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 109
            byte[] r0 = defpackage.lambdaonInputSurface2androidxcameracoreprocessingDefaultSurfaceProcessor.$$c
            int r7 = r7 * 4
            int r7 = 3 - r7
            int r6 = r6 * 3
            int r1 = 1 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L19
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2e
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            int r7 = r7 + 1
            r3 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2e:
            int r3 = -r3
            int r7 = r7 + r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lambdaonInputSurface2androidxcameracoreprocessingDefaultSurfaceProcessor.$$e(byte, short, int):java.lang.String");
    }
}
