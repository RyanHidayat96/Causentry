package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.dynamiclinks.DynamicLink;
import defpackage.FileTransformFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.koin.core.error.NoBeanDefFoundException;
import org.koin.core.logger.Level;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ?\u0010\u001d\u001a\u0002H\u001e\"\u0004\b\u0000\u0010\u001e2\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030 2\n\u0010!\u001a\u0006\u0012\u0002\b\u00030 2\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020$\u0018\u00010#j\u0004\u0018\u0001`%¢\u0006\u0002\u0010&J6\u0010\u001d\u001a\u0002H\u001e\"\u0006\b\u0000\u0010\u001e\u0018\u0001\"\u0006\b\u0001\u0010'\u0018\u00012\u0016\b\n\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020$\u0018\u00010#j\u0004\u0018\u0001`%H\u0086\b¢\u0006\u0002\u0010(J\u0006\u0010)\u001a\u00020*J\r\u0010+\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\u000e\u0010-\u001a\u00020\bHÀ\u0003¢\u0006\u0002\b.J+\u0010/\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\r\u00100\u001a\u00020*H\u0000¢\u0006\u0002\b1J@\u00102\u001a\u00020*\"\u0006\b\u0000\u00103\u0018\u00012\u0006\u00104\u001a\u0002H32\n\b\u0002\u00105\u001a\u0004\u0018\u0001062\u0014\b\u0002\u00107\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030 \u0018\u000108H\u0086\b¢\u0006\u0002\u00109J\r\u0010:\u001a\u00020*H\u0000¢\u0006\u0002\b;J\u0013\u0010<\u001a\u00020\u00062\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\"\u0010>\u001a\u0006\u0012\u0002\b\u00030?2\b\u00105\u001a\u0004\u0018\u0001062\n\u0010@\u001a\u0006\u0012\u0002\b\u00030 H\u0002JC\u0010A\u001a\u0002H3\"\u0004\b\u0000\u001032\n\u0010@\u001a\u0006\u0012\u0002\b\u00030B2\n\b\u0002\u00105\u001a\u0004\u0018\u0001062\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020$\u0018\u00010#j\u0004\u0018\u0001`%H\u0007¢\u0006\u0002\u0010CJ=\u0010A\u001a\u0002H3\"\u0004\b\u0000\u001032\n\u0010@\u001a\u0006\u0012\u0002\b\u00030 2\b\u00105\u001a\u0004\u0018\u0001062\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020$\u0018\u00010#j\u0004\u0018\u0001`%¢\u0006\u0002\u0010DJ:\u0010A\u001a\u0002H3\"\u0006\b\u0000\u00103\u0018\u00012\n\b\u0002\u00105\u001a\u0004\u0018\u0001062\u0016\b\n\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020$\u0018\u00010#j\u0004\u0018\u0001`%H\u0087\b¢\u0006\u0002\u0010EJ\u0017\u0010F\u001a\b\u0012\u0004\u0012\u0002H308\"\u0006\b\u0000\u00103\u0018\u0001H\u0086\bJ\u001e\u0010F\u001a\b\u0012\u0004\u0012\u0002H308\"\u0004\b\u0000\u001032\n\u0010@\u001a\u0006\u0012\u0002\b\u00030 J\u0006\u0010G\u001a\u00020\bJ<\u0010H\u001a\u0004\u0018\u0001H3\"\u0006\b\u0000\u00103\u0018\u00012\n\b\u0002\u00105\u001a\u0004\u0018\u0001062\u0016\b\n\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020$\u0018\u00010#j\u0004\u0018\u0001`%H\u0087\b¢\u0006\u0002\u0010EJ\u0019\u0010I\u001a\u0002H3\"\u0004\b\u0000\u001032\u0006\u0010J\u001a\u00020\u0003¢\u0006\u0002\u0010KJ!\u0010I\u001a\u0002H3\"\u0004\b\u0000\u001032\u0006\u0010J\u001a\u00020\u00032\u0006\u0010L\u001a\u0002H3¢\u0006\u0002\u0010MJ\u001b\u0010N\u001a\u0004\u0018\u0001H3\"\u0004\b\u0000\u001032\u0006\u0010J\u001a\u00020\u0003¢\u0006\u0002\u0010KJ\u0012\u0010O\u001a\u00020\u00002\n\u0010P\u001a\u00060\u0003j\u0002`\u0004J\t\u0010Q\u001a\u00020RHÖ\u0001J;\u0010S\u001a\b\u0012\u0004\u0012\u0002H30T\"\u0006\b\u0000\u00103\u0018\u00012\n\b\u0002\u00105\u001a\u0004\u0018\u0001062\u0016\b\n\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020$\u0018\u00010#j\u0004\u0018\u0001`%H\u0087\bJ=\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H30T\"\u0006\b\u0000\u00103\u0018\u00012\n\b\u0002\u00105\u001a\u0004\u0018\u0001062\u0016\b\n\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020$\u0018\u00010#j\u0004\u0018\u0001`%H\u0087\bJ\u000e\u0010V\u001a\u00020*2\u0006\u0010W\u001a\u00020\u0012J?\u0010X\u001a\u0002H3\"\u0004\b\u0000\u001032\b\u00105\u001a\u0004\u0018\u0001062\n\u0010@\u001a\u0006\u0012\u0002\b\u00030 2\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020$\u0018\u00010#j\u0004\u0018\u0001`%H\u0002¢\u0006\u0002\u0010YJ\b\u0010Z\u001a\u00020\u0003H\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006["}, d2 = {"Lorg/koin/core/scope/Scope;", "", "id", "", "Lorg/koin/core/scope/ScopeID;", "isRoot", "", "_koin", "Lorg/koin/core/Koin;", "(Ljava/lang/String;ZLorg/koin/core/Koin;)V", "get_koin$koin_core", "()Lorg/koin/core/Koin;", "beanRegistry", "Lorg/koin/core/registry/BeanRegistry;", "getBeanRegistry", "()Lorg/koin/core/registry/BeanRegistry;", "callbacks", "Ljava/util/ArrayList;", "Lorg/koin/core/scope/ScopeCallback;", "Lkotlin/collections/ArrayList;", "getId", "()Ljava/lang/String;", "()Z", "scopeDefinition", "Lorg/koin/core/scope/ScopeDefinition;", "getScopeDefinition", "()Lorg/koin/core/scope/ScopeDefinition;", "setScopeDefinition", "(Lorg/koin/core/scope/ScopeDefinition;)V", "bind", ExifInterface.LATITUDE_SOUTH, "primaryType", "Lkotlin/reflect/KClass;", "secondaryType", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, "Lkotlin/Function0;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "P", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "close", "", "component1", "component2", "component3", "component3$koin_core", "copy", "createEagerInstances", "createEagerInstances$koin_core", "declare", ExifInterface.GPS_DIRECTION_TRUE, "instance", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "secondaryTypes", "", "(Ljava/lang/Object;Lorg/koin/core/qualifier/Qualifier;Ljava/util/List;)V", "declareDefinitionsFromScopeSet", "declareDefinitionsFromScopeSet$koin_core", "equals", "other", "findDefinition", "Lorg/koin/core/definition/BeanDefinition;", "clazz", "get", "Ljava/lang/Class;", "(Ljava/lang/Class;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "(Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getAll", "getKoin", "getOrNull", "getProperty", "key", "(Ljava/lang/String;)Ljava/lang/Object;", "defaultValue", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "getPropertyOrNull", "getScope", "scopeID", "hashCode", "", "inject", "Lkotlin/Lazy;", "injectOrNull", "registerCallback", "callback", "resolveInstance", "(Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "toString", "koin-core"}, k = 1, mv = {1, 1, 15})
public final /* data */ class FileTransformFactory {
    private static short[] notify;
    public final String TuitionPaymentFragmentbindingInflater1;
    public isUsingRotationDegrees TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final ZoomGestureDetectorZoomEvent TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final mapRect TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final boolean asInterface;
    private final ArrayList<Object> b;
    private static final byte[] $$c = {83, -90, 68, -23};
    private static final int $$f = 149;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {73, 55, 58, 33, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 59, -6, -10, 13, -20, 14, -12, -7, 11, -72, 63, -7, -14, -1, -1, 11, -72, 56, 2, 3, -18, 10, -7, -16, 8, -65, 73, -3, -23, 17, 30, -15, 8, -14, 3, -4, -33, 14, 21, -15, -11, 6, 3, -49, 41, -20, 3, 3, -11, 6, 3, -21, 4, 2, -13, 2, 2, -10, -33, 34, -11, 3, -14, 16, -18, 10, -68};
    private static final int $$e = 190;
    private static final byte[] $$a = {43, 23, 22, -14, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 187;
    private static int onTransact = 0;
    private static int cancel = 1;
    private static int asBinder = -205167437;
    private static int g = -1934795627;
    private static int d = 1949518679;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static byte[] f145a = {69, -18, 18, -27, -49, 48, -18, 23, -25, 28, -64, -61, 93, -30, -89, 44, 29, 28, 27, -24, 16, -21, 122, 30, -30, 19, -18, -19, 26, -11, 8, 25, 20, -27, -23, 19, -31, 65, -27, 26, 21, -20, -14, Base64.padSymbol, -29, -19, 21, -21, 19, -9, -60, -11, 88, -26, -23, -43, 44, 29, 28, 27, -24, 16, -21, 121, 25, -32, 19, -11, 24, 28, 27, 26, -26, -55, 43, -32, -17, 21, -26, 27, -12, 123, -18, 23, -25, 28, -64, -61, 33, 31, -21, 19, -40, 43, 13, -13, 17, 123, -25, 19, -54, Base64.padSymbol, 19, -12, -1, 41, -29, -19, 19, -32, -17, -25, 29};

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = defpackage.FileTransformFactory.$$a
            int r1 = 53 - r7
            int r5 = r5 * 14
            int r5 = 98 - r5
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r5
            r5 = r7
            r3 = r2
            goto L29
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L23:
            int r6 = r6 + 1
            int r3 = r3 + 1
            r4 = r0[r6]
        L29:
            int r5 = r5 + r4
            int r5 = r5 + (-10)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.FileTransformFactory.c(short, int, byte, java.lang.Object[]):void");
    }

    private static void f(short s, int i, byte b, Object[] objArr) {
        byte[] bArr = $$d;
        int i2 = 99 - (b * 15);
        int i3 = 52 - (i * 48);
        int i4 = s * 11;
        byte[] bArr2 = new byte[i4 + 38];
        int i5 = i4 + 37;
        int i6 = -1;
        if (bArr == null) {
            i2 = i3 + i5 + 3;
            i3++;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i2;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i7 = i2;
            int i8 = i3 + 1;
            i2 = i7 + bArr[i3] + 3;
            i3 = i8;
        }
    }

    public FileTransformFactory(String str, boolean z, ZoomGestureDetectorZoomEvent zoomGestureDetectorZoomEvent) {
        this.TuitionPaymentFragmentbindingInflater1 = str;
        this.asInterface = z;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = zoomGestureDetectorZoomEvent;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new mapRect();
        this.b = new ArrayList<>();
    }

    public static final /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(FileTransformFactory fileTransformFactory, mapPoint mappoint, KClass kClass, Function0 function0) {
        int i = 2 % 2;
        Object objB = fileTransformFactory.TuitionPaymentFragmentbindingInflater1(mappoint, kClass).b(new ScreenFlashUiInfo(fileTransformFactory.TuitionPaymentFragmentspecialinlinedviewModeldefault2, fileTransformFactory, function0));
        int i2 = cancel + 101;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return objB;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ FileTransformFactory(String str, boolean z, ZoomGestureDetectorZoomEvent zoomGestureDetectorZoomEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = cancel + 115;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            z = false;
        }
        this(str, z, zoomGestureDetectorZoomEvent);
    }

    public final <T> T b(final KClass<?> kClass, final mapPoint mappoint, final Function0<CoordinateTransform> function0) {
        synchronized (this) {
            getFocusX.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault3 = getFocusX.INSTANCE;
            isSamsungFold2OrFold3 issamsungfold2orfold3TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getFocusX.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            if (issamsungfold2orfold3TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1.compareTo(Level.DEBUG) <= 0) {
                getFocusX.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault4 = getFocusX.INSTANCE;
                isSamsungFold2OrFold3 issamsungfold2orfold3TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getFocusX.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                StringBuilder sb = new StringBuilder("+- get '");
                sb.append(setUsingCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault3(kClass));
                sb.append('\'');
                issamsungfold2orfold3TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Level.DEBUG, sb.toString());
                Pair pairTuitionPaymentFragmentspecialinlinedviewModeldefault2 = isUsingCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function0<T>() { // from class: org.koin.core.scope.Scope$get$$inlined$synchronized$lambda$1
                    @Override // kotlin.jvm.functions.Function0
                    public final T invoke() {
                        return (T) FileTransformFactory.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.this$0, mappoint, kClass, function0);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                });
                T t = (T) pairTuitionPaymentFragmentspecialinlinedviewModeldefault2.component1();
                double dDoubleValue = ((Number) pairTuitionPaymentFragmentspecialinlinedviewModeldefault2.component2()).doubleValue();
                getFocusX.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault5 = getFocusX.INSTANCE;
                isSamsungFold2OrFold3 issamsungfold2orfold3TuitionPaymentFragmentspecialinlinedviewModeldefault4 = getFocusX.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                StringBuilder sb2 = new StringBuilder("+- got '");
                sb2.append(setUsingCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault3(kClass));
                sb2.append("' in ");
                sb2.append(dDoubleValue);
                sb2.append(" ms");
                issamsungfold2orfold3TuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Level.DEBUG, sb2.toString());
                return t;
            }
            return (T) TuitionPaymentFragmentbindingInflater1(mappoint, kClass).b(new ScreenFlashUiInfo(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this, function0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    private final ZoomGestureDetectorZoomEventMove<?> TuitionPaymentFragmentbindingInflater1(mapPoint mappoint, KClass<?> kClass) throws NoBeanDefFoundException {
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove;
        int i = 2 % 2;
        FileTransformFactory fileTransformFactory = this;
        while (true) {
            mapRect maprect = fileTransformFactory.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (mappoint != null) {
                zoomGestureDetectorZoomEventMove = maprect.b.get(mappoint.toString());
            } else {
                ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove2 = maprect.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(kClass);
                if (zoomGestureDetectorZoomEventMove2 != null) {
                    zoomGestureDetectorZoomEventMove = zoomGestureDetectorZoomEventMove2;
                } else {
                    ArrayList<ZoomGestureDetectorZoomEventMove<?>> arrayList = maprect.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(kClass);
                    if (arrayList != null) {
                        int i2 = onTransact + 79;
                        cancel = i2 % 128;
                        if (i2 % 2 != 0 ? arrayList.size() == 1 : arrayList.size() == 0) {
                            int i3 = cancel + 117;
                            onTransact = i3 % 128;
                            zoomGestureDetectorZoomEventMove = i3 % 2 != 0 ? arrayList.get(0) : arrayList.get(0);
                        } else {
                            if (arrayList == null && arrayList.size() > 1) {
                                StringBuilder sb = new StringBuilder("Found multiple definitions for type '");
                                sb.append(setUsingCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault3(kClass));
                                sb.append("': ");
                                sb.append(arrayList);
                                sb.append(". Please use the 'bind<P,S>()' function to bind your instance from primary and secondary types.");
                                throw new NoBeanDefFoundException(sb.toString());
                            }
                            zoomGestureDetectorZoomEventMove = null;
                        }
                    } else {
                        if (arrayList == null) {
                        }
                        zoomGestureDetectorZoomEventMove = null;
                    }
                }
            }
            if (zoomGestureDetectorZoomEventMove != null) {
                return zoomGestureDetectorZoomEventMove;
            }
            if (!(!fileTransformFactory.asInterface)) {
                StringBuilder sb2 = new StringBuilder("No definition found for '");
                sb2.append(setUsingCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault3(kClass));
                sb2.append("' has been found. Check your module definitions.");
                throw new NoBeanDefFoundException(sb2.toString());
            }
            fileTransformFactory = fileTransformFactory.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b;
            int i4 = cancel + 49;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 % 3;
            }
        }
    }

    public final void b() {
        int i = 2 % 2;
        int i2 = onTransact + 119;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        if (this.asInterface) {
            HashSet<ZoomGestureDetectorZoomEventMove<?>> hashSet = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (hashSet.isEmpty()) {
                return;
            }
            Iterator<T> it = hashSet.iterator();
            while (it.hasNext()) {
                ((ZoomGestureDetectorZoomEventMove) it.next()).b(new ScreenFlashUiInfo(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this, null, 4, null));
                int i4 = onTransact + 29;
                cancel = i4 % 128;
                int i5 = i4 % 2;
            }
        }
    }

    private static void e(int i, int i2, short s, byte b, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5;
        boolean z;
        int i6 = 2;
        int i7 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(g)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b2 = (byte) 0;
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ExpandableListView.getPackedPositionType(0L), TextUtils.getTrimmedLength("") + 2267, 33 - TextUtils.getCapsMode("", 0, 0), 1387473586, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            Object obj = null;
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            float f = 0.0f;
            if (!z2) {
                i4 = 2;
            } else {
                int i8 = $11 + 39;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                byte[] bArr = f145a;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i9 = 0;
                    while (i9 < length) {
                        int i10 = $11 + 95;
                        $10 = i10 % 128;
                        if (i10 % i6 != 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char c = (char) (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1));
                                int maxKeyCode = 3358 - (KeyEvent.getMaxKeyCode() >> 16);
                                int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 18;
                                byte length2 = (byte) $$c.length;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, maxKeyCode, pressedStateDuration, -1054011043, false, $$g((byte) 0, length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE});
                            }
                            bArr2[i9] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                            i9 = 0;
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr[i9])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char c2 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3358;
                                int iMyPid = 18 - (Process.myPid() >> 22);
                                byte length3 = (byte) $$c.length;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, minimumFlingVelocity, iMyPid, -1054011043, false, $$g((byte) 0, length3, (byte) (length3 - 4)), new Class[]{Integer.TYPE});
                            }
                            bArr2[i9] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).byteValue();
                            i9++;
                        }
                        i6 = 2;
                        f = 0.0f;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = f145a;
                    Object[] objArr5 = {Integer.valueOf(i3), Integer.valueOf(asBinder)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 2267 - Color.argb(0, 0, 0, 0), 33 - (ViewConfiguration.getPressedStateDuration() >> 16), 1387473586, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) g) ^ 3046761265686732006L)));
                    i4 = 2;
                } else {
                    iIntValue = (short) (((short) (((long) notify[i3 + ((int) (((long) asBinder) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) g) ^ 3046761265686732006L)));
                    int i11 = $10 + 15;
                    $11 = i11 % 128;
                    i4 = 2;
                    int i12 = i11 % 2;
                }
            }
            if (iIntValue > 0) {
                int i13 = ((i3 + iIntValue) - i4) + ((int) (((long) asBinder) ^ 3046761265686732006L));
                if (z2) {
                    int i14 = $11 + 73;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i13 + i5;
                Object[] objArr6 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(d), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (55904 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0) + 2856, TextUtils.indexOf("", "", 0, 0) + 13, -1529949196, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = f145a;
                if (bArr4 != null) {
                    int length4 = bArr4.length;
                    byte[] bArr5 = new byte[length4];
                    for (int i16 = 0; i16 < length4; i16++) {
                        int i17 = $10 + 27;
                        $11 = i17 % 128;
                        int i18 = i17 % 2;
                        bArr5[i16] = (byte) (((long) bArr4[i16]) ^ 3046761265686732006L);
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i19 = $11 + 119;
                    $10 = i19 % 128;
                    int i20 = i19 % 2;
                    z = true;
                } else {
                    z = false;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    if (z) {
                        int i21 = $11 + 43;
                        $10 = i21 % 128;
                        int i22 = i21 % 2;
                        byte[] bArr6 = f145a;
                        int i23 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i23 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i23]) ^ 3046761265686732006L)) + s)) ^ b));
                    } else {
                        short[] sArr = notify;
                        int i24 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i24 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i24]) ^ 3046761265686732006L)) + s)) ^ b));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder(",set:'");
        sb.append((Object) null);
        sb.append('\'');
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder("Scope[id:'");
        sb2.append(this.TuitionPaymentFragmentbindingInflater1);
        sb2.append('\'');
        sb2.append(string);
        sb2.append(']');
        String string2 = sb2.toString();
        int i2 = onTransact + 73;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        return string2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022 A[PHI: r6
  0x0022: PHI (r6v5 int) = (r6v0 int), (r6v6 int) binds: [B:8:0x001b, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x001d A[PHI: r2 r6
  0x001d: PHI (r2v5 java.lang.String) = (r2v4 java.lang.String), (r2v14 java.lang.String) binds: [B:8:0x001b, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]
  0x001d: PHI (r6v1 int) = (r6v0 int), (r6v6 int) binds: [B:8:0x001b, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v65 */
    /* JADX WARN: Type inference failed for: r7v66 */
    public final int hashCode() throws Throwable {
        String str;
        int iHashCode;
        int iHashCode2;
        Object[] objArr;
        int i = 2 % 2;
        int i2 = cancel + 3;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            str = this.TuitionPaymentFragmentbindingInflater1;
            iHashCode = 1;
            if (str != null) {
                iHashCode2 = str.hashCode();
            } else {
                iHashCode2 = 0;
            }
        } else {
            str = this.TuitionPaymentFragmentbindingInflater1;
            iHashCode = 0;
            if (str != null) {
                iHashCode2 = str.hashCode();
            } else {
                iHashCode2 = 0;
            }
        }
        boolean z = this.asInterface;
        ?? r7 = z;
        if (z) {
            int i3 = onTransact + 115;
            cancel = i3 % 128;
            int i4 = i3 % 2;
            r7 = 1;
        }
        ZoomGestureDetectorZoomEvent zoomGestureDetectorZoomEvent = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (zoomGestureDetectorZoomEvent != null) {
            iHashCode = zoomGestureDetectorZoomEvent.hashCode();
        }
        ?? r2 = (iHashCode2 * 31) + r7;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 31533);
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 921;
            int iMakeMeasureSpec = 28 - View.MeasureSpec.makeMeasureSpec(0, 0);
            byte[] bArr = $$a;
            byte b = bArr[80];
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b, b2, (byte) (b2 & 52), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, maximumFlingVelocity, iMakeMeasureSpec, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(123857072 - View.MeasureSpec.getSize(0), (-116) - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (short) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (byte) (ViewConfiguration.getTouchSlop() >> 8), (-2137536597) - Gravity.getAbsoluteGravity(0, 0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(ExpandableListView.getPackedPositionType(0L) + 123857076, (-116) - Drawable.resolveOpacity(0, 0), (short) ExpandableListView.getPackedPositionType(0L), (byte) Color.green(0), TextUtils.indexOf((CharSequence) "", '0') - 2137536574, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char absoluteGravity = (char) (Gravity.getAbsoluteGravity(0, 0) + 31533);
            int i5 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 921;
            int deadChar = 28 - KeyEvent.getDeadChar(0, 0);
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            c(bArr2[37], bArr2[7], bArr2[80], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(absoluteGravity, i5, deadChar, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i6 = onTransact + 65;
            cancel = i6 % 128;
            int i7 = i6 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 31533);
                int iMyPid = 921 - (Process.myPid() >> 22);
                int iNormalizeMetaState = 28 - KeyEvent.normalizeMetaState(0);
                byte[] bArr3 = $$a;
                byte b3 = bArr3[37];
                Object[] objArr6 = new Object[1];
                c(b3, (byte) (b3 | 50), bArr3[33], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(longPressTimeout, iMyPid, iNormalizeMetaState, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i8 = (((((~((-686316167) | startUptimeMillis)) | 673712770) * (-566)) + 843418119) + ((~(startUptimeMillis | (-12603397))) * 566)) - 1863354752;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 123857072, (-117) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (short) KeyEvent.normalizeMetaState(0), (byte) KeyEvent.keyCodeFromString(""), (-2137536560) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e((ViewConfiguration.getDoubleTapTimeout() >> 16) + 123857074, (-116) - (ViewConfiguration.getTouchSlop() >> 8), (short) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (byte) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (-2137536534) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            e(View.resolveSizeAndState(0, 0, 0) + 123857081, (-116) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (short) Color.blue(0), (byte) (ViewConfiguration.getEdgeSlop() >> 16), (-2137536515) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(123857079 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), Color.green(0) - 116, (short) TextUtils.indexOf("", "", 0), (byte) (Color.rgb(0, 0, 0) + 16777216), (-2137536499) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i11 = cancel + 19;
            onTransact = i11 % 128;
            int i12 = i11 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -1863354752};
                byte[] bArr4 = $$d;
                byte b4 = (byte) (-bArr4[35]);
                byte b5 = b4;
                Object[] objArr13 = new Object[1];
                f(b4, b5, (byte) (b5 - 1), objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b6 = bArr4[35];
                byte b7 = (byte) (b6 + 1);
                Object[] objArr14 = new Object[1];
                f(b7, b7, (byte) (-b6), objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char maximumFlingVelocity2 = (char) (31533 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                    int scrollBarFadeDuration = 921 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 28;
                    byte[] bArr5 = $$a;
                    byte b8 = bArr5[37];
                    Object[] objArr16 = new Object[1];
                    c(b8, (byte) (b8 | 50), bArr5[33], objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maximumFlingVelocity2, scrollBarFadeDuration, pressedStateDuration, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    e((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 123857072, TextUtils.getCapsMode("", 0, 0) - 116, (short) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (byte) (ViewConfiguration.getKeyRepeatDelay() >> 16), KeyEvent.getDeadChar(0, 0) - 2137536597, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    e(107079860 - Color.rgb(0, 0, 0), (-117) - TextUtils.indexOf((CharSequence) "", '0'), (short) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (byte) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getWindowTouchSlop() >> 8) - 2137536575, objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cRgb = (char) ((-16745683) - Color.rgb(0, 0, 0));
                        int iMyPid2 = (Process.myPid() >> 22) + 921;
                        int packedPositionGroup = 28 - ExpandableListView.getPackedPositionGroup(0L);
                        byte[] bArr6 = $$a;
                        Object[] objArr19 = new Object[1];
                        c(bArr6[37], bArr6[7], bArr6[80], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cRgb, iMyPid2, packedPositionGroup, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cKeyCodeFromString = (char) (31533 - KeyEvent.keyCodeFromString(""));
                        int iResolveOpacity = 921 - Drawable.resolveOpacity(0, 0);
                        int offsetBefore = 28 - TextUtils.getOffsetBefore("", 0);
                        byte[] bArr7 = $$a;
                        byte b9 = bArr7[80];
                        byte b10 = bArr7[7];
                        Object[] objArr20 = new Object[1];
                        c(b9, b10, (byte) (b10 & 52), objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cKeyCodeFromString, iResolveOpacity, offsetBefore, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr15;
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
        int i13 = ((int[]) objArr[1])[0];
        int i14 = ((int[]) objArr[3])[0];
        if (i14 == i13) {
            int i15 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iMyTid = Process.myTid();
            int i16 = i15 + 215165005 + (((~((-975322092) | iMyTid)) | (-1069431804)) * (-502)) + ((~((~iMyTid) | (-270674252))) * (-502)) + (((~(iMyTid | (-798757553))) | (-975322092)) * TypedValues.PositionType.TYPE_DRAWPATH);
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr21[0])[0] = i18 ^ (i18 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i19 = 0;
                while (i19 < strArr.length) {
                    int i20 = cancel + 125;
                    onTransact = i20 % 128;
                    if (i20 % 2 != 0) {
                        arrayList.add(strArr[i19]);
                        i19 += 76;
                    } else {
                        arrayList.add(strArr[i19]);
                        i19++;
                    }
                }
            }
            Toast.makeText((Context) null, i14 / (((i14 - 1) * i14) % 2), 0).show();
            int i21 = ((int[]) objArr[0])[0];
            Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i22 = ~iIdentityHashCode;
            int i23 = i21 + 1744779075 + (((~((-765802735) | i22)) | 1008276909) * (-602)) + (((~(iIdentityHashCode | (-765802735))) | 738267308 | (~(1035812335 | i22))) * (-301)) + ((~(i22 | 1008276909)) * 301);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr22[0])[0] = i25 ^ (i25 << 5);
        }
        return (r2 * 31) + iHashCode;
    }

    public final boolean equals(Object other) {
        int i = 2 % 2;
        if (this != other) {
            if (!(other instanceof FileTransformFactory)) {
                return false;
            }
            FileTransformFactory fileTransformFactory = (FileTransformFactory) other;
            if (!Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, fileTransformFactory.TuitionPaymentFragmentbindingInflater1)) {
                return false;
            }
            int i2 = cancel + 103;
            int i3 = i2 % 128;
            onTransact = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                boolean z = fileTransformFactory.asInterface;
                obj.hashCode();
                throw null;
            }
            if (this.asInterface != fileTransformFactory.asInterface) {
                return false;
            }
            int i4 = i3 + 113;
            cancel = i4 % 128;
            int i5 = i4 % 2;
            ZoomGestureDetectorZoomEvent zoomGestureDetectorZoomEvent = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            ZoomGestureDetectorZoomEvent zoomGestureDetectorZoomEvent2 = fileTransformFactory.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (i5 == 0) {
                Intrinsics.areEqual(zoomGestureDetectorZoomEvent, zoomGestureDetectorZoomEvent2);
                throw null;
            }
            if (!Intrinsics.areEqual(zoomGestureDetectorZoomEvent, zoomGestureDetectorZoomEvent2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, short r7, short r8) {
        /*
            int r8 = r8 * 2
            int r0 = 1 - r8
            byte[] r1 = defpackage.FileTransformFactory.$$c
            int r6 = r6 * 4
            int r6 = 3 - r6
            int r7 = r7 + 117
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L17
            r7 = r6
            r4 = r8
            r3 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r5
        L2c:
            int r6 = r6 + r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.FileTransformFactory.$$g(byte, short, short):java.lang.String");
    }
}
