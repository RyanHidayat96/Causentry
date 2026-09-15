package defpackage;

import com.midtrans.sdk.corekit.models.TransactionResponse;

/* JADX INFO: loaded from: classes4.dex */
public final class propagateChildrenTemplate extends filterOutChildSizesThatWillNeverBeSelected<filterOutChildSizesCausingDoubleCropping> {
    public propagateChildrenTemplate() {
    }

    public propagateChildrenTemplate(TransactionResponse transactionResponse) {
        if (transactionResponse != null) {
            this.b = transactionResponse;
        }
    }
}
