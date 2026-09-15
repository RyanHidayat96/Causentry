package androidx.compose.ui.autofill;

import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsProperties;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0003\"\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsConfiguration;", "", "isAutofillable", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;)Z", "isRelatedToAutoCommit", "isRelatedToAutofill", "", "logTag", "Ljava/lang/String;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AndroidAutofillManager_androidKt {
    private static final String logTag = "ComposeAutofillManager";

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isAutofillable(SemanticsConfiguration semanticsConfiguration) {
        return semanticsConfiguration.getProps$ui_release().contains(SemanticsActions.INSTANCE.getOnAutofillText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isRelatedToAutoCommit(SemanticsConfiguration semanticsConfiguration) {
        return semanticsConfiguration.getProps$ui_release().contains(SemanticsProperties.INSTANCE.getContentType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isRelatedToAutofill(SemanticsConfiguration semanticsConfiguration) {
        return semanticsConfiguration.getProps$ui_release().contains(SemanticsActions.INSTANCE.getOnAutofillText()) || semanticsConfiguration.getProps$ui_release().contains(SemanticsProperties.INSTANCE.getContentType()) || semanticsConfiguration.getProps$ui_release().contains(SemanticsProperties.INSTANCE.getContentDataType());
    }
}
