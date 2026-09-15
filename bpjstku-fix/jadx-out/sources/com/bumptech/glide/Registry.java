package com.bumptech.glide;

import androidx.core.util.Pools;
import com.bumptech.glide.load.ImageHeaderParser;
import defpackage.Camera;
import defpackage.CameraEffect;
import defpackage.CameraProvider;
import defpackage.CameraStateStateError;
import defpackage.ForwardingImageProxy;
import defpackage.ImageAnalysisAbstractAnalyzer;
import defpackage.ImageAnalysisAnalyzer;
import defpackage.ImageAnalysisExternalSyntheticLambda3;
import defpackage.ImageAnalysisExternalSyntheticLambda4;
import defpackage.ImageAnalysisExternalSyntheticLambda5;
import defpackage.analyze;
import defpackage.createImageReaderProxy;
import defpackage.createString;
import defpackage.createULong;
import defpackage.emptyInstance;
import defpackage.getDeviceSurfaceManagerProvider;
import defpackage.getImageProcessor;
import defpackage.getOutputOption;
import defpackage.getSchedulerHandler;
import defpackage.getSensorToBufferTransform;
import defpackage.getUseCaseConfigFactoryProvider;
import defpackage.setCameraExecutor;
import defpackage.setTargetRotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Registry {
    public final setTargetRotation TuitionPaymentFragmentbindingInflater1;
    public final getImageProcessor TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final getUseCaseConfigFactoryProvider TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final ImageAnalysisExternalSyntheticLambda5 TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final Pools.Pool<List<Throwable>> asBinder;
    private final ImageAnalysisAnalyzer asInterface;
    public final ImageAnalysisExternalSyntheticLambda3 b;
    private final emptyInstance d;
    private final analyze g = new analyze();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ImageAnalysisExternalSyntheticLambda4 f673a = new ImageAnalysisExternalSyntheticLambda4();

    public Registry() {
        Pools.Pool<List<Throwable>> poolTuitionPaymentFragmentspecialinlinedviewModeldefault2 = createImageReaderProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        this.asBinder = poolTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new getUseCaseConfigFactoryProvider(poolTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        this.TuitionPaymentFragmentbindingInflater1 = new setTargetRotation();
        this.asInterface = new ImageAnalysisAnalyzer();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new ImageAnalysisExternalSyntheticLambda5();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new getImageProcessor();
        this.d = new emptyInstance();
        this.b = new ImageAnalysisExternalSyntheticLambda3();
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        ImageAnalysisAnalyzer imageAnalysisAnalyzer = this.asInterface;
        synchronized (imageAnalysisAnalyzer) {
            ArrayList<String> arrayList2 = new ArrayList(imageAnalysisAnalyzer.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            imageAnalysisAnalyzer.TuitionPaymentFragmentspecialinlinedviewModeldefault2.clear();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                imageAnalysisAnalyzer.TuitionPaymentFragmentspecialinlinedviewModeldefault2.add((String) it2.next());
            }
            for (String str : arrayList2) {
                if (!arrayList.contains(str)) {
                    imageAnalysisAnalyzer.TuitionPaymentFragmentspecialinlinedviewModeldefault2.add(str);
                }
            }
        }
    }

    public final <Data> Registry TuitionPaymentFragmentspecialinlinedviewModeldefault1(Class<Data> cls, getSensorToBufferTransform<Data> getsensortobuffertransform) {
        setTargetRotation settargetrotation = this.TuitionPaymentFragmentbindingInflater1;
        synchronized (settargetrotation) {
            settargetrotation.b.add(new setTargetRotation.TuitionPaymentFragmentspecialinlinedviewModeldefault1<>(cls, getsensortobuffertransform));
        }
        return this;
    }

    public final <Data, TResource> Registry TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, Class<Data> cls, Class<TResource> cls2, Camera<Data, TResource> camera) {
        ImageAnalysisAnalyzer imageAnalysisAnalyzer = this.asInterface;
        synchronized (imageAnalysisAnalyzer) {
            imageAnalysisAnalyzer.TuitionPaymentFragmentbindingInflater1(str).add(new ImageAnalysisAnalyzer.TuitionPaymentFragmentspecialinlinedviewModeldefault2<>(cls, cls2, camera));
        }
        return this;
    }

    public final <TResource> Registry TuitionPaymentFragmentspecialinlinedviewModeldefault2(Class<TResource> cls, CameraEffect<TResource> cameraEffect) {
        ImageAnalysisExternalSyntheticLambda5 imageAnalysisExternalSyntheticLambda5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        synchronized (imageAnalysisExternalSyntheticLambda5) {
            imageAnalysisExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1.add(new ImageAnalysisExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2<>(cls, cameraEffect));
        }
        return this;
    }

    public final Registry b(getOutputOption.TuitionPaymentFragmentspecialinlinedviewModeldefault1<?> tuitionPaymentFragmentspecialinlinedviewModeldefault1) {
        getImageProcessor getimageprocessor = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        synchronized (getimageprocessor) {
            getimageprocessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2.put(tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), tuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        return this;
    }

    public final <TResource, Transcode> Registry TuitionPaymentFragmentspecialinlinedviewModeldefault2(Class<TResource> cls, Class<Transcode> cls2, ForwardingImageProxy<TResource, Transcode> forwardingImageProxy) {
        emptyInstance emptyinstance = this.d;
        synchronized (emptyinstance) {
            emptyinstance.TuitionPaymentFragmentbindingInflater1.add(new emptyInstance.TuitionPaymentFragmentspecialinlinedviewModeldefault2<>(cls, cls2, forwardingImageProxy));
        }
        return this;
    }

    public final Registry TuitionPaymentFragmentspecialinlinedviewModeldefault2(ImageHeaderParser imageHeaderParser) {
        ImageAnalysisExternalSyntheticLambda3 imageAnalysisExternalSyntheticLambda3 = this.b;
        synchronized (imageAnalysisExternalSyntheticLambda3) {
            imageAnalysisExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(imageHeaderParser);
        }
        return this;
    }

    public final <Model, Data> Registry TuitionPaymentFragmentbindingInflater1(Class<Model> cls, Class<Data> cls2, getDeviceSurfaceManagerProvider<Model, Data> getdevicesurfacemanagerprovider) {
        getUseCaseConfigFactoryProvider getusecaseconfigfactoryprovider = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        synchronized (getusecaseconfigfactoryprovider) {
            setCameraExecutor setcameraexecutor = getusecaseconfigfactoryprovider.TuitionPaymentFragmentbindingInflater1;
            synchronized (setcameraexecutor) {
                setcameraexecutor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(cls, cls2, getdevicesurfacemanagerprovider, true);
            }
            getusecaseconfigfactoryprovider.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2.clear();
        }
        return this;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final <Data, TResource, Transcode> CameraStateStateError<Data, TResource, Transcode> TuitionPaymentFragmentspecialinlinedviewModeldefault2(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        CameraStateStateError<Data, TResource, Transcode> cameraStateStateErrorTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.f673a.TuitionPaymentFragmentspecialinlinedviewModeldefault3(cls, cls2, cls3);
        if (ImageAnalysisExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault1(cameraStateStateErrorTuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
            return null;
        }
        if (cameraStateStateErrorTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
            return cameraStateStateErrorTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault2(cls, cls2)) {
            for (Class cls5 : this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault3(cls4, cls3)) {
                arrayList.add(new CameraProvider(cls, cls4, cls5, this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(cls, cls4), this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault2(cls4, cls5), this.asBinder));
            }
        }
        CameraStateStateError<Data, TResource, Transcode> cameraStateStateError = !arrayList.isEmpty() ? new CameraStateStateError<>(cls, cls2, cls3, arrayList, this.asBinder) : null;
        ImageAnalysisExternalSyntheticLambda4 imageAnalysisExternalSyntheticLambda4 = this.f673a;
        synchronized (imageAnalysisExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            imageAnalysisExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault1.put(new ImageAnalysisAbstractAnalyzer(cls, cls2, cls3), cameraStateStateError == null ? ImageAnalysisExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : cameraStateStateError);
        }
        return cameraStateStateError;
    }

    public final <Model, TResource, Transcode> List<Class<?>> TuitionPaymentFragmentbindingInflater1(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> listTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3(cls, cls2, cls3);
        if (listTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            listTuitionPaymentFragmentspecialinlinedviewModeldefault3 = new ArrayList<>();
            Iterator<Class<?>> it = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(cls).iterator();
            while (it.hasNext()) {
                for (Class<?> cls4 : this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault2(it.next(), cls2)) {
                    if (!this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault3(cls4, cls3).isEmpty() && !listTuitionPaymentFragmentspecialinlinedviewModeldefault3.contains(cls4)) {
                        listTuitionPaymentFragmentspecialinlinedviewModeldefault3.add(cls4);
                    }
                }
            }
            analyze analyzeVar = this.g;
            List<Class<?>> listUnmodifiableList = Collections.unmodifiableList(listTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            synchronized (analyzeVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                analyzeVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2.put(new ImageAnalysisAbstractAnalyzer(cls, cls2, cls3), listUnmodifiableList);
            }
        }
        return listTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public final <Model> List<getSchedulerHandler<Model, ?>> b(Model model) {
        List listTuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(model.getClass());
        if (listTuitionPaymentFragmentbindingInflater1.isEmpty()) {
            throw new NoModelLoaderAvailableException(model);
        }
        int size = listTuitionPaymentFragmentbindingInflater1.size();
        List<getSchedulerHandler<Model, ?>> listEmptyList = Collections.emptyList();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            getSchedulerHandler<Model, ?> getschedulerhandler = (getSchedulerHandler) listTuitionPaymentFragmentbindingInflater1.get(i);
            if (getschedulerhandler.TuitionPaymentFragmentbindingInflater1(model)) {
                if (z) {
                    listEmptyList = new ArrayList<>(size - i);
                    z = false;
                }
                listEmptyList.add(getschedulerhandler);
            }
        }
        if (listEmptyList.isEmpty()) {
            throw new NoModelLoaderAvailableException(model, (List<getSchedulerHandler<Model, ?>>) listTuitionPaymentFragmentbindingInflater1);
        }
        return listEmptyList;
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(Object obj) {
            StringBuilder sb = new StringBuilder("Failed to find any ModelLoaders registered for model class: ");
            sb.append(obj.getClass());
            super(sb.toString());
        }

        public <M> NoModelLoaderAvailableException(M m, List<getSchedulerHandler<M, ?>> list) {
            StringBuilder sb = new StringBuilder("Found ModelLoaders for model class: ");
            sb.append(list);
            sb.append(", but none that handle this specific model instance: ");
            sb.append(m);
            super(sb.toString());
        }

        public NoModelLoaderAvailableException(Class<?> cls, Class<?> cls2) {
            StringBuilder sb = new StringBuilder("Failed to find any ModelLoaders for model: ");
            sb.append(cls);
            sb.append(" and data: ");
            sb.append(cls2);
            super(sb.toString());
        }
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(Class<?> cls) {
            StringBuilder sb = new StringBuilder("Failed to find result encoder for resource class: ");
            sb.append(cls);
            sb.append(", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
            super(sb.toString());
        }

        public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1() {
            createString.b[0] = createULong.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0];
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(Class<?> cls) {
            super("Failed to find source encoder for data class: ".concat(String.valueOf(cls)));
        }
    }

    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(String str) {
            super(str);
        }
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }
}
