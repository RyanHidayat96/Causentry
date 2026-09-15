package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class TextureViewImplementationExternalSyntheticLambda3 {
    private static final List<TextureViewImplementationExternalSyntheticLambda3> b = new ArrayList();
    onSurfaceTextureUpdated TuitionPaymentFragmentbindingInflater1;
    TextureViewImplementationExternalSyntheticLambda3 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    Object TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    private TextureViewImplementationExternalSyntheticLambda3(Object obj, onSurfaceTextureUpdated onsurfacetextureupdated) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = obj;
        this.TuitionPaymentFragmentbindingInflater1 = onsurfacetextureupdated;
    }

    static TextureViewImplementationExternalSyntheticLambda3 b(onSurfaceTextureUpdated onsurfacetextureupdated, Object obj) {
        List<TextureViewImplementationExternalSyntheticLambda3> list = b;
        synchronized (list) {
            int size = list.size();
            if (size > 0) {
                TextureViewImplementationExternalSyntheticLambda3 textureViewImplementationExternalSyntheticLambda3Remove = list.remove(size - 1);
                textureViewImplementationExternalSyntheticLambda3Remove.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = obj;
                textureViewImplementationExternalSyntheticLambda3Remove.TuitionPaymentFragmentbindingInflater1 = onsurfacetextureupdated;
                textureViewImplementationExternalSyntheticLambda3Remove.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                return textureViewImplementationExternalSyntheticLambda3Remove;
            }
            return new TextureViewImplementationExternalSyntheticLambda3(obj, onsurfacetextureupdated);
        }
    }

    static void TuitionPaymentFragmentbindingInflater1(TextureViewImplementationExternalSyntheticLambda3 textureViewImplementationExternalSyntheticLambda3) {
        textureViewImplementationExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        textureViewImplementationExternalSyntheticLambda3.TuitionPaymentFragmentbindingInflater1 = null;
        textureViewImplementationExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
        List<TextureViewImplementationExternalSyntheticLambda3> list = b;
        synchronized (list) {
            if (list.size() < 10000) {
                list.add(textureViewImplementationExternalSyntheticLambda3);
            }
        }
    }
}
