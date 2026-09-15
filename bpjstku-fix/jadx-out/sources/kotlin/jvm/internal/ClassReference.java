package kotlin.jvm.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
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
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.messaging.Constants;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import kotlin.Function;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.reflect.KCallable;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVisibility;
import kotlin.text.StringsKt;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u0000 S2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001SB\u0013\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00128WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0014R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00128WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0014R\u001e\u0010!\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001e0\u001d8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R \u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\"0\u001d8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010 R\u001e\u0010&\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u001d8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010 R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020(0'8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0016\u0010.\u001a\u0004\u0018\u00010\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R \u00103\u001a\b\u0012\u0004\u0012\u00020/0'8WX\u0097\u0004¢\u0006\f\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010*R \u00107\u001a\b\u0012\u0004\u0012\u0002040'8WX\u0097\u0004¢\u0006\f\u0012\u0004\b6\u00102\u001a\u0004\b5\u0010*R(\u0010:\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00010'8WX\u0097\u0004¢\u0006\f\u0012\u0004\b9\u00102\u001a\u0004\b8\u0010*R\u001c\u0010?\u001a\u0004\u0018\u00010;8WX\u0097\u0004¢\u0006\f\u0012\u0004\b>\u00102\u001a\u0004\b<\u0010=R\u001a\u0010@\u001a\u00020\b8WX\u0097\u0004¢\u0006\f\u0012\u0004\bB\u00102\u001a\u0004\b@\u0010AR\u001a\u0010C\u001a\u00020\b8WX\u0097\u0004¢\u0006\f\u0012\u0004\bD\u00102\u001a\u0004\bC\u0010AR\u001a\u0010E\u001a\u00020\b8WX\u0097\u0004¢\u0006\f\u0012\u0004\bF\u00102\u001a\u0004\bE\u0010AR\u001a\u0010G\u001a\u00020\b8WX\u0097\u0004¢\u0006\f\u0012\u0004\bH\u00102\u001a\u0004\bG\u0010AR\u001a\u0010I\u001a\u00020\b8WX\u0097\u0004¢\u0006\f\u0012\u0004\bJ\u00102\u001a\u0004\bI\u0010AR\u001a\u0010K\u001a\u00020\b8WX\u0097\u0004¢\u0006\f\u0012\u0004\bL\u00102\u001a\u0004\bK\u0010AR\u001a\u0010M\u001a\u00020\b8WX\u0097\u0004¢\u0006\f\u0012\u0004\bN\u00102\u001a\u0004\bM\u0010AR\u001a\u0010O\u001a\u00020\b8WX\u0097\u0004¢\u0006\f\u0012\u0004\bP\u00102\u001a\u0004\bO\u0010AR\u001a\u0010Q\u001a\u00020\b8WX\u0097\u0004¢\u0006\f\u0012\u0004\bR\u00102\u001a\u0004\bQ\u0010A"}, d2 = {"Lkotlin/jvm/internal/ClassReference;", "Lkotlin/reflect/KClass;", "", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "Ljava/lang/Class;", "p0", "<init>", "(Ljava/lang/Class;)V", "", "isInstance", "(Ljava/lang/Object;)Z", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "()Ljava/lang/Void;", "equals", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "jClass", "Ljava/lang/Class;", "getJClass", "()Ljava/lang/Class;", "getSimpleName", "simpleName", "getQualifiedName", "qualifiedName", "", "Lkotlin/reflect/KCallable;", "getMembers", "()Ljava/util/Collection;", "members", "Lkotlin/reflect/KFunction;", "getConstructors", "constructors", "getNestedClasses", "nestedClasses", "", "", "getAnnotations", "()Ljava/util/List;", "annotations", "getObjectInstance", "()Ljava/lang/Object;", "objectInstance", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "getTypeParameters$annotations", "()V", "typeParameters", "Lkotlin/reflect/KType;", "getSupertypes", "getSupertypes$annotations", "supertypes", "getSealedSubclasses", "getSealedSubclasses$annotations", "sealedSubclasses", "Lkotlin/reflect/KVisibility;", "getVisibility", "()Lkotlin/reflect/KVisibility;", "getVisibility$annotations", "visibility", "isFinal", "()Z", "isFinal$annotations", "isOpen", "isOpen$annotations", "isAbstract", "isAbstract$annotations", "isSealed", "isSealed$annotations", "isData", "isData$annotations", "isInner", "isInner$annotations", "isCompanion", "isCompanion$annotations", "isFun", "isFun$annotations", "isValue", "isValue$annotations", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ClassReference implements KClass<Object>, ClassBasedDeclarationContainer {
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Map<Class<? extends Function<?>>, Integer> FUNCTION_CLASSES;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final HashMap<String, String> classFqNames;
    private static final HashMap<String, String> primitiveFqNames;
    private static final HashMap<String, String> primitiveWrapperFqNames;
    private static final Map<String, String> simpleNames;
    private final Class<?> jClass;
    private static final byte[] $$d = {12, 11, -9, -106, -20, -6, 55, -60, -22, -2, -17, -9, 1, -18, 63, -62, -5, -27, 11, -9, -15, -13, 2, -13, -13, -1, 49, -32, -52, 9, -14, -14, 0, -17, -14, 43, -58, 2, -10, 34, -42, -25, 3, -21, 9, 13, -25, -25, -10, 3, -2, -14, -15, 7, -21, -14, 41, -46, -19, 3, -25, 13, -17, -13, 3, -9, -15, 36, -51, 4, -26, 0, 0, -17, -14, 42, -47, -13, 2, -13, -13, -1, -41, 4, -19, 3, -14, -7, 22, -25, -32, 4, 0, -17, -14, 38, -52, 9, -14, -14, 0, -17, -14, -7, -5, 3, -6, -14, 0, -19, -5, -13, -6, -5, -13, 1, -7, -26, 5, -4, -26, 34, -42, 3, -9, -15, 0, -9, -9, -3, -28, 1, -16, 58};
    private static final int $$e = 67;
    private static final byte[] $$a = {29, 88, -118, 32, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
    private static final int $$b = 203;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int b = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 14
            int r7 = 98 - r7
            int r8 = r8 + 4
            int r9 = r9 + 1
            byte[] r0 = kotlin.jvm.internal.ClassReference.$$a
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L27
        L12:
            r3 = r2
        L13:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L22:
            r3 = r0[r8]
            r6 = r3
            r3 = r7
            r7 = r6
        L27:
            int r8 = r8 + 1
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.ClassReference.a(int, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = kotlin.jvm.internal.ClassReference.$$d
            int r6 = r6 + 4
            int r7 = r7 * 26
            int r1 = 79 - r7
            int r5 = r5 * 15
            int r5 = r5 + 84
            byte[] r1 = new byte[r1]
            int r7 = 78 - r7
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            int r3 = r3 + 1
            int r6 = r6 + 1
            r4 = r0[r6]
        L2a:
            int r4 = -r4
            int r5 = r5 + r4
            int r5 = r5 + (-8)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.ClassReference.d(byte, short, int, java.lang.Object[]):void");
    }

    public ClassReference(Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        this.jClass = cls;
    }

    public static final /* synthetic */ HashMap access$getClassFqNames$cp() {
        int i = 2 % 2;
        int i2 = b + 123;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return classFqNames;
        }
        throw null;
    }

    public static final /* synthetic */ Map access$getFUNCTION_CLASSES$cp() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 107;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Map<Class<? extends Function<?>>, Integer> map = FUNCTION_CLASSES;
        int i4 = i2 + 81;
        b = i4 % 128;
        int i5 = i4 % 2;
        return map;
    }

    public static final /* synthetic */ Map access$getSimpleNames$cp() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 61;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        Map<String, String> map = simpleNames;
        int i5 = i2 + 13;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    public final Class<?> getJClass() {
        int i = 2 % 2;
        int i2 = b + 79;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.jClass;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final String getSimpleName() {
        int i = 2 % 2;
        int i2 = b + 5;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            INSTANCE.getClassSimpleName(getJClass());
            obj.hashCode();
            throw null;
        }
        String classSimpleName = INSTANCE.getClassSimpleName(getJClass());
        int i3 = b + 103;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 == 0) {
            return classSimpleName;
        }
        throw null;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 2624 - ExpandableListView.getPackedPositionGroup(0L), Gravity.getAbsoluteGravity(0, 0) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - View.MeasureSpec.makeMeasureSpec(0, 0)), 482 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 37 - (ViewConfiguration.getScrollBarSize() >> 8), 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        int i4 = $11 + 71;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i6 = $11 + 107;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (View.MeasureSpec.getMode(0) + 39422), 481 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                throw null;
            }
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 39421), (ViewConfiguration.getScrollBarSize() >> 8) + 481, 37 - TextUtils.getCapsMode("", 0, 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2);
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u0004\u0018\u00010\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\t\u0010\bJ#\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\f\u0010\rR,\u0010\u0011\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000f0\u0004\u0012\u0004\u0012\u00020\u00100\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R0\u0010\u0015\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0013j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R0\u0010\u0017\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0013j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R0\u0010\u0018\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0013j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R$\u0010\u0019\u001a\u0012\u0012\b\u0012\u0006*\u00020\u00060\u0006\u0012\u0004\u0012\u00020\u00060\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0012"}, d2 = {"Lkotlin/jvm/internal/ClassReference$Companion;", "", "<init>", "()V", "Ljava/lang/Class;", "p0", "", "getClassSimpleName", "(Ljava/lang/Class;)Ljava/lang/String;", "getClassQualifiedName", "p1", "", "isInstance", "(Ljava/lang/Object;Ljava/lang/Class;)Z", "", "Lkotlin/Function;", "", "FUNCTION_CLASSES", "Ljava/util/Map;", "Ljava/util/HashMap;", "Lkotlin/collections/TuitionPaymentFragmentbindingInflater1;", "primitiveFqNames", "Ljava/util/HashMap;", "primitiveWrapperFqNames", "classFqNames", "simpleNames"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final String getClassSimpleName(Class<?> p0) {
            String str;
            Intrinsics.checkNotNullParameter(p0, "");
            String string = null;
            if (p0.isAnonymousClass()) {
                return null;
            }
            if (p0.isLocalClass()) {
                String simpleName = p0.getSimpleName();
                Method enclosingMethod = p0.getEnclosingMethod();
                if (enclosingMethod != null) {
                    Intrinsics.checkNotNull(simpleName);
                    StringBuilder sb = new StringBuilder();
                    sb.append(enclosingMethod.getName());
                    sb.append(Typography.dollar);
                    String strSubstringAfter$default = StringsKt.substringAfter$default(simpleName, sb.toString(), (String) null, 2, (Object) null);
                    if (strSubstringAfter$default != null) {
                        return strSubstringAfter$default;
                    }
                }
                Constructor<?> enclosingConstructor = p0.getEnclosingConstructor();
                if (enclosingConstructor == null) {
                    Intrinsics.checkNotNull(simpleName);
                    return StringsKt.substringAfter$default(simpleName, Typography.dollar, (String) null, 2, (Object) null);
                }
                Intrinsics.checkNotNull(simpleName);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(enclosingConstructor.getName());
                sb2.append(Typography.dollar);
                return StringsKt.substringAfter$default(simpleName, sb2.toString(), (String) null, 2, (Object) null);
            }
            if (p0.isArray()) {
                Class<?> componentType = p0.getComponentType();
                if (componentType.isPrimitive() && (str = (String) ClassReference.access$getSimpleNames$cp().get(componentType.getName())) != null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append("Array");
                    string = sb3.toString();
                }
                return string == null ? "Array" : string;
            }
            String str2 = (String) ClassReference.access$getSimpleNames$cp().get(p0.getName());
            return str2 == null ? p0.getSimpleName() : str2;
        }

        public final String getClassQualifiedName(Class<?> p0) {
            String str;
            Intrinsics.checkNotNullParameter(p0, "");
            String string = null;
            if (p0.isAnonymousClass() || p0.isLocalClass()) {
                return null;
            }
            if (p0.isArray()) {
                Class<?> componentType = p0.getComponentType();
                if (componentType.isPrimitive() && (str = (String) ClassReference.access$getClassFqNames$cp().get(componentType.getName())) != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append("Array");
                    string = sb.toString();
                }
                return string == null ? "kotlin.Array" : string;
            }
            String str2 = (String) ClassReference.access$getClassFqNames$cp().get(p0.getName());
            return str2 == null ? p0.getCanonicalName() : str2;
        }

        public final boolean isInstance(Object p0, Class<?> p1) {
            Intrinsics.checkNotNullParameter(p1, "");
            Map mapAccess$getFUNCTION_CLASSES$cp = ClassReference.access$getFUNCTION_CLASSES$cp();
            Intrinsics.checkNotNull(mapAccess$getFUNCTION_CLASSES$cp, "");
            Integer num = (Integer) mapAccess$getFUNCTION_CLASSES$cp.get(p1);
            if (num != null) {
                return TypeIntrinsics.isFunctionOfArity(p0, num.intValue());
            }
            if (p1.isPrimitive()) {
                p1 = JvmClassMappingKt.getJavaObjectType(JvmClassMappingKt.getKotlinClass(p1));
            }
            return p1.isInstance(p0);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // kotlin.reflect.KClass
    public final String getQualifiedName() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (43043 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
            int gidForName = 3110 - Process.getGidForName("");
            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 22;
            byte b2 = $$a[80];
            Object[] objArr2 = new Object[1];
            a(b2, (short) (b2 | 88), (byte) 52, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, gidForName, jumpTapTimeout, -1272852037, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{44463, 12423, 38884, 31433, 55613, 48228, 832, 57841, 17561, 11234, 36454, 27952, 61539, 22342, 13720, 39138, 32723, 49690, 41244, 1092, 60065, 18838}, 40232 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{44459, 62721, 7401, 42071, 53041, 5764, 48760, 49641, 26803, 45076, 56316, 25275, 35331, 11748, 30017}, 22692 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) (43042 - TextUtils.indexOf("", ""));
            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 3111;
            int iIndexOf = 21 - TextUtils.indexOf((CharSequence) "", '0', 0);
            byte b3 = $$a[80];
            Object[] objArr5 = new Object[1];
            a(b3, (short) (b3 | 140), (byte) 52, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, doubleTapTimeout, iIndexOf, -1269618118, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 37;
            b = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 43043);
                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 3111;
                int touchSlop = 22 - (ViewConfiguration.getTouchSlop() >> 8);
                Object[] objArr6 = new Object[1];
                a($$a[80], (short) 52, (byte) 37, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(bitsPerPixel, scrollDefaultDelay, touchSlop, 154975793, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i4 = ((int[]) objArr7[2])[0];
            int i5 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i4};
            int i6 = ~(System.identityHashCode(this) | 639857585);
            int i7 = (((-2130087262) + (((-1065173874) | i6) * (-220))) + ((i6 | (-1065317362)) * 220)) - 404011443;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
            objArr = new Object[]{new int[1], new int[]{i5}, iArr, strArr};
            int i10 = TuitionPaymentFragmentbindingInflater1 + 9;
            b = i10 % 128;
            int i11 = i10 % 2;
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{44452, 52094, 24602, 39388, 13988, 44983, 50505, 25111, 39713, 12473, 43447, 51020, 31857, 38183, 12997, 43932}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 26321, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{44455, 57825, 13629, 18753, 40086, 53456, 25720, 48058, 53214, 780, 22355, 60063, 15881, 29294, 33200, 54734}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 19530, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            int i12 = TuitionPaymentFragmentbindingInflater1 + 121;
            b = i12 % 128;
            int i13 = i12 % 2;
            try {
                Object[] objArr10 = {null, Integer.valueOf(iIntValue), 0, 24269773};
                byte[] bArr = $$d;
                Object[] objArr11 = new Object[1];
                d(bArr[12], bArr[25], bArr[32], objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b4 = bArr[32];
                Object[] objArr12 = new Object[1];
                d(b4, (byte) (b4 | 77), bArr[12], objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) (43042 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                    int i14 = 3112 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    int i15 = 22 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    Object[] objArr13 = new Object[1];
                    a($$a[80], (short) 52, (byte) 37, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, i14, i15, 154975793, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    c(new char[]{44463, 12423, 38884, 31433, 55613, 48228, 832, 57841, 17561, 11234, 36454, 27952, 61539, 22342, 13720, 39138, 32723, 49690, 41244, 1092, 60065, 18838}, 40231 - Color.argb(0, 0, 0, 0), objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    c(new char[]{44459, 62721, 7401, 42071, 53041, 5764, 48760, 49641, 26803, 45076, 56316, 25275, 35331, 11748, 30017}, TextUtils.indexOf((CharSequence) "", '0') + 22692, objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c3 = (char) (43042 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                        int iMyPid = 3111 - (Process.myPid() >> 22);
                        int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0) + 23;
                        byte b5 = $$a[80];
                        Object[] objArr16 = new Object[1];
                        a(b5, (short) (b5 | 140), (byte) 52, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c3, iMyPid, bitsPerPixel2, -1269618118, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cResolveSize = (char) (43042 - View.resolveSize(0, 0));
                        int iIndexOf2 = 3110 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        int i16 = 22 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        byte b6 = $$a[80];
                        Object[] objArr17 = new Object[1];
                        a(b6, (short) (b6 | 88), (byte) 52, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveSize, iIndexOf2, i16, -1272852037, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        int i18 = ((int[]) objArr[2])[0];
        if (i18 == i17) {
            int i19 = ((int[]) objArr[0])[0];
            int i20 = ((int[]) objArr[2])[0];
            int i21 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[3];
            int[] iArr2 = {i20};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i22 = ~startUptimeMillis;
            int i23 = (~((-705001601) | i22)) | 704723072;
            int i24 = ~(startUptimeMillis | 1000308386);
            int i25 = i19 + (((i23 | i24) * (-252)) - 1093380830) + ((i24 | (~(i22 | (-278529)))) * 252);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr[0])[0] = i27 ^ (i27 << 5);
            Object[] objArr18 = {new int[1], new int[]{i21}, iArr2, strArr2};
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                int i28 = b + 33;
                TuitionPaymentFragmentbindingInflater1 = i28 % 128;
                int i29 = 2;
                int i30 = i28 % 2;
                int i31 = 0;
                while (i31 < strArr3.length) {
                    int i32 = b + 13;
                    TuitionPaymentFragmentbindingInflater1 = i32 % 128;
                    int i33 = i32 % i29;
                    arrayList.add(strArr3[i31]);
                    i31++;
                    i29 = 2;
                }
            }
            int[] iArr3 = new int[i18];
            int i34 = i18 - 1;
            iArr3[i34] = 1;
            Toast.makeText((Context) null, iArr3[((i18 * i34) % 2) - 1], 1).show();
            int i35 = ((int[]) objArr[0])[0];
            int i36 = ((int[]) objArr[2])[0];
            int i37 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[3];
            int[] iArr4 = {i36};
            int iNextInt = new Random().nextInt();
            int i38 = ~((-449679859) | (~iNextInt));
            int i39 = i35 + ((((1074930688 | i38) | (~(449679858 | iNextInt))) * (-338)) - 40616158) + (((~(iNextInt | 1524610546)) | i38) * 338);
            int i40 = (i39 << 13) ^ i39;
            int i41 = i40 ^ (i40 >>> 17);
            ((int[]) objArr[0])[0] = i41 ^ (i41 << 5);
            Object[] objArr19 = {new int[1], new int[]{i37}, iArr4, strArr4};
        }
        return INSTANCE.getClassQualifiedName(getJClass());
    }

    @Override // kotlin.reflect.KClass, kotlin.reflect.KDeclarationContainer
    public final Collection<KCallable<?>> getMembers() {
        int i = 2 % 2;
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public final Collection<KFunction<Object>> getConstructors() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 59;
        b = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 651;
            int packedPositionChild = 43 - ExpandableListView.getPackedPositionChild(0L);
            byte[] bArr = $$a;
            byte b2 = bArr[80];
            short s = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b2, s, (byte) (s | 52), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(windowTouchSlop, threadPriority, packedPositionChild, -459846511, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{44463, 12423, 38884, 31433, 55613, 48228, 832, 57841, 17561, 11234, 36454, 27952, 61539, 22342, 13720, 39138, 32723, 49690, 41244, 1092, 60065, 18838}, 40231 - (ViewConfiguration.getEdgeSlop() >> 16), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{44459, 62721, 7401, 42071, 53041, 5764, 48760, 49641, 26803, 45076, 56316, 25275, 35331, 11748, 30017}, 22691 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
            int i4 = 651 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int iMakeMeasureSpec = 44 - View.MeasureSpec.makeMeasureSpec(0, 0);
            byte b3 = $$a[7];
            byte b4 = b3;
            Object[] objArr5 = new Object[1];
            a(b4, (short) (b4 | 52), b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(keyRepeatDelay, i4, iMakeMeasureSpec, -873460649, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 651;
                int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 44;
                Object[] objArr6 = new Object[1];
                a($$a[80], (short) 52, (byte) 37, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cKeyCodeFromString, maximumFlingVelocity, doubleTapTimeout, -1595579076, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i5 = ((int[]) objArr7[2])[0];
            int i6 = ((int[]) objArr7[0])[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = ~iIdentityHashCode;
            int i8 = 157817214 + (((~(349088088 | i7)) | 352518898) * (-90)) + (((~(349088088 | iIdentityHashCode)) | 13412616) * (-45)) + (((~(iIdentityHashCode | (-352518899))) | 349088088 | (~(i7 | 352518898))) * 45) + 1823032474;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[3])[0] = i10 ^ (i10 << 5);
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) TextUtils.indexOf("", "", 0, 0), 1609 - MotionEvent.axisFromString(""), ((Process.getThreadPriority(0) + 20) >> 6) + 26, 2145681644, false, null, new Class[0]);
                }
                Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), 1823032474, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int iIndexOf = 650 - TextUtils.indexOf((CharSequence) "", '0');
                    int scrollBarFadeDuration2 = 44 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    byte b5 = $$a[7];
                    byte b6 = b5;
                    Object[] objArr9 = new Object[1];
                    a(b6, (short) (b6 | 52), b5, objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarFadeDuration, iIndexOf, scrollBarFadeDuration2, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((-1) - MotionEvent.axisFromString("")), 695 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getEdgeSlop() >> 16) + 98), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63406 - ExpandableListView.getPackedPositionGroup(0L)), 793 - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 83), Integer.TYPE, Integer.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cBlue = (char) Color.blue(0);
                    int i11 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 651;
                    int deadChar = 44 - KeyEvent.getDeadChar(0, 0);
                    Object[] objArr10 = new Object[1];
                    a($$a[80], (short) 52, (byte) 37, objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cBlue, i11, deadChar, -1595579076, false, (String) objArr10[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr11 = new Object[1];
                    c(new char[]{44463, 12423, 38884, 31433, 55613, 48228, 832, 57841, 17561, 11234, 36454, 27952, 61539, 22342, 13720, 39138, 32723, 49690, 41244, 1092, 60065, 18838}, TextUtils.lastIndexOf("", '0') + 40232, objArr11);
                    Class<?> cls2 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    c(new char[]{44459, 62721, 7401, 42071, 53041, 5764, 48760, 49641, 26803, 45076, 56316, 25275, 35331, 11748, 30017}, AndroidCharacter.getMirror('0') + 22643, objArr12);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                        int maximumFlingVelocity2 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 651;
                        int i12 = 44 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        byte b7 = $$a[7];
                        byte b8 = b7;
                        Object[] objArr13 = new Object[1];
                        a(b8, (short) (b8 | 52), b7, objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cCombineMeasuredStates, maximumFlingVelocity2, i12, -873460649, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 651;
                        int iIndexOf2 = TextUtils.indexOf("", "") + 44;
                        byte[] bArr2 = $$a;
                        byte b9 = bArr2[80];
                        short s2 = bArr2[7];
                        Object[] objArr14 = new Object[1];
                        a(b9, s2, (byte) (s2 | 52), objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cIndexOf, maxKeyCode, iIndexOf2, -459846511, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
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
        int i13 = ((int[]) objArr[0])[0];
        int i14 = ((int[]) objArr[2])[0];
        if (i14 == i13) {
            Object[] objArr15 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i15 = ((int[]) objArr[3])[0];
            int i16 = ((int[]) objArr[2])[0];
            int i17 = ((int[]) objArr[0])[0];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i18 = i15 + 1049828164 + (((~(iIdentityHashCode2 | 533748120)) | 763494) * 305) + (((~((~iIdentityHashCode2) | 533748120)) | 530317310) * 305);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr15[3])[0] = i20 ^ (i20 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[1];
            if (strArr != null) {
                int i21 = b;
                int i22 = i21 + 111;
                TuitionPaymentFragmentbindingInflater1 = i22 % 128;
                int i23 = i22 % 2;
                int i24 = i21 + 121;
                TuitionPaymentFragmentbindingInflater1 = i24 % 128;
                int i25 = i24 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i14];
            int i26 = i14 - 1;
            iArr[i26] = 1;
            Toast.makeText((Context) null, iArr[((i14 * i26) % 2) - 1], 1).show();
            Object[] objArr16 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i27 = ((int[]) objArr[3])[0];
            int i28 = ((int[]) objArr[2])[0];
            int i29 = ((int[]) objArr[0])[0];
            int i30 = ~(System.identityHashCode(this) | 971267639);
            int i31 = i27 + (((-5528235) | i30) * (-658)) + 494851987 + ((i30 | (-972316352)) * 658);
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArr16[3])[0] = i33 ^ (i33 << 5);
        }
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public final Collection<KClass<?>> getNestedClasses() {
        int i = 2 % 2;
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public final List<Annotation> getAnnotations() {
        int i = 2 % 2;
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public final Object getObjectInstance() {
        int i = 2 % 2;
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public final boolean isInstance(Object p0) {
        int i = 2 % 2;
        int i2 = b + 39;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsInstance = INSTANCE.isInstance(p0, getJClass());
        int i4 = TuitionPaymentFragmentbindingInflater1 + 53;
        b = i4 % 128;
        int i5 = i4 % 2;
        return zIsInstance;
    }

    @Override // kotlin.reflect.KClass
    public final List<KTypeParameter> getTypeParameters() {
        int i = 2 % 2;
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public final List<KType> getSupertypes() {
        int i = 2 % 2;
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public final List<KClass<? extends Object>> getSealedSubclasses() {
        int i = 2 % 2;
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public final KVisibility getVisibility() {
        int i = 2 % 2;
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public final boolean isFinal() {
        int i = 2 % 2;
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public final boolean isOpen() {
        int i = 2 % 2;
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public final boolean isAbstract() {
        int i = 2 % 2;
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public final boolean isSealed() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 39;
        b = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
            int i4 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 651;
            int modifierMetaStateMask = 43 - ((byte) KeyEvent.getModifierMetaStateMask());
            byte[] bArr = $$a;
            byte b2 = bArr[80];
            short s = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b2, s, (byte) (s | 52), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i4, modifierMetaStateMask, -459846511, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{44463, 12423, 38884, 31433, 55613, 48228, 832, 57841, 17561, 11234, 36454, 27952, 61539, 22342, 13720, 39138, 32723, 49690, 41244, 1092, 60065, 18838}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 40231, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{44459, 62721, 7401, 42071, 53041, 5764, 48760, 49641, 26803, 45076, 56316, 25275, 35331, 11748, 30017}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22690, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c2 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
            int offsetBefore = 651 - TextUtils.getOffsetBefore("", 0);
            int offsetBefore2 = TextUtils.getOffsetBefore("", 0) + 44;
            byte b3 = $$a[7];
            byte b4 = b3;
            Object[] objArr5 = new Object[1];
            a(b4, (short) (b4 | 52), b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, offsetBefore, offsetBefore2, -873460649, false, (String) objArr5[0], null);
        }
        if (j != ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1610, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 25, 2145681644, false, null, new Class[0]);
                }
                Object[] objArr6 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(null), -2106788001, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c3 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    int deadChar = 651 - KeyEvent.getDeadChar(0, 0);
                    int absoluteGravity = 44 - Gravity.getAbsoluteGravity(0, 0);
                    byte b5 = $$a[7];
                    byte b6 = b5;
                    Object[] objArr7 = new Object[1];
                    a(b6, (short) (b6 | 52), b5, objArr7);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c3, deadChar, absoluteGravity, 2075921419, false, (String) objArr7[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 695, 98 - ((Process.getThreadPriority(0) + 20) >> 6)), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63406 - View.MeasureSpec.getSize(0)), 793 - ((Process.getThreadPriority(0) + 20) >> 6), 83 - KeyEvent.keyCodeFromString("")), Integer.TYPE, Integer.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr6);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c4 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int i5 = 651 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 44;
                    Object[] objArr8 = new Object[1];
                    a($$a[80], (short) 52, (byte) 37, objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c4, i5, iResolveSizeAndState, -1595579076, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArr);
                try {
                    Object[] objArr9 = new Object[1];
                    c(new char[]{44463, 12423, 38884, 31433, 55613, 48228, 832, 57841, 17561, 11234, 36454, 27952, 61539, 22342, 13720, 39138, 32723, 49690, 41244, 1092, 60065, 18838}, 40231 - TextUtils.indexOf("", "", 0), objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    c(new char[]{44459, 62721, 7401, 42071, 53041, 5764, 48760, 49641, 26803, 45076, 56316, 25275, 35331, 11748, 30017}, 22692 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr10);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char deadChar2 = (char) KeyEvent.getDeadChar(0, 0);
                        int i6 = 652 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        int size = 44 - View.MeasureSpec.getSize(0);
                        byte b7 = $$a[7];
                        byte b8 = b7;
                        Object[] objArr11 = new Object[1];
                        a(b8, (short) (b8 | 52), b7, objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(deadChar2, i6, size, -873460649, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int iIndexOf = 650 - TextUtils.indexOf((CharSequence) "", '0');
                        int iResolveSize = 44 - View.resolveSize(0, 0);
                        byte[] bArr2 = $$a;
                        byte b9 = bArr2[80];
                        short s2 = bArr2[7];
                        Object[] objArr12 = new Object[1];
                        a(b9, s2, (byte) (s2 | 52), objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(keyRepeatTimeout, iIndexOf, iResolveSize, -459846511, false, (String) objArr12[0], null);
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
        } else {
            int i7 = b + 45;
            TuitionPaymentFragmentbindingInflater1 = i7 % 128;
            int i8 = i7 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                int i9 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 651;
                int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 44;
                Object[] objArr13 = new Object[1];
                a($$a[80], (short) 52, (byte) 37, objArr13);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(edgeSlop, i9, iIndexOf2, -1595579076, false, (String) objArr13[0], null);
            }
            Object[] objArr14 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i10 = ((int[]) objArr14[2])[0];
            int i11 = ((int[]) objArr14[0])[0];
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i12 = ((((-1284625637) + (((~(209182457 | iMaxMemory)) | 5490280) * (-502))) + ((~((~iMaxMemory) | 218103547)) * (-502))) + (((~(iMaxMemory | (-212613268))) | 209182457) * TypedValues.PositionType.TYPE_DRAWPATH)) - 2106788001;
            int i13 = (i12 << 13) ^ i12;
            int i14 = i13 ^ (i13 >>> 17);
            ((int[]) objArr[3])[0] = i14 ^ (i14 << 5);
        }
        int i15 = ((int[]) objArr[0])[0];
        int i16 = ((int[]) objArr[2])[0];
        if (i16 == i15) {
            Object[] objArr15 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i17 = ((int[]) objArr[3])[0];
            int i18 = ((int[]) objArr[2])[0];
            int i19 = ((int[]) objArr[0])[0];
            int iMaxMemory2 = (int) Runtime.getRuntime().maxMemory();
            int i20 = i17 + (((924995336 + (((~((-4762267) | iMaxMemory2)) | (~((-1331457) | iMaxMemory2))) * 69)) + (((~(iMaxMemory2 | (-129454405))) | ((~((-132885215) | iMaxMemory2)) | 128122948)) * (-69))) - 671015707);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr15[3])[0] = i22 ^ (i22 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[1];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i16];
            int i23 = i16 - 1;
            iArr[i23] = 1;
            Toast.makeText((Context) null, iArr[((i16 * i23) % 2) - 1], 1).show();
            Object[] objArr16 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i24 = ((int[]) objArr[3])[0];
            int i25 = ((int[]) objArr[2])[0];
            int i26 = ((int[]) objArr[0])[0];
            int iNextInt = new Random().nextInt();
            int i27 = i24 + 1049828164 + (((~(iNextInt | 1029347884)) | 2375826) * 305) + (((~((~iNextInt) | 1029347884)) | 1025917074) * 305);
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr16[3])[0] = i29 ^ (i29 << 5);
        }
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public final boolean isData() {
        int i = 2 % 2;
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public final boolean isInner() {
        int i = 2 % 2;
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public final boolean isCompanion() {
        int i = 2 % 2;
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public final boolean isFun() {
        int i = 2 % 2;
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public final boolean isValue() {
        int i = 2 % 2;
        error();
        throw new KotlinNothingValueException();
    }

    private final Void error() {
        int i = 2 % 2;
        throw new KotlinReflectionNotSupportedError();
    }

    @Override // kotlin.reflect.KClass
    public final boolean equals(Object p0) {
        int i = 2 % 2;
        int i2 = b + 65;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        if (!(p0 instanceof ClassReference) || !Intrinsics.areEqual(JvmClassMappingKt.getJavaObjectType(this), JvmClassMappingKt.getJavaObjectType((KClass) p0))) {
            return false;
        }
        int i4 = b + 19;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        return i4 % 2 == 0;
    }

    @Override // kotlin.reflect.KClass
    public final int hashCode() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 93;
        b = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = JvmClassMappingKt.getJavaObjectType(this).hashCode();
        int i4 = b + 119;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(getJClass());
        sb.append(" (Kotlin reflection is not available)");
        String string = sb.toString();
        int i2 = b + 23;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x009d A[PHI: r5
  0x009d: PHI (r5v35 java.lang.Object) = (r5v31 java.lang.Object), (r5v36 java.lang.Object) binds: [B:11:0x009b, B:8:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        Object next;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        INSTANCE = new Companion(null);
        List listListOf = CollectionsKt.listOf((Object[]) new Class[]{Function0.class, Function1.class, Function2.class, Function3.class, Function4.class, Function5.class, Function6.class, Function7.class, Function8.class, Function9.class, Function10.class, Function11.class, Function12.class, Function13.class, Function14.class, Function15.class, Function16.class, Function17.class, Function18.class, Function19.class, Function20.class, Function21.class, Function22.class});
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
        Iterator it = listListOf.iterator();
        int i = 2 % 2;
        int i2 = 0;
        while (it.hasNext()) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            if (i3 % 2 != 0) {
                next = it.next();
                int i4 = 33 / 0;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
            } else {
                next = it.next();
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
            }
            arrayList.add(TuplesKt.to((Class) next, Integer.valueOf(i2)));
            i2++;
        }
        FUNCTION_CLASSES = MapsKt.toMap(arrayList);
        HashMap<String, String> map = new HashMap<>();
        map.put(TypedValues.Custom.S_BOOLEAN, "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put(TypedValues.Custom.S_FLOAT, "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        primitiveFqNames = map;
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        primitiveWrapperFqNames = map2;
        HashMap<String, String> map3 = new HashMap<>();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            Intrinsics.checkNotNull(str);
            sb.append(StringsKt.substringAfterLast$default(str, '.', (String) null, 2, (Object) null));
            sb.append("CompanionObject");
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(".Companion");
            Pair pair = TuplesKt.to(string, sb2.toString());
            map3.put(pair.getFirst(), pair.getSecond());
        }
        HashMap<String, String> map4 = map3;
        for (Map.Entry<Class<? extends Function<?>>, Integer> entry : FUNCTION_CLASSES.entrySet()) {
            map3.put(entry.getKey().getName(), "kotlin.Function".concat(String.valueOf(entry.getValue().intValue())));
        }
        classFqNames = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map4.size()));
        Iterator<T> it2 = map4.entrySet().iterator();
        while (it2.hasNext()) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
            Map.Entry entry2 = (Map.Entry) it2.next();
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            Intrinsics.checkNotNull(str2);
            linkedHashMap.put(key, StringsKt.substringAfterLast$default(str2, '.', (String) null, 2, (Object) null));
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 59;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
            int i8 = i7 % 2;
        }
        simpleNames = linkedHashMap;
    }

    public static /* synthetic */ void getSealedSubclasses$annotations() {
        int i = 2 % 2;
        int i2 = b + 25;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ void getSupertypes$annotations() {
        int i = 2 % 2;
        int i2 = b + 35;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void getTypeParameters$annotations() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 91;
        b = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ void getVisibility$annotations() {
        int i = 2 % 2;
        int i2 = b + 67;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void isAbstract$annotations() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 123;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 86 / 0;
        }
    }

    public static /* synthetic */ void isCompanion$annotations() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 75;
        b = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ void isData$annotations() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 13;
        b = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ void isFinal$annotations() {
        int i = 2 % 2;
        int i2 = b + 67;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ void isFun$annotations() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 101;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void isInner$annotations() {
        int i = 2 % 2;
        int i2 = b + 43;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ void isOpen$annotations() {
        int i = 2 % 2;
        int i2 = b + 37;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ void isSealed$annotations() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 99;
        b = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ void isValue$annotations() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 25;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 5719056491232822485L;
    }
}
