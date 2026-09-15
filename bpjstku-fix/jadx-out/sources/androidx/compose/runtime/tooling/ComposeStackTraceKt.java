package androidx.compose.runtime.tooling;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a'\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\u0001¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\r\u001a\u00020\f*\u00060\nj\u0002`\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0012\u001a\u00020\u00058\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/tooling/ComposeStackTraceFrame;", "p0", "", "tryAttachComposeStackTrace", "(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)Z", "attachComposeStackTrace", "(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)Ljava/lang/Throwable;", "Ljava/lang/StringBuilder;", "Lkotlin/text/TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "appendStackTrace", "(Ljava/lang/StringBuilder;Ljava/util/List;)V", "", "RuntimePackageHash", "Ljava/lang/String;", "IncludeDebugInfo", "Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ComposeStackTraceKt {
    private static final boolean IncludeDebugInfo = false;
    private static final String RuntimePackageHash = "9igjgp";

    public static final boolean tryAttachComposeStackTrace(Throwable th, Function0<? extends List<ComposeStackTraceFrame>> function0) {
        DiagnosticComposeException diagnosticComposeException;
        List<Throwable> suppressedExceptions = ExceptionsKt.getSuppressedExceptions(th);
        boolean z = false;
        if (!(suppressedExceptions instanceof Collection) || !suppressedExceptions.isEmpty()) {
            Iterator<T> it = suppressedExceptions.iterator();
            while (it.hasNext()) {
                if (((Throwable) it.next()) instanceof DiagnosticComposeException) {
                    return false;
                }
            }
        }
        try {
            List<ComposeStackTraceFrame> listInvoke = function0.invoke();
            boolean zIsEmpty = listInvoke.isEmpty();
            z = !zIsEmpty;
            diagnosticComposeException = !zIsEmpty ? new DiagnosticComposeException(listInvoke) : null;
        } catch (Throwable th2) {
            diagnosticComposeException = th2;
        }
        if (diagnosticComposeException != null) {
            ExceptionsKt.addSuppressed(th, diagnosticComposeException);
        }
        return z;
    }

    public static final Throwable attachComposeStackTrace(Throwable th, Function0<? extends List<ComposeStackTraceFrame>> function0) {
        tryAttachComposeStackTrace(th, function0);
        return th;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0039 A[PHI: r10
  0x0039: PHI (r10v1 java.lang.String) = (r10v0 java.lang.String), (r10v8 java.lang.String) binds: [B:6:0x0026, B:11:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void appendStackTrace(StringBuilder sb, List<ComposeStackTraceFrame> list) {
        String strValueOf;
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        List listAsReversed = CollectionsKt.asReversed(list);
        int size = listAsReversed.size();
        String str = null;
        String str2 = null;
        for (int i = 0; i < size; i++) {
            ComposeStackTraceFrame composeStackTraceFrame = (ComposeStackTraceFrame) listAsReversed.get(i);
            SourceInformation sourceInfo = composeStackTraceFrame.getSourceInfo();
            String functionName = sourceInfo.getFunctionName();
            if (functionName != null) {
                str = functionName;
            } else {
                functionName = sourceInfo.getIsCall() ? "<lambda>" : null;
                if (functionName != null) {
                    str = functionName;
                } else if (str == null) {
                    str = "<unknown function>";
                }
            }
            String sourceFile = sourceInfo.getSourceFile();
            if (sourceFile != null) {
                str2 = sourceFile;
            } else if (str2 == null) {
                str2 = "<unknown file>";
            }
            List<LocationSourceInformation> locations = sourceInfo.getLocations();
            if (composeStackTraceFrame.getGroupOffset() != null && composeStackTraceFrame.getGroupOffset().intValue() < locations.size()) {
                strValueOf = String.valueOf(locations.get(composeStackTraceFrame.getGroupOffset().intValue()).getLineNumber());
            } else {
                strValueOf = "<unknown line>";
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append('(');
            sb2.append(str2);
            sb2.append(':');
            sb2.append(strValueOf);
            sb2.append(')');
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            if (!sourceInfo.getIsCall()) {
            }
            if (!Intrinsics.areEqual(sourceInfo.getFunctionName(), "rememberCompositionContext") || !Intrinsics.areEqual(sourceInfo.getPackageHash(), RuntimePackageHash)) {
                listCreateListBuilder.add(string);
            }
        }
        List listAsReversed2 = CollectionsKt.asReversed(CollectionsKt.build(listCreateListBuilder));
        int size2 = listAsReversed2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            sb.append("\tat ".concat(String.valueOf((String) listAsReversed2.get(i2))));
            Intrinsics.checkNotNullExpressionValue(sb, "");
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "");
        }
    }
}
