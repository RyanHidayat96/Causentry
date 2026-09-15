package defpackage;

import defpackage.SurfaceViewImplementationExternalSyntheticLambda1;
import defpackage.animateToFullOpacity;
import defpackage.notifySurfaceNotInUse;
import defpackage.r8lambdahCN9BxMaL9aaLZJ1MXUKgX6Yonw;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B#\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u00132\u0006\u0010\u0003\u001a\u00020\tH\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0003\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u0017J\u0017\u0010\u0010\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\tH\u0017¢\u0006\u0004\b\u0010\u0010\u0019J'\u0010\u0010\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0010\u0010\u001aJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0012\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\tH\u0017¢\u0006\u0004\b\u0012\u0010\u001cR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001dR'\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\u001e0\u00138CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0012\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\""}, d2 = {"LnotifySurfaceNotInUse;", "LanimateToFullOpacity;", "Ljava/lang/ClassLoader;", "p0", "", "p1", "p2", "<init>", "(Ljava/lang/ClassLoader;ZLanimateToFullOpacity;)V", "LSurfaceViewImplementationExternalSyntheticLambda1;", "LSurfaceViewImplementationApi24Impl;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(LSurfaceViewImplementationExternalSyntheticLambda1;Z)LSurfaceViewImplementationApi24Impl;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(LSurfaceViewImplementationExternalSyntheticLambda1;LSurfaceViewImplementationExternalSyntheticLambda1;)V", "TuitionPaymentFragmentbindingInflater1", "(LSurfaceViewImplementationExternalSyntheticLambda1;Z)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "", "b", "(LSurfaceViewImplementationExternalSyntheticLambda1;)Ljava/util/List;", "LlambdaonRotationChanged0androidxcameraviewRotationProviderListenerWrapper;", "(LSurfaceViewImplementationExternalSyntheticLambda1;)LlambdaonRotationChanged0androidxcameraviewRotationProviderListenerWrapper;", "LorientationToSurfaceRotation;", "(LSurfaceViewImplementationExternalSyntheticLambda1;)LorientationToSurfaceRotation;", "(LSurfaceViewImplementationExternalSyntheticLambda1;ZZ)LorientationToSurfaceRotation;", "LtryToComplete;", "(LSurfaceViewImplementationExternalSyntheticLambda1;)LtryToComplete;", "Ljava/lang/ClassLoader;", "Lkotlin/Pair;", "asInterface", "Lkotlin/Lazy;", "g", "LanimateToFullOpacity;"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class notifySurfaceNotInUse extends animateToFullOpacity {
    private static final SurfaceViewImplementationExternalSyntheticLambda1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2(null);

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ClassLoader TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final animateToFullOpacity TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public /* synthetic */ notifySurfaceNotInUse(ClassLoader classLoader, boolean z, animateToFullOpacity animatetofullopacity, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(classLoader, z, (i & 4) != 0 ? animateToFullOpacity.TuitionPaymentFragmentbindingInflater1 : animatetofullopacity);
    }

    private notifySurfaceNotInUse(ClassLoader classLoader, boolean z, animateToFullOpacity animatetofullopacity) {
        Intrinsics.checkNotNullParameter(classLoader, "");
        Intrinsics.checkNotNullParameter(animatetofullopacity, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = classLoader;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = animatetofullopacity;
        Lazy lazy = LazyKt.lazy(new Function0<List<? extends Pair<? extends animateToFullOpacity, ? extends SurfaceViewImplementationExternalSyntheticLambda1>>>() { // from class: okio.internal.ResourceFileSystem$roots$2
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final List<Pair<animateToFullOpacity, SurfaceViewImplementationExternalSyntheticLambda1>> invoke() {
                notifySurfaceNotInUse notifysurfacenotinuse = this.this$0;
                return notifySurfaceNotInUse.b(notifysurfacenotinuse, notifysurfacenotinuse.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }

            {
                super(0);
            }
        });
        this.b = lazy;
        if (z) {
            ((List) lazy.getValue()).size();
        }
    }

    @Override // defpackage.animateToFullOpacity
    public final orientationToSurfaceRotation TuitionPaymentFragmentbindingInflater1(SurfaceViewImplementationExternalSyntheticLambda1 p0) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(p0, "");
        if (!TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(p0)) {
            throw new FileNotFoundException("file not found: ".concat(String.valueOf(p0)));
        }
        SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Intrinsics.checkNotNullParameter(p0, "");
        String string = surfaceChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault2(surfaceViewImplementationExternalSyntheticLambda1, p0, true).b(surfaceViewImplementationExternalSyntheticLambda1).toString();
        for (Pair pair : (List) this.b.getValue()) {
            try {
                return ((animateToFullOpacity) pair.component1()).TuitionPaymentFragmentbindingInflater1(((SurfaceViewImplementationExternalSyntheticLambda1) pair.component2()).b(string));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: ".concat(String.valueOf(p0)));
    }

    @Override // defpackage.animateToFullOpacity
    public final orientationToSurfaceRotation TuitionPaymentFragmentbindingInflater1(SurfaceViewImplementationExternalSyntheticLambda1 p0, boolean p1, boolean p2) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        throw new IOException("resources are not writable");
    }

    @Override // defpackage.animateToFullOpacity
    public final lambdaonRotationChanged0androidxcameraviewRotationProviderListenerWrapper TuitionPaymentFragmentspecialinlinedviewModeldefault3(SurfaceViewImplementationExternalSyntheticLambda1 p0) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        if (!TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(p0)) {
            return null;
        }
        SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Intrinsics.checkNotNullParameter(p0, "");
        String string = surfaceChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault2(surfaceViewImplementationExternalSyntheticLambda1, p0, true).b(surfaceViewImplementationExternalSyntheticLambda1).toString();
        for (Pair pair : (List) this.b.getValue()) {
            lambdaonRotationChanged0androidxcameraviewRotationProviderListenerWrapper lambdaonrotationchanged0androidxcameraviewrotationproviderlistenerwrapperTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ((animateToFullOpacity) pair.component1()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(((SurfaceViewImplementationExternalSyntheticLambda1) pair.component2()).b(string));
            if (lambdaonrotationchanged0androidxcameraviewrotationproviderlistenerwrapperTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                return lambdaonrotationchanged0androidxcameraviewrotationproviderlistenerwrapperTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }
        }
        return null;
    }

    @Override // defpackage.animateToFullOpacity
    public final tryToComplete TuitionPaymentFragmentspecialinlinedviewModeldefault2(SurfaceViewImplementationExternalSyntheticLambda1 p0) throws Exception {
        Intrinsics.checkNotNullParameter(p0, "");
        if (!TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(p0)) {
            throw new FileNotFoundException("file not found: ".concat(String.valueOf(p0)));
        }
        SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        URL resource = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getResource(SurfaceViewImplementationExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(surfaceViewImplementationExternalSyntheticLambda1, p0).b(surfaceViewImplementationExternalSyntheticLambda1).toString());
        if (resource == null) {
            throw new FileNotFoundException("file not found: ".concat(String.valueOf(p0)));
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(uRLConnectionOpenConnection);
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(uRLConnectionOpenConnection);
        Intrinsics.checkNotNullExpressionValue(inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault2, "");
        return SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault2(inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    @Override // defpackage.animateToFullOpacity
    public final SurfaceViewImplementationApi24Impl TuitionPaymentFragmentspecialinlinedviewModeldefault3(SurfaceViewImplementationExternalSyntheticLambda1 p0, boolean p1) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(" is read-only");
        throw new IOException(sb.toString());
    }

    @Override // defpackage.animateToFullOpacity
    public final SurfaceViewImplementationApi24Impl TuitionPaymentFragmentspecialinlinedviewModeldefault1(SurfaceViewImplementationExternalSyntheticLambda1 p0, boolean p1) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(" is read-only");
        throw new IOException(sb.toString());
    }

    @Override // defpackage.animateToFullOpacity
    public final void TuitionPaymentFragmentbindingInflater1(SurfaceViewImplementationExternalSyntheticLambda1 p0, boolean p1) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(" is read-only");
        throw new IOException(sb.toString());
    }

    @Override // defpackage.animateToFullOpacity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(SurfaceViewImplementationExternalSyntheticLambda1 p0, SurfaceViewImplementationExternalSyntheticLambda1 p1) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(" is read-only");
        throw new IOException(sb.toString());
    }

    @Override // defpackage.animateToFullOpacity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(SurfaceViewImplementationExternalSyntheticLambda1 p0, boolean p1) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(" is read-only");
        throw new IOException(sb.toString());
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"LnotifySurfaceNotInUse$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "LSurfaceViewImplementationExternalSyntheticLambda1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LSurfaceViewImplementationExternalSyntheticLambda1;", "TuitionPaymentFragmentbindingInflater1", "()LSurfaceViewImplementationExternalSyntheticLambda1;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        private TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        public static SurfaceViewImplementationExternalSyntheticLambda1 TuitionPaymentFragmentbindingInflater1() {
            return notifySurfaceNotInUse.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        public static final /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1) {
            return !StringsKt.endsWith(surfaceViewImplementationExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3().asInterface(), ".class", true);
        }

        public /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault2(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        SurfaceViewImplementationExternalSyntheticLambda1.Companion companion = SurfaceViewImplementationExternalSyntheticLambda1.INSTANCE;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = SurfaceViewImplementationExternalSyntheticLambda1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3("/");
    }

    public static final /* synthetic */ List b(notifySurfaceNotInUse notifysurfacenotinuse, ClassLoader classLoader) throws IOException {
        int iLastIndexOf$default;
        Pair pair;
        Enumeration<URL> resources = classLoader.getResources("");
        Intrinsics.checkNotNullExpressionValue(resources, "");
        ArrayList list = Collections.list(resources);
        Intrinsics.checkNotNullExpressionValue(list, "");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            URL url = (URL) it.next();
            Intrinsics.checkNotNull(url);
            Pair pair2 = Intrinsics.areEqual(url.getProtocol(), "file") ? TuplesKt.to(notifysurfacenotinuse.TuitionPaymentFragmentspecialinlinedviewModeldefault2, SurfaceViewImplementationExternalSyntheticLambda1.Companion.b(SurfaceViewImplementationExternalSyntheticLambda1.INSTANCE, new File(url.toURI()))) : null;
            if (pair2 != null) {
                arrayList.add(pair2);
            }
        }
        ArrayList arrayList2 = arrayList;
        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
        Intrinsics.checkNotNullExpressionValue(resources2, "");
        ArrayList<URL> list2 = Collections.list(resources2);
        Intrinsics.checkNotNullExpressionValue(list2, "");
        ArrayList arrayList3 = new ArrayList();
        for (URL url2 : list2) {
            Intrinsics.checkNotNull(url2);
            String string = url2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            if (StringsKt.startsWith$default(string, "jar:file:", false, 2, (Object) null) && (iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) string, "!", 0, false, 6, (Object) null)) != -1) {
                SurfaceViewImplementationExternalSyntheticLambda1.Companion companion = SurfaceViewImplementationExternalSyntheticLambda1.INSTANCE;
                String strSubstring = string.substring(4, iLastIndexOf$default);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                pair = TuplesKt.to(reattachSurfaceTexture.TuitionPaymentFragmentspecialinlinedviewModeldefault2(SurfaceViewImplementationExternalSyntheticLambda1.Companion.b(companion, new File(URI.create(strSubstring))), notifysurfacenotinuse.TuitionPaymentFragmentspecialinlinedviewModeldefault2, new Function1<r8lambdahCN9BxMaL9aaLZJ1MXUKgX6Yonw, Boolean>() { // from class: okio.internal.ResourceFileSystem$toJarRoot$zip$1
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke(r8lambdahCN9BxMaL9aaLZJ1MXUKgX6Yonw r8lambdahcn9bxmal9aalzj1mxukgx6yonw) {
                        Intrinsics.checkNotNullParameter(r8lambdahcn9bxmal9aalzj1mxukgx6yonw, "");
                        notifySurfaceNotInUse.TuitionPaymentFragmentspecialinlinedviewModeldefault2 unused = notifySurfaceNotInUse.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        return Boolean.valueOf(notifySurfaceNotInUse.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(r8lambdahcn9bxmal9aalzj1mxukgx6yonw.b));
                    }
                }), TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            } else {
                pair = null;
            }
            if (pair != null) {
                arrayList3.add(pair);
            }
        }
        return CollectionsKt.plus((Collection) arrayList2, (Iterable) arrayList3);
    }

    @Override // defpackage.animateToFullOpacity
    public final List<SurfaceViewImplementationExternalSyntheticLambda1> b(SurfaceViewImplementationExternalSyntheticLambda1 p0) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(p0, "");
        SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Intrinsics.checkNotNullParameter(p0, "");
        String string = surfaceChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault2(surfaceViewImplementationExternalSyntheticLambda1, p0, true).b(surfaceViewImplementationExternalSyntheticLambda1).toString();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (Pair pair : (List) this.b.getValue()) {
            animateToFullOpacity animatetofullopacity = (animateToFullOpacity) pair.component1();
            SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda2 = (SurfaceViewImplementationExternalSyntheticLambda1) pair.component2();
            try {
                LinkedHashSet linkedHashSet2 = linkedHashSet;
                List<SurfaceViewImplementationExternalSyntheticLambda1> listB = animatetofullopacity.b(surfaceViewImplementationExternalSyntheticLambda2.b(string));
                ArrayList arrayList = new ArrayList();
                for (Object obj : listB) {
                    if (TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1((SurfaceViewImplementationExternalSyntheticLambda1) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList<SurfaceViewImplementationExternalSyntheticLambda1> arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                for (SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda3 : arrayList2) {
                    Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda3, "");
                    Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda2, "");
                    arrayList3.add(TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1().b(StringsKt.replace$default(StringsKt.removePrefix(surfaceViewImplementationExternalSyntheticLambda3.toString(), (CharSequence) surfaceViewImplementationExternalSyntheticLambda2.toString()), '\\', '/', false, 4, (Object) null)));
                }
                CollectionsKt.addAll(linkedHashSet2, arrayList3);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (!z) {
            throw new FileNotFoundException("file not found: ".concat(String.valueOf(p0)));
        }
        return CollectionsKt.toList(linkedHashSet);
    }
}
