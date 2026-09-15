package com.google.firebase.datatransport;

import android.content.Context;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import defpackage.TakePictureManager1;
import defpackage.decrementRetryCounter;
import defpackage.getCaptureFuture;
import defpackage.isInMemoryCapture;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        return Arrays.asList(Component.builder(getCaptureFuture.class).name(LIBRARY_NAME).add(Dependency.required((Class<?>) Context.class)).factory(new ComponentFactory() { // from class: com.google.firebase.datatransport.TransportRegistrar$$ExternalSyntheticLambda0
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return TransportRegistrar.lambda$getComponents$0(componentContainer);
            }
        }).build(), Component.builder(Qualified.qualified(LegacyTransportBackend.class, getCaptureFuture.class)).add(Dependency.required((Class<?>) Context.class)).factory(new ComponentFactory() { // from class: com.google.firebase.datatransport.TransportRegistrar$$ExternalSyntheticLambda1
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return TransportRegistrar.lambda$getComponents$1(componentContainer);
            }
        }).build(), Component.builder(Qualified.qualified(TransportBackend.class, getCaptureFuture.class)).add(Dependency.required((Class<?>) Context.class)).factory(new ComponentFactory() { // from class: com.google.firebase.datatransport.TransportRegistrar$$ExternalSyntheticLambda2
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return TransportRegistrar.lambda$getComponents$2(componentContainer);
            }
        }).build(), LibraryVersionComponent.create(LIBRARY_NAME, "19.0.0"));
    }

    static /* synthetic */ getCaptureFuture lambda$getComponents$0(ComponentContainer componentContainer) {
        TakePictureManager1.TuitionPaymentFragmentbindingInflater1((Context) componentContainer.get(Context.class));
        decrementRetryCounter decrementretrycounter = TakePictureManager1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (decrementretrycounter != null) {
            return decrementretrycounter.TuitionPaymentFragmentspecialinlinedviewModeldefault2().TuitionPaymentFragmentspecialinlinedviewModeldefault2(isInMemoryCapture.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        throw new IllegalStateException("Not initialized!");
    }

    static /* synthetic */ getCaptureFuture lambda$getComponents$1(ComponentContainer componentContainer) {
        TakePictureManager1.TuitionPaymentFragmentbindingInflater1((Context) componentContainer.get(Context.class));
        decrementRetryCounter decrementretrycounter = TakePictureManager1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (decrementretrycounter != null) {
            return decrementretrycounter.TuitionPaymentFragmentspecialinlinedviewModeldefault2().TuitionPaymentFragmentspecialinlinedviewModeldefault2(isInMemoryCapture.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        throw new IllegalStateException("Not initialized!");
    }

    static /* synthetic */ getCaptureFuture lambda$getComponents$2(ComponentContainer componentContainer) {
        TakePictureManager1.TuitionPaymentFragmentbindingInflater1((Context) componentContainer.get(Context.class));
        decrementRetryCounter decrementretrycounter = TakePictureManager1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (decrementretrycounter != null) {
            return decrementretrycounter.TuitionPaymentFragmentspecialinlinedviewModeldefault2().TuitionPaymentFragmentspecialinlinedviewModeldefault2(isInMemoryCapture.TuitionPaymentFragmentbindingInflater1);
        }
        throw new IllegalStateException("Not initialized!");
    }
}
