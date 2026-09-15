package defpackage;

import coil.disk.DiskLruCache$launchCleanup$1;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000u\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015*\u0001$\b\u0000\u0018\u0000 F2\u00060\u0002j\u0002`\u00012\u00020\u0003:\u0004CDEFB7\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010&\u001a\u00020'J\b\u0010(\u001a\u00020'H\u0002J\b\u0010)\u001a\u00020\u001dH\u0002J\u0010\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020\u0016H\u0002J\b\u0010,\u001a\u00020'H\u0002J\b\u0010-\u001a\u00020'H\u0002J\u0017\u0010.\u001a\b\u0018\u00010/R\u00020\u00002\u0006\u00100\u001a\u00020\u0016H\u0086\u0002J\u0014\u00101\u001a\b\u0018\u000102R\u00020\u00002\u0006\u00100\u001a\u00020\u0016J\u0006\u0010\u001a\u001a\u00020\u000bJ\u001c\u00103\u001a\u00020'2\n\u00104\u001a\u000602R\u00020\u00002\u0006\u00105\u001a\u00020\u001fH\u0002J\b\u00106\u001a\u00020\u001fH\u0002J\u000e\u00107\u001a\u00020\u001f2\u0006\u00100\u001a\u00020\u0016J\u0014\u00108\u001a\u00020\u001f2\n\u00109\u001a\u00060\u0017R\u00020\u0000H\u0002J\b\u0010:\u001a\u00020'H\u0002J\b\u0010;\u001a\u00020'H\u0016J\b\u0010<\u001a\u00020'H\u0016J\b\u0010=\u001a\u00020'H\u0002J\b\u0010>\u001a\u00020\u001fH\u0002J\b\u0010?\u001a\u00020'H\u0002J\u0006\u0010@\u001a\u00020'J\b\u0010A\u001a\u00020'H\u0002J\u0010\u0010B\u001a\u00020'2\u0006\u00100\u001a\u00020\u0016H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0016\u0012\b\u0012\u00060\u0017R\u00020\u00000\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020$X\u0082\u0004¢\u0006\u0004\n\u0002\u0010%¨\u0006G"}, d2 = {"Lcoil/disk/DiskLruCache;", "Lokio/Closeable;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "fileSystem", "Lokio/FileSystem;", "directory", "Lokio/Path;", "cleanupDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "maxSize", "", RemoteConfigConstants.RequestFieldKey.APP_VERSION, "", "valueCount", "<init>", "(Lokio/FileSystem;Lokio/Path;Lkotlinx/coroutines/CoroutineDispatcher;JII)V", "journalFile", "journalFileTmp", "journalFileBackup", "lruEntries", "Ljava/util/LinkedHashMap;", "", "Lcoil/disk/DiskLruCache$Entry;", "cleanupScope", "Lkotlinx/coroutines/CoroutineScope;", "size", "operationsSinceRewrite", "journalWriter", "Lokio/BufferedSink;", "hasJournalErrors", "", "initialized", "closed", "mostRecentTrimFailed", "mostRecentRebuildFailed", "coil/disk/DiskLruCache$fileSystem$1", "Lcoil/disk/DiskLruCache$fileSystem$1;", "initialize", "", "readJournal", "newJournalWriter", "readJournalLine", "line", "processJournal", "writeJournal", "get", "Lcoil/disk/DiskLruCache$Snapshot;", "key", "edit", "Lcoil/disk/DiskLruCache$Editor;", "completeEdit", "editor", "success", "journalRewriteRequired", "remove", "removeEntry", "entry", "checkNotClosed", "close", "flush", "trimToSize", "removeOldestEntry", "delete", "evictAll", "launchCleanup", "validateKey", "Snapshot", "Editor", "Entry", "Companion", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getIconUri implements Closeable, Flushable {
    public static final TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentbindingInflater1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2(null);
    private static final Regex b = new Regex("[a-z0-9_-]{1,120}");
    private final SurfaceViewImplementationExternalSyntheticLambda1 INotificationSideChannel;
    private boolean INotificationSideChannelDefault;
    private boolean INotificationSideChannelStubProxy;
    private int RemoteActionCompatParcelizer;
    private final CoroutineScope TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SurfaceViewImplementationExternalSyntheticLambda1 f941a;
    private final b asBinder;
    private boolean asInterface;
    private final LinkedHashMap<String, TuitionPaymentFragmentbindingInflater1> cancel;
    private final long cancelAll;
    private final SurfaceViewImplementationExternalSyntheticLambda1 d;
    private boolean g;
    private long getInterfaceDescriptor;
    private RotationProviderListener notify;
    private final SurfaceViewImplementationExternalSyntheticLambda1 onTransact;
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private final int INotificationSideChannelStub = 2;

    public getIconUri(animateToFullOpacity animatetofullopacity, SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1, CoroutineDispatcher coroutineDispatcher, long j) {
        this.d = surfaceViewImplementationExternalSyntheticLambda1;
        this.cancelAll = j;
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        Intrinsics.checkNotNullParameter("journal", "");
        RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
        Intrinsics.checkNotNullParameter("journal", "");
        this.f941a = surfaceChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault2(surfaceViewImplementationExternalSyntheticLambda1, surfaceChanged.TuitionPaymentFragmentbindingInflater1(rotationProviderListenerWrapper.b("journal", 0, 7), false), false);
        Intrinsics.checkNotNullParameter("journal.tmp", "");
        RotationProviderListenerWrapper rotationProviderListenerWrapper2 = new RotationProviderListenerWrapper();
        Intrinsics.checkNotNullParameter("journal.tmp", "");
        this.onTransact = surfaceChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault2(surfaceViewImplementationExternalSyntheticLambda1, surfaceChanged.TuitionPaymentFragmentbindingInflater1(rotationProviderListenerWrapper2.b("journal.tmp", 0, 11), false), false);
        Intrinsics.checkNotNullParameter("journal.bkp", "");
        RotationProviderListenerWrapper rotationProviderListenerWrapper3 = new RotationProviderListenerWrapper();
        Intrinsics.checkNotNullParameter("journal.bkp", "");
        this.INotificationSideChannel = surfaceChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault2(surfaceViewImplementationExternalSyntheticLambda1, surfaceChanged.TuitionPaymentFragmentbindingInflater1(rotationProviderListenerWrapper3.b("journal.bkp", 0, 11), false), false);
        this.cancel = new LinkedHashMap<>(0, 0.75f, true);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = CoroutineScopeKt.CoroutineScope(new getDataSpace(null).plus(coroutineDispatcher.limitedParallelism(1)));
        this.asBinder = new b(animatetofullopacity);
    }

    public static final class b extends ScreenFlashView {
        b(animateToFullOpacity animatetofullopacity) {
            super(animatetofullopacity);
        }

        @Override // defpackage.ScreenFlashView, defpackage.animateToFullOpacity
        public final SurfaceViewImplementationApi24Impl TuitionPaymentFragmentspecialinlinedviewModeldefault3(SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1, boolean z) throws IOException {
            SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1 = surfaceViewImplementationExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1();
            if (surfaceViewImplementationExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1 != null) {
                Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1, "");
                Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1, "");
                surfaceDestroyed.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this, surfaceViewImplementationExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1, false);
            }
            return super.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceViewImplementationExternalSyntheticLambda1, z);
        }
    }

    private void a() {
        synchronized (this) {
            if (this.asInterface) {
                return;
            }
            b bVar = this.asBinder;
            SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1 = this.onTransact;
            Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda1, "");
            bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2(surfaceViewImplementationExternalSyntheticLambda1, false);
            b bVar2 = this.asBinder;
            SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda2 = this.INotificationSideChannel;
            Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda2, "");
            Intrinsics.checkNotNullParameter(bVar2, "");
            Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda2, "");
            if (bVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceViewImplementationExternalSyntheticLambda2) != null) {
                b bVar3 = this.asBinder;
                SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda3 = this.f941a;
                Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda3, "");
                Intrinsics.checkNotNullParameter(bVar3, "");
                Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda3, "");
                if (bVar3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceViewImplementationExternalSyntheticLambda3) != null) {
                    b bVar4 = this.asBinder;
                    SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda4 = this.INotificationSideChannel;
                    Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda4, "");
                    bVar4.TuitionPaymentFragmentspecialinlinedviewModeldefault2(surfaceViewImplementationExternalSyntheticLambda4, false);
                } else {
                    this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.INotificationSideChannel, this.f941a);
                }
            }
            b bVar5 = this.asBinder;
            SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda5 = this.f941a;
            Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda5, "");
            Intrinsics.checkNotNullParameter(bVar5, "");
            Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda5, "");
            if (bVar5.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceViewImplementationExternalSyntheticLambda5) != null) {
                try {
                    try {
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        this.asInterface = true;
                        return;
                    } catch (IOException unused) {
                        close();
                        getMetadata.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.asBinder, this.d);
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = false;
                        asInterface();
                        this.asInterface = true;
                    }
                } catch (Throwable th) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = false;
                    throw th;
                }
            }
            asInterface();
            this.asInterface = true;
        }
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws Throwable {
        Throwable th;
        String strSubstring;
        RotationProvider1 rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3 = SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.f941a));
        try {
            RotationProvider1 rotationProvider1 = rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String strIconCompatParcelizer = rotationProvider1.IconCompatParcelizer();
            String strIconCompatParcelizer2 = rotationProvider1.IconCompatParcelizer();
            String strIconCompatParcelizer3 = rotationProvider1.IconCompatParcelizer();
            String strIconCompatParcelizer4 = rotationProvider1.IconCompatParcelizer();
            String strIconCompatParcelizer5 = rotationProvider1.IconCompatParcelizer();
            if (!Intrinsics.areEqual("libcore.io.DiskLruCache", strIconCompatParcelizer) || !Intrinsics.areEqual("1", strIconCompatParcelizer2) || !Intrinsics.areEqual(String.valueOf(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1), strIconCompatParcelizer3) || !Intrinsics.areEqual(String.valueOf(this.INotificationSideChannelStub), strIconCompatParcelizer4) || strIconCompatParcelizer5.length() > 0) {
                StringBuilder sb = new StringBuilder("unexpected journal header: [");
                sb.append(strIconCompatParcelizer);
                sb.append(", ");
                sb.append(strIconCompatParcelizer2);
                sb.append(", ");
                sb.append(strIconCompatParcelizer3);
                sb.append(", ");
                sb.append(strIconCompatParcelizer4);
                sb.append(", ");
                sb.append(strIconCompatParcelizer5);
                sb.append(']');
                throw new IOException(sb.toString());
            }
            int i = 0;
            while (true) {
                th = null;
                try {
                    String strIconCompatParcelizer6 = rotationProvider1.IconCompatParcelizer();
                    String str = strIconCompatParcelizer6;
                    int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, ' ', 0, false, 6, (Object) null);
                    if (iIndexOf$default == -1) {
                        throw new IOException("unexpected journal line: ".concat(String.valueOf(strIconCompatParcelizer6)));
                    }
                    int i2 = iIndexOf$default + 1;
                    int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) str, ' ', i2, false, 4, (Object) null);
                    if (iIndexOf$default2 == -1) {
                        strSubstring = strIconCompatParcelizer6.substring(i2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                        if (iIndexOf$default == 6 && StringsKt.startsWith$default(strIconCompatParcelizer6, "REMOVE", false, 2, (Object) null)) {
                            this.cancel.remove(strSubstring);
                        }
                        i++;
                    } else {
                        strSubstring = strIconCompatParcelizer6.substring(i2, iIndexOf$default2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    }
                    LinkedHashMap<String, TuitionPaymentFragmentbindingInflater1> linkedHashMap = this.cancel;
                    TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = linkedHashMap.get(strSubstring);
                    if (tuitionPaymentFragmentbindingInflater1 == null) {
                        tuitionPaymentFragmentbindingInflater1 = new TuitionPaymentFragmentbindingInflater1(strSubstring);
                        linkedHashMap.put(strSubstring, tuitionPaymentFragmentbindingInflater1);
                    }
                    TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater2 = tuitionPaymentFragmentbindingInflater1;
                    if (iIndexOf$default2 != -1 && iIndexOf$default == 5 && StringsKt.startsWith$default(strIconCompatParcelizer6, "CLEAN", false, 2, (Object) null)) {
                        String strSubstring2 = strIconCompatParcelizer6.substring(iIndexOf$default2 + 1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                        List listSplit$default = StringsKt.split$default((CharSequence) strSubstring2, new char[]{' '}, false, 0, 6, (Object) null);
                        tuitionPaymentFragmentbindingInflater2.g();
                        tuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(null);
                        if (listSplit$default.size() != getIconUri.this.INotificationSideChannelStub) {
                            throw new IOException("unexpected journal line: ".concat(String.valueOf(listSplit$default)));
                        }
                        try {
                            int size = listSplit$default.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                tuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentbindingInflater1[i3] = Long.parseLong((String) listSplit$default.get(i3));
                            }
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: ".concat(String.valueOf(listSplit$default)));
                        }
                    } else {
                        if (iIndexOf$default2 == -1 && iIndexOf$default == 5 && StringsKt.startsWith$default(strIconCompatParcelizer6, "DIRTY", false, 2, (Object) null)) {
                            tuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentbindingInflater2));
                        } else if (iIndexOf$default2 != -1 || iIndexOf$default != 4 || !StringsKt.startsWith$default(strIconCompatParcelizer6, "READ", false, 2, (Object) null)) {
                            throw new IOException("unexpected journal line: ".concat(String.valueOf(strIconCompatParcelizer6)));
                        }
                        i++;
                    }
                    i++;
                } catch (EOFException unused2) {
                    this.RemoteActionCompatParcelizer = i - this.cancel.size();
                    if (!rotationProvider1.d()) {
                        asInterface();
                    } else {
                        this.notify = TuitionPaymentFragmentbindingInflater1();
                    }
                    Unit unit = Unit.INSTANCE;
                    try {
                        rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3.close();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            try {
                rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3.close();
            } catch (Throwable th4) {
                ExceptionsKt.addSuppressed(th, th4);
            }
        }
        if (th != null) {
            throw th;
        }
    }

    private final RotationProviderListener TuitionPaymentFragmentbindingInflater1() {
        b bVar = this.asBinder;
        SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1 = this.f941a;
        Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda1, "");
        return SurfaceViewImplementation.TuitionPaymentFragmentbindingInflater1(new getSubtitle(bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1(surfaceViewImplementationExternalSyntheticLambda1, false), new Function1() { // from class: getMediaDescription
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getIconUri.b(this.TuitionPaymentFragmentbindingInflater1);
            }
        }));
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() throws IOException {
        Iterator<TuitionPaymentFragmentbindingInflater1> it = this.cancel.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            TuitionPaymentFragmentbindingInflater1 next = it.next();
            if (next.TuitionPaymentFragmentspecialinlinedviewModeldefault2() == null) {
                int i = this.INotificationSideChannelStub;
                for (int i2 = 0; i2 < i; i2++) {
                    j += next.TuitionPaymentFragmentspecialinlinedviewModeldefault3()[i2];
                }
            } else {
                next.TuitionPaymentFragmentspecialinlinedviewModeldefault3(null);
                int i3 = this.INotificationSideChannelStub;
                for (int i4 = 0; i4 < i3; i4++) {
                    b bVar = this.asBinder;
                    SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1 = next.TuitionPaymentFragmentbindingInflater1().get(i4);
                    Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda1, "");
                    bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2(surfaceViewImplementationExternalSyntheticLambda1, false);
                    b bVar2 = this.asBinder;
                    SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda2 = next.TuitionPaymentFragmentspecialinlinedviewModeldefault1().get(i4);
                    Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda2, "");
                    bVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(surfaceViewImplementationExternalSyntheticLambda2, false);
                }
                it.remove();
            }
        }
        this.getInterfaceDescriptor = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void asInterface() {
        Throwable th;
        synchronized (this) {
            RotationProviderListener rotationProviderListener = this.notify;
            if (rotationProviderListener != null) {
                rotationProviderListener.close();
            }
            RotationProviderListener rotationProviderListenerTuitionPaymentFragmentbindingInflater1 = SurfaceViewImplementation.TuitionPaymentFragmentbindingInflater1(this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.onTransact, false));
            try {
                RotationProviderListener rotationProviderListener2 = rotationProviderListenerTuitionPaymentFragmentbindingInflater1;
                rotationProviderListener2.TuitionPaymentFragmentspecialinlinedviewModeldefault1("libcore.io.DiskLruCache").TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
                rotationProviderListener2.TuitionPaymentFragmentspecialinlinedviewModeldefault1("1").TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
                rotationProviderListener2.a(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
                rotationProviderListener2.a(this.INotificationSideChannelStub).TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
                rotationProviderListener2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
                for (TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 : this.cancel.values()) {
                    if (tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2() != null) {
                        rotationProviderListener2.TuitionPaymentFragmentspecialinlinedviewModeldefault1("DIRTY");
                        rotationProviderListener2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(32);
                        rotationProviderListener2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentbindingInflater1.b());
                        rotationProviderListener2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
                    } else {
                        rotationProviderListener2.TuitionPaymentFragmentspecialinlinedviewModeldefault1("CLEAN");
                        rotationProviderListener2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(32);
                        rotationProviderListener2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentbindingInflater1.b());
                        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(rotationProviderListener2);
                        rotationProviderListener2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
                    }
                }
                Unit unit = Unit.INSTANCE;
                try {
                    rotationProviderListenerTuitionPaymentFragmentbindingInflater1.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    rotationProviderListenerTuitionPaymentFragmentbindingInflater1.close();
                } catch (Throwable th4) {
                    ExceptionsKt.addSuppressed(th3, th4);
                }
                th = th3;
            }
            if (th == null) {
                b bVar = this.asBinder;
                SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1 = this.f941a;
                Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda1, "");
                Intrinsics.checkNotNullParameter(bVar, "");
                Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda1, "");
                if (bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceViewImplementationExternalSyntheticLambda1) != null) {
                    this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.f941a, this.INotificationSideChannel);
                    this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.onTransact, this.f941a);
                    b bVar2 = this.asBinder;
                    SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda2 = this.INotificationSideChannel;
                    Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda2, "");
                    bVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(surfaceViewImplementationExternalSyntheticLambda2, false);
                } else {
                    this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.onTransact, this.f941a);
                }
                this.notify = TuitionPaymentFragmentbindingInflater1();
                this.RemoteActionCompatParcelizer = 0;
                this.g = false;
                this.INotificationSideChannelDefault = false;
            } else {
                throw th;
            }
        }
    }

    public final TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3D;
        synchronized (this) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(str);
            a();
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.cancel.get(str);
            if (tuitionPaymentFragmentbindingInflater1 == null || (tuitionPaymentFragmentspecialinlinedviewModeldefault3D = tuitionPaymentFragmentbindingInflater1.d()) == null) {
                return null;
            }
            this.RemoteActionCompatParcelizer++;
            RotationProviderListener rotationProviderListener = this.notify;
            Intrinsics.checkNotNull(rotationProviderListener);
            rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1("READ");
            rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(32);
            rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str);
            rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
            if (b()) {
                kotlinx.coroutines.b.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, null, null, new DiskLruCache$launchCleanup$1(this, null), 3, null);
            }
            return tuitionPaymentFragmentspecialinlinedviewModeldefault3D;
        }
    }

    public final TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
        synchronized (this) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(str);
            a();
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.cancel.get(str);
            if ((tuitionPaymentFragmentbindingInflater1 != null ? tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2() : null) != null) {
                return null;
            }
            if (tuitionPaymentFragmentbindingInflater1 != null && tuitionPaymentFragmentbindingInflater1.asInterface() != 0) {
                return null;
            }
            if (!this.INotificationSideChannelStubProxy && !this.INotificationSideChannelDefault) {
                RotationProviderListener rotationProviderListener = this.notify;
                Intrinsics.checkNotNull(rotationProviderListener);
                rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1("DIRTY");
                rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(32);
                rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str);
                rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
                rotationProviderListener.flush();
                if (this.g) {
                    return null;
                }
                if (tuitionPaymentFragmentbindingInflater1 == null) {
                    tuitionPaymentFragmentbindingInflater1 = new TuitionPaymentFragmentbindingInflater1(str);
                    this.cancel.put(str, tuitionPaymentFragmentbindingInflater1);
                }
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentbindingInflater1);
                tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(tuitionPaymentFragmentspecialinlinedviewModeldefault1);
                return tuitionPaymentFragmentspecialinlinedviewModeldefault1;
            }
            kotlinx.coroutines.b.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, null, null, new DiskLruCache$launchCleanup$1(this, null), 3, null);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1, boolean z) {
        synchronized (this) {
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            if (!Intrinsics.areEqual(tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), tuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (z && !tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3.a()) {
                int i = this.INotificationSideChannelStub;
                for (int i2 = 0; i2 < i; i2++) {
                    if (tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1()[i2]) {
                        b bVar = this.asBinder;
                        SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1 = tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1().get(i2);
                        Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda1, "");
                        Intrinsics.checkNotNullParameter(bVar, "");
                        Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda1, "");
                        if (bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceViewImplementationExternalSyntheticLambda1) == null) {
                            tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(false);
                            return;
                        }
                    }
                }
                int i3 = this.INotificationSideChannelStub;
                for (int i4 = 0; i4 < i3; i4++) {
                    SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda2 = tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1().get(i4);
                    SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda3 = tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1().get(i4);
                    b bVar2 = this.asBinder;
                    Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda2, "");
                    Intrinsics.checkNotNullParameter(bVar2, "");
                    Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda2, "");
                    if (bVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceViewImplementationExternalSyntheticLambda2) != null) {
                        this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceViewImplementationExternalSyntheticLambda2, surfaceViewImplementationExternalSyntheticLambda3);
                    } else {
                        getMetadata.TuitionPaymentFragmentbindingInflater1(this.asBinder, tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1().get(i4));
                    }
                    long j = tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3()[i4];
                    b bVar3 = this.asBinder;
                    Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda3, "");
                    Long l = surfaceDestroyed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bVar3, surfaceViewImplementationExternalSyntheticLambda3).asInterface;
                    long jLongValue = l != null ? l.longValue() : 0L;
                    tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3()[i4] = jLongValue;
                    this.getInterfaceDescriptor = (this.getInterfaceDescriptor - j) + jLongValue;
                }
            } else {
                int i5 = this.INotificationSideChannelStub;
                for (int i6 = 0; i6 < i5; i6++) {
                    b bVar4 = this.asBinder;
                    SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda4 = tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1().get(i6);
                    Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda4, "");
                    bVar4.TuitionPaymentFragmentspecialinlinedviewModeldefault2(surfaceViewImplementationExternalSyntheticLambda4, false);
                }
            }
            tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(null);
            if (tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3.a()) {
                TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                return;
            }
            this.RemoteActionCompatParcelizer++;
            RotationProviderListener rotationProviderListener = this.notify;
            Intrinsics.checkNotNull(rotationProviderListener);
            if (z || tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3.g();
                rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1("CLEAN");
                rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(32);
                rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3.b());
                tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(rotationProviderListener);
                rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
            } else {
                this.cancel.remove(tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3.b());
                rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1("REMOVE");
                rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(32);
                rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3.b());
                rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
            }
            rotationProviderListener.flush();
            if (this.getInterfaceDescriptor > this.cancelAll || b()) {
                kotlinx.coroutines.b.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, null, null, new DiskLruCache$launchCleanup$1(this, null), 3, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean b() {
        return this.RemoteActionCompatParcelizer >= 2000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean TuitionPaymentFragmentbindingInflater1(TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) throws IOException {
        RotationProviderListener rotationProviderListener;
        if (tuitionPaymentFragmentbindingInflater1.asInterface() > 0 && (rotationProviderListener = this.notify) != null) {
            rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1("DIRTY");
            rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(32);
            rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentbindingInflater1.b());
            rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
            rotationProviderListener.flush();
        }
        if (tuitionPaymentFragmentbindingInflater1.asInterface() <= 0 && tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2() == null) {
            int i = this.INotificationSideChannelStub;
            for (int i2 = 0; i2 < i; i2++) {
                b bVar = this.asBinder;
                SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1().get(i2);
                Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda1, "");
                bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2(surfaceViewImplementationExternalSyntheticLambda1, false);
                this.getInterfaceDescriptor -= tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3()[i2];
                tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3()[i2] = 0;
            }
            this.RemoteActionCompatParcelizer++;
            RotationProviderListener rotationProviderListener2 = this.notify;
            if (rotationProviderListener2 != null) {
                rotationProviderListener2.TuitionPaymentFragmentspecialinlinedviewModeldefault1("REMOVE");
                rotationProviderListener2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(32);
                rotationProviderListener2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentbindingInflater1.b());
                rotationProviderListener2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
            }
            this.cancel.remove(tuitionPaymentFragmentbindingInflater1.b());
            if (b()) {
                kotlinx.coroutines.b.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, null, null, new DiskLruCache$launchCleanup$1(this, null), 3, null);
            }
            return true;
        }
        tuitionPaymentFragmentbindingInflater1.b = true;
        return true;
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (this.asInterface && !this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                for (TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 : (TuitionPaymentFragmentbindingInflater1[]) this.cancel.values().toArray(new TuitionPaymentFragmentbindingInflater1[0])) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    if (tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null && Intrinsics.areEqual(tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                        tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b = true;
                    }
                }
                do {
                    if (this.getInterfaceDescriptor <= this.cancelAll) {
                        this.INotificationSideChannelStubProxy = false;
                        break;
                    }
                } while (asBinder());
                CoroutineScopeKt.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (CancellationException) null);
                RotationProviderListener rotationProviderListener = this.notify;
                Intrinsics.checkNotNull(rotationProviderListener);
                rotationProviderListener.close();
                this.notify = null;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
        }
    }

    @Override // java.io.Flushable
    public final void flush() {
        synchronized (this) {
            if (this.asInterface) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                do {
                    if (this.getInterfaceDescriptor <= this.cancelAll) {
                        this.INotificationSideChannelStubProxy = false;
                        break;
                    }
                } while (asBinder());
                RotationProviderListener rotationProviderListener = this.notify;
                Intrinsics.checkNotNull(rotationProviderListener);
                rotationProviderListener.flush();
            }
        }
    }

    private final boolean asBinder() throws IOException {
        for (TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 : this.cancel.values()) {
            if (!tuitionPaymentFragmentbindingInflater1.a()) {
                TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentbindingInflater1);
                return true;
            }
        }
        return false;
    }

    private static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        if (b.matches(str)) {
            return;
        }
        StringBuilder sb = new StringBuilder("keys must match regex [a-z0-9_-]{1,120}: \"");
        sb.append(str);
        sb.append(Typography.quote);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Closeable {
        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private final TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentbindingInflater1;
        }

        public final SurfaceViewImplementationExternalSyntheticLambda1 TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                throw new IllegalStateException("snapshot is closed".toString());
            }
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1().get(i);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
            getIconUri geticonuri = getIconUri.this;
            synchronized (geticonuri) {
                TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentbindingInflater1.asInterface() - 1);
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface() == 0 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.a()) {
                    geticonuri.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                }
                Unit unit = Unit.INSTANCE;
            }
        }

        public final TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            getIconUri geticonuri = getIconUri.this;
            synchronized (geticonuri) {
                close();
                tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentspecialinlinedviewModeldefault3 = geticonuri.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b());
            }
            return tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
    }

    public final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        private final boolean[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        final TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentbindingInflater1;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new boolean[getIconUri.this.INotificationSideChannelStub];
        }

        public final TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        public final boolean[] TuitionPaymentFragmentbindingInflater1() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        public final SurfaceViewImplementationExternalSyntheticLambda1 TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
            SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1;
            getIconUri geticonuri = getIconUri.this;
            synchronized (geticonuri) {
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    throw new IllegalStateException("editor is closed".toString());
                }
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1[i] = true;
                SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1().get(i);
                getMetadata.TuitionPaymentFragmentbindingInflater1(geticonuri.asBinder, surfaceViewImplementationExternalSyntheticLambda2);
                surfaceViewImplementationExternalSyntheticLambda1 = surfaceViewImplementationExternalSyntheticLambda2;
            }
            return surfaceViewImplementationExternalSyntheticLambda1;
        }

        private void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(true);
        }

        public final TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            getIconUri geticonuri = getIconUri.this;
            synchronized (geticonuri) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault1 = geticonuri.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b());
            }
            return tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean z) {
            getIconUri geticonuri = getIconUri.this;
            synchronized (geticonuri) {
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    throw new IllegalStateException("editor is closed".toString());
                }
                if (Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), this)) {
                    geticonuri.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, z);
                }
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final class TuitionPaymentFragmentbindingInflater1 {
        final long[] TuitionPaymentFragmentbindingInflater1;
        boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private final ArrayList<SurfaceViewImplementationExternalSyntheticLambda1> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private TuitionPaymentFragmentspecialinlinedviewModeldefault1 f942a;
        private final String asInterface;
        boolean b;
        private int d;
        private final ArrayList<SurfaceViewImplementationExternalSyntheticLambda1> g;

        public TuitionPaymentFragmentbindingInflater1(String str) {
            this.asInterface = str;
            this.TuitionPaymentFragmentbindingInflater1 = new long[getIconUri.this.INotificationSideChannelStub];
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new ArrayList<>(getIconUri.this.INotificationSideChannelStub);
            this.g = new ArrayList<>(getIconUri.this.INotificationSideChannelStub);
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            int i = getIconUri.this.INotificationSideChannelStub;
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(i2);
                ArrayList<SurfaceViewImplementationExternalSyntheticLambda1> arrayList = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1 = getIconUri.this.d;
                String string = sb.toString();
                Intrinsics.checkNotNullParameter(string, "");
                RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
                Intrinsics.checkNotNullParameter(string, "");
                arrayList.add(surfaceChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault2(surfaceViewImplementationExternalSyntheticLambda1, surfaceChanged.TuitionPaymentFragmentbindingInflater1(rotationProviderListenerWrapper.b(string, 0, string.length()), false), false));
                sb.append(".tmp");
                ArrayList<SurfaceViewImplementationExternalSyntheticLambda1> arrayList2 = this.g;
                SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda2 = getIconUri.this.d;
                String string2 = sb.toString();
                Intrinsics.checkNotNullParameter(string2, "");
                RotationProviderListenerWrapper rotationProviderListenerWrapper2 = new RotationProviderListenerWrapper();
                Intrinsics.checkNotNullParameter(string2, "");
                arrayList2.add(surfaceChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault2(surfaceViewImplementationExternalSyntheticLambda2, surfaceChanged.TuitionPaymentFragmentbindingInflater1(rotationProviderListenerWrapper2.b(string2, 0, string2.length()), false), false));
                sb.setLength(length);
            }
        }

        public final String b() {
            return this.asInterface;
        }

        public final long[] TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return this.TuitionPaymentFragmentbindingInflater1;
        }

        public final ArrayList<SurfaceViewImplementationExternalSyntheticLambda1> TuitionPaymentFragmentbindingInflater1() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        public final ArrayList<SurfaceViewImplementationExternalSyntheticLambda1> TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return this.g;
        }

        public final void g() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
        }

        public final boolean a() {
            return this.b;
        }

        public final TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.f942a;
        }

        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            this.f942a = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        public final void TuitionPaymentFragmentbindingInflater1(int i) {
            this.d = i;
        }

        public final int asInterface() {
            return this.d;
        }

        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(RotationProviderListener rotationProviderListener) throws IOException {
            for (long j : this.TuitionPaymentFragmentbindingInflater1) {
                rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(32).a(j);
            }
        }

        public final TuitionPaymentFragmentspecialinlinedviewModeldefault3 d() {
            if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 || this.f942a != null || this.b) {
                return null;
            }
            ArrayList<SurfaceViewImplementationExternalSyntheticLambda1> arrayList = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            getIconUri geticonuri = getIconUri.this;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1 = arrayList.get(i);
                b bVar = geticonuri.asBinder;
                Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda1, "");
                Intrinsics.checkNotNullParameter(bVar, "");
                Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda1, "");
                if (bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceViewImplementationExternalSyntheticLambda1) == null) {
                    try {
                        geticonuri.TuitionPaymentFragmentbindingInflater1(this);
                    } catch (IOException unused) {
                    }
                    return null;
                }
            }
            this.d++;
            return getIconUri.this.new TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"LgetIconUri$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Lkotlin/text/Regex;", "b", "Lkotlin/text/Regex;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        private TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        public /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault2(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ Unit b(getIconUri geticonuri) {
        geticonuri.g = true;
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ void asInterface(getIconUri geticonuri) {
        while (geticonuri.getInterfaceDescriptor > geticonuri.cancelAll) {
            if (!geticonuri.asBinder()) {
                return;
            }
        }
        geticonuri.INotificationSideChannelStubProxy = false;
    }
}
