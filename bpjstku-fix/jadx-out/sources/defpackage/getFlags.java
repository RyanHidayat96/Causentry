package defpackage;

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
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.material.timepicker.ClockHandView$$ExternalSyntheticLambda0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B«\u0001\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u00120\u0010\b\u001a,\u0012(\u0012&\u0012\u0014\u0012\u0012\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u0002\u0012(\u0010\n\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u0002\u0012(\u0010\f\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0002¢\u0006\u0004\b\u000f\u0010\u0010B\t\b\u0016¢\u0006\u0004\b\u000f\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J=\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ=\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u0013\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b!\u0010\"R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010#\u001a\u0004\b\u001b\u0010$RD\u0010%\u001a,\u0012(\u0012&\u0012\u0014\u0012\u0012\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010#\u001a\u0004\b\u0016\u0010$R<\u0010\u0013\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b&\u0010$R<\u0010\u001b\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b\u0013\u0010$R \u0010&\u001a\b\u0012\u0004\u0012\u00020\r0\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010#\u001a\u0004\b%\u0010$"}, d2 = {"LgetFlags;", "", "", "LfromParcel;", "p0", "Lkotlin/Pair;", "LgetString;", "Ljava/lang/Class;", "p1", "LfromMediaMetadata;", "p2", "LsetMediaId$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "p3", "LMediaBrowserCompatApi21MediaItem$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "p4", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "()V", "LgetStarRating;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/lang/Object;LgetStarRating;)Ljava/lang/Object;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/lang/Object;LgetStarRating;)Ljava/lang/String;", "LwriteToParcel;", "", "LsetMediaId;", "b", "(Ljava/lang/Object;LgetStarRating;LwriteToParcel;I)Lkotlin/Pair;", "LMediaDescriptionCompatApi21Builder;", "LMediaBrowserCompatApi21MediaItem;", "(LMediaDescriptionCompatApi21Builder;LgetStarRating;I)Lkotlin/Pair;", "LgetFlags$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "d", "()LgetFlags$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "Ljava/util/List;", "()Ljava/util/List;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getFlags {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final List<Pair<fromMediaMetadata<? extends Object>, Class<? extends Object>>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final List<Pair<setMediaId.TuitionPaymentFragmentspecialinlinedviewModeldefault1<? extends Object>, Class<? extends Object>>> b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final List<Pair<getString<? extends Object, ? extends Object>, Class<? extends Object>>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final List<fromParcel> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<MediaBrowserCompatApi21MediaItem.TuitionPaymentFragmentspecialinlinedviewModeldefault2> TuitionPaymentFragmentbindingInflater1;

    /* JADX WARN: Multi-variable type inference failed */
    private getFlags(List<? extends fromParcel> list, List<? extends Pair<? extends getString<? extends Object, ? extends Object>, ? extends Class<? extends Object>>> list2, List<? extends Pair<? extends fromMediaMetadata<? extends Object>, ? extends Class<? extends Object>>> list3, List<? extends Pair<? extends setMediaId.TuitionPaymentFragmentspecialinlinedviewModeldefault1<? extends Object>, ? extends Class<? extends Object>>> list4, List<? extends MediaBrowserCompatApi21MediaItem.TuitionPaymentFragmentspecialinlinedviewModeldefault2> list5) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = list;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = list2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = list3;
        this.b = list4;
        this.TuitionPaymentFragmentbindingInflater1 = list5;
    }

    public final List<fromParcel> b() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public final List<Pair<getString<? extends Object, ? extends Object>, Class<? extends Object>>> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public final List<Pair<fromMediaMetadata<? extends Object>, Class<? extends Object>>> TuitionPaymentFragmentbindingInflater1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public final List<Pair<setMediaId.TuitionPaymentFragmentspecialinlinedviewModeldefault1<? extends Object>, Class<? extends Object>>> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.b;
    }

    public final List<MediaBrowserCompatApi21MediaItem.TuitionPaymentFragmentspecialinlinedviewModeldefault2> TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    public getFlags() {
        this(CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList());
    }

    public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object p0, getStarRating p1) {
        List<Pair<getString<? extends Object, ? extends Object>, Class<? extends Object>>> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Pair<getString<? extends Object, ? extends Object>, Class<? extends Object>> pair = list.get(i);
            getString<? extends Object, ? extends Object> getstringComponent1 = pair.component1();
            if (pair.component2().isAssignableFrom(p0.getClass())) {
                Intrinsics.checkNotNull(getstringComponent1, "");
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getstringComponent1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0, p1);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                    p0 = objTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                }
            }
        }
        return p0;
    }

    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object p0, getStarRating p1) {
        List<Pair<fromMediaMetadata<? extends Object>, Class<? extends Object>>> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Pair<fromMediaMetadata<? extends Object>, Class<? extends Object>> pair = list.get(i);
            fromMediaMetadata<? extends Object> frommediametadataComponent1 = pair.component1();
            if (pair.component2().isAssignableFrom(p0.getClass())) {
                Intrinsics.checkNotNull(frommediametadataComponent1, "");
                String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = frommediametadataComponent1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0, p1);
                if (strTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                    return strTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                }
            }
        }
        return null;
    }

    public final Pair<setMediaId, Integer> b(Object p0, getStarRating p1, writeToParcel p2, int p3) {
        int size = this.b.size();
        while (p3 < size) {
            Pair<setMediaId.TuitionPaymentFragmentspecialinlinedviewModeldefault1<? extends Object>, Class<? extends Object>> pair = this.b.get(p3);
            setMediaId.TuitionPaymentFragmentspecialinlinedviewModeldefault1<? extends Object> tuitionPaymentFragmentspecialinlinedviewModeldefault1Component1 = pair.component1();
            if (pair.component2().isAssignableFrom(p0.getClass())) {
                Intrinsics.checkNotNull(tuitionPaymentFragmentspecialinlinedviewModeldefault1Component1, "");
                setMediaId setmediaidTuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentspecialinlinedviewModeldefault1Component1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0, p1);
                if (setmediaidTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                    return TuplesKt.to(setmediaidTuitionPaymentFragmentspecialinlinedviewModeldefault2, Integer.valueOf(p3));
                }
            }
            p3++;
        }
        return null;
    }

    public final Pair<MediaBrowserCompatApi21MediaItem, Integer> TuitionPaymentFragmentspecialinlinedviewModeldefault3(MediaDescriptionCompatApi21Builder mediaDescriptionCompatApi21Builder, getStarRating getstarrating, int i) {
        if (i < this.TuitionPaymentFragmentbindingInflater1.size()) {
            return TuplesKt.to(this.TuitionPaymentFragmentbindingInflater1.get(i).TuitionPaymentFragmentspecialinlinedviewModeldefault3(mediaDescriptionCompatApi21Builder, getstarrating), Integer.valueOf(i));
        }
        return null;
    }

    public final TuitionPaymentFragmentspecialinlinedviewModeldefault3 d() {
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        private final List<Pair<fromMediaMetadata<? extends Object>, Class<? extends Object>>> TuitionPaymentFragmentbindingInflater1;
        private final List<Pair<getString<? extends Object, ?>, Class<? extends Object>>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private final List<fromParcel> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        public final List<MediaBrowserCompatApi21MediaItem.TuitionPaymentFragmentspecialinlinedviewModeldefault2> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        public final List<Pair<setMediaId.TuitionPaymentFragmentspecialinlinedviewModeldefault1<? extends Object>, Class<? extends Object>>> b;
        private static final byte[] $$c = {82, Base64.padSymbol, -66, -42};
        private static final int $$d = 8;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {114, -59, 10, 31, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
        private static final int $$b = 231;
        private static int d = 0;
        private static int asBinder = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static long f938a = -9094044883405339775L;
        private static int asInterface = -981105359;
        private static char g = 34097;

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(short r7, int r8, short r9, java.lang.Object[] r10) {
            /*
                int r9 = r9 * 4
                int r9 = r9 + 84
                int r8 = r8 + 4
                int r7 = r7 * 15
                int r7 = r7 + 38
                byte[] r0 = getFlags.TuitionPaymentFragmentspecialinlinedviewModeldefault3.$$a
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r9
                r5 = r2
                r9 = r8
                goto L2c
            L15:
                r3 = r2
            L16:
                int r8 = r8 + 1
                byte r4 = (byte) r9
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r7) goto L27
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L27:
                r3 = r0[r8]
                r6 = r9
                r9 = r8
                r8 = r6
            L2c:
                int r3 = -r3
                int r8 = r8 + r3
                int r8 = r8 + (-11)
                r3 = r5
                r6 = r9
                r9 = r8
                r8 = r6
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: getFlags.TuitionPaymentFragmentspecialinlinedviewModeldefault3.c(short, int, short, java.lang.Object[]):void");
        }

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ArrayList();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ArrayList();
            this.TuitionPaymentFragmentbindingInflater1 = new ArrayList();
            this.b = new ArrayList();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new ArrayList();
        }

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(getFlags getflags) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = CollectionsKt.toMutableList((Collection) getflags.b());
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = CollectionsKt.toMutableList((Collection) getflags.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            this.TuitionPaymentFragmentbindingInflater1 = CollectionsKt.toMutableList((Collection) getflags.TuitionPaymentFragmentbindingInflater1());
            this.b = CollectionsKt.toMutableList((Collection) getflags.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = CollectionsKt.toMutableList((Collection) getflags.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        }

        private static void e(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2;
            int i4 = 2 % 2;
            SessionProcessor sessionProcessor = new SessionProcessor();
            int length = cArr2.length;
            char[] cArr4 = new char[length];
            int length2 = cArr.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr2, 0, cArr4, 0, length);
            System.arraycopy(cArr, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr3.length;
            char[] cArr6 = new char[length3];
            sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            int i5 = $11 + 73;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
                int i7 = $10 + 77;
                $11 = i7 % 128;
                int i8 = i7 % i3;
                try {
                    Object[] objArr2 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8328), 1235 - View.combineMeasuredStates(0, 0), 35 - Gravity.getAbsoluteGravity(0, 0), -653973969, false, $$e(b, b2, b2), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 + 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 2812 - AndroidCharacter.getMirror('0'), 14 - TextUtils.getCapsMode("", 0, 0), 1504416861, false, $$e(b3, b4, (byte) (b4 - 2)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), Gravity.getAbsoluteGravity(0, 0) + 253, MotionEvent.axisFromString("") + 23, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 65200);
                        int i9 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2892;
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 18;
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 + 1);
                        String str$$e = $$e(b5, b6, (byte) (b6 - 1));
                        i2 = 2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(capsMode, i9, modifierMetaStateMask, 2012627446, false, str$$e, new Class[]{Integer.TYPE, Integer.TYPE});
                    } else {
                        i2 = 2;
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = sessionProcessor.b;
                    cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (f938a ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) asInterface) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) g) ^ (-6377398940819159759L)))));
                    sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                    i3 = i2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArr6);
        }

        public final <T> TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault2(getString<T, ?> getstring, Class<T> cls) throws Throwable {
            Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 29944);
                int iMakeMeasureSpec = 1755 - View.MeasureSpec.makeMeasureSpec(0, 0);
                int doubleTapTimeout = 23 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                byte[] bArr = $$a;
                byte b = bArr[7];
                Object[] objArr = new Object[1];
                c(b, bArr[28], b, objArr);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(touchSlop, iMakeMeasureSpec, doubleTapTimeout, 986134021, false, (String) objArr[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr2 = new Object[1];
            e(new char[]{1712, 42159, 39727, 9909}, new char[]{56303, 11393, 30658, 55958}, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (-1) - MotionEvent.axisFromString(""), new char[]{37535, 21753, 17255, 28612, 57329, 18745, 56465, 8867, 50257, 45352, 41107, 51390, 1226, 50110, 62058, 27012, 45545, 47071, 23173, 2984, 62397, 1780}, objArr2);
            Class<?> cls2 = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            e(new char[]{1712, 42159, 39727, 9909}, new char[]{21550, 9396, 17007, 63929}, (char) (47425 - ((byte) KeyEvent.getModifierMetaStateMask())), 1864676436 - Drawable.resolveOpacity(0, 0), new char[]{24614, 25867, 6356, 44162, 21959, 58290, 17184, 1860, 32700, 42087, 9778, 12227, 35928, 55372, 58509}, objArr3);
            long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c = (char) (29945 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                int iRed = Color.red(0) + 1755;
                int offsetAfter = 23 - TextUtils.getOffsetAfter("", 0);
                byte[] bArr2 = $$a;
                Object[] objArr4 = new Object[1];
                c(bArr2[5], (byte) ($$b & 60), bArr2[7], objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iRed, offsetAfter, 1596667560, false, (String) objArr4[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                int i2 = d + 71;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cIndexOf = (char) (29944 - TextUtils.indexOf("", "", 0));
                    int size = View.MeasureSpec.getSize(0) + 1755;
                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 24;
                    byte[] bArr3 = $$a;
                    Object[] objArr5 = new Object[1];
                    c(bArr3[5], (byte) 88, bArr3[7], objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, size, bitsPerPixel, 1599039318, false, (String) objArr5[0], null);
                }
                Object[] objArr6 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr6[0])[0]}, new int[]{((int[]) objArr6[1])[0]}, (Object[]) objArr6[2], new int[1], (String[]) objArr6[4]};
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i4 = ~iElapsedRealtime;
                int i5 = (-151972385) + (((~((-132644223) | i4)) | (~(iElapsedRealtime | 79958203))) * 333) + (((~(iElapsedRealtime | (-132644223))) | (~(i4 | 79958203))) * 333) + 1530817072;
                int i6 = (i5 << 13) ^ i5;
                int i7 = i6 ^ (i6 >>> 17);
                ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i7 ^ (i7 << 5);
            } else {
                Object[] objArr7 = new Object[1];
                e(new char[]{1712, 42159, 39727, 9909}, new char[]{26761, 59728, 10217, 40260}, (char) (17447 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), ViewConfiguration.getWindowTouchSlop() >> 8, new char[]{61787, 14222, 55422, 7688, 3739, 27661, 52346, 25830, 57918, 21846, 12687, 42813, 64271, 48159, 57299, 3669}, objArr7);
                Class<?> cls3 = Class.forName((String) objArr7[0]);
                Object[] objArr8 = new Object[1];
                e(new char[]{1712, 42159, 39727, 9909}, new char[]{11351, 16437, 7373, 47716}, (char) (25628 - (ViewConfiguration.getJumpTapTimeout() >> 16)), View.MeasureSpec.getMode(0), new char[]{9848, 29718, 5307, 22072, 56067, 34520, 37381, 41412, 61152, 11675, 29703, 28586, 62077, 17468, 46889, 59763}, objArr8);
                int iIntValue = ((Integer) cls3.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr9 = {2109330474};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getTouchSlop() >> 8) + 42049), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1726, 30 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
                    }
                    objArrTuitionPaymentFragmentbindingInflater1$7879113 = ClockHandView$$ExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr9), 1530817072, false, true);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char bitsPerPixel2 = (char) (ImageFormat.getBitsPerPixel(0) + 29945);
                        int defaultSize = View.getDefaultSize(0, 0) + 1755;
                        int iArgb = Color.argb(0, 0, 0, 0) + 23;
                        byte[] bArr4 = $$a;
                        Object[] objArr10 = new Object[1];
                        c(bArr4[5], (byte) 88, bArr4[7], objArr10);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(bitsPerPixel2, defaultSize, iArgb, 1599039318, false, (String) objArr10[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                    try {
                        Object[] objArr11 = new Object[1];
                        e(new char[]{1712, 42159, 39727, 9909}, new char[]{56303, 11393, 30658, 55958}, (char) (Process.myTid() >> 22), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{37535, 21753, 17255, 28612, 57329, 18745, 56465, 8867, 50257, 45352, 41107, 51390, 1226, 50110, 62058, 27012, 45545, 47071, 23173, 2984, 62397, 1780}, objArr11);
                        Class<?> cls4 = Class.forName((String) objArr11[0]);
                        Object[] objArr12 = new Object[1];
                        e(new char[]{1712, 42159, 39727, 9909}, new char[]{21550, 9396, 17007, 63929}, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 47425), 1864676437 + TextUtils.indexOf((CharSequence) "", '0'), new char[]{24614, 25867, 6356, 44162, 21959, 58290, 17184, 1860, 32700, 42087, 9778, 12227, 35928, 55372, 58509}, objArr12);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c2 = (char) (29945 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                            int capsMode = TextUtils.getCapsMode("", 0, 0) + 1755;
                            int iArgb2 = 23 - Color.argb(0, 0, 0, 0);
                            byte[] bArr5 = $$a;
                            Object[] objArr13 = new Object[1];
                            c(bArr5[5], (byte) ($$b & 60), bArr5[7], objArr13);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, capsMode, iArgb2, 1596667560, false, (String) objArr13[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                            char c3 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 29943);
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0) + 1755;
                            int i8 = 24 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                            byte[] bArr6 = $$a;
                            byte b2 = bArr6[7];
                            Object[] objArr14 = new Object[1];
                            c(b2, bArr6[28], b2, objArr14);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c3, iMakeMeasureSpec2, i8, 986134021, false, (String) objArr14[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            if (((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0] != ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
                if (strArr == null) {
                    throw null;
                }
                int i9 = asBinder + 35;
                d = i9 % 128;
                int i10 = i9 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
                throw null;
            }
            int i11 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            Object[] objArr15 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int iNextInt = new Random().nextInt();
            int i12 = (-133797790) + (((~((~iNextInt) | 201189104)) | (-469628923)) * (-245));
            int i13 = ~(iNextInt | 201189104);
            int i14 = i11 + i12 + (i13 * (-245)) + ((i13 | 413791530) * 245);
            int i15 = (i14 << 13) ^ i14;
            int i16 = i15 ^ (i15 >>> 17);
            ((int[]) objArr15[3])[0] = i16 ^ (i16 << 5);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(TuplesKt.to(getstring, cls));
            return this;
        }

        public final <T> TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault3(fromMediaMetadata<T> frommediametadata, Class<T> cls) {
            int i = 2 % 2;
            int i2 = asBinder + 59;
            d = i2 % 128;
            if (i2 % 2 != 0) {
                this.TuitionPaymentFragmentbindingInflater1.add(TuplesKt.to(frommediametadata, cls));
                throw null;
            }
            this.TuitionPaymentFragmentbindingInflater1.add(TuplesKt.to(frommediametadata, cls));
            int i3 = d + 87;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 26 / 0;
            }
            return this;
        }

        public final <T> TuitionPaymentFragmentspecialinlinedviewModeldefault3 b(setMediaId.TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> tuitionPaymentFragmentspecialinlinedviewModeldefault1, Class<T> cls) {
            int i = 2 % 2;
            int i2 = d + 57;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                this.b.add(TuplesKt.to(tuitionPaymentFragmentspecialinlinedviewModeldefault1, cls));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.b.add(TuplesKt.to(tuitionPaymentFragmentspecialinlinedviewModeldefault1, cls));
            int i3 = d + 7;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            return this;
        }

        public final TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentbindingInflater1(MediaBrowserCompatApi21MediaItem.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i = 2 % 2;
            int i2 = d + 107;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(tuitionPaymentFragmentspecialinlinedviewModeldefault2);
            int i4 = d + 121;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        public final getFlags TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            int i = 2 % 2;
            getFlags getflags = new getFlags(getPackageName.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2), getPackageName.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1), getPackageName.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1), getPackageName.TuitionPaymentFragmentbindingInflater1(this.b), getPackageName.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3), null);
            int i2 = asBinder + 91;
            d = i2 % 128;
            if (i2 % 2 == 0) {
                return getflags;
            }
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$e(int r6, short r7, byte r8) {
            /*
                int r7 = r7 + 102
                int r6 = r6 * 4
                int r0 = 1 - r6
                int r8 = r8 * 4
                int r8 = r8 + 4
                byte[] r1 = getFlags.TuitionPaymentFragmentspecialinlinedviewModeldefault3.$$c
                byte[] r0 = new byte[r0]
                r2 = 0
                int r6 = 0 - r6
                if (r1 != 0) goto L16
                r3 = r8
                r4 = r2
                goto L2b
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r7
                r0[r3] = r4
                if (r3 != r6) goto L22
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L22:
                int r3 = r3 + 1
                r4 = r1[r8]
                r5 = r8
                r8 = r7
                r7 = r4
                r4 = r3
                r3 = r5
            L2b:
                int r7 = -r7
                int r7 = r7 + r8
                int r8 = r3 + 1
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: getFlags.TuitionPaymentFragmentspecialinlinedviewModeldefault3.$$e(int, short, byte):java.lang.String");
        }
    }

    public /* synthetic */ getFlags(List list, List list2, List list3, List list4, List list5, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, list4, list5);
    }
}
