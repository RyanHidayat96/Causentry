package androidx.p002lifecycle;

import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import androidx.p002lifecycle.internal.SavedStateHandleImpl;
import androidx.p002lifecycle.internal.SavedStateHandleImpl_androidKt;
import androidx.p013savedstate.SavedStateReader;
import androidx.p013savedstate.SavedStateRegistry;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.lambdasignalSourceStopped7androidxcameravideointernalencoderEncoderImpl;
import defpackage.lambdastop3androidxcameravideointernalencoderEncoderImpl;
import defpackage.stopMediaCodec;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 12\u00020\u0001:\u000221B\u001f\b\u0016\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0010\u0010\u0013J3\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001dH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010 \u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0004\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0004\b \u0010!J(\u0010#\u001a\u00020\"\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00018\u0000H\u0087\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b%\u0010!J\u001f\u0010&\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\bH\u0007¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b(\u0010)R$\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030+0*8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b/\u00100"}, d2 = {"Landroidx/lifecycle/SavedStateHandle;", "", "", "", "p0", "<init>", "(Ljava/util/Map;)V", "()V", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "savedStateProvider", "()Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "", "contains", "(Ljava/lang/String;)Z", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/MutableLiveData;", "getLiveData", "(Ljava/lang/String;)Landroidx/lifecycle/MutableLiveData;", "p1", "(Ljava/lang/String;Ljava/lang/Object;)Landroidx/lifecycle/MutableLiveData;", "p2", "getLiveDataInternal", "(Ljava/lang/String;ZLjava/lang/Object;)Landroidx/lifecycle/MutableLiveData;", "LstopMediaCodec;", "getStateFlow", "(Ljava/lang/String;Ljava/lang/Object;)LstopMediaCodec;", "Llambdastop3androidxcameravideointernalencoderEncoderImpl;", "getMutableStateFlow", "(Ljava/lang/String;Ljava/lang/Object;)Llambdastop3androidxcameravideointernalencoderEncoderImpl;", "", UserMetadata.KEYDATA_FILENAME, "()Ljava/util/Set;", "get", "(Ljava/lang/String;)Ljava/lang/Object;", "", "set", "(Ljava/lang/String;Ljava/lang/Object;)V", "remove", "setSavedStateProvider", "(Ljava/lang/String;Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;)V", "clearSavedStateProvider", "(Ljava/lang/String;)V", "", "Landroidx/lifecycle/SavedStateHandle$SavingStateLiveData;", "liveDatas", "Ljava/util/Map;", "Landroidx/lifecycle/internal/SavedStateHandleImpl;", "impl", "Landroidx/lifecycle/internal/SavedStateHandleImpl;", "Companion", "SavingStateLiveData"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SavedStateHandle {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private SavedStateHandleImpl impl;
    private final Map<String, SavingStateLiveData<?>> liveDatas;

    public SavedStateHandle(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.liveDatas = new LinkedHashMap();
        this.impl = new SavedStateHandleImpl(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SavedStateHandle() {
        this.liveDatas = new LinkedHashMap();
        this.impl = new SavedStateHandleImpl(null, 1, 0 == true ? 1 : 0);
    }

    public final SavedStateRegistry.SavedStateProvider savedStateProvider() {
        return this.impl.getSavedStateProvider();
    }

    public final boolean contains(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.impl.contains(p0);
    }

    public final <T> MutableLiveData<T> getLiveData(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        MutableLiveData<T> liveDataInternal = getLiveDataInternal(p0, false, null);
        Intrinsics.checkNotNull(liveDataInternal, "");
        return liveDataInternal;
    }

    public final <T> MutableLiveData<T> getLiveData(String p0, T p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        return getLiveDataInternal(p0, true, p1);
    }

    private final <T> MutableLiveData<T> getLiveDataInternal(String p0, boolean p1, T p2) {
        SavingStateLiveData<?> savingStateLiveData;
        if (this.impl.getMutableFlows().containsKey(p0)) {
            throw new IllegalArgumentException(SavedStateHandle_androidKt.createMutuallyExclusiveErrorMessage(p0).toString());
        }
        Map<String, SavingStateLiveData<?>> map = this.liveDatas;
        SavingStateLiveData<?> savingStateLiveData2 = map.get(p0);
        if (savingStateLiveData2 == null) {
            if (this.impl.getRegular().containsKey(p0)) {
                savingStateLiveData = new SavingStateLiveData<>(this, p0, this.impl.getRegular().get(p0));
            } else if (p1) {
                this.impl.getRegular().put(p0, p2);
                savingStateLiveData = new SavingStateLiveData<>(this, p0, p2);
            } else {
                savingStateLiveData = new SavingStateLiveData<>(this, p0);
            }
            savingStateLiveData2 = savingStateLiveData;
            map.put(p0, savingStateLiveData2);
        }
        return savingStateLiveData2;
    }

    public final <T> stopMediaCodec<T> getStateFlow(String p0, T p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (!this.impl.getMutableFlows().containsKey(p0)) {
            return this.impl.getStateFlow(p0, p1);
        }
        return new lambdasignalSourceStopped7androidxcameravideointernalencoderEncoderImpl(this.impl.getMutableStateFlow(p0, p1), null);
    }

    public final <T> lambdastop3androidxcameravideointernalencoderEncoderImpl<T> getMutableStateFlow(String p0, T p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (this.liveDatas.containsKey(p0)) {
            throw new IllegalArgumentException(SavedStateHandle_androidKt.createMutuallyExclusiveErrorMessage(p0).toString());
        }
        return this.impl.getMutableStateFlow(p0, p1);
    }

    public final Set<String> keys() {
        return SetsKt.plus((Set) this.impl.keys(), (Iterable) this.liveDatas.keySet());
    }

    public final <T> T get(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return (T) this.impl.get(p0);
    }

    public final <T> void set(String p0, T p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (!INSTANCE.validateValue(p1)) {
            StringBuilder sb = new StringBuilder("Can't put value with type ");
            Intrinsics.checkNotNull(p1);
            sb.append(p1.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        SavingStateLiveData<?> savingStateLiveData = this.liveDatas.get(p0);
        SavingStateLiveData<?> savingStateLiveData2 = savingStateLiveData instanceof MutableLiveData ? savingStateLiveData : null;
        if (savingStateLiveData2 != null) {
            savingStateLiveData2.setValue(p1);
        }
        this.impl.set(p0, p1);
    }

    public final <T> T remove(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        T t = (T) this.impl.remove(p0);
        SavingStateLiveData<?> savingStateLiveDataRemove = this.liveDatas.remove(p0);
        if (savingStateLiveDataRemove != null) {
            savingStateLiveDataRemove.detach();
        }
        return t;
    }

    public final void setSavedStateProvider(String p0, SavedStateRegistry.SavedStateProvider p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        this.impl.setSavedStateProvider(p0, p1);
    }

    public final void clearSavedStateProvider(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.impl.clearSavedStateProvider(p0);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/lifecycle/SavedStateHandle$SavingStateLiveData;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/SavedStateHandle;", "p0", "", "p1", "p2", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;)V", "(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;)V", "", "setValue", "(Ljava/lang/Object;)V", "detach", "()V", "key", "Ljava/lang/String;", "handle", "Landroidx/lifecycle/SavedStateHandle;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SavingStateLiveData<T> extends MutableLiveData<T> {
        private SavedStateHandle handle;
        private String key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavingStateLiveData(SavedStateHandle savedStateHandle, String str, T t) {
            super(t);
            Intrinsics.checkNotNullParameter(str, "");
            this.key = str;
            this.handle = savedStateHandle;
        }

        public SavingStateLiveData(SavedStateHandle savedStateHandle, String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.key = str;
            this.handle = savedStateHandle;
        }

        @Override // androidx.p002lifecycle.MutableLiveData, androidx.p002lifecycle.LiveData
        public final void setValue(T p0) {
            SavedStateHandleImpl savedStateHandleImpl;
            SavedStateHandle savedStateHandle = this.handle;
            if (savedStateHandle != null && (savedStateHandleImpl = savedStateHandle.impl) != null) {
                savedStateHandleImpl.set(this.key, p0);
            }
            super.setValue(p0);
        }

        public final void detach() {
            this.handle = null;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\t\u001a\u00020\b2\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00052\u000e\u0010\u0007\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroidx/lifecycle/SavedStateHandle$Companion;", "", "<init>", "()V", "Landroid/os/Bundle;", "Landroidx/savedstate/b;", "p0", "p1", "Landroidx/lifecycle/SavedStateHandle;", "createHandle", "(Landroid/os/Bundle;Landroid/os/Bundle;)Landroidx/lifecycle/SavedStateHandle;", "", "validateValue", "(Ljava/lang/Object;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public final SavedStateHandle createHandle(Bundle p0, Bundle p1) {
            if (p0 == null) {
                p0 = p1;
            }
            if (p0 == null) {
                return new SavedStateHandle();
            }
            ClassLoader classLoader = SavedStateHandle.class.getClassLoader();
            Intrinsics.checkNotNull(classLoader);
            p0.setClassLoader(classLoader);
            return new SavedStateHandle(SavedStateReader.m7449toMapimpl(SavedStateReader.m7368constructorimpl(p0)));
        }

        public final boolean validateValue(Object p0) {
            return SavedStateHandleImpl_androidKt.isAcceptableType(p0);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @JvmStatic
    public static final SavedStateHandle createHandle(Bundle bundle, Bundle bundle2) {
        return INSTANCE.createHandle(bundle, bundle2);
    }
}
