package defpackage;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00052\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H§\u0002¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u000b\f"}, d2 = {"LPreviewViewStreamState;", "", "<init>", "()V", "", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "p0", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/util/List;)LvideoProfileHdrFormatsToDynamicRangeEncoding;", "TuitionPaymentFragmentbindingInflater1", "b", "LPreviewViewStreamState$TuitionPaymentFragmentbindingInflater1;", "LPreviewViewStreamState$b;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PreviewViewStreamState {
    public abstract videoProfileHdrFormatsToDynamicRangeEncoding<?> TuitionPaymentFragmentspecialinlinedviewModeldefault1(List<? extends videoProfileHdrFormatsToDynamicRangeEncoding<?>> p0);

    private PreviewViewStreamState() {
    }

    public /* synthetic */ PreviewViewStreamState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class TuitionPaymentFragmentbindingInflater1 extends PreviewViewStreamState {
        final videoProfileHdrFormatsToDynamicRangeEncoding<?> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TuitionPaymentFragmentbindingInflater1(videoProfileHdrFormatsToDynamicRangeEncoding<?> videoprofilehdrformatstodynamicrangeencoding) {
            super(null);
            Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = videoprofilehdrformatstodynamicrangeencoding;
        }

        @Override // defpackage.PreviewViewStreamState
        public final videoProfileHdrFormatsToDynamicRangeEncoding<?> TuitionPaymentFragmentspecialinlinedviewModeldefault1(List<? extends videoProfileHdrFormatsToDynamicRangeEncoding<?>> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(((TuitionPaymentFragmentbindingInflater1) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }

        public final int hashCode() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
        }
    }

    public static final class b extends PreviewViewStreamState {
        final Function1<List<? extends videoProfileHdrFormatsToDynamicRangeEncoding<?>>, videoProfileHdrFormatsToDynamicRangeEncoding<?>> TuitionPaymentFragmentbindingInflater1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super List<? extends videoProfileHdrFormatsToDynamicRangeEncoding<?>>, ? extends videoProfileHdrFormatsToDynamicRangeEncoding<?>> function1) {
            super(null);
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentbindingInflater1 = function1;
        }

        @Override // defpackage.PreviewViewStreamState
        public final videoProfileHdrFormatsToDynamicRangeEncoding<?> TuitionPaymentFragmentspecialinlinedviewModeldefault1(List<? extends videoProfileHdrFormatsToDynamicRangeEncoding<?>> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return this.TuitionPaymentFragmentbindingInflater1.invoke(list);
        }
    }
}
