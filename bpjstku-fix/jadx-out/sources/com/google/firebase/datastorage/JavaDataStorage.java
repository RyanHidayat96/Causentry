package com.google.firebase.datastorage;

import android.content.Context;
import android.content.ContextWrapper;
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
import android.widget.Toast;
import androidx.content.core.DataStore;
import androidx.content.preferences.PreferenceDataStoreDelegateKt;
import androidx.content.preferences.SharedPreferencesMigrationKt;
import androidx.content.preferences.core.MutablePreferences;
import androidx.content.preferences.core.Preferences;
import androidx.content.preferences.core.PreferencesKt;
import androidx.exifinterface.media.ExifInterface;
import defpackage.initSession;
import defpackage.lambdapause5androidxcameravideointernalencoderEncoderImpl;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0005\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00010\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0018\u001a\u00020\u000f2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R%\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000f0%*\u00020\u00028CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000f0%8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010+"}, d2 = {"Lcom/google/firebase/datastorage/JavaDataStorage;", "", "Landroid/content/Context;", "p0", "", "p1", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/preferences/core/Preferences$Key;", "getSync", "(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)Ljava/lang/Object;", "", "contains", "(Landroidx/datastore/preferences/core/Preferences$Key;)Z", "Landroidx/datastore/preferences/core/Preferences;", "putSync", "(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)Landroidx/datastore/preferences/core/Preferences;", "", "getAllSync", "()Ljava/util/Map;", "Lkotlin/Function1;", "Landroidx/datastore/preferences/core/MutablePreferences;", "", "editSync", "(Lkotlin/jvm/functions/Function1;)Landroidx/datastore/preferences/core/Preferences;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Ljava/lang/ThreadLocal;", "editLock", "Ljava/lang/ThreadLocal;", "Landroidx/datastore/core/DataStore;", "dataStore$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getDataStore", "(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", "dataStore", "Landroidx/datastore/core/DataStore;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JavaDataStorage {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property2(new PropertyReference2Impl(JavaDataStorage.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};
    private final Context context;
    private final DataStore<Preferences> dataStore;

    /* JADX INFO: renamed from: dataStore$delegate, reason: from kotlin metadata */
    private final ReadOnlyProperty dataStore;
    private final ThreadLocal<Boolean> editLock;
    private final String name;

    public JavaDataStorage(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.context = context;
        this.name = str;
        this.editLock = new ThreadLocal<>();
        this.dataStore = PreferenceDataStoreDelegateKt.preferencesDataStore$default(str, null, new Function1() { // from class: com.google.firebase.datastorage.JavaDataStorage$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JavaDataStorage.dataStore_delegate$lambda$0(this.f$0, (Context) obj);
            }
        }, null, 10, null);
        this.dataStore = getDataStore(context);
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getName() {
        return this.name;
    }

    private final DataStore<Preferences> getDataStore(Context context) {
        return (DataStore) this.dataStore.getValue(context, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List dataStore_delegate$lambda$0(JavaDataStorage javaDataStorage, Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return CollectionsKt.listOf(SharedPreferencesMigrationKt.SharedPreferencesMigration$default(context, javaDataStorage.name, null, 4, null));
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$getSync$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.google.firebase.datastorage.JavaDataStorage$getSync$1", f = "JavaDataStorage.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
    static final class C07041<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
        final /* synthetic */ T $defaultValue;
        final /* synthetic */ Preferences.Key<T> $key;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = lambdapause5androidxcameravideointernalencoderEncoderImpl.b(JavaDataStorage.this.dataStore.getData(), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Preferences preferences = (Preferences) obj;
            return (preferences == null || (obj2 = preferences.get(this.$key)) == null) ? this.$defaultValue : obj2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07041(Preferences.Key<T> key, T t, Continuation<? super C07041> continuation) {
            super(2, continuation);
            this.$key = key;
            this.$defaultValue = t;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return JavaDataStorage.this.new C07041(this.$key, this.$defaultValue, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
            return ((C07041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final <T> T getSync(Preferences.Key<T> p0, T p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        return (T) BuildersKt.runBlocking(EmptyCoroutineContext.INSTANCE, new C07041(p0, p1, null));
    }

    /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$contains$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.google.firebase.datastorage.JavaDataStorage$contains$1", f = "JavaDataStorage.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ Preferences.Key<T> $key;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = lambdapause5androidxcameravideointernalencoderEncoderImpl.b(JavaDataStorage.this.dataStore.getData(), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Preferences preferences = (Preferences) obj;
            return Boxing.boxBoolean(preferences != null ? preferences.contains(this.$key) : false);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Preferences.Key<T> key, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$key = key;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return JavaDataStorage.this.new AnonymousClass1(this.$key, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final <T> boolean contains(Preferences.Key<T> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return ((Boolean) BuildersKt.runBlocking(EmptyCoroutineContext.INSTANCE, new AnonymousClass1(p0, null))).booleanValue();
    }

    /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$putSync$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroidx/datastore/preferences/core/Preferences;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.google.firebase.datastorage.JavaDataStorage$putSync$1", f = "JavaDataStorage.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {})
    static final class C07051 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Preferences>, Object> {
        final /* synthetic */ Preferences.Key<T> $key;
        final /* synthetic */ T $value;
        int label;
        private static final byte[] $$c = {31, 115, -100, -11};
        private static final int $$f = 213;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {6, 51, 46, 31, 6, 23, -41, 38, 23, 12, 9, 5, -5, -16, 42, -3, 9, -57, 56, 41, -4, 19, -3, 14, 7, -22, 25, 32, -4, 0, 17, 14, -38, 52, -9, 14, 14, 0, 17, 14, -10, 15, 13, -2, 13, 13, 1, -22, 45, 0, 14, -3, 27, -7, 21, -57, 41, -4, 19, -3, 14, 7, -22, 25, 32, -4, 0, 17, 14, -38, 52, -9, 14, 14, 0, 17, 14, 7, 5, -3, 6, 14, 0, 19, 5, 13, 6, 5, 13, -1, 7, 26, -5, 4, 26, -34, 42, -3, 9, 15, 0, 9, 9, 3, 28, -1, 16, -57};
        private static final int $$e = 126;
        private static final byte[] $$a = {91, -9, 99, 11, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
        private static final int $$b = 242;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
        private static int TuitionPaymentFragmentbindingInflater1 = -83722381;

        /* JADX WARN: Code duplicated, block: B:10:0x0028  */
        /* JADX WARN: Code duplicated, block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(byte r5, short r6, byte r7, java.lang.Object[] r8) {
            /*
                int r7 = r7 * 52
                int r7 = r7 + 4
                byte[] r0 = com.google.firebase.datastorage.JavaDataStorage.C07051.$$a
                int r6 = r6 * 15
                int r1 = 53 - r6
                int r5 = r5 * 3
                int r5 = 84 - r5
                byte[] r1 = new byte[r1]
                int r6 = 52 - r6
                r2 = 0
                if (r0 != 0) goto L18
                r3 = r7
                r4 = r2
                goto L2a
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r5
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r6) goto L28
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L28:
                r3 = r0[r7]
            L2a:
                int r7 = r7 + 1
                int r5 = r5 + r3
                int r5 = r5 + (-11)
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.datastorage.JavaDataStorage.C07051.a(byte, short, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(int r7, byte r8, short r9, java.lang.Object[] r10) {
            /*
                int r9 = r9 * 52
                int r9 = r9 + 4
                int r7 = r7 * 19
                int r7 = 103 - r7
                int r8 = r8 * 2
                int r8 = r8 + 53
                byte[] r0 = com.google.firebase.datastorage.JavaDataStorage.C07051.$$d
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L17
                r7 = r8
                r3 = r9
                r4 = r2
                goto L2c
            L17:
                r3 = r2
            L18:
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                if (r4 != r8) goto L27
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L27:
                r3 = r0[r9]
                r6 = r3
                r3 = r9
                r9 = r6
            L2c:
                int r7 = r7 + r9
                int r7 = r7 + (-8)
                int r9 = r3 + 1
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.datastorage.JavaDataStorage.C07051.c(int, byte, short, java.lang.Object[]):void");
        }

        private static void b(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
            int i4 = 2 % 2;
            setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
            char[] cArr2 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i5 = $10 + 9;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                int i7 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) 0;
                        byte b2 = (byte) (b + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getTouchSlop() >> 8), 3291 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), AndroidCharacter.getMirror('0') - 17, 1199271174, false, $$g(b, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    try {
                        Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getTouchSlop() >> 8), TextUtils.getTrimmedLength("") + 651, View.MeasureSpec.makeMeasureSpec(0, 0) + 44, -450685997, false, $$g(b3, b4, b4), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            if (i3 > 0) {
                setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr2, 0, cArr3, 0, i2);
                System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            }
            if (z) {
                int i8 = $10 + 61;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                char[] cArr4 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    int i10 = $10 + 1;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i2 << setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                        Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) TextUtils.indexOf("", "", 0, 0), 652 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), Color.red(0) + 44, -450685997, false, $$g(b5, b6, b6), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    } else {
                        cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                        Object[] objArr5 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = b7;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) + 651, 44 - View.MeasureSpec.getSize(0), -450685997, false, $$g(b7, b8, b8), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    }
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }

        /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$putSync$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.google.firebase.datastorage.JavaDataStorage$putSync$1$1", f = "JavaDataStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C01531 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
            final /* synthetic */ Preferences.Key<T> $key;
            final /* synthetic */ T $value;
            /* synthetic */ Object L$0;
            int label;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws IllegalAccessException {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ExpandableListView.getPackedPositionChild(0L) + 46401), (ViewConfiguration.getWindowTouchSlop() >> 8) + 40, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 19, 1513912262, false, "b", null);
                }
                int i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37836 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 59, 18 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
                }
                int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
                long j = i2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getTouchSlop() >> 8) + 37836), 59 - KeyEvent.normalizeMetaState(0), 18 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
                }
                int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
                long j2 = -964;
                long j3 = -1;
                long j4 = j3 ^ 2418922597838327403L;
                long jNextInt = new Random().nextInt();
                long j5 = (((long) (-963)) * 3100330899321458836L) + j2 + (((long) 965) * 2418922597838327403L) + (((j3 ^ 3100330899321458836L) | ((j4 | jNextInt) ^ j3)) * j2) + (j2 * (((j4 | 3100330899321458836L) ^ j3) | ((j4 | (jNextInt ^ j3)) ^ j3)));
                int i4 = 0;
                long j6 = j;
                while (true) {
                    for (int i5 = 0; i5 != 8; i5++) {
                        i3 = (((((int) (j6 >> i5)) & 255) + (i3 << 6)) + (i3 << 16)) - i3;
                    }
                    if (i4 != 0) {
                        break;
                    }
                    i4++;
                    j6 = j5;
                }
                if (i3 != i) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Process.getGidForName("") + 46401), 40 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), View.combineMeasuredStates(0, 0) + 19, -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
                    Toast.makeText((Context) null, i2 / (((i2 - 1) * i2) % 2), 0).show();
                }
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ((MutablePreferences) this.L$0).set(this.$key, this.$value);
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01531(Preferences.Key<T> key, T t, Continuation<? super C01531> continuation) {
                super(2, continuation);
                this.$key = key;
                this.$value = t;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C01531 c01531 = new C01531(this.$key, this.$value, continuation);
                c01531.L$0 = obj;
                return c01531;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
                return ((C01531) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object[] objArr;
            Object[] objArr2;
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char c = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                int iResolveSize = View.resolveSize(0, 0) + 2267;
                int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 33;
                byte b = $$a[7];
                byte b2 = b;
                Object[] objArr3 = new Object[1];
                a(b, b2, b2, objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iResolveSize, fadingEdgeLength, -887667012, false, (String) objArr3[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr4 = new Object[1];
            b(true, ImageFormat.getBitsPerPixel(0) + 117, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 22, 5 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), new char[]{15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f'}, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            b(true, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 120, Color.alpha(0) + 15, 3 - (ViewConfiguration.getWindowTouchSlop() >> 8), new char[]{65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530, 65534, 65515, 65533, 65534, '\f', '\t'}, objArr5);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c2 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2267;
                int i2 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33;
                byte[] bArr = $$a;
                byte b3 = bArr[7];
                Object[] objArr6 = new Object[1];
                a(b3, b3, bArr[132], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, keyRepeatDelay, i2, -874156483, false, (String) objArr6[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 2267;
                    int windowTouchSlop = 33 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    byte[] bArr2 = $$a;
                    Object[] objArr7 = new Object[1];
                    a(bArr2[7], bArr2[132], bArr2[37], objArr7);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(keyRepeatTimeout, packedPositionGroup, windowTouchSlop, -654680577, false, (String) objArr7[0], null);
                }
                Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                int i3 = ((int[]) objArr8[0])[0];
                int i4 = ((int[]) objArr8[3])[0];
                String[] strArr = (String[]) objArr8[1];
                int i5 = ~((int) Process.getStartUptimeMillis());
                int i6 = (((-124732534) + (((~((-286905513) | i5)) | (-521807804)) * (-983))) + (((~(i5 | (-521807804))) | 235021075) * 983)) - 633661978;
                int i7 = (i6 << 13) ^ i6;
                int i8 = i7 ^ (i7 >>> 17);
                ((int[]) objArr[2])[0] = i8 ^ (i8 << 5);
            } else {
                Object[] objArr9 = new Object[1];
                b(false, 116 - TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 26, Gravity.getAbsoluteGravity(0, 0) + 12, new char[]{17, 6, 19, 6, 17, 22, 65521, 5, 15, 2, 65534, 1, 65534, 11, 1, 15, '\f', 6, 1, 65483, 65534, '\r', '\r', 65483, 65502, 0}, objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                Object[] objArr10 = new Object[1];
                b(true, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 122, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 18, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 16, new char[]{'\n', 65527, 65529, 65535, 2, 6, 6, 65495, '\n', 4, 65531, '\b', '\b', 11, 65529, 4, 5, 65535}, objArr10);
                Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                }
                Object[] objArr11 = new Object[1];
                b(true, 114 - TextUtils.lastIndexOf("", '0'), 17 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 2 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), new char[]{65535, '\b', 11, 3, 18, 17, 23, 65521, 65484, 5, '\f', 65535, '\n', 65484, 65535, 20}, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                Object[] objArr12 = new Object[1];
                b(true, TextUtils.lastIndexOf("", '0') + 120, 15 - ImageFormat.getBitsPerPixel(0), TextUtils.getTrimmedLength("") + 10, new char[]{65531, 65506, 19, 14, 3, 14, '\b', 65535, 65534, 3, 65535, 65534, '\t', 65501, 2, '\r'}, objArr12);
                try {
                    Object[] objArr13 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue()), 0, -633661978};
                    byte[] bArr3 = $$d;
                    byte b4 = bArr3[29];
                    byte b5 = b4;
                    Object[] objArr14 = new Object[1];
                    c(b4, b5, b5, objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    byte b6 = bArr3[46];
                    Object[] objArr15 = new Object[1];
                    c(b6, bArr3[29], b6, objArr15);
                    Object[] objArr16 = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                    if (applicationContext != null) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cRed = (char) Color.red(0);
                            int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 2267;
                            int minimumFlingVelocity = 33 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            byte[] bArr4 = $$a;
                            Object[] objArr17 = new Object[1];
                            a(bArr4[7], bArr4[132], bArr4[37], objArr17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cRed, iIndexOf, minimumFlingVelocity, -654680577, false, (String) objArr17[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr16);
                        try {
                            Object[] objArr18 = new Object[1];
                            b(true, 116 - TextUtils.getOffsetBefore("", 0), Gravity.getAbsoluteGravity(0, 0) + 22, 4 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), new char[]{15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f'}, objArr18);
                            Class<?> cls5 = Class.forName((String) objArr18[0]);
                            Object[] objArr19 = new Object[1];
                            b(true, ImageFormat.getBitsPerPixel(0) + 121, TextUtils.lastIndexOf("", '0') + 16, TextUtils.getCapsMode("", 0, 0) + 3, new char[]{65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530, 65534, 65515, 65533, 65534, '\f', '\t'}, objArr19);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char cResolveSize = (char) View.resolveSize(0, 0);
                                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2267;
                                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 33;
                                byte[] bArr5 = $$a;
                                byte b7 = bArr5[7];
                                Object[] objArr20 = new Object[1];
                                a(b7, b7, bArr5[132], objArr20);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveSize, scrollDefaultDelay, iResolveOpacity, -874156483, false, (String) objArr20[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
                                int i9 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2266;
                                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 33;
                                byte b8 = $$a[7];
                                byte b9 = b8;
                                Object[] objArr21 = new Object[1];
                                a(b8, b9, b9, objArr21);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cAxisFromString, i9, edgeSlop, -887667012, false, (String) objArr21[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                            int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i10 % 128;
                            int i11 = i10 % 2;
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                    objArr = objArr16;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i12 = ((int[]) objArr[3])[0];
            int i13 = ((int[]) objArr[0])[0];
            if (i13 == i12) {
                int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i14 % 128;
                int i15 = i14 % 2;
                objArr2 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                int i16 = ((int[]) objArr[2])[0];
                int i17 = ((int[]) objArr[0])[0];
                int i18 = ((int[]) objArr[3])[0];
                String[] strArr2 = (String[]) objArr[1];
                int iIdentityHashCode = System.identityHashCode(this);
                int i19 = i16 + (-878671592) + (((~((~iIdentityHashCode) | 157802762)) | (-804256604)) * 529) + (((~(iIdentityHashCode | 157802762)) | (-650910554)) * 529);
                int i20 = (i19 << 13) ^ i19;
                int i21 = i20 ^ (i20 >>> 17);
                ((int[]) objArr2[2])[0] = i21 ^ (i21 << 5);
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr3 = (String[]) objArr[1];
                if (strArr3 != null) {
                    int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 23;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i22 % 128;
                    int i23 = 2;
                    int i24 = i22 % 2;
                    int i25 = 0;
                    while (i25 < strArr3.length) {
                        int i26 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 67;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i26 % 128;
                        if (i26 % i23 == 0) {
                            arrayList.add(strArr3[i25]);
                            i25 += 4;
                        } else {
                            arrayList.add(strArr3[i25]);
                            i25++;
                        }
                        i23 = 2;
                    }
                }
                int[] iArr = new int[i13];
                int i27 = i13 - 1;
                iArr[i27] = 1;
                Toast.makeText((Context) null, iArr[((i13 * i27) % 2) - 1], 1).show();
                objArr2 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                int i28 = ((int[]) objArr[2])[0];
                int i29 = ((int[]) objArr[0])[0];
                int i30 = ((int[]) objArr[3])[0];
                String[] strArr4 = (String[]) objArr[1];
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i31 = ~iIdentityHashCode2;
                int i32 = (-1704972149) + (((~((-3408005) | i31)) | (~(666245332 | iIdentityHashCode2))) * 520);
                int i33 = ~((-666245333) | i31);
                int i34 = ~(iIdentityHashCode2 | 142467983);
                int i35 = i28 + i32 + ((i33 | i34) * (-1040)) + ((i34 | (~(i31 | (-142467984))) | 662837328) * 520);
                int i36 = (i35 << 13) ^ i35;
                int i37 = i36 ^ (i36 >>> 17);
                ((int[]) objArr2[2])[0] = i37 ^ (i37 << 5);
            }
            int i38 = this.label;
            if (i38 != 0) {
                int i39 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i39 % 128;
                if (i39 % 2 == 0 ? i38 != 1 : i38 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            int i40 = ((int[]) objArr2[2])[0];
            int i41 = ((((i40 * i40) - (~(-(1161800907 * i40)))) - 1) - (~(-(i40 * 1444549483)))) - 1;
            int i42 = (i41 ^ 645350105) + ((645350105 & i41) << 1);
            int i43 = ((i42 >> 24) - 511) / 256;
            int i44 = (i42 - (~((i43 ^ 1) + ((i43 & 1) << 1)))) - 1;
            int i45 = i42 >> 21;
            int i46 = ((i45 & (-4095)) + (i45 | (-4095))) / 2048;
            int i47 = -(i44 ^ (((i46 | 1) << 1) - (i46 ^ 1)));
            int i48 = (i47 & 3) + (i47 | 3);
            int i49 = ((i48 >> 19) - 16383) / 8192;
            this.label = 57 / (((-(((i49 ^ 1) + ((i49 & 1) << 1)) + 1)) & i48) * 19);
            Object objEdit = PreferencesKt.edit(JavaDataStorage.this.dataStore, new C01531(this.$key, this.$value, null), this);
            if (objEdit != coroutine_suspended) {
                return objEdit;
            }
            int i50 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 91;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i50 % 128;
            int i51 = i50 % 2;
            return coroutine_suspended;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07051(Preferences.Key<T> key, T t, Continuation<? super C07051> continuation) {
            super(2, continuation);
            this.$key = key;
            this.$value = t;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            C07051 c07051 = JavaDataStorage.this.new C07051(this.$key, this.$value, continuation);
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            if (i2 % 2 == 0) {
                return c07051;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Preferences> continuation) throws Throwable {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 55;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvoke2 = invoke2(coroutineScope, continuation);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 7;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            return objInvoke2;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Preferences> continuation) throws Throwable {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((C07051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 93;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(byte r7, short r8, short r9) {
            /*
                int r8 = r8 + 119
                int r7 = r7 * 4
                int r7 = 4 - r7
                byte[] r0 = com.google.firebase.datastorage.JavaDataStorage.C07051.$$c
                int r9 = r9 * 2
                int r9 = r9 + 1
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L15
                r8 = r7
                r3 = r9
                r5 = r2
                goto L29
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r8
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r9) goto L23
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L23:
                r3 = r0[r7]
                r6 = r8
                r8 = r7
                r7 = r3
                r3 = r6
            L29:
                int r7 = -r7
                int r7 = r7 + r3
                int r8 = r8 + 1
                r3 = r5
                r6 = r8
                r8 = r7
                r7 = r6
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.datastorage.JavaDataStorage.C07051.$$g(byte, short, short):java.lang.String");
        }
    }

    public final <T> Preferences putSync(Preferences.Key<T> p0, T p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        return (Preferences) BuildersKt.runBlocking(EmptyCoroutineContext.INSTANCE, new C07051(p0, p1, null));
    }

    /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$getAllSync$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.google.firebase.datastorage.JavaDataStorage$getAllSync$1", f = "JavaDataStorage.kt", i = {}, l = {157}, m = "invokeSuspend", n = {}, s = {})
    static final class C07031 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<Preferences.Key<?>, ? extends Object>>, Object> {
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Map<Preferences.Key<?>, Object> mapAsMap;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = lambdapause5androidxcameravideointernalencoderEncoderImpl.b(JavaDataStorage.this.dataStore.getData(), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Preferences preferences = (Preferences) obj;
            return (preferences == null || (mapAsMap = preferences.asMap()) == null) ? MapsKt.emptyMap() : mapAsMap;
        }

        C07031(Continuation<? super C07031> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return JavaDataStorage.this.new C07031(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Map<Preferences.Key<?>, ? extends Object>> continuation) {
            return ((C07031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Map<Preferences.Key<?>, Object> getAllSync() {
        return (Map) BuildersKt.runBlocking(EmptyCoroutineContext.INSTANCE, new C07031(null));
    }

    /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$editSync$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroidx/datastore/preferences/core/Preferences;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.google.firebase.datastorage.JavaDataStorage$editSync$1", f = "JavaDataStorage.kt", i = {}, l = {207}, m = "invokeSuspend", n = {}, s = {})
    static final class C07021 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Preferences>, Object> {
        final /* synthetic */ Function1<MutablePreferences, Unit> $transform;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!Intrinsics.areEqual(JavaDataStorage.this.editLock.get(), Boxing.boxBoolean(true))) {
                        JavaDataStorage.this.editLock.set(Boxing.boxBoolean(true));
                        this.label = 1;
                        obj = PreferencesKt.edit(JavaDataStorage.this.dataStore, new C01521(this.$transform, null), this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        throw new IllegalStateException("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Preferences preferences = (Preferences) obj;
                JavaDataStorage.this.editLock.set(Boxing.boxBoolean(false));
                return preferences;
            } catch (Throwable th) {
                JavaDataStorage.this.editLock.set(Boxing.boxBoolean(false));
                throw th;
            }
        }

        /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$editSync$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.google.firebase.datastorage.JavaDataStorage$editSync$1$1", f = "JavaDataStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C01521 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<MutablePreferences, Unit> $transform;
            /* synthetic */ Object L$0;
            int label;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$transform.invoke((MutablePreferences) this.L$0);
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C01521(Function1<? super MutablePreferences, Unit> function1, Continuation<? super C01521> continuation) {
                super(2, continuation);
                this.$transform = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C01521 c01521 = new C01521(this.$transform, continuation);
                c01521.L$0 = obj;
                return c01521;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
                return ((C01521) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C07021(Function1<? super MutablePreferences, Unit> function1, Continuation<? super C07021> continuation) {
            super(2, continuation);
            this.$transform = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return JavaDataStorage.this.new C07021(this.$transform, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Preferences> continuation) {
            return ((C07021) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Preferences editSync(Function1<? super MutablePreferences, Unit> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return (Preferences) BuildersKt.runBlocking(EmptyCoroutineContext.INSTANCE, new C07021(p0, null));
    }
}
