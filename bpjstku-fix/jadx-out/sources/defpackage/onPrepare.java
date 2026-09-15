package defpackage;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.airbnb.lottie.parser.moshi.JsonDataException;
import com.airbnb.lottie.parser.moshi.JsonEncodingException;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.bpjstku.data.registration.pmi.PMIRegistrationDataStore$$ExternalSyntheticLambda7;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.text.Charsets;
import kotlin.text.Typography;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
public final class onPrepare extends JsonReader {
    private static long INotificationSideChannelStub;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ByteString f1302a;
    private static final ByteString asInterface;
    private static final ByteString d;
    private static int getInterfaceDescriptor;
    private String INotificationSideChannel;
    private long cancel;
    private final RotationProvider1 cancelAll;
    private final RotationProviderListenerWrapper g;
    private int notify = 0;
    private int onTransact;
    private static final byte[] $$c = {19, 78, 114, 113};
    private static final int $$d = 201;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {56, 94, 119, -19, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
    private static final int $$b = 52;
    private static int RemoteActionCompatParcelizer = 0;
    private static int INotificationSideChannelStubProxy = 1;
    private static int INotificationSideChannelDefault = 1;

    public static /* synthetic */ Object b(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) throws Throwable {
        int i7 = ~i2;
        int i8 = ~(i7 | i);
        int i9 = ~i;
        int i10 = i8 | (~(i9 | i5));
        int i11 = ~(i9 | i2);
        int i12 = i10 | i11;
        int i13 = ~i5;
        int i14 = i11 | (~(i13 | i2));
        int i15 = (~(i | i7 | i13)) | (~(i13 | i9 | i2));
        int i16 = i5 + i2 + i4 + ((-1369571145) * i3) + ((-720088171) * i6);
        int i17 = i16 * i16;
        int i18 = (((-954023988) * i5) - 252706816) + ((-260227018) * i2) + ((-346898485) * i12) + (i14 * 346898485) + (346898485 * i15) + ((-607125504) * i4) + (565182464 * i3) + (1611661312 * i6) + ((-409206784) * i17);
        int i19 = ((i5 * (-1931095572)) - 2087550970) + (i2 * (-1931094842)) + (i12 * (-365)) + (i14 * 365) + (i15 * 365) + (i4 * (-1931095207)) + (i3 * (-789048161)) + (i6 * 356376013) + (i17 * 423362560);
        int i20 = i18 + (i19 * i19 * (-1901854720));
        if (i20 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        if (i20 != 2) {
            if (i20 != 3) {
                return i20 != 4 ? TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr) : b(objArr);
            }
            onPrepare onprepare = (onPrepare) objArr[0];
            int i21 = 2 % 2;
            StringBuilder sb = new StringBuilder("JsonReader(");
            sb.append(onprepare.cancelAll);
            sb.append(")");
            String string = sb.toString();
            int i22 = RemoteActionCompatParcelizer + 79;
            INotificationSideChannelStubProxy = i22 % 128;
            int i23 = i22 % 2;
            return string;
        }
        onPrepare onprepare2 = (onPrepare) objArr[0];
        int i24 = 2 % 2;
        int i25 = RemoteActionCompatParcelizer + 101;
        int i26 = i25 % 128;
        INotificationSideChannelStubProxy = i26;
        int i27 = i25 % 2;
        int iINotificationSideChannelDefault = onprepare2.notify;
        if (iINotificationSideChannelDefault == 0) {
            int i28 = i26 + 89;
            RemoteActionCompatParcelizer = i28 % 128;
            int i29 = i28 % 2;
            iINotificationSideChannelDefault = onprepare2.INotificationSideChannelDefault();
        }
        if (iINotificationSideChannelDefault != 4) {
            StringBuilder sb2 = new StringBuilder("Expected END_ARRAY but was ");
            sb2.append(onprepare2.cancel());
            sb2.append(" at path ");
            sb2.append(onprepare2.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            throw new JsonDataException(sb2.toString());
        }
        int i30 = RemoteActionCompatParcelizer + 63;
        INotificationSideChannelStubProxy = i30 % 128;
        if (i30 % 2 == 0) {
            onprepare2.asBinder = onprepare2.asBinder;
            int[] iArr = onprepare2.TuitionPaymentFragmentbindingInflater1;
            int i31 = onprepare2.asBinder - 1;
            iArr[i31] = iArr[i31];
            onprepare2.notify = 0;
        } else {
            onprepare2.asBinder--;
            int[] iArr2 = onprepare2.TuitionPaymentFragmentbindingInflater1;
            int i32 = onprepare2.asBinder - 1;
            iArr2[i32] = iArr2[i32] + 1;
            onprepare2.notify = 0;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = defpackage.onPrepare.$$a
            int r7 = r7 * 15
            int r1 = 53 - r7
            int r5 = 92 - r5
            int r6 = r6 * 4
            int r6 = 84 - r6
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = -1
            if (r0 != 0) goto L16
            r6 = r5
            r3 = r7
            goto L2d
        L16:
            r4 = r6
            r6 = r5
            r5 = r4
        L19:
            int r2 = r2 + 1
            byte r3 = (byte) r5
            r1[r2] = r3
            if (r2 != r7) goto L29
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            r8[r6] = r5
            return
        L29:
            int r6 = r6 + 1
            r3 = r0[r6]
        L2d:
            int r5 = r5 + r3
            int r5 = r5 + (-11)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.onPrepare.c(short, short, int, java.lang.Object[]):void");
    }

    static {
        getInterfaceDescriptor = 0;
        getInterfaceDescriptor();
        d = ByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault1("'\\");
        f1302a = ByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault1("\"\\");
        asInterface = ByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault1("{}[]:, \n\t\r\f/\\;#=");
        ByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault1("\n\r");
        ByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault1("*/");
        int i = INotificationSideChannelDefault + 119;
        getInterfaceDescriptor = i % 128;
        int i2 = i % 2;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(INotificationSideChannelStub ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        while (abortcapture.b < cArrB.length) {
            int i3 = $11 + 115;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i5 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(INotificationSideChannelStub)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64837 - TextUtils.lastIndexOf("", '0', 0, 0)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1356, 38 - KeyEvent.keyCodeFromString(""), 894276454, false, $$e(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 47773), 468 - (KeyEvent.getMaxKeyCode() >> 16), 13 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
        int i6 = $11 + 115;
        $10 = i6 % 128;
        int i7 = i6 % 2;
    }

    public onPrepare(RotationProvider1 rotationProvider1) {
        if (rotationProvider1 == null) {
            throw new NullPointerException("source == null");
        }
        this.cancelAll = rotationProvider1;
        this.g = rotationProvider1.asInterface();
        TuitionPaymentFragmentbindingInflater1(6);
        int i = RemoteActionCompatParcelizer + 111;
        INotificationSideChannelStubProxy = i % 128;
        int i2 = i % 2;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws Throwable {
        int i = 2 % 2;
        int iINotificationSideChannelDefault = this.notify;
        if (iINotificationSideChannelDefault == 0) {
            int i2 = INotificationSideChannelStubProxy + 15;
            RemoteActionCompatParcelizer = i2 % 128;
            if (i2 % 2 != 0) {
                INotificationSideChannelDefault();
                throw null;
            }
            iINotificationSideChannelDefault = INotificationSideChannelDefault();
        }
        if (iINotificationSideChannelDefault != 3) {
            StringBuilder sb = new StringBuilder("Expected BEGIN_ARRAY but was ");
            sb.append(cancel());
            sb.append(" at path ");
            sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            throw new JsonDataException(sb.toString());
        }
        int i3 = RemoteActionCompatParcelizer + 5;
        INotificationSideChannelStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            TuitionPaymentFragmentbindingInflater1(0);
            this.TuitionPaymentFragmentbindingInflater1[this.asBinder] = 0;
            this.notify = 1;
        } else {
            TuitionPaymentFragmentbindingInflater1(1);
            this.TuitionPaymentFragmentbindingInflater1[this.asBinder - 1] = 0;
            this.notify = 0;
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() throws Throwable {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 109;
        int i3 = i2 % 128;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        int iINotificationSideChannelDefault = this.notify;
        if (iINotificationSideChannelDefault == 0) {
            int i5 = i3 + 51;
            INotificationSideChannelStubProxy = i5 % 128;
            int i6 = i5 % 2;
            iINotificationSideChannelDefault = INotificationSideChannelDefault();
        }
        if (iINotificationSideChannelDefault == 1) {
            TuitionPaymentFragmentbindingInflater1(3);
            this.notify = 0;
        } else {
            StringBuilder sb = new StringBuilder("Expected BEGIN_OBJECT but was ");
            sb.append(cancel());
            sb.append(" at path ");
            sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            throw new JsonDataException(sb.toString());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void TuitionPaymentFragmentbindingInflater1() throws Throwable {
        int i = 2 % 2;
        int iINotificationSideChannelDefault = this.notify;
        if (iINotificationSideChannelDefault == 0) {
            int i2 = INotificationSideChannelStubProxy + 27;
            RemoteActionCompatParcelizer = i2 % 128;
            if (i2 % 2 != 0) {
                iINotificationSideChannelDefault = INotificationSideChannelDefault();
                int i3 = 77 / 0;
            } else {
                iINotificationSideChannelDefault = INotificationSideChannelDefault();
            }
        }
        if (iINotificationSideChannelDefault != 2) {
            StringBuilder sb = new StringBuilder("Expected END_OBJECT but was ");
            sb.append(cancel());
            sb.append(" at path ");
            sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            throw new JsonDataException(sb.toString());
        }
        this.asBinder--;
        Object obj = null;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3[this.asBinder] = null;
        int[] iArr = this.TuitionPaymentFragmentbindingInflater1;
        int i4 = this.asBinder - 1;
        iArr[i4] = iArr[i4] + 1;
        this.notify = 0;
        int i5 = RemoteActionCompatParcelizer + 87;
        INotificationSideChannelStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final boolean asInterface() throws Throwable {
        int iINotificationSideChannelDefault;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 71;
        INotificationSideChannelStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            iINotificationSideChannelDefault = this.notify;
            int i3 = 49 / 0;
            if (iINotificationSideChannelDefault == 0) {
                iINotificationSideChannelDefault = INotificationSideChannelDefault();
            }
        } else {
            iINotificationSideChannelDefault = this.notify;
            if (iINotificationSideChannelDefault == 0) {
                iINotificationSideChannelDefault = INotificationSideChannelDefault();
            }
        }
        if (iINotificationSideChannelDefault != 2 && iINotificationSideChannelDefault != 4) {
            int i4 = RemoteActionCompatParcelizer + 15;
            INotificationSideChannelStubProxy = i4 % 128;
            int i5 = i4 % 2;
            if (iINotificationSideChannelDefault != 18) {
                return true;
            }
        }
        int i6 = RemoteActionCompatParcelizer + 41;
        INotificationSideChannelStubProxy = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final JsonReader.Token cancel() throws Throwable {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 119;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        int iINotificationSideChannelDefault = this.notify;
        if (iINotificationSideChannelDefault == 0) {
            iINotificationSideChannelDefault = INotificationSideChannelDefault();
        }
        switch (iINotificationSideChannelDefault) {
            case 1:
                JsonReader.Token token = JsonReader.Token.BEGIN_OBJECT;
                int i4 = INotificationSideChannelStubProxy + 75;
                RemoteActionCompatParcelizer = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 84 / 0;
                }
                return token;
            case 2:
                return JsonReader.Token.END_OBJECT;
            case 3:
                JsonReader.Token token2 = JsonReader.Token.BEGIN_ARRAY;
                int i6 = RemoteActionCompatParcelizer + 107;
                INotificationSideChannelStubProxy = i6 % 128;
                int i7 = i6 % 2;
                return token2;
            case 4:
                return JsonReader.Token.END_ARRAY;
            case 5:
            case 6:
                return JsonReader.Token.BOOLEAN;
            case 7:
                return JsonReader.Token.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader.Token.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return JsonReader.Token.NAME;
            case 16:
            case 17:
                return JsonReader.Token.NUMBER;
            case 18:
                return JsonReader.Token.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0588 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:123:0x0589  */
    /* JADX WARN: Code duplicated, block: B:126:0x059a  */
    /* JADX WARN: Code duplicated, block: B:128:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:157:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:182:0x064c  */
    /* JADX WARN: Code duplicated, block: B:188:0x0658  */
    /* JADX WARN: Code duplicated, block: B:200:0x0686  */
    /* JADX WARN: Code duplicated, block: B:206:0x0698  */
    /* JADX WARN: Code duplicated, block: B:208:0x06a0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:209:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:211:0x06af  */
    /* JADX WARN: Code duplicated, block: B:213:0x06b6  */
    /* JADX WARN: Code duplicated, block: B:294:0x069e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:295:0x0655 A[SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private int INotificationSideChannelDefault() throws Throwable {
        Object[] objArr;
        boolean z;
        int i;
        String str;
        String str2;
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        byte bTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i7;
        boolean z3;
        int i8 = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        int i9 = 1;
        int i10 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cAlpha = (char) (Color.alpha(0) + 29944);
            int deadChar = 1755 - KeyEvent.getDeadChar(0, 0);
            int iMyTid = (Process.myTid() >> 22) + 23;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c((byte) 89, bArr[7], bArr[28], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAlpha, deadChar, iMyTid, 986134021, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{37096, 62516, 16406, 35557, 37001, 54474, 338, 60199, 4807, 22157, 33554, 26939, 37895, 53591, 1432, 60550, 5713, 21271, 34690, 25328, 39301, 56807, 2650, 57402, 7115, 24463}, ImageFormat.getBitsPerPixel(0) + 1, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{41870, 41069, 35064, 44086, 41963, 32913, 51641, 52726, 8637, 728, 19452, 20372, 42859, 34076, 52532, 51826, 9511, 1872, 20349}, KeyEvent.normalizeMetaState(0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cMakeMeasureSpec = (char) (29944 - View.MeasureSpec.makeMeasureSpec(0, 0));
            int i11 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1754;
            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 23;
            byte b = (byte) $$b;
            byte b2 = $$a[7];
            Object[] objArr5 = new Object[1];
            c(b, b2, b2, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMakeMeasureSpec, i11, absoluteGravity, 1596667560, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 29944);
                int packedPositionChild = 1754 - ExpandableListView.getPackedPositionChild(0L);
                int iAlpha = 23 - Color.alpha(0);
                byte b3 = $$a[7];
                byte b4 = b3;
                Object[] objArr6 = new Object[1];
                c(b3, b4, b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionType, packedPositionChild, iAlpha, 1599039318, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i12 = ((int[]) objArr7[0])[0];
            objArr = new Object[]{new int[]{i12}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[1], (String[]) objArr7[4]};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i13 = 1886833673 + (((~((-638353539) | (~elapsedCpuTime))) | (~((-425751113) | elapsedCpuTime))) * (-272)) + (((~((-638354596) | elapsedCpuTime)) | 1057) * (-272)) + (((~(elapsedCpuTime | 638354595)) | (-425752170)) * 272) + 1573828524;
            int i14 = (i13 << 13) ^ i13;
            int i15 = i14 ^ (i14 >>> 17);
            ((int[]) objArr[3])[0] = i15 ^ (i15 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{15611, 59802, 24195, 14607, 15505, 51563, 8149, 22750, 48789, 19238, 40322, 55953, 14364, 52388, 7024, 24390, 47688, 20158, 39174, 53522}, (-1) - TextUtils.indexOf((CharSequence) "", '0', 0), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{'K', 26496, 5761, 40950, Typography.quote, 18292, 22468, 65064, 33407, 50489, 54677, 31871, 1155, 17137, 21330, 63918, 34504, 49343, 53509, 30691}, ViewConfiguration.getFadingEdgeLength() >> 16, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-1351308753};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (42097 - AndroidCharacter.getMirror('0')), 1726 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 29 - (KeyEvent.getMaxKeyCode() >> 16), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrB$5f1425da = PMIRegistrationDataStore$$ExternalSyntheticLambda7.b$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), 1573828524);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char mode = (char) (29944 - View.MeasureSpec.getMode(0));
                    int jumpTapTimeout = 1755 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int doubleTapTimeout = 23 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    byte b5 = $$a[7];
                    byte b6 = b5;
                    Object[] objArr11 = new Object[1];
                    c(b5, b6, b6, objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(mode, jumpTapTimeout, doubleTapTimeout, 1599039318, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrB$5f1425da);
                try {
                    Object[] objArr12 = new Object[1];
                    e(new char[]{37096, 62516, 16406, 35557, 37001, 54474, 338, 60199, 4807, 22157, 33554, 26939, 37895, 53591, 1432, 60550, 5713, 21271, 34690, 25328, 39301, 56807, 2650, 57402, 7115, 24463}, ViewConfiguration.getScrollBarFadeDuration() >> 16, objArr12);
                    Class<?> cls3 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    e(new char[]{41870, 41069, 35064, 44086, 41963, 32913, 51641, 52726, 8637, 728, 19452, 20372, 42859, 34076, 52532, 51826, 9511, 1872, 20349}, Color.blue(0), objArr13);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf("", "") + 29944);
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1755;
                        int i16 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 24;
                        byte b7 = (byte) $$b;
                        byte b8 = $$a[7];
                        Object[] objArr14 = new Object[1];
                        c(b7, b8, b8, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, scrollBarFadeDuration, i16, 1596667560, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char defaultSize = (char) (29944 - View.getDefaultSize(0, 0));
                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 1755;
                        int offsetBefore2 = 23 - TextUtils.getOffsetBefore("", 0);
                        byte[] bArr2 = $$a;
                        Object[] objArr15 = new Object[1];
                        c((byte) 89, bArr2[7], bArr2[28], objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(defaultSize, offsetBefore, offsetBefore2, 986134021, false, (String) objArr15[0], null);
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
        int i17 = ((int[]) objArr[1])[0];
        int i18 = ((int[]) objArr[0])[0];
        if (i18 != i17) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                while (i10 < strArr.length) {
                    int i19 = INotificationSideChannelStubProxy + 103;
                    RemoteActionCompatParcelizer = i19 % 128;
                    int i20 = i19 % 2;
                    arrayList.add(strArr[i10]);
                    i10++;
                }
            }
            throw new RuntimeException(String.valueOf(i18));
        }
        int i21 = RemoteActionCompatParcelizer + 73;
        INotificationSideChannelStubProxy = i21 % 128;
        int i22 = i21 % 2;
        int i23 = ((int[]) objArr[3])[0];
        int i24 = ((int[]) objArr[0])[0];
        Object[] objArr16 = {new int[]{i24}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i25 = ~iUptimeMillis;
        int i26 = i23 + ((((~(381129722 | i25)) | (~((-67371745) | iUptimeMillis))) * 988) - 768732651) + (((~(iUptimeMillis | 101155552)) | 279974170 | (~(i25 | (-67371745)))) * 988);
        int i27 = (i26 << 13) ^ i26;
        int i28 = i27 ^ (i27 >>> 17);
        ((int[]) objArr16[3])[0] = i28 ^ (i28 << 5);
        int i29 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2[this.asBinder - 1];
        int i30 = ((int[]) objArr16[3])[0];
        int i31 = i30 * i30;
        int i32 = -(922894960 * i30);
        int i33 = (i31 & i32) + (i31 | i32);
        int i34 = -(i30 * (-1234625772));
        int i35 = ((i33 ^ i34) + ((i34 & i33) << 1)) - (-1839221508);
        int i36 = ((i35 >> 19) - 16383) / 8192;
        int i37 = (i36 & 1) + (i36 | 1);
        int i38 = ((i35 | i37) << 1) - (i37 ^ i35);
        int i39 = i35 >> 21;
        int i40 = (((i39 | (-4095)) << 1) - (i39 ^ (-4095))) / 2048;
        int i41 = -(i38 ^ ((i40 ^ 1) + ((i40 & 1) << 1)));
        int i42 = 6;
        int i43 = (i41 & 6) + (i41 | 6);
        int i44 = i43 >> 16;
        int i45 = (((((-131071) | i44) << 1) - (i44 ^ (-131071))) / 65536) - (-1);
        if (i29 == 3312 / (((-(((i45 | 1) << 1) - (i45 ^ 1))) & i43) * 552)) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2[this.asBinder - 1] = 2;
        } else if (i29 == 2) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(true);
            this.g.cancel();
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 != 44) {
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 == 59) {
                    boolean z4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    throw TuitionPaymentFragmentspecialinlinedviewModeldefault3("Use JsonReader.setLenient(true) to accept malformed JSON");
                }
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 != 93) {
                    throw TuitionPaymentFragmentspecialinlinedviewModeldefault3("Unterminated array");
                }
                this.notify = 4;
                return 4;
            }
        } else {
            if (i29 == 3 || i29 == 5) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2[this.asBinder - 1] = 4;
                if (i29 == 5) {
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(true);
                    this.g.cancel();
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 44) {
                        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 == 59) {
                            boolean z5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            throw TuitionPaymentFragmentspecialinlinedviewModeldefault3("Use JsonReader.setLenient(true) to accept malformed JSON");
                        }
                        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 125) {
                            throw TuitionPaymentFragmentspecialinlinedviewModeldefault3("Unterminated object");
                        }
                        this.notify = 2;
                        return 2;
                    }
                    z = true;
                } else {
                    z = true;
                }
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(z);
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault4 == 34) {
                    this.g.cancel();
                    this.notify = 13;
                    return 13;
                }
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault4 == 39) {
                    this.g.cancel();
                    boolean z6 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    throw TuitionPaymentFragmentspecialinlinedviewModeldefault3("Use JsonReader.setLenient(true) to accept malformed JSON");
                }
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault4 == 125) {
                    if (i29 == 5) {
                        throw TuitionPaymentFragmentspecialinlinedviewModeldefault3("Expected name");
                    }
                    this.g.cancel();
                    this.notify = 2;
                    return 2;
                }
                int i46 = RemoteActionCompatParcelizer + 33;
                INotificationSideChannelStubProxy = i46 % 128;
                int i47 = i46 % 2;
                boolean z7 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                throw TuitionPaymentFragmentspecialinlinedviewModeldefault3("Use JsonReader.setLenient(true) to accept malformed JSON");
            }
            if (i29 == 4) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2[this.asBinder - 1] = 5;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(true);
                this.g.cancel();
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault5 != 58) {
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault5 != 61) {
                        throw TuitionPaymentFragmentspecialinlinedviewModeldefault3("Expected ':'");
                    }
                    boolean z8 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    throw TuitionPaymentFragmentspecialinlinedviewModeldefault3("Use JsonReader.setLenient(true) to accept malformed JSON");
                }
            } else if (i29 == 6) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2[this.asBinder - 1] = 7;
            } else {
                if (i29 == 7) {
                    if (TuitionPaymentFragmentspecialinlinedviewModeldefault2(false) == -1) {
                        this.notify = 18;
                        return 18;
                    }
                    boolean z9 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    throw TuitionPaymentFragmentspecialinlinedviewModeldefault3("Use JsonReader.setLenient(true) to accept malformed JSON");
                }
                if (i29 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
            }
        }
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(true);
        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault6 == 34) {
            this.g.cancel();
            this.notify = 9;
            return 9;
        }
        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault6 == 39) {
            boolean z10 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            throw TuitionPaymentFragmentspecialinlinedviewModeldefault3("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault6 == 44 || iTuitionPaymentFragmentspecialinlinedviewModeldefault6 == 59) {
            i = 1;
        } else {
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault6 == 91) {
                this.g.cancel();
                this.notify = 3;
                return 3;
            }
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault6 != 93) {
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault6 == 123) {
                    this.g.cancel();
                    this.notify = 1;
                    return 1;
                }
                byte bTuitionPaymentFragmentspecialinlinedviewModeldefault4 = this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0L);
                if (bTuitionPaymentFragmentspecialinlinedviewModeldefault4 == 116 || bTuitionPaymentFragmentspecialinlinedviewModeldefault4 == 84) {
                    str = "true";
                    str2 = "TRUE";
                    i2 = 5;
                } else {
                    if (bTuitionPaymentFragmentspecialinlinedviewModeldefault4 != 102 && bTuitionPaymentFragmentspecialinlinedviewModeldefault4 != 70) {
                        if (bTuitionPaymentFragmentspecialinlinedviewModeldefault4 != 110 && bTuitionPaymentFragmentspecialinlinedviewModeldefault4 != 78) {
                            i2 = 0;
                            break;
                        }
                        str = "null";
                        str2 = "NULL";
                        i2 = 7;
                        if (i2 != 0) {
                            return i2;
                        }
                        z2 = true;
                        i3 = 0;
                        i4 = 0;
                        boolean z11 = false;
                        long j2 = 0;
                        while (true) {
                            i5 = i3 + 1;
                            if (!this.cancelAll.asBinder(i5)) {
                                bTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
                                if (bTuitionPaymentFragmentspecialinlinedviewModeldefault3 == 43) {
                                    i7 = i42;
                                    if (i4 != 5) {
                                        if (i10 != 0) {
                                            return i10;
                                        }
                                        if (!TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0L))) {
                                            throw TuitionPaymentFragmentspecialinlinedviewModeldefault3("Expected value");
                                        }
                                        boolean z12 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                        throw TuitionPaymentFragmentspecialinlinedviewModeldefault3("Use JsonReader.setLenient(true) to accept malformed JSON");
                                    }
                                    i4 = i7;
                                } else if (bTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 69 || bTuitionPaymentFragmentspecialinlinedviewModeldefault3 == 101) {
                                    i7 = i42;
                                    if (i4 == 2 && i4 != 4) {
                                        if (i10 != 0) {
                                            return i10;
                                        }
                                        if (!TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0L))) {
                                            throw TuitionPaymentFragmentspecialinlinedviewModeldefault3("Expected value");
                                        }
                                        boolean z13 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                        throw TuitionPaymentFragmentspecialinlinedviewModeldefault3("Use JsonReader.setLenient(true) to accept malformed JSON");
                                    }
                                    i4 = 5;
                                } else if (bTuitionPaymentFragmentspecialinlinedviewModeldefault3 == 45) {
                                    i7 = i42;
                                    if (i4 == 0) {
                                        i4 = 1;
                                        z11 = true;
                                    } else {
                                        if (i4 != 5) {
                                            if (i10 != 0) {
                                                return i10;
                                            }
                                            if (!TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0L))) {
                                                throw TuitionPaymentFragmentspecialinlinedviewModeldefault3("Expected value");
                                            }
                                            boolean z14 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                            throw TuitionPaymentFragmentspecialinlinedviewModeldefault3("Use JsonReader.setLenient(true) to accept malformed JSON");
                                        }
                                        i4 = i7;
                                    }
                                } else {
                                    if (bTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 46) {
                                        if (bTuitionPaymentFragmentspecialinlinedviewModeldefault3 < 48 || bTuitionPaymentFragmentspecialinlinedviewModeldefault3 > 57) {
                                            if (!TuitionPaymentFragmentspecialinlinedviewModeldefault3(bTuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                                            }
                                        } else if (i4 == i9 || i4 == 0) {
                                            i7 = i42;
                                            j2 = -(bTuitionPaymentFragmentspecialinlinedviewModeldefault3 - 48);
                                            i4 = 2;
                                        } else if (i4 == 2) {
                                            int i48 = RemoteActionCompatParcelizer;
                                            int i49 = i48 + 9;
                                            INotificationSideChannelStubProxy = i49 % 128;
                                            int i50 = i49 % 2;
                                            if (j2 != 0) {
                                                long j3 = (10 * j2) - ((long) (bTuitionPaymentFragmentspecialinlinedviewModeldefault3 - 48));
                                                if (j2 > -922337203685477580L) {
                                                    z3 = true;
                                                } else {
                                                    if (j2 == -922337203685477580L) {
                                                        int i51 = i48 + 77;
                                                        INotificationSideChannelStubProxy = i51 % 128;
                                                        if (i51 % 2 == 0) {
                                                            int i52 = 75 / 0;
                                                            if (j3 < j2) {
                                                                z3 = true;
                                                            }
                                                        } else if (j3 < j2) {
                                                            z3 = true;
                                                        }
                                                    }
                                                    z3 = false;
                                                }
                                                z2 &= z3;
                                                j2 = j3;
                                                i7 = 6;
                                            }
                                        } else {
                                            i7 = 6;
                                            if (i4 == 3) {
                                                i4 = 4;
                                            } else if (i4 == 5 || i4 == 6) {
                                                int i53 = INotificationSideChannelStubProxy + 93;
                                                RemoteActionCompatParcelizer = i53 % 128;
                                                int i54 = i53 % 2;
                                                i4 = 7;
                                            }
                                        }
                                        if (i10 != 0) {
                                            return i10;
                                        }
                                        if (!TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0L))) {
                                            throw TuitionPaymentFragmentspecialinlinedviewModeldefault3("Expected value");
                                        }
                                        boolean z15 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                        throw TuitionPaymentFragmentspecialinlinedviewModeldefault3("Use JsonReader.setLenient(true) to accept malformed JSON");
                                    }
                                    i7 = i42;
                                    if (i4 != 2) {
                                        if (i10 != 0) {
                                            return i10;
                                        }
                                        if (!TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0L))) {
                                            throw TuitionPaymentFragmentspecialinlinedviewModeldefault3("Expected value");
                                        }
                                        boolean z16 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                        throw TuitionPaymentFragmentspecialinlinedviewModeldefault3("Use JsonReader.setLenient(true) to accept malformed JSON");
                                    }
                                    int i55 = RemoteActionCompatParcelizer + 41;
                                    INotificationSideChannelStubProxy = i55 % 128;
                                    int i56 = i55 % 2;
                                    i4 = 3;
                                }
                                i42 = i7;
                                i3 = i5;
                                i9 = 1;
                            }
                            if (i4 == 2) {
                                int i57 = RemoteActionCompatParcelizer + 35;
                                INotificationSideChannelStubProxy = i57 % 128;
                                int i58 = i57 % 2;
                                if (z2 || ((j2 == Long.MIN_VALUE && !z11) || (j2 == 0 && z11))) {
                                    i6 = 2;
                                } else {
                                    if (!z11) {
                                        j2 = -j2;
                                    }
                                    this.cancel = j2;
                                    this.g.g(i3);
                                    this.notify = 16;
                                    i10 = 16;
                                }
                                if (i10 != 0) {
                                    return i10;
                                }
                                if (!TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0L))) {
                                    throw TuitionPaymentFragmentspecialinlinedviewModeldefault3("Expected value");
                                }
                                boolean z17 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                throw TuitionPaymentFragmentspecialinlinedviewModeldefault3("Use JsonReader.setLenient(true) to accept malformed JSON");
                            }
                            i6 = 2;
                            if (i4 != i6 || i4 == 4) {
                                this.onTransact = i3;
                                i10 = 17;
                                this.notify = 17;
                            } else {
                                int i59 = RemoteActionCompatParcelizer + 55;
                                INotificationSideChannelStubProxy = i59 % 128;
                                int i60 = i59 % i6;
                                if (i4 == 7) {
                                    this.onTransact = i3;
                                    i10 = 17;
                                    this.notify = 17;
                                }
                            }
                            if (i10 != 0) {
                                return i10;
                            }
                            if (!TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0L))) {
                                throw TuitionPaymentFragmentspecialinlinedviewModeldefault3("Expected value");
                            }
                            boolean z18 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            throw TuitionPaymentFragmentspecialinlinedviewModeldefault3("Use JsonReader.setLenient(true) to accept malformed JSON");
                        }
                    }
                    str = "false";
                    str2 = "FALSE";
                    i2 = 6;
                }
                int length = str.length();
                int i61 = 1;
                while (true) {
                    if (i61 >= length) {
                        if (!this.cancelAll.asBinder(length + 1) || !TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3(length))) {
                            this.g.g(length);
                            this.notify = i2;
                            break;
                        }
                    } else {
                        int i62 = i61 + 1;
                        if (this.cancelAll.asBinder(i62)) {
                            byte bTuitionPaymentFragmentspecialinlinedviewModeldefault5 = this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i61);
                            if (bTuitionPaymentFragmentspecialinlinedviewModeldefault5 == str.charAt(i61) || bTuitionPaymentFragmentspecialinlinedviewModeldefault5 == str2.charAt(i61)) {
                                i61 = i62;
                            }
                        } else {
                            int i63 = INotificationSideChannelStubProxy + 67;
                            RemoteActionCompatParcelizer = i63 % 128;
                            int i64 = i63 % 2;
                        }
                    }
                    i2 = 0;
                    break;
                }
                if (i2 != 0) {
                    return i2;
                }
                z2 = true;
                i3 = 0;
                i4 = 0;
                boolean z19 = false;
                long j4 = 0;
                while (true) {
                    i5 = i3 + 1;
                    if (!this.cancelAll.asBinder(i5)) {
                        bTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
                        if (bTuitionPaymentFragmentspecialinlinedviewModeldefault3 == 43) {
                            if (bTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 69) {
                            }
                            i7 = i42;
                            if (i4 == 2) {
                            }
                            i4 = 5;
                        } else {
                            i7 = i42;
                            if (i4 != 5) {
                                if (i10 != 0) {
                                    return i10;
                                }
                                if (!TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0L))) {
                                    throw TuitionPaymentFragmentspecialinlinedviewModeldefault3("Expected value");
                                }
                                boolean z110 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                throw TuitionPaymentFragmentspecialinlinedviewModeldefault3("Use JsonReader.setLenient(true) to accept malformed JSON");
                            }
                            i4 = i7;
                        }
                        i42 = i7;
                        i3 = i5;
                        i9 = 1;
                    }
                    if (i4 == 2) {
                        int i510 = RemoteActionCompatParcelizer + 35;
                        INotificationSideChannelStubProxy = i510 % 128;
                        int i511 = i510 % 2;
                        if (z2) {
                        }
                        i6 = 2;
                    } else {
                        i6 = 2;
                    }
                    if (i4 != i6) {
                        this.onTransact = i3;
                        i10 = 17;
                        this.notify = 17;
                    } else {
                        this.onTransact = i3;
                        i10 = 17;
                        this.notify = 17;
                    }
                    if (i10 != 0) {
                        return i10;
                    }
                    if (!TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0L))) {
                        throw TuitionPaymentFragmentspecialinlinedviewModeldefault3("Expected value");
                    }
                    boolean z111 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    throw TuitionPaymentFragmentspecialinlinedviewModeldefault3("Use JsonReader.setLenient(true) to accept malformed JSON");
                }
            }
            i = 1;
            if (i29 == 1) {
                this.g.cancel();
                this.notify = 4;
                return 4;
            }
        }
        if (i29 != i && i29 != 2) {
            throw TuitionPaymentFragmentspecialinlinedviewModeldefault3("Unexpected value");
        }
        boolean z20 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        throw TuitionPaymentFragmentspecialinlinedviewModeldefault3("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) throws IOException {
        int i2 = 2 % 2;
        if (i != 9 && i != 10) {
            int i3 = INotificationSideChannelStubProxy + 73;
            int i4 = i3 % 128;
            RemoteActionCompatParcelizer = i4;
            int i5 = i3 % 2;
            if (i != 12) {
                int i6 = i4 + 115;
                INotificationSideChannelStubProxy = i6 % 128;
                if (i6 % 2 != 0 ? i != 13 : i != 62) {
                    if (i != 32) {
                        if (i != 35) {
                            int i7 = i4 + 7;
                            int i8 = i7 % 128;
                            INotificationSideChannelStubProxy = i8;
                            if (i7 % 2 != 0 ? i != 44 : i != 11) {
                                if (i != 47) {
                                    int i9 = i8 + 35;
                                    RemoteActionCompatParcelizer = i9 % 128;
                                    int i10 = i9 % 2;
                                    if (i != 61) {
                                        if (i != 123 && i != 125) {
                                            int i11 = i8 + 23;
                                            RemoteActionCompatParcelizer = i11 % 128;
                                            int i12 = i11 % 2;
                                            if (i != 58) {
                                                if (i != 59) {
                                                    switch (i) {
                                                        case 91:
                                                        case 93:
                                                            break;
                                                        case 92:
                                                            break;
                                                        default:
                                                            return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        boolean z = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        throw TuitionPaymentFragmentspecialinlinedviewModeldefault3("Use JsonReader.setLenient(true) to accept malformed JSON");
                    }
                }
            }
        }
        int i13 = INotificationSideChannelStubProxy + 71;
        RemoteActionCompatParcelizer = i13 % 128;
        int i14 = i13 % 2;
        return false;
    }

    private static /* synthetic */ Object b(Object[] objArr) throws Throwable {
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        onPrepare onprepare = (onPrepare) objArr[0];
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 89;
        RemoteActionCompatParcelizer = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int i3 = onprepare.notify;
            obj.hashCode();
            throw null;
        }
        int iINotificationSideChannelDefault = onprepare.notify;
        if (iINotificationSideChannelDefault == 0) {
            iINotificationSideChannelDefault = onprepare.INotificationSideChannelDefault();
            int i4 = INotificationSideChannelStubProxy + 121;
            RemoteActionCompatParcelizer = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 % 2;
            }
        }
        if (iINotificationSideChannelDefault == 14) {
            strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = onprepare.INotificationSideChannelStubProxy();
        } else if (iINotificationSideChannelDefault == 13) {
            int i6 = RemoteActionCompatParcelizer + 111;
            INotificationSideChannelStubProxy = i6 % 128;
            if (i6 % 2 == 0) {
                onprepare.TuitionPaymentFragmentspecialinlinedviewModeldefault1(f1302a);
                obj.hashCode();
                throw null;
            }
            strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = onprepare.TuitionPaymentFragmentspecialinlinedviewModeldefault1(f1302a);
        } else if (iINotificationSideChannelDefault == 12) {
            strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = onprepare.TuitionPaymentFragmentspecialinlinedviewModeldefault1(d);
        } else {
            if (iINotificationSideChannelDefault != 15) {
                StringBuilder sb = new StringBuilder("Expected a name but was ");
                sb.append(onprepare.cancel());
                sb.append(" at path ");
                sb.append(onprepare.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                throw new JsonDataException(sb.toString());
            }
            strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = onprepare.INotificationSideChannel;
        }
        onprepare.notify = 0;
        onprepare.TuitionPaymentFragmentspecialinlinedviewModeldefault3[onprepare.asBinder - 1] = strTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        return strTuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1(JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) throws Throwable {
        int i = 2 % 2;
        int iINotificationSideChannelDefault = this.notify;
        Object obj = null;
        if (iINotificationSideChannelDefault == 0) {
            int i2 = INotificationSideChannelStubProxy + 59;
            RemoteActionCompatParcelizer = i2 % 128;
            if (i2 % 2 != 0) {
                INotificationSideChannelDefault();
                obj.hashCode();
                throw null;
            }
            iINotificationSideChannelDefault = INotificationSideChannelDefault();
        }
        if (iINotificationSideChannelDefault < 12 || iINotificationSideChannelDefault > 15) {
            int i3 = INotificationSideChannelStubProxy + 47;
            RemoteActionCompatParcelizer = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 69 / 0;
            }
            return -1;
        }
        if (iINotificationSideChannelDefault == 15) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.INotificationSideChannel, tuitionPaymentFragmentspecialinlinedviewModeldefault3);
            int i5 = RemoteActionCompatParcelizer + 27;
            INotificationSideChannelStubProxy = i5 % 128;
            if (i5 % 2 != 0) {
                return iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            }
            obj.hashCode();
            throw null;
        }
        int iTuitionPaymentFragmentbindingInflater1 = this.cancelAll.TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        if (iTuitionPaymentFragmentbindingInflater1 != -1) {
            this.notify = 0;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3[this.asBinder - 1] = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1[iTuitionPaymentFragmentbindingInflater1];
            return iTuitionPaymentFragmentbindingInflater1;
        }
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3[this.asBinder - 1];
        String strA = a();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(strA, tuitionPaymentFragmentspecialinlinedviewModeldefault3);
        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 == -1) {
            this.notify = 15;
            this.INotificationSideChannel = strA;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3[this.asBinder - 1] = str;
        }
        return iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void cancelAll() throws Throwable {
        int i = 2 % 2;
        boolean z = this.b;
        int iINotificationSideChannelDefault = this.notify;
        if (iINotificationSideChannelDefault == 0) {
            int i2 = RemoteActionCompatParcelizer + 33;
            INotificationSideChannelStubProxy = i2 % 128;
            if (i2 % 2 == 0) {
                iINotificationSideChannelDefault = INotificationSideChannelDefault();
                int i3 = 88 / 0;
            } else {
                iINotificationSideChannelDefault = INotificationSideChannelDefault();
            }
        }
        if (iINotificationSideChannelDefault == 14) {
            INotificationSideChannelStub();
        } else {
            Object obj = null;
            if (iINotificationSideChannelDefault == 13) {
                int i4 = RemoteActionCompatParcelizer + 27;
                INotificationSideChannelStubProxy = i4 % 128;
                if (i4 % 2 == 0) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3(f1302a);
                    obj.hashCode();
                    throw null;
                }
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(f1302a);
            } else if (iINotificationSideChannelDefault == 12) {
                int i5 = RemoteActionCompatParcelizer + 55;
                INotificationSideChannelStubProxy = i5 % 128;
                if (i5 % 2 == 0) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3(d);
                    obj.hashCode();
                    throw null;
                }
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(d);
            } else if (iINotificationSideChannelDefault != 15) {
                StringBuilder sb = new StringBuilder("Expected a name but was ");
                sb.append(cancel());
                sb.append(" at path ");
                sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                throw new JsonDataException(sb.toString());
            }
        }
        this.notify = 0;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3[this.asBinder - 1] = "null";
    }

    private int TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 123;
        INotificationSideChannelStubProxy = i2 % 128;
        int length = i2 % 2 == 0 ? tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1.length : tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (!(!str.equals(tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1[i3]))) {
                int i4 = INotificationSideChannelStubProxy + 93;
                RemoteActionCompatParcelizer = i4 % 128;
                int i5 = i4 % 2;
                this.notify = 0;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3[this.asBinder - 1] = str;
                return i3;
            }
        }
        return -1;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final String INotificationSideChannel() throws Throwable {
        String strB;
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i = 2 % 2;
        int iINotificationSideChannelDefault = this.notify;
        if (iINotificationSideChannelDefault == 0) {
            int i2 = INotificationSideChannelStubProxy + 93;
            RemoteActionCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            iINotificationSideChannelDefault = INotificationSideChannelDefault();
        }
        if (iINotificationSideChannelDefault == 10) {
            strB = INotificationSideChannelStubProxy();
        } else if (iINotificationSideChannelDefault == 9) {
            strB = TuitionPaymentFragmentspecialinlinedviewModeldefault1(f1302a);
        } else {
            if (iINotificationSideChannelDefault == 8) {
                strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(d);
                int i4 = INotificationSideChannelStubProxy + 61;
                RemoteActionCompatParcelizer = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 5 % 4;
                }
            } else if (iINotificationSideChannelDefault == 11) {
                int i6 = INotificationSideChannelStubProxy + 113;
                RemoteActionCompatParcelizer = i6 % 128;
                if (i6 % 2 != 0) {
                    strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.INotificationSideChannel;
                    this.INotificationSideChannel = null;
                    int i7 = 29 / 0;
                } else {
                    strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.INotificationSideChannel;
                    this.INotificationSideChannel = null;
                }
            } else if (iINotificationSideChannelDefault == 16) {
                strB = Long.toString(this.cancel);
            } else {
                if (iINotificationSideChannelDefault != 17) {
                    StringBuilder sb = new StringBuilder("Expected a string but was ");
                    sb.append(cancel());
                    sb.append(" at path ");
                    sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                    throw new JsonDataException(sb.toString());
                }
                strB = this.g.b(this.onTransact, Charsets.UTF_8);
            }
            strB = strTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        this.notify = 0;
        int[] iArr = this.TuitionPaymentFragmentbindingInflater1;
        int i8 = this.asBinder - 1;
        iArr[i8] = iArr[i8] + 1;
        return strB;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) throws Throwable {
        onPrepare onprepare = (onPrepare) objArr[0];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 111;
        INotificationSideChannelStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iINotificationSideChannelDefault = onprepare.notify;
        if (iINotificationSideChannelDefault == 0) {
            iINotificationSideChannelDefault = onprepare.INotificationSideChannelDefault();
        }
        if (iINotificationSideChannelDefault == 5) {
            onprepare.notify = 0;
            int[] iArr = onprepare.TuitionPaymentFragmentbindingInflater1;
            int i4 = onprepare.asBinder - 1;
            iArr[i4] = iArr[i4] + 1;
            return true;
        }
        if (iINotificationSideChannelDefault != 6) {
            StringBuilder sb = new StringBuilder("Expected a boolean but was ");
            sb.append(onprepare.cancel());
            sb.append(" at path ");
            sb.append(onprepare.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            throw new JsonDataException(sb.toString());
        }
        int i5 = INotificationSideChannelStubProxy + 43;
        RemoteActionCompatParcelizer = i5 % 128;
        int i6 = i5 % 2;
        onprepare.notify = 0;
        int[] iArr2 = onprepare.TuitionPaymentFragmentbindingInflater1;
        int i7 = onprepare.asBinder - 1;
        iArr2[i7] = iArr2[i7] + 1;
        int i8 = RemoteActionCompatParcelizer + 85;
        INotificationSideChannelStubProxy = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final double d() throws Throwable {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 107;
        INotificationSideChannelStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iINotificationSideChannelDefault = this.notify;
        if (iINotificationSideChannelDefault == 0) {
            iINotificationSideChannelDefault = INotificationSideChannelDefault();
        }
        if (iINotificationSideChannelDefault == 16) {
            this.notify = 0;
            int[] iArr = this.TuitionPaymentFragmentbindingInflater1;
            int i4 = this.asBinder - 1;
            iArr[i4] = iArr[i4] + 1;
            return this.cancel;
        }
        if (iINotificationSideChannelDefault == 17) {
            int i5 = RemoteActionCompatParcelizer + 29;
            INotificationSideChannelStubProxy = i5 % 128;
            int i6 = i5 % 2;
            this.INotificationSideChannel = this.g.b(this.onTransact, Charsets.UTF_8);
        } else if (iINotificationSideChannelDefault == 9) {
            this.INotificationSideChannel = TuitionPaymentFragmentspecialinlinedviewModeldefault1(f1302a);
        } else if (iINotificationSideChannelDefault == 8) {
            int i7 = RemoteActionCompatParcelizer + 21;
            INotificationSideChannelStubProxy = i7 % 128;
            int i8 = i7 % 2;
            this.INotificationSideChannel = TuitionPaymentFragmentspecialinlinedviewModeldefault1(d);
            int i9 = RemoteActionCompatParcelizer + 117;
            INotificationSideChannelStubProxy = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 2 / 5;
            }
        } else if (iINotificationSideChannelDefault == 10) {
            this.INotificationSideChannel = INotificationSideChannelStubProxy();
        } else if (iINotificationSideChannelDefault != 11) {
            StringBuilder sb = new StringBuilder("Expected a double but was ");
            sb.append(cancel());
            sb.append(" at path ");
            sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            throw new JsonDataException(sb.toString());
        }
        this.notify = 11;
        try {
            double d2 = Double.parseDouble(this.INotificationSideChannel);
            boolean z = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (!Double.isNaN(d2)) {
                int i11 = RemoteActionCompatParcelizer + 5;
                INotificationSideChannelStubProxy = i11 % 128;
                if (i11 % 2 == 0) {
                    Double.isInfinite(d2);
                    throw null;
                }
                if (!Double.isInfinite(d2)) {
                    this.INotificationSideChannel = null;
                    this.notify = 0;
                    int[] iArr2 = this.TuitionPaymentFragmentbindingInflater1;
                    int i12 = this.asBinder - 1;
                    iArr2[i12] = iArr2[i12] + 1;
                    int i13 = INotificationSideChannelStubProxy + 73;
                    RemoteActionCompatParcelizer = i13 % 128;
                    int i14 = i13 % 2;
                    return d2;
                }
            }
            StringBuilder sb2 = new StringBuilder("JSON forbids NaN and infinities: ");
            sb2.append(d2);
            sb2.append(" at path ");
            sb2.append(TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            throw new JsonEncodingException(sb2.toString());
        } catch (NumberFormatException unused) {
            StringBuilder sb3 = new StringBuilder("Expected a double but was ");
            sb3.append(this.INotificationSideChannel);
            sb3.append(" at path ");
            sb3.append(TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            throw new JsonDataException(sb3.toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0043 A[SYNTHETIC] */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault1(ByteString byteString) throws IOException {
        long jB;
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 103;
        RemoteActionCompatParcelizer = i2 % 128;
        StringBuilder sb = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        while (true) {
            jB = this.cancelAll.b(byteString);
            if (jB != -1) {
                int i3 = INotificationSideChannelStubProxy + 25;
                RemoteActionCompatParcelizer = i3 % 128;
                if (i3 % 2 == 0) {
                    if (this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jB) != 92) {
                        break;
                    }
                    if (sb == null) {
                        sb = new StringBuilder();
                    }
                    sb.append(this.g.b(jB, Charsets.UTF_8));
                    this.g.cancel();
                    sb.append(RemoteActionCompatParcelizer());
                } else {
                    if (this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jB) != 104) {
                        break;
                    }
                    if (sb == null) {
                        sb = new StringBuilder();
                    }
                    sb.append(this.g.b(jB, Charsets.UTF_8));
                    this.g.cancel();
                    sb.append(RemoteActionCompatParcelizer());
                }
            } else {
                throw TuitionPaymentFragmentspecialinlinedviewModeldefault3("Unterminated string");
            }
        }
        if (sb != null) {
            sb.append(this.g.b(jB, Charsets.UTF_8));
            this.g.cancel();
            return sb.toString();
        }
        String strB = this.g.b(jB, Charsets.UTF_8);
        this.g.cancel();
        return strB;
    }

    private String INotificationSideChannelStubProxy() throws IOException {
        int i = 2 % 2;
        long jB = this.cancelAll.b(asInterface);
        if (jB != -1) {
            int i2 = RemoteActionCompatParcelizer + 31;
            INotificationSideChannelStubProxy = i2 % 128;
            int i3 = i2 % 2;
            String strB = this.g.b(jB, Charsets.UTF_8);
            int i4 = RemoteActionCompatParcelizer + 5;
            INotificationSideChannelStubProxy = i4 % 128;
            int i5 = i4 % 2;
            return strB;
        }
        RotationProviderListenerWrapper rotationProviderListenerWrapper = this.g;
        return rotationProviderListenerWrapper.b(rotationProviderListenerWrapper.size, Charsets.UTF_8);
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault3(ByteString byteString) throws IOException {
        int i = 2 % 2;
        while (true) {
            long jB = this.cancelAll.b(byteString);
            if (jB == -1) {
                throw TuitionPaymentFragmentspecialinlinedviewModeldefault3("Unterminated string");
            }
            if (this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jB) == 92) {
                int i2 = RemoteActionCompatParcelizer + 51;
                INotificationSideChannelStubProxy = i2 % 128;
                int i3 = i2 % 2;
                this.g.g(jB + 1);
                RemoteActionCompatParcelizer();
            } else {
                this.g.g(jB + 1);
                int i4 = INotificationSideChannelStubProxy + 41;
                RemoteActionCompatParcelizer = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    private void INotificationSideChannelStub() throws IOException {
        int i = 2 % 2;
        long jB = this.cancelAll.b(asInterface);
        RotationProviderListenerWrapper rotationProviderListenerWrapper = this.g;
        if (jB == -1) {
            int i2 = INotificationSideChannelStubProxy + 83;
            RemoteActionCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            jB = rotationProviderListenerWrapper.size;
        }
        rotationProviderListenerWrapper.g(jB);
        int i4 = RemoteActionCompatParcelizer + 53;
        INotificationSideChannelStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final int g() throws Throwable {
        int i = 2 % 2;
        int iINotificationSideChannelDefault = this.notify;
        if (iINotificationSideChannelDefault == 0) {
            iINotificationSideChannelDefault = INotificationSideChannelDefault();
            int i2 = INotificationSideChannelStubProxy + 109;
            RemoteActionCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
        }
        if (iINotificationSideChannelDefault == 16) {
            long j = this.cancel;
            int i4 = (int) j;
            if (j == i4) {
                this.notify = 0;
                int[] iArr = this.TuitionPaymentFragmentbindingInflater1;
                int i5 = this.asBinder - 1;
                iArr[i5] = iArr[i5] + 1;
                return i4;
            }
            StringBuilder sb = new StringBuilder("Expected an int but was ");
            sb.append(this.cancel);
            sb.append(" at path ");
            sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            throw new JsonDataException(sb.toString());
        }
        if (iINotificationSideChannelDefault == 17) {
            this.INotificationSideChannel = this.g.b(this.onTransact, Charsets.UTF_8);
            int i6 = INotificationSideChannelStubProxy + 95;
            RemoteActionCompatParcelizer = i6 % 128;
            int i7 = i6 % 2;
        } else if (iINotificationSideChannelDefault == 9 || iINotificationSideChannelDefault == 8) {
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = iINotificationSideChannelDefault == 9 ? TuitionPaymentFragmentspecialinlinedviewModeldefault1(f1302a) : TuitionPaymentFragmentspecialinlinedviewModeldefault1(d);
            this.INotificationSideChannel = strTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                int i8 = Integer.parseInt(strTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                this.notify = 0;
                int[] iArr2 = this.TuitionPaymentFragmentbindingInflater1;
                int i9 = this.asBinder - 1;
                iArr2[i9] = iArr2[i9] + 1;
                return i8;
            } catch (NumberFormatException unused) {
            }
        } else if (iINotificationSideChannelDefault != 11) {
            StringBuilder sb2 = new StringBuilder("Expected an int but was ");
            sb2.append(cancel());
            sb2.append(" at path ");
            sb2.append(TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            throw new JsonDataException(sb2.toString());
        }
        this.notify = 11;
        try {
            double d2 = Double.parseDouble(this.INotificationSideChannel);
            int i10 = (int) d2;
            if (i10 != d2) {
                StringBuilder sb3 = new StringBuilder("Expected an int but was ");
                sb3.append(this.INotificationSideChannel);
                sb3.append(" at path ");
                sb3.append(TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                throw new JsonDataException(sb3.toString());
            }
            int i11 = INotificationSideChannelStubProxy + 111;
            RemoteActionCompatParcelizer = i11 % 128;
            int i12 = i11 % 2;
            this.INotificationSideChannel = null;
            this.notify = 0;
            int[] iArr3 = this.TuitionPaymentFragmentbindingInflater1;
            int i13 = this.asBinder - 1;
            iArr3[i13] = iArr3[i13] + 1;
            return i10;
        } catch (NumberFormatException unused2) {
            StringBuilder sb4 = new StringBuilder("Expected an int but was ");
            sb4.append(this.INotificationSideChannel);
            sb4.append(" at path ");
            sb4.append(TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            throw new JsonDataException(sb4.toString());
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) throws EOFException {
        onPrepare onprepare = (onPrepare) objArr[0];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 119;
        INotificationSideChannelStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onprepare.notify = 0;
        onprepare.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0] = 8;
        onprepare.asBinder = 1;
        RotationProviderListenerWrapper rotationProviderListenerWrapper = onprepare.g;
        rotationProviderListenerWrapper.g(rotationProviderListenerWrapper.size);
        onprepare.cancelAll.close();
        int i4 = RemoteActionCompatParcelizer + 19;
        INotificationSideChannelStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0104  */
    /* JADX WARN: Code duplicated, block: B:52:0x010a  */
    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void onTransact() throws Throwable {
        int i = 2 % 2;
        boolean z = this.b;
        int i2 = 0;
        do {
            int iINotificationSideChannelDefault = this.notify;
            if (iINotificationSideChannelDefault == 0) {
                iINotificationSideChannelDefault = INotificationSideChannelDefault();
            }
            if (iINotificationSideChannelDefault == 3) {
                int i3 = RemoteActionCompatParcelizer + 55;
                INotificationSideChannelStubProxy = i3 % 128;
                int i4 = i3 % 2;
                TuitionPaymentFragmentbindingInflater1(1);
            } else {
                if (iINotificationSideChannelDefault == 1) {
                    TuitionPaymentFragmentbindingInflater1(3);
                } else if (iINotificationSideChannelDefault == 4) {
                    i2--;
                    if (i2 < 0) {
                        StringBuilder sb = new StringBuilder("Expected a value but was ");
                        sb.append(cancel());
                        sb.append(" at path ");
                        sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                        throw new JsonDataException(sb.toString());
                    }
                    this.asBinder--;
                } else if (iINotificationSideChannelDefault == 2) {
                    i2--;
                    if (i2 < 0) {
                        StringBuilder sb2 = new StringBuilder("Expected a value but was ");
                        sb2.append(cancel());
                        sb2.append(" at path ");
                        sb2.append(TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                        throw new JsonDataException(sb2.toString());
                    }
                    this.asBinder--;
                } else if (iINotificationSideChannelDefault != 14) {
                    int i5 = RemoteActionCompatParcelizer;
                    int i6 = i5 + 37;
                    INotificationSideChannelStubProxy = i6 % 128;
                    int i7 = i6 % 2;
                    if (iINotificationSideChannelDefault != 10) {
                        int i8 = i5 + 65;
                        INotificationSideChannelStubProxy = i8 % 128;
                        int i9 = i8 % 2;
                        if (iINotificationSideChannelDefault != 9) {
                            int i10 = i5 + 97;
                            INotificationSideChannelStubProxy = i10 % 128;
                            if (i10 % 2 != 0 ? iINotificationSideChannelDefault == 13 : iINotificationSideChannelDefault == 61) {
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3(f1302a);
                            } else if (iINotificationSideChannelDefault == 8 || iINotificationSideChannelDefault == 12) {
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3(d);
                            } else if (iINotificationSideChannelDefault == 17) {
                                int i11 = i5 + 19;
                                INotificationSideChannelStubProxy = i11 % 128;
                                int i12 = i11 % 2;
                                this.g.g(this.onTransact);
                            } else {
                                if (iINotificationSideChannelDefault == 18) {
                                    StringBuilder sb3 = new StringBuilder("Expected a value but was ");
                                    sb3.append(cancel());
                                    sb3.append(" at path ");
                                    sb3.append(TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                                    throw new JsonDataException(sb3.toString());
                                }
                                int i13 = i5 + 83;
                                INotificationSideChannelStubProxy = i13 % 128;
                                int i14 = i13 % 2;
                            }
                        } else {
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3(f1302a);
                        }
                    } else {
                        INotificationSideChannelStub();
                    }
                } else {
                    INotificationSideChannelStub();
                }
                this.notify = 0;
            }
            i2++;
            this.notify = 0;
        } while (i2 != 0);
        int[] iArr = this.TuitionPaymentFragmentbindingInflater1;
        int i15 = this.asBinder - 1;
        iArr[i15] = iArr[i15] + 1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3[this.asBinder - 1] = "null";
        int i16 = RemoteActionCompatParcelizer + 1;
        INotificationSideChannelStubProxy = i16 % 128;
        if (i16 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0041  */
    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    /* JADX WARN: Code duplicated, block: B:18:0x004e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    /* JADX WARN: Code duplicated, block: B:49:0x0057 A[EDGE_INSN: B:49:0x0057->B:23:0x0057 BREAK  A[LOOP:0: B:3:0x000e->B:42:0x00a9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0057 A[EDGE_INSN: B:50:0x0057->B:23:0x0057 BREAK  A[LOOP:0: B:3:0x000e->B:42:0x00a9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a9 A[SYNTHETIC] */
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault2(boolean z) throws IOException {
        long j;
        byte bTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 43;
        INotificationSideChannelStubProxy = i3 % 128;
        int i4 = i3 % 2;
        int i5 = 0;
        while (true) {
            int i6 = i5 + 1;
            if (!this.cancelAll.asBinder(i6)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            int i7 = RemoteActionCompatParcelizer + 7;
            INotificationSideChannelStubProxy = i7 % 128;
            int i8 = i7 % 2;
            j = i5;
            bTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3(j);
            if (bTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 10) {
                int i9 = INotificationSideChannelStubProxy;
                int i10 = i9 + 33;
                RemoteActionCompatParcelizer = i10 % 128;
                if (i10 % 2 != 0) {
                    if (bTuitionPaymentFragmentspecialinlinedviewModeldefault3 == 98) {
                        continue;
                    } else if (bTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 13) {
                        i = i9 + 13;
                        RemoteActionCompatParcelizer = i % 128;
                        if (i % 2 != 0) {
                            if (bTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 12) {
                                break;
                            }
                        } else if (bTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 9) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else if (bTuitionPaymentFragmentspecialinlinedviewModeldefault3 == 32) {
                    continue;
                } else if (bTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 13) {
                    i = i9 + 13;
                    RemoteActionCompatParcelizer = i % 128;
                    if (i % 2 != 0) {
                        if (bTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 12) {
                            break;
                            break;
                        }
                    } else if (bTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 9) {
                        break;
                        break;
                    }
                } else {
                    continue;
                }
            }
            i5 = i6;
        }
        this.g.g(j);
        if (bTuitionPaymentFragmentspecialinlinedviewModeldefault3 == 47) {
            if (this.cancelAll.asBinder(2L)) {
                int i11 = INotificationSideChannelStubProxy + 75;
                RemoteActionCompatParcelizer = i11 % 128;
                if (i11 % 2 == 0) {
                    boolean z2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    throw TuitionPaymentFragmentspecialinlinedviewModeldefault3("Use JsonReader.setLenient(true) to accept malformed JSON");
                }
                boolean z3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i12 = 95 / 0;
                throw TuitionPaymentFragmentspecialinlinedviewModeldefault3("Use JsonReader.setLenient(true) to accept malformed JSON");
            }
        } else if (bTuitionPaymentFragmentspecialinlinedviewModeldefault3 == 35) {
            int i13 = INotificationSideChannelStubProxy + 45;
            RemoteActionCompatParcelizer = i13 % 128;
            if (i13 % 2 == 0) {
                boolean z4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                throw TuitionPaymentFragmentspecialinlinedviewModeldefault3("Use JsonReader.setLenient(true) to accept malformed JSON");
            }
            boolean z5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i14 = 14 / 0;
            throw TuitionPaymentFragmentspecialinlinedviewModeldefault3("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
        return bTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    private char RemoteActionCompatParcelizer() throws IOException {
        int i;
        int i2 = 2 % 2;
        if (!this.cancelAll.asBinder(1L)) {
            throw TuitionPaymentFragmentspecialinlinedviewModeldefault3("Unterminated escape sequence");
        }
        int i3 = INotificationSideChannelStubProxy + 5;
        RemoteActionCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        byte bCancel = this.g.cancel();
        if (bCancel != 10) {
            int i5 = RemoteActionCompatParcelizer;
            int i6 = i5 + 121;
            INotificationSideChannelStubProxy = i6 % 128;
            if (i6 % 2 != 0 ? bCancel != 34 : bCancel != 109) {
                int i7 = i5 + 23;
                INotificationSideChannelStubProxy = i7 % 128;
                if (i7 % 2 != 0 ? bCancel != 39 : bCancel != 125) {
                    int i8 = i5 + 111;
                    INotificationSideChannelStubProxy = i8 % 128;
                    int i9 = i8 % 2;
                    if (bCancel != 47) {
                        int i10 = i5 + 49;
                        int i11 = i10 % 128;
                        INotificationSideChannelStubProxy = i11;
                        if (i10 % 2 != 0 ? bCancel != 92 : bCancel != 49) {
                            if (bCancel == 98) {
                                int i12 = i11 + 35;
                                RemoteActionCompatParcelizer = i12 % 128;
                                if (i12 % 2 != 0) {
                                    int i13 = 49 / 0;
                                }
                                return '\b';
                            }
                            if (bCancel == 102) {
                                return '\f';
                            }
                            if (bCancel == 110) {
                                return '\n';
                            }
                            if (bCancel == 114) {
                                return '\r';
                            }
                            if (bCancel == 116) {
                                return '\t';
                            }
                            if (bCancel != 117) {
                                boolean z = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                StringBuilder sb = new StringBuilder("Invalid escape sequence: \\");
                                sb.append((char) bCancel);
                                throw TuitionPaymentFragmentspecialinlinedviewModeldefault3(sb.toString());
                            }
                            if (!this.cancelAll.asBinder(4L)) {
                                StringBuilder sb2 = new StringBuilder("Unterminated escape sequence at path ");
                                sb2.append(TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                                throw new EOFException(sb2.toString());
                            }
                            char c = 0;
                            for (int i14 = 0; i14 < 4; i14++) {
                                byte bTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i14);
                                char c2 = (char) (c << 4);
                                if (bTuitionPaymentFragmentspecialinlinedviewModeldefault3 >= 48 && bTuitionPaymentFragmentspecialinlinedviewModeldefault3 <= 57) {
                                    i = bTuitionPaymentFragmentspecialinlinedviewModeldefault3 - 48;
                                } else if (bTuitionPaymentFragmentspecialinlinedviewModeldefault3 >= 97 && bTuitionPaymentFragmentspecialinlinedviewModeldefault3 <= 102) {
                                    int i15 = RemoteActionCompatParcelizer + 123;
                                    INotificationSideChannelStubProxy = i15 % 128;
                                    int i16 = i15 % 2;
                                    i = bTuitionPaymentFragmentspecialinlinedviewModeldefault3 - 87;
                                } else {
                                    if (bTuitionPaymentFragmentspecialinlinedviewModeldefault3 < 65 || bTuitionPaymentFragmentspecialinlinedviewModeldefault3 > 70) {
                                        StringBuilder sb3 = new StringBuilder("\\u");
                                        sb3.append(this.g.b(4L, Charsets.UTF_8));
                                        throw TuitionPaymentFragmentspecialinlinedviewModeldefault3(sb3.toString());
                                    }
                                    i = bTuitionPaymentFragmentspecialinlinedviewModeldefault3 - 55;
                                }
                                c = (char) (c2 + i);
                                int i17 = RemoteActionCompatParcelizer + 119;
                                INotificationSideChannelStubProxy = i17 % 128;
                                int i18 = i17 % 2;
                            }
                            this.g.g(4L);
                            return c;
                        }
                    }
                }
            }
        }
        return (char) bCancel;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        b(ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 502334756, new Object[]{this}, ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -502334755, ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void b() throws Throwable {
        b(ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1192735808, new Object[]{this}, ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1192735806, ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final boolean asBinder() throws IOException {
        return ((Boolean) b(ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1200176066, new Object[]{this}, ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1200176066, ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1())).booleanValue();
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final String a() throws IOException {
        return (String) b(ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1366570915, new Object[]{this}, ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1366570911, ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    public final String toString() {
        return (String) b(ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1318987236, new Object[]{this}, ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1318987233, ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    static void getInterfaceDescriptor() {
        INotificationSideChannelStub = -5948964401488213258L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(byte r6, int r7, byte r8) {
        /*
            int r7 = r7 * 3
            int r7 = 1 - r7
            int r8 = r8 * 4
            int r8 = 107 - r8
            byte[] r0 = defpackage.onPrepare.$$c
            int r6 = r6 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L27
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r6 = r6 + 1
            r3 = r0[r6]
        L27:
            int r8 = r8 + r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.onPrepare.$$e(byte, int, byte):java.lang.String");
    }
}
