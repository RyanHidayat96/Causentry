package androidx.compose.foundation.content.internal;

import androidx.compose.foundation.content.ReceiveContentListener;
import androidx.compose.foundation.content.ReceiveContentNode;
import androidx.compose.foundation.content.TransferableContent;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/foundation/content/internal/DynamicReceiveContentConfiguration;", "Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;", "Landroidx/compose/foundation/content/ReceiveContentNode;", "p0", "<init>", "(Landroidx/compose/foundation/content/ReceiveContentNode;)V", "Landroidx/compose/foundation/content/ReceiveContentListener;", "getParentReceiveContentListener", "()Landroidx/compose/foundation/content/ReceiveContentListener;", "receiveContentListener", "Landroidx/compose/foundation/content/ReceiveContentListener;", "getReceiveContentListener", "receiveContentNode", "Landroidx/compose/foundation/content/ReceiveContentNode;", "getReceiveContentNode", "()Landroidx/compose/foundation/content/ReceiveContentNode;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DynamicReceiveContentConfiguration extends ReceiveContentConfiguration {
    public static final int $stable = 8;
    private final ReceiveContentListener receiveContentListener = new ReceiveContentListener() { // from class: androidx.compose.foundation.content.internal.DynamicReceiveContentConfiguration$receiveContentListener$1
        private int nodeEnterCount;

        @Override // androidx.compose.foundation.content.ReceiveContentListener
        public final void onDragStart() {
            this.nodeEnterCount = 0;
            this.this$0.getReceiveContentNode().getReceiveContentListener().onDragStart();
        }

        @Override // androidx.compose.foundation.content.ReceiveContentListener
        public final void onDragEnd() {
            this.this$0.getReceiveContentNode().getReceiveContentListener().onDragEnd();
            this.nodeEnterCount = 0;
        }

        @Override // androidx.compose.foundation.content.ReceiveContentListener
        public final void onDragEnter() {
            int i = this.nodeEnterCount + 1;
            this.nodeEnterCount = i;
            if (i == 1) {
                this.this$0.getReceiveContentNode().getReceiveContentListener().onDragEnter();
            }
            ReceiveContentListener parentReceiveContentListener = this.this$0.getParentReceiveContentListener();
            if (parentReceiveContentListener != null) {
                parentReceiveContentListener.onDragEnter();
            }
        }

        @Override // androidx.compose.foundation.content.ReceiveContentListener
        public final void onDragExit() {
            int i = this.nodeEnterCount;
            int iCoerceAtLeast = RangesKt.coerceAtLeast(i - 1, 0);
            this.nodeEnterCount = iCoerceAtLeast;
            if (iCoerceAtLeast == 0 && i > 0) {
                this.this$0.getReceiveContentNode().getReceiveContentListener().onDragExit();
            }
            ReceiveContentListener parentReceiveContentListener = this.this$0.getParentReceiveContentListener();
            if (parentReceiveContentListener != null) {
                parentReceiveContentListener.onDragExit();
            }
        }

        @Override // androidx.compose.foundation.content.ReceiveContentListener
        public final TransferableContent onReceive(TransferableContent p0) {
            TransferableContent transferableContentOnReceive = this.this$0.getReceiveContentNode().getReceiveContentListener().onReceive(p0);
            if (transferableContentOnReceive == null) {
                return null;
            }
            ReceiveContentListener parentReceiveContentListener = this.this$0.getParentReceiveContentListener();
            return parentReceiveContentListener == null ? transferableContentOnReceive : parentReceiveContentListener.onReceive(transferableContentOnReceive);
        }
    };
    private final ReceiveContentNode receiveContentNode;

    public final ReceiveContentNode getReceiveContentNode() {
        return this.receiveContentNode;
    }

    public DynamicReceiveContentConfiguration(ReceiveContentNode receiveContentNode) {
        this.receiveContentNode = receiveContentNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReceiveContentListener getParentReceiveContentListener() {
        ReceiveContentConfiguration receiveContentConfiguration = ReceiveContentConfigurationKt.getReceiveContentConfiguration(this.receiveContentNode);
        if (receiveContentConfiguration != null) {
            return receiveContentConfiguration.getReceiveContentListener();
        }
        return null;
    }

    @Override // androidx.compose.foundation.content.internal.ReceiveContentConfiguration
    public final ReceiveContentListener getReceiveContentListener() {
        return this.receiveContentListener;
    }
}
