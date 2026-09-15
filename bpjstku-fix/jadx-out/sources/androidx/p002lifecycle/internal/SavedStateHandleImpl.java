package androidx.p002lifecycle.internal;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.p013savedstate.SavedStateRegistry;
import androidx.p013savedstate.SavedStateWriter;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.EncoderImplExternalSyntheticLambda14;
import defpackage.lambdamatchAcquisitionsAndFreeBufferIndexes15androidxcameravideointernalencoderEncoderImpl;
import defpackage.lambdasignalSourceStopped7androidxcameravideointernalencoderEncoderImpl;
import defpackage.lambdastop3androidxcameravideointernalencoderEncoderImpl;
import defpackage.stopMediaCodec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u0018\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001b\u001a\u00020\u001a\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00018\u0000H\u0087\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001d\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b \u0010!R(\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\"8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010$R(\u0010(\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00120\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010$R.\u0010)\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00120\"8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\t"}, d2 = {"Landroidx/lifecycle/internal/SavedStateHandleImpl;", "", "", "", "p0", "<init>", "(Ljava/util/Map;)V", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "savedStateProvider", "()Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "", "contains", "(Ljava/lang/String;)Z", ExifInterface.GPS_DIRECTION_TRUE, "p1", "LstopMediaCodec;", "getStateFlow", "(Ljava/lang/String;Ljava/lang/Object;)LstopMediaCodec;", "Llambdastop3androidxcameravideointernalencoderEncoderImpl;", "getMutableStateFlow", "(Ljava/lang/String;Ljava/lang/Object;)Llambdastop3androidxcameravideointernalencoderEncoderImpl;", "", UserMetadata.KEYDATA_FILENAME, "()Ljava/util/Set;", "get", "(Ljava/lang/String;)Ljava/lang/Object;", "", "set", "(Ljava/lang/String;Ljava/lang/Object;)V", "remove", "setSavedStateProvider", "(Ljava/lang/String;Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;)V", "clearSavedStateProvider", "(Ljava/lang/String;)V", "", "regular", "Ljava/util/Map;", "getRegular", "()Ljava/util/Map;", "providers", "flows", "mutableFlows", "getMutableFlows", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "getSavedStateProvider"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SavedStateHandleImpl {
    private final Map<String, lambdastop3androidxcameravideointernalencoderEncoderImpl<Object>> flows;
    private final Map<String, lambdastop3androidxcameravideointernalencoderEncoderImpl<Object>> mutableFlows;
    private final Map<String, SavedStateRegistry.SavedStateProvider> providers;
    private final Map<String, Object> regular;
    private final SavedStateRegistry.SavedStateProvider savedStateProvider;

    public SavedStateHandleImpl(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.regular = MapsKt.toMutableMap(map);
        this.providers = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.mutableFlows = new LinkedHashMap();
        this.savedStateProvider = new SavedStateRegistry.SavedStateProvider() { // from class: androidx.lifecycle.internal.SavedStateHandleImpl$$ExternalSyntheticLambda0
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                return SavedStateHandleImpl.savedStateProvider$lambda$0(this.f$0);
            }
        };
    }

    public /* synthetic */ SavedStateHandleImpl(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MapsKt.emptyMap() : map);
    }

    public final Map<String, Object> getRegular() {
        return this.regular;
    }

    public final Map<String, lambdastop3androidxcameravideointernalencoderEncoderImpl<Object>> getMutableFlows() {
        return this.mutableFlows;
    }

    public final SavedStateRegistry.SavedStateProvider getSavedStateProvider() {
        return this.savedStateProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle savedStateProvider$lambda$0(SavedStateHandleImpl savedStateHandleImpl) {
        Pair[] pairArr;
        for (Map.Entry entry : MapsKt.toMap(savedStateHandleImpl.mutableFlows).entrySet()) {
            savedStateHandleImpl.set((String) entry.getKey(), ((lambdastop3androidxcameravideointernalencoderEncoderImpl) entry.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        }
        for (Map.Entry entry2 : MapsKt.toMap(savedStateHandleImpl.providers).entrySet()) {
            savedStateHandleImpl.set((String) entry2.getKey(), ((SavedStateRegistry.SavedStateProvider) entry2.getValue()).saveState());
        }
        Map<String, Object> map = savedStateHandleImpl.regular;
        if (map.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, Object> entry3 : map.entrySet()) {
                arrayList.add(TuplesKt.to(entry3.getKey(), entry3.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m7454constructorimpl(bundleBundleOf);
        return bundleBundleOf;
    }

    public final SavedStateRegistry.SavedStateProvider savedStateProvider() {
        return this.savedStateProvider;
    }

    public final boolean contains(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.regular.containsKey(p0);
    }

    public final <T> stopMediaCodec<T> getStateFlow(String p0, T p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Map<String, lambdastop3androidxcameravideointernalencoderEncoderImpl<Object>> map = this.flows;
        lambdastop3androidxcameravideointernalencoderEncoderImpl<Object> lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault2 = map.get(p0);
        if (lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
            if (!this.regular.containsKey(p0)) {
                this.regular.put(p0, p1);
            }
            lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault2 = EncoderImplExternalSyntheticLambda14.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.regular.get(p0));
            map.put(p0, lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        lambdasignalSourceStopped7androidxcameravideointernalencoderEncoderImpl lambdasignalsourcestopped7androidxcameravideointernalencoderencoderimpl = new lambdasignalSourceStopped7androidxcameravideointernalencoderEncoderImpl(lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault2, null);
        Intrinsics.checkNotNull(lambdasignalsourcestopped7androidxcameravideointernalencoderencoderimpl, "");
        return lambdasignalsourcestopped7androidxcameravideointernalencoderencoderimpl;
    }

    public final <T> lambdastop3androidxcameravideointernalencoderEncoderImpl<T> getMutableStateFlow(String p0, T p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Map<String, lambdastop3androidxcameravideointernalencoderEncoderImpl<Object>> map = this.mutableFlows;
        lambdamatchAcquisitionsAndFreeBufferIndexes15androidxcameravideointernalencoderEncoderImpl lambdamatchacquisitionsandfreebufferindexes15androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault2 = map.get(p0);
        if (lambdamatchacquisitionsandfreebufferindexes15androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
            if (!this.regular.containsKey(p0)) {
                this.regular.put(p0, p1);
            }
            lambdamatchacquisitionsandfreebufferindexes15androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault2 = EncoderImplExternalSyntheticLambda14.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.regular.get(p0));
            map.put(p0, (lambdastop3androidxcameravideointernalencoderEncoderImpl<Object>) lambdamatchacquisitionsandfreebufferindexes15androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        lambdastop3androidxcameravideointernalencoderEncoderImpl<T> lambdastop3androidxcameravideointernalencoderencoderimpl = (lambdastop3androidxcameravideointernalencoderEncoderImpl) lambdamatchacquisitionsandfreebufferindexes15androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Intrinsics.checkNotNull(lambdastop3androidxcameravideointernalencoderencoderimpl, "");
        return lambdastop3androidxcameravideointernalencoderencoderimpl;
    }

    public final Set<String> keys() {
        return SetsKt.plus((Set) this.regular.keySet(), (Iterable) this.providers.keySet());
    }

    public final <T> T get(String p0) {
        T t;
        Intrinsics.checkNotNullParameter(p0, "");
        try {
            lambdastop3androidxcameravideointernalencoderEncoderImpl<Object> lambdastop3androidxcameravideointernalencoderencoderimpl = this.mutableFlows.get(p0);
            return (lambdastop3androidxcameravideointernalencoderencoderimpl == null || (t = (T) lambdastop3androidxcameravideointernalencoderencoderimpl.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) == null) ? (T) this.regular.get(p0) : t;
        } catch (ClassCastException unused) {
            remove(p0);
            return null;
        }
    }

    public final <T> void set(String p0, T p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.regular.put(p0, p1);
        lambdastop3androidxcameravideointernalencoderEncoderImpl<Object> lambdastop3androidxcameravideointernalencoderencoderimpl = this.flows.get(p0);
        if (lambdastop3androidxcameravideointernalencoderencoderimpl != null) {
            lambdastop3androidxcameravideointernalencoderencoderimpl.b(p1);
        }
        lambdastop3androidxcameravideointernalencoderEncoderImpl<Object> lambdastop3androidxcameravideointernalencoderencoderimpl2 = this.mutableFlows.get(p0);
        if (lambdastop3androidxcameravideointernalencoderencoderimpl2 != null) {
            lambdastop3androidxcameravideointernalencoderencoderimpl2.b(p1);
        }
    }

    public final <T> T remove(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        T t = (T) this.regular.remove(p0);
        this.flows.remove(p0);
        this.mutableFlows.remove(p0);
        return t;
    }

    public final void setSavedStateProvider(String p0, SavedStateRegistry.SavedStateProvider p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        this.providers.put(p0, p1);
    }

    public final void clearSavedStateProvider(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.providers.remove(p0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SavedStateHandleImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
