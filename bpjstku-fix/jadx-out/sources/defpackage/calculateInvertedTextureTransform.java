package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.ImageView;
import com.koushikdutta.async.AsyncServer;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
public final class calculateInvertedTextureTransform {
    private static HashMap<String, calculateInvertedTextureTransform> INotificationSideChannelStub;
    private static ExecutorService INotificationSideChannelStubProxy;
    private static Comparator<SurfaceEdgeSettableSurfaceExternalSyntheticLambda0> onTransact;
    SurfaceEdge INotificationSideChannel;
    private AutoValue_DualSurfaceProcessorNode_In IconCompatParcelizer;
    private DualOpenGlRenderer MediaBrowserCompat;
    public lambdaonOutputSurface1androidxcameracoreprocessingSurfaceProcessorWithExecutor TuitionPaymentFragmentbindingInflater1;
    public Context TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f349a;
    public InternalImageProcessor asBinder;
    String asInterface;
    public String cancel;
    private getPrimaryOutConfig connect;
    private lambdaonInputSurface0androidxcameracoreprocessingconcurrentDualSurfaceProcessor disconnect;
    private DualSurfaceProcessor getExtras;
    private getSecondarySurfaceEdge getInterfaceDescriptor;
    private renderInternal getNotifyChildrenChangedOptions;
    private SurfaceEdgeExternalSyntheticLambda5 getRoot;
    String notify;
    private lambdaexecuteSafely7 read;
    private isSuperset write;
    static final Handler TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new Handler(Looper.getMainLooper());
    private static int RemoteActionCompatParcelizer = Runtime.getRuntime().availableProcessors();
    ArrayList<setUpRotationUpdates> d = new ArrayList<>();
    SurfaceEdgeExternalSyntheticLambda6<DefaultSurfaceProcessorExternalSyntheticLambda14<SurfaceProcessorNodeExternalSyntheticLambda2>> b = new SurfaceEdgeExternalSyntheticLambda6<>();
    b TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new b();
    private SurfaceProcessorNode INotificationSideChannelDefault = new SurfaceProcessorNode(this);
    Runnable cancelAll = new Runnable() { // from class: calculateInvertedTextureTransform.3
        @Override // java.lang.Runnable
        public final void run() {
            if (SurfaceOutputImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2(calculateInvertedTextureTransform.this)) {
                return;
            }
            Iterator<String> it = calculateInvertedTextureTransform.this.b.b.keySet().iterator();
            ArrayList<SurfaceEdgeSettableSurfaceExternalSyntheticLambda0> arrayList = null;
            while (it.hasNext()) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = calculateInvertedTextureTransform.this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(it.next());
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 instanceof SurfaceEdgeSettableSurfaceExternalSyntheticLambda0) {
                    SurfaceEdgeSettableSurfaceExternalSyntheticLambda0 surfaceEdgeSettableSurfaceExternalSyntheticLambda0 = (SurfaceEdgeSettableSurfaceExternalSyntheticLambda0) objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(surfaceEdgeSettableSurfaceExternalSyntheticLambda0);
                }
            }
            if (arrayList != null) {
                Collections.sort(arrayList, calculateInvertedTextureTransform.onTransact);
                int i = 0;
                for (SurfaceEdgeSettableSurfaceExternalSyntheticLambda0 surfaceEdgeSettableSurfaceExternalSyntheticLambda1 : arrayList) {
                    calculateInvertedTextureTransform.this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceEdgeSettableSurfaceExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2, null);
                    calculateInvertedTextureTransform.this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceEdgeSettableSurfaceExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1, null);
                    surfaceEdgeSettableSurfaceExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    i++;
                    if (i > 5) {
                        return;
                    }
                }
            }
        }
    };
    WeakHashMap<Object, TuitionPaymentFragmentspecialinlinedviewModeldefault1> g = new WeakHashMap<>();

    static {
        Executors.newFixedThreadPool(4);
        int i = RemoteActionCompatParcelizer;
        INotificationSideChannelStubProxy = i > 2 ? Executors.newFixedThreadPool(i - 1) : Executors.newFixedThreadPool(1);
        INotificationSideChannelStub = new HashMap<>();
        onTransact = new Comparator<SurfaceEdgeSettableSurfaceExternalSyntheticLambda0>() { // from class: calculateInvertedTextureTransform.2
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(SurfaceEdgeSettableSurfaceExternalSyntheticLambda0 surfaceEdgeSettableSurfaceExternalSyntheticLambda0, SurfaceEdgeSettableSurfaceExternalSyntheticLambda0 surfaceEdgeSettableSurfaceExternalSyntheticLambda1) {
                SurfaceEdgeSettableSurfaceExternalSyntheticLambda0 surfaceEdgeSettableSurfaceExternalSyntheticLambda2 = surfaceEdgeSettableSurfaceExternalSyntheticLambda0;
                SurfaceEdgeSettableSurfaceExternalSyntheticLambda0 surfaceEdgeSettableSurfaceExternalSyntheticLambda3 = surfaceEdgeSettableSurfaceExternalSyntheticLambda1;
                if (surfaceEdgeSettableSurfaceExternalSyntheticLambda2.b == surfaceEdgeSettableSurfaceExternalSyntheticLambda3.b) {
                    return 0;
                }
                return surfaceEdgeSettableSurfaceExternalSyntheticLambda2.b < surfaceEdgeSettableSurfaceExternalSyntheticLambda3.b ? 1 : -1;
            }
        };
    }

    public static getHumanReadableName.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3<? extends getHumanReadableName.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3<?>> TuitionPaymentFragmentspecialinlinedviewModeldefault2(ImageView imageView) {
        Context context = imageView.getContext();
        if (context == null) {
            throw new NullPointerException("Can not pass null context in to retrieve ion instance");
        }
        calculateInvertedTextureTransform calculateinvertedtexturetransform = INotificationSideChannelStub.get("ion");
        if (calculateinvertedtexturetransform == null) {
            HashMap<String, calculateInvertedTextureTransform> map = INotificationSideChannelStub;
            calculateInvertedTextureTransform calculateinvertedtexturetransform2 = new calculateInvertedTextureTransform(context, "ion");
            map.put("ion", calculateinvertedtexturetransform2);
            calculateinvertedtexturetransform = calculateinvertedtexturetransform2;
        }
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new IllegalStateException("must be called from UI thread");
        }
        calculateinvertedtexturetransform.INotificationSideChannelDefault.TuitionPaymentFragmentbindingInflater1();
        calculateinvertedtexturetransform.INotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = calculateinvertedtexturetransform;
        return calculateinvertedtexturetransform.INotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault2(imageView);
    }

    private calculateInvertedTextureTransform(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = applicationContext;
        this.cancel = str;
        InternalImageProcessor internalImageProcessor = new InternalImageProcessor(new AsyncServer("ion-".concat(String.valueOf(str))));
        this.asBinder = internalImageProcessor;
        internalImageProcessor.TuitionPaymentFragmentbindingInflater1.b = new SurfaceProcessorNode1();
        InternalImageProcessor internalImageProcessor2 = this.asBinder;
        isSuperset issuperset = new isSuperset(applicationContext, this.asBinder.TuitionPaymentFragmentbindingInflater1);
        this.write = issuperset;
        internalImageProcessor2.b.add(0, issuperset);
        File file = new File(applicationContext.getCacheDir(), str);
        try {
            this.INotificationSideChannel = SurfaceEdge.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.asBinder, file);
        } catch (IOException unused) {
            SurfaceEdgeExternalSyntheticLambda4.TuitionPaymentFragmentbindingInflater1(file);
            try {
                this.INotificationSideChannel = SurfaceEdge.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.asBinder, file);
            } catch (IOException unused2) {
            }
        }
        this.getRoot = new SurfaceEdgeExternalSyntheticLambda5(new File(applicationContext.getFilesDir(), str), Long.MAX_VALUE);
        InternalImageProcessor internalImageProcessor3 = this.asBinder;
        getPrimaryOutConfig getprimaryoutconfig = new getPrimaryOutConfig(this);
        this.connect = getprimaryoutconfig;
        internalImageProcessor3.b.add(0, getprimaryoutconfig);
        this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1 = true;
        this.asBinder.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1 = true;
        this.TuitionPaymentFragmentbindingInflater1 = new lambdaonOutputSurface1androidxcameracoreprocessingSurfaceProcessorWithExecutor(this);
        b bVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        lambdaonInputSurface0androidxcameracoreprocessingconcurrentDualSurfaceProcessor lambdaoninputsurface0androidxcameracoreprocessingconcurrentdualsurfaceprocessor = new lambdaonInputSurface0androidxcameracoreprocessingconcurrentDualSurfaceProcessor();
        this.disconnect = lambdaoninputsurface0androidxcameracoreprocessingconcurrentdualsurfaceprocessor;
        calculateInvertedTextureTransform.this.d.add(lambdaoninputsurface0androidxcameracoreprocessingconcurrentdualsurfaceprocessor);
        renderInternal renderinternal = new renderInternal();
        this.getNotifyChildrenChangedOptions = renderinternal;
        calculateInvertedTextureTransform.this.d.add(renderinternal);
        lambdaexecuteSafely7 lambdaexecutesafely7 = new lambdaexecuteSafely7();
        this.read = lambdaexecutesafely7;
        calculateInvertedTextureTransform.this.d.add(lambdaexecutesafely7);
        DualOpenGlRenderer dualOpenGlRenderer = new DualOpenGlRenderer();
        this.MediaBrowserCompat = dualOpenGlRenderer;
        calculateInvertedTextureTransform.this.d.add(dualOpenGlRenderer);
        DualSurfaceProcessor dualSurfaceProcessor = new DualSurfaceProcessor();
        this.getExtras = dualSurfaceProcessor;
        calculateInvertedTextureTransform.this.d.add(dualSurfaceProcessor);
        getSecondarySurfaceEdge getsecondarysurfaceedge = new getSecondarySurfaceEdge();
        this.getInterfaceDescriptor = getsecondarysurfaceedge;
        calculateInvertedTextureTransform.this.d.add(getsecondarysurfaceedge);
        AutoValue_DualSurfaceProcessorNode_In autoValue_DualSurfaceProcessorNode_In = new AutoValue_DualSurfaceProcessorNode_In();
        this.IconCompatParcelizer = autoValue_DualSurfaceProcessorNode_In;
        calculateInvertedTextureTransform.this.d.add(autoValue_DualSurfaceProcessorNode_In);
    }

    public static ExecutorService TuitionPaymentFragmentbindingInflater1() {
        return INotificationSideChannelStubProxy;
    }

    static class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends WeakHashMap<DefaultSurfaceProcessorExternalSyntheticLambda10, Boolean> {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }
    }

    public class b {
        getSecondaryOutConfig TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new getSecondaryOutConfig() { // from class: calculateInvertedTextureTransform.b.4
            @Override // defpackage.getSecondaryOutConfig
            public final Node TuitionPaymentFragmentbindingInflater1(Uri uri, String str, getOutSurfaceOrThrow getoutsurfaceorthrow) {
                Node node = new Node(uri, str, getoutsurfaceorthrow);
                if (!TextUtils.isEmpty(calculateInvertedTextureTransform.this.notify)) {
                    node.g.b("User-Agent", calculateInvertedTextureTransform.this.notify);
                }
                return node;
            }
        };

        public b() {
        }
    }
}
