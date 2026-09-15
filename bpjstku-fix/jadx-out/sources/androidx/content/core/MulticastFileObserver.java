package androidx.content.core;

import android.os.FileObserver;
import defpackage.clampVideoBitrateIfNotSupported;
import defpackage.hasStopCodecAfterSurfaceRemovalCrashMediaServerQuirk;
import defpackage.setCompatibleAudioProfile;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR,\u0010\u000e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\b0\fj\u0002`\r0\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/datastore/core/MulticastFileObserver;", "Landroid/os/FileObserver;", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "p1", "", "onEvent", "(ILjava/lang/String;)V", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lkotlin/Function1;", "Landroidx/datastore/core/FileMoveObserver;", "delegates", "Ljava/util/concurrent/CopyOnWriteArrayList;", "path", "Ljava/lang/String;", "getPath", "()Ljava/lang/String;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MulticastFileObserver extends FileObserver {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Object LOCK = new Object();
    private static final Map<String, MulticastFileObserver> fileObservers = new LinkedHashMap();
    private final CopyOnWriteArrayList<Function1<String, Unit>> delegates;
    private final String path;

    public final String getPath() {
        return this.path;
    }

    private MulticastFileObserver(String str) {
        super(str, 128);
        this.path = str;
        this.delegates = new CopyOnWriteArrayList<>();
    }

    @Override // android.os.FileObserver
    public final void onEvent(int p0, String p1) {
        Iterator<T> it = this.delegates.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(p1);
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ1\u0010\b\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\r\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00070\nj\u0002`\fH\u0003¢\u0006\u0004\b\b\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0010\u0010\u0003R\u0014\u0010\u0011\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R,\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00140\u00138\u0001X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u0003\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/datastore/core/MulticastFileObserver$Companion;", "", "<init>", "()V", "Ljava/io/File;", "p0", "LclampVideoBitrateIfNotSupported;", "", "observe", "(Ljava/io/File;)LclampVideoBitrateIfNotSupported;", "Lkotlin/Function1;", "", "Landroidx/datastore/core/FileMoveObserver;", "p1", "LsetCompatibleAudioProfile;", "(Ljava/io/File;Lkotlin/jvm/functions/Function1;)LsetCompatibleAudioProfile;", "removeAllObservers$datastore_core_release", "LOCK", "Ljava/lang/Object;", "", "Landroidx/datastore/core/MulticastFileObserver;", "fileObservers", "Ljava/util/Map;", "getFileObservers$datastore_core_release", "()Ljava/util/Map;", "getFileObservers$datastore_core_release$annotations"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public static /* synthetic */ void getFileObservers$datastore_core_release$annotations() {
        }

        private Companion() {
        }

        public final Map<String, MulticastFileObserver> getFileObservers$datastore_core_release() {
            return MulticastFileObserver.fileObservers;
        }

        public final clampVideoBitrateIfNotSupported<Unit> observe(File p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return new hasStopCodecAfterSurfaceRemovalCrashMediaServerQuirk(new MulticastFileObserver$Companion$observe$1(p0, null), null, 0, null, 14, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final setCompatibleAudioProfile observe(File p0, final Function1<? super String, Unit> p1) {
            final String path = p0.getCanonicalFile().getPath();
            synchronized (MulticastFileObserver.LOCK) {
                Map<String, MulticastFileObserver> fileObservers$datastore_core_release = MulticastFileObserver.INSTANCE.getFileObservers$datastore_core_release();
                Intrinsics.checkNotNullExpressionValue(path, "");
                MulticastFileObserver multicastFileObserver = fileObservers$datastore_core_release.get(path);
                if (multicastFileObserver == null) {
                    multicastFileObserver = new MulticastFileObserver(path, null);
                    fileObservers$datastore_core_release.put(path, multicastFileObserver);
                }
                MulticastFileObserver multicastFileObserver2 = multicastFileObserver;
                multicastFileObserver2.delegates.add(p1);
                if (multicastFileObserver2.delegates.size() == 1) {
                    multicastFileObserver2.startWatching();
                }
                Unit unit = Unit.INSTANCE;
            }
            return new setCompatibleAudioProfile() { // from class: androidx.datastore.core.MulticastFileObserver$Companion$$ExternalSyntheticLambda0
                @Override // defpackage.setCompatibleAudioProfile
                public final void dispose() {
                    MulticastFileObserver.Companion.observe$lambda$4(path, p1);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void observe$lambda$4(String str, Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            synchronized (MulticastFileObserver.LOCK) {
                MulticastFileObserver multicastFileObserver = MulticastFileObserver.INSTANCE.getFileObservers$datastore_core_release().get(str);
                if (multicastFileObserver != null) {
                    multicastFileObserver.delegates.remove(function1);
                    if (multicastFileObserver.delegates.isEmpty()) {
                        MulticastFileObserver.INSTANCE.getFileObservers$datastore_core_release().remove(str);
                        multicastFileObserver.stopWatching();
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
        }

        public final void removeAllObservers$datastore_core_release() {
            synchronized (MulticastFileObserver.LOCK) {
                Iterator<T> it = MulticastFileObserver.INSTANCE.getFileObservers$datastore_core_release().values().iterator();
                while (it.hasNext()) {
                    ((MulticastFileObserver) it.next()).stopWatching();
                }
                MulticastFileObserver.INSTANCE.getFileObservers$datastore_core_release().clear();
                Unit unit = Unit.INSTANCE;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ MulticastFileObserver(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
