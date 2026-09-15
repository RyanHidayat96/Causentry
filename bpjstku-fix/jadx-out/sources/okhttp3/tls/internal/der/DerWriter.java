package okhttp3.tls.internal.der;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.exifinterface.media.ExifInterface;
import com.bpjstku.databinding.ItemProgramChosenBinding;
import defpackage.RotationProviderListener;
import defpackage.RotationProviderListenerWrapper;
import defpackage.initSession;
import defpackage.setVideoStabilizationMode;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ9\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0011¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020%¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b(\u0010$J\u0015\u0010)\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b)\u0010$J\u0017\u0010*\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0011H\u0002¢\u0006\u0004\b*\u0010\"R\"\u0010+\u001a\u00020\u001e8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u0010 R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\b008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u0002008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b3\u00102R(\u00108\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00018G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001c\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b9\u00102"}, d2 = {"Lokhttp3/tls/internal/der/DerWriter;", "", "LRotationProviderListener;", "p0", "<init>", "(LRotationProviderListener;)V", "sink", "()LRotationProviderListener;", "", "toString", "()Ljava/lang/String;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", "withTypeHint", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "", "p1", "", "p2", "Lkotlin/Function1;", "", "p3", "write", "(Ljava/lang/String;IJLkotlin/jvm/functions/Function1;)V", "Ljava/math/BigInteger;", "writeBigInteger", "(Ljava/math/BigInteger;)V", "Lokhttp3/tls/internal/der/BitString;", "writeBitString", "(Lokhttp3/tls/internal/der/BitString;)V", "", "writeBoolean", "(Z)V", "writeLong", "(J)V", "writeObjectIdentifier", "(Ljava/lang/String;)V", "Lokio/ByteString;", "writeOctetString", "(Lokio/ByteString;)V", "writeRelativeObjectIdentifier", "writeUtf8", "writeVariableLengthLong", "constructed", "Z", "getConstructed", "()Z", "setConstructed", "", "path", "Ljava/util/List;", "stack", "getTypeHint", "()Ljava/lang/Object;", "setTypeHint", "(Ljava/lang/Object;)V", "typeHint", "typeHintStack"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class DerWriter {
    private boolean constructed;
    private final List<String> path;
    private final List<RotationProviderListener> stack;
    private final List<Object> typeHintStack;
    private static final byte[] $$c = {113, 29, -123, -97};
    private static final int $$d = 120;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {12, 11, -9, -106, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$b = 235;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {59694, 59734, 59784, 59800, 59803, 59778, 59789, 59774, 59775, 59777, 59789, 59791, 59784, 59791, 59789, 59779, 59782, 59778, 59784, 59757, 59744, 59781, 59735, 59831, 59829, 59850, 59848, 59826, 59837, 59813, 59813, 59836, 59828, 59855, 59824, 59826, 59824, 59708, 59745, 59713, 59723, 59757, 59773, 59768, 59751, 59746, 59744, 59758, 59744, 59744, 59724, 59718, 59757, 59705, 59757, 59756, 59759, 59746, 59730, 59742, 59750, 59745, 59743, 59755, 59773, 59749, 59749, 59770, 59746};

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 2
            int r8 = r8 + 84
            int r6 = r6 * 15
            int r0 = 53 - r6
            byte[] r1 = okhttp3.tls.internal.der.DerWriter.$$a
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            int r6 = 52 - r6
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2c:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            int r8 = r8 + 1
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.tls.internal.der.DerWriter.a(short, int, byte, java.lang.Object[]):void");
    }

    public DerWriter(RotationProviderListener rotationProviderListener) {
        Intrinsics.checkNotNullParameter(rotationProviderListener, "");
        this.stack = CollectionsKt.mutableListOf(rotationProviderListener);
        this.typeHintStack = new ArrayList();
        this.path = new ArrayList();
    }

    public final Object getTypeHint() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        List<Object> list = this.typeHintStack;
        if (i3 != 0) {
            return CollectionsKt.lastOrNull((List) list);
        }
        CollectionsKt.lastOrNull((List) list);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setTypeHint(Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        List<Object> list = this.typeHintStack;
        list.set(list.size() - 1, obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final boolean getConstructed() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 125;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        boolean z = this.constructed;
        int i5 = i3 + 43;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setConstructed(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        this.constructed = z;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void write(String p0, int p1, long p2, Function1<? super RotationProviderListener, Unit> p3) throws IOException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p3, "");
        RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
        this.stack.add(rotationProviderListenerWrapper);
        this.constructed = false;
        this.path.add(p0);
        try {
            p3.invoke(rotationProviderListenerWrapper);
            int i2 = this.constructed ? 32 : 0;
            this.constructed = true;
            List<RotationProviderListener> list = this.stack;
            list.remove(list.size() - 1);
            List<String> list2 = this.path;
            list2.remove(list2.size() - 1);
            RotationProviderListener rotationProviderListenerSink = sink();
            if (p2 < 31) {
                int i3 = TuitionPaymentFragmentbindingInflater1 + 81;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
                int i4 = i3 % 2;
                rotationProviderListenerSink.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p1 | i2 | ((int) p2));
            } else {
                rotationProviderListenerSink.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p1 | i2 | 31);
                writeVariableLengthLong(p2);
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
                TuitionPaymentFragmentbindingInflater1 = i5 % 128;
                int i6 = i5 % 2;
            }
            long j = rotationProviderListenerWrapper.size;
            if (j >= 128) {
                int iNumberOfLeadingZeros = (71 - Long.numberOfLeadingZeros(j)) / 8;
                rotationProviderListenerSink.TuitionPaymentFragmentspecialinlinedviewModeldefault3(iNumberOfLeadingZeros | 128);
                int i7 = (iNumberOfLeadingZeros - 1) * 8;
                int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(i7, 0, -8);
                if (progressionLastElement <= i7) {
                    while (true) {
                        rotationProviderListenerSink.TuitionPaymentFragmentspecialinlinedviewModeldefault3((int) (j >> i7));
                        if (i7 == progressionLastElement) {
                            break;
                        }
                        int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i9 = i8 + 69;
                        TuitionPaymentFragmentbindingInflater1 = i9 % 128;
                        i7 = i9 % 2 != 0 ? i7 + 93 : i7 - 8;
                        int i10 = i8 + 119;
                        TuitionPaymentFragmentbindingInflater1 = i10 % 128;
                        int i11 = i10 % 2;
                    }
                }
            } else {
                rotationProviderListenerSink.TuitionPaymentFragmentspecialinlinedviewModeldefault3((int) j);
            }
            rotationProviderListenerSink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(rotationProviderListenerWrapper);
        } catch (Throwable th) {
            List<RotationProviderListener> list3 = this.stack;
            list3.remove(list3.size() - 1);
            List<String> list4 = this.path;
            list4.remove(list4.size() - 1);
            throw th;
        }
    }

    public final <T> T withTypeHint(Function0<? extends T> p0) {
        T tInvoke;
        List<Object> list;
        int size;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(p0, "");
                this.typeHintStack.add(null);
                tInvoke = p0.invoke();
                list = this.typeHintStack;
                size = list.size() % 1;
            } else {
                Intrinsics.checkNotNullParameter(p0, "");
                this.typeHintStack.add(null);
                tInvoke = p0.invoke();
                list = this.typeHintStack;
                size = list.size() - 1;
            }
            list.remove(size);
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            if (i3 % 2 == 0) {
                return tInvoke;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            List<Object> list2 = this.typeHintStack;
            list2.remove(list2.size() - 1);
            throw th;
        }
    }

    private final RotationProviderListener sink() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        List<RotationProviderListener> list = this.stack;
        return list.get(i3 == 0 ? list.size() << 1 : list.size() - 1);
    }

    public final void writeBoolean(boolean p0) throws IOException {
        int i;
        int i2 = 2 % 2;
        RotationProviderListener rotationProviderListenerSink = sink();
        if (p0) {
            int i3 = TuitionPaymentFragmentbindingInflater1 + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            i = -1;
        } else {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            i = 0;
        }
        rotationProviderListenerSink.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i);
    }

    public final void writeBigInteger(BigInteger p0) throws IOException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        RotationProviderListener rotationProviderListenerSink = sink();
        byte[] byteArray = p0.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "");
        rotationProviderListenerSink.b(byteArray);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void writeLong(long p0) throws IOException {
        int iNumberOfLeadingZeros;
        int i = 2 % 2;
        RotationProviderListener rotationProviderListenerSink = sink();
        if (p0 >= 0) {
            iNumberOfLeadingZeros = Long.numberOfLeadingZeros(p0);
        } else {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            iNumberOfLeadingZeros = i2 % 2 != 0 ? Long.numberOfLeadingZeros(p0 - (-1)) : Long.numberOfLeadingZeros(~p0);
        }
        int i3 = (((72 - iNumberOfLeadingZeros) / 8) - 1) * 8;
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(i3, 0, -8);
        if (progressionLastElement > i3) {
            return;
        }
        while (true) {
            rotationProviderListenerSink.TuitionPaymentFragmentspecialinlinedviewModeldefault3((int) (p0 >> i3));
            if (i3 == progressionLastElement) {
                return;
            }
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            i3 -= 8;
        }
    }

    public final void writeBitString(BitString p0) throws IOException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(p0, "");
            RotationProviderListener rotationProviderListenerSink = sink();
            rotationProviderListenerSink.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0.getUnusedBitsCount());
            rotationProviderListenerSink.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0.getByteString());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(p0, "");
        RotationProviderListener rotationProviderListenerSink2 = sink();
        rotationProviderListenerSink2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0.getUnusedBitsCount());
        rotationProviderListenerSink2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0.getByteString());
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 6 / 0;
        }
    }

    public final void writeOctetString(ByteString p0) throws IOException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(p0, "");
            sink().TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(p0, "");
        sink().TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0);
        int i3 = TuitionPaymentFragmentbindingInflater1 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public final void writeUtf8(String p0) throws IOException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        sink().TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 121;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void writeObjectIdentifier(String p0) throws IOException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
        Intrinsics.checkNotNullParameter(p0, "");
        RotationProviderListenerWrapper rotationProviderListenerWrapperB = rotationProviderListenerWrapper.b(p0, 0, p0.length());
        long jINotificationSideChannel = rotationProviderListenerWrapperB.INotificationSideChannel();
        if (rotationProviderListenerWrapperB.cancel() != 46) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        writeVariableLengthLong((jINotificationSideChannel * 40) + rotationProviderListenerWrapperB.INotificationSideChannel());
        while (rotationProviderListenerWrapperB.size != 0) {
            int i4 = TuitionPaymentFragmentbindingInflater1 + 47;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            if (rotationProviderListenerWrapperB.cancel() != 46) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            writeVariableLengthLong(rotationProviderListenerWrapperB.INotificationSideChannel());
            int i6 = TuitionPaymentFragmentbindingInflater1 + 113;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = TuitionPaymentFragmentbindingInflater1 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
        int i9 = i8 % 2;
    }

    public final void writeRelativeObjectIdentifier(String p0) throws IOException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        RotationProviderListenerWrapper rotationProviderListenerWrapperTuitionPaymentFragmentspecialinlinedviewModeldefault3 = new RotationProviderListenerWrapper().TuitionPaymentFragmentspecialinlinedviewModeldefault3(46);
        Intrinsics.checkNotNullParameter(p0, "");
        RotationProviderListenerWrapper rotationProviderListenerWrapperB = rotationProviderListenerWrapperTuitionPaymentFragmentspecialinlinedviewModeldefault3.b(p0, 0, p0.length());
        while (rotationProviderListenerWrapperB.size != 0) {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 111;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            if (i2 % 2 == 0) {
                if (rotationProviderListenerWrapperB.cancel() != 7) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
                TuitionPaymentFragmentbindingInflater1 = i3 % 128;
                int i4 = i3 % 2;
                writeVariableLengthLong(rotationProviderListenerWrapperB.INotificationSideChannel());
            } else {
                if (rotationProviderListenerWrapperB.cancel() != 46) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
                TuitionPaymentFragmentbindingInflater1 = i5 % 128;
                int i6 = i5 % 2;
                writeVariableLengthLong(rotationProviderListenerWrapperB.INotificationSideChannel());
            }
        }
        int i7 = TuitionPaymentFragmentbindingInflater1 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
        int i8 = i7 % 2;
    }

    private final void writeVariableLengthLong(long p0) throws IOException {
        int i;
        int i2 = 2 % 2;
        RotationProviderListener rotationProviderListenerSink = sink();
        int iNumberOfLeadingZeros = (((70 - Long.numberOfLeadingZeros(p0)) / 7) - 1) * 7;
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(iNumberOfLeadingZeros, 0, -7);
        if (progressionLastElement > iNumberOfLeadingZeros) {
            return;
        }
        while (true) {
            if (iNumberOfLeadingZeros == 0) {
                int i3 = TuitionPaymentFragmentbindingInflater1 + 75;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
                int i4 = i3 % 2;
                i = 0;
            } else {
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 107;
                TuitionPaymentFragmentbindingInflater1 = i5 % 128;
                int i6 = i5 % 2;
                i = 128;
            }
            rotationProviderListenerSink.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i | ((int) ((p0 >> iNumberOfLeadingZeros) & 127)));
            if (iNumberOfLeadingZeros == progressionLastElement) {
                return;
            }
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 61;
            TuitionPaymentFragmentbindingInflater1 = i7 % 128;
            iNumberOfLeadingZeros = i7 % 2 != 0 ? iNumberOfLeadingZeros + 39 : iNumberOfLeadingZeros - 7;
        }
    }

    private static void b(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2;
        int i3 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i4 = 0;
        int i5 = iArr[0];
        int i6 = 1;
        int i7 = iArr[1];
        int i8 = iArr[2];
        int i9 = iArr[3];
        char[] cArr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i10 = 0;
            while (i10 < length) {
                int i11 = $10 + 35;
                $11 = i11 % 128;
                if (i11 % i2 == 0) {
                    try {
                        Object[] objArr2 = new Object[i6];
                        objArr2[i4] = Integer.valueOf(cArr[i10]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b = (byte) i4;
                            byte b2 = (byte) (b + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) View.getDefaultSize(i4, i4), 1271 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 18 - (ViewConfiguration.getJumpTapTimeout() >> 16), 407021364, false, $$e(b, b2, (byte) (-b2)), new Class[]{Integer.TYPE});
                        }
                        cArr2[i10] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr[i10])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1269, 18 - TextUtils.getOffsetAfter("", 0), 407021364, false, $$e(b3, b4, (byte) (-b4)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i10] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i10++;
                }
                i2 = 2;
                i4 = 0;
                i6 = 1;
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i7];
        System.arraycopy(cArr, i5, cArr3, 0, i7);
        if (bArr != null) {
            char[] cArr4 = new char[i7];
            setvideostabilizationmode.b = 0;
            char c = 0;
            while (setvideostabilizationmode.b < i7) {
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i12 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getJumpTapTimeout() >> 16) + 3225, 13 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 2133916302, false, $$e(b5, b6, (byte) (b6 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                } else {
                    int i13 = setvideostabilizationmode.b;
                    Object[] objArr5 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = (byte) (b7 + 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (29944 - (ViewConfiguration.getPressedStateDuration() >> 16)), (ViewConfiguration.getEdgeSlop() >> 16) + 1755, 22 - TextUtils.indexOf((CharSequence) "", '0'), 387247676, false, $$e(b7, b8, (byte) (b8 - 3)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                }
                c = cArr4[setvideostabilizationmode.b];
                Object[] objArr6 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b9 = (byte) 0;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (Color.green(0) + 41241), 1705 - TextUtils.getCapsMode("", 0, 0), 20 - TextUtils.lastIndexOf("", '0', 0), -1434471773, false, $$e(b9, (byte) (b9 | 6), (byte) (-1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                int i14 = $10 + 39;
                $11 = i14 % 128;
                if (i14 % 2 == 0) {
                    int i15 = 4 % 5;
                }
            }
            cArr3 = cArr4;
        }
        if (i9 > 0) {
            char[] cArr5 = new char[i7];
            i = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i7);
            int i16 = i7 - i9;
            System.arraycopy(cArr5, 0, cArr3, i16, i9);
            System.arraycopy(cArr5, i9, cArr3, 0, i16);
        } else {
            i = 0;
        }
        if (!(!z)) {
            char[] cArr6 = new char[i7];
            while (true) {
                setvideostabilizationmode.b = i;
                if (setvideostabilizationmode.b >= i7) {
                    break;
                }
                int i17 = $11 + 85;
                $10 = i17 % 128;
                int i18 = i17 % 2;
                cArr6[setvideostabilizationmode.b] = cArr3[(i7 - setvideostabilizationmode.b) - 1];
                i = setvideostabilizationmode.b + 1;
            }
            cArr3 = cArr6;
        }
        if (i8 > 0) {
            int i19 = $11 + 85;
            $10 = i19 % 128;
            int i20 = i19 % 2;
            int i21 = 0;
            while (true) {
                setvideostabilizationmode.b = i21;
                if (setvideostabilizationmode.b >= i7) {
                    break;
                }
                int i22 = $11 + 73;
                $10 = i22 % 128;
                int i23 = i22 % 2;
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                i21 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public final String toString() throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        char c;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 29944);
            int iIndexOf = 1754 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 23;
            byte[] bArr = $$a;
            byte b = bArr[5];
            byte b2 = bArr[7];
            Object[] objArr3 = new Object[1];
            a(b, b2, b2, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(capsMode, iIndexOf, iIndexOf2, 986134021, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        b(new int[]{0, 22, 29, 12}, false, new byte[]{1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        b(new int[]{22, 15, 83, 0}, true, new byte[]{0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cLastIndexOf = (char) (29943 - TextUtils.lastIndexOf("", '0'));
            int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1756;
            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 23;
            byte b3 = $$a[7];
            byte b4 = b3;
            Object[] objArr6 = new Object[1];
            a(b4, (byte) (b4 | 37), b3, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, iIndexOf3, offsetBefore, 1596667560, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29944);
                int tapTimeout = 1755 - (ViewConfiguration.getTapTimeout() >> 16);
                int iArgb = 23 - Color.argb(0, 0, 0, 0);
                byte b5 = $$a[7];
                byte b6 = b5;
                Object[] objArr7 = new Object[1];
                a(b6, (byte) (b6 | 89), b5, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, tapTimeout, iArgb, 1599039318, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i4 = ((int[]) objArr8[0])[0];
            objArr = new Object[]{new int[]{i4}, new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[1], (String[]) objArr8[4]};
            int iMyPid = Process.myPid();
            int i5 = ~iMyPid;
            int i6 = 1958332176 + (((~((-110288139) | i5)) | 102314287) * 226) + (((~(i5 | (-8571905))) | (~((-102314288) | iMyPid)) | 598053) * (-113)) + ((~(iMyPid | (-110288139))) * 113) + 98510954;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[3])[0] = i8 ^ (i8 << 5);
            int i9 = TuitionPaymentFragmentbindingInflater1 + 115;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 2 / 4;
            }
        } else {
            Object[] objArr9 = new Object[1];
            b(new int[]{37, 16, 0, 9}, false, new byte[]{0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1}, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            b(new int[]{53, 16, 0, 2}, true, new byte[]{0, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1}, objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr11 = {934102188};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (42049 - KeyEvent.keyCodeFromString("")), 1726 - View.MeasureSpec.getMode(0), 29 - (ViewConfiguration.getFadingEdgeLength() >> 16), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrB$5f1425da = ItemProgramChosenBinding.b$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr11), 98510954);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c3 = (char) (29943 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                    int i11 = 1754 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    int capsMode2 = 23 - TextUtils.getCapsMode("", 0, 0);
                    byte b7 = $$a[7];
                    byte b8 = b7;
                    Object[] objArr12 = new Object[1];
                    a(b8, (byte) (b8 | 89), b7, objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c3, i11, capsMode2, 1599039318, false, (String) objArr12[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrB$5f1425da);
                try {
                    Object[] objArr13 = new Object[1];
                    b(new int[]{0, 22, 29, 12}, false, new byte[]{1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0}, objArr13);
                    Class<?> cls3 = Class.forName((String) objArr13[0]);
                    Object[] objArr14 = new Object[1];
                    b(new int[]{22, 15, 83, 0}, true, new byte[]{0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr14);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr14[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cResolveSize = (char) (29944 - View.resolveSize(0, 0));
                        int iGreen = Color.green(0) + 1755;
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 23;
                        byte b9 = $$a[7];
                        byte b10 = b9;
                        Object[] objArr15 = new Object[1];
                        a(b10, (byte) (b10 | 37), b9, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveSize, iGreen, minimumFlingVelocity, 1596667560, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c4 = (char) (29944 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        int iRgb = Color.rgb(0, 0, 0) + 16778971;
                        int doubleTapTimeout = 23 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        byte[] bArr2 = $$a;
                        byte b11 = bArr2[5];
                        byte b12 = bArr2[7];
                        Object[] objArr16 = new Object[1];
                        a(b11, b12, b12, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c4, iRgb, doubleTapTimeout, 986134021, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                    objArr = objArrB$5f1425da;
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
        int i12 = ((int[]) objArr[1])[0];
        int i13 = ((int[]) objArr[0])[0];
        if (i13 == i12) {
            int i14 = ((int[]) objArr[3])[0];
            int i15 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[]{i15}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i16 = ~(338947989 | iIdentityHashCode);
            int i17 = i14 + (-696190673) + (((-397930464) | i16) * (-814)) + ((i16 | (~((~iIdentityHashCode) | 126345563)) | 67363089) * 407) + (((~(iIdentityHashCode | (-126345564))) | (~((-338947990) | iIdentityHashCode)) | 67363089) * 407);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr2[3])[0] = i19 ^ (i19 << 5);
            c = 3;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i20 = 0;
                while (i20 < strArr.length) {
                    int i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 91;
                    TuitionPaymentFragmentbindingInflater1 = i21 % 128;
                    int i22 = i21 % 2;
                    arrayList.add(strArr[i20]);
                    i20++;
                    int i23 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
                    TuitionPaymentFragmentbindingInflater1 = i23 % 128;
                    int i24 = i23 % 2;
                }
            }
            Toast.makeText((Context) null, i13 / (((i13 - 1) * i13) % 2), 0).show();
            int i25 = ((int[]) objArr[3])[0];
            int i26 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[]{i26}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i27 = i25 + (((~(iIdentityHashCode2 | 70206985)) | 142395440) * 56) + 50204273 + (((~((~iIdentityHashCode2) | 142395440)) | 70206985) * 56);
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            c = 3;
            ((int[]) objArr2[3])[0] = i29 ^ (i29 << 5);
        }
        List<String> list = this.path;
        int i30 = ((int[]) objArr2[c])[0];
        int i31 = i30 * i30;
        int i32 = -(1807085658 * i30);
        int i33 = (((i31 & i32) + (i31 | i32)) - (~(-(i30 * 736287714)))) - 1;
        int i34 = (i33 & 2089544580) + (2089544580 | i33);
        int i35 = i34 >> 24;
        int i36 = ((i35 ^ (-511)) + ((i35 & (-511)) << 1)) / 256;
        int i37 = (i34 - (~((i36 & 1) + (i36 | 1)))) - 1;
        int i38 = i34 >> 19;
        int i39 = (((i38 | (-16383)) << 1) - (i38 ^ (-16383))) / 8192;
        int i40 = -(i37 ^ ((i39 & 1) + (i39 | 1)));
        int i41 = ((i40 | 7) << 1) - (i40 ^ 7);
        int i42 = i41 >> 24;
        int i43 = ((i42 & (-511)) + (i42 | (-511))) / 256;
        int i44 = ((i43 | 1) << 1) - (i43 ^ 1);
        return CollectionsKt.joinToString$default(list, "6\\ / ".substring(27818 / (((-((i44 & 1) + (i44 | 1))) & i41) * 1987)), null, null, 0, null, null, 62, null);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001f -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x001f
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(short r6, int r7, byte r8) {
        /*
            int r6 = r6 * 3
            int r0 = r6 + 1
            int r8 = r8 + 4
            byte[] r1 = okhttp3.tls.internal.der.DerWriter.$$c
            int r7 = r7 + 99
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L1f
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L1f:
            int r8 = r8 + 1
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r7 = -r7
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.tls.internal.der.DerWriter.$$e(short, int, byte):java.lang.String");
    }
}
