package androidx.compose.ui.autofill;

import android.os.Build;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import androidx.collection.MutableScatterMap;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.platform.SemanticsUtils_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsInfo;
import androidx.compose.ui.semantics.SemanticsInfoKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.spatial.RectManager;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a5\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroid/view/ViewStructure;", "Landroidx/compose/ui/semantics/SemanticsInfo;", "p0", "Landroid/view/autofill/AutofillId;", "p1", "", "p2", "Landroidx/compose/ui/spatial/RectManager;", "p3", "", "populate", "(Landroid/view/ViewStructure;Landroidx/compose/ui/semantics/SemanticsInfo;Landroid/view/autofill/AutofillId;Ljava/lang/String;Landroidx/compose/ui/spatial/RectManager;)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PopulateViewStructure_androidKt {
    /* JADX WARN: Code duplicated, block: B:99:0x0274  */
    public static final void populate(final ViewStructure viewStructure, SemanticsInfo semanticsInfo, AutofillId autofillId, String str, RectManager rectManager) {
        String str2;
        ToggleableState toggleableState;
        ContentDataType contentDataType;
        ContentType contentType;
        Boolean bool;
        Role role;
        Integer num;
        AnnotatedString annotatedString;
        boolean z;
        boolean z2;
        List list;
        String strM6119toLegacyClassNameV4PA4sw;
        String[] contentHints;
        String[] contentHints2;
        MutableScatterMap<SemanticsPropertyKey<?>, Object> props$ui_release;
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        Object[] objArr2;
        MutableScatterMap<SemanticsPropertyKey<?>, Object> props$ui_release2;
        ToggleableState toggleableState2;
        long[] jArr3;
        String str3;
        long[] jArr4;
        char c;
        final AutofillApi26Helper autofillApi26Helper = AutofillApi26Helper.INSTANCE;
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
        SemanticsConfiguration semanticsConfiguration = semanticsInfo.getSemanticsConfiguration();
        char c2 = 7;
        long j = -9187201950435737472L;
        String str4 = "";
        Integer numValueOf = null;
        if (semanticsConfiguration == null || (props$ui_release2 = semanticsConfiguration.getProps$ui_release()) == null) {
            str2 = "";
            toggleableState = null;
            contentDataType = null;
            contentType = null;
            bool = null;
            role = null;
            num = null;
            annotatedString = null;
            z = false;
            z2 = false;
        } else {
            MutableScatterMap<SemanticsPropertyKey<?>, Object> mutableScatterMap = props$ui_release2;
            Object[] objArr3 = mutableScatterMap.keys;
            Object[] objArr4 = mutableScatterMap.values;
            long[] jArr5 = mutableScatterMap.metadata;
            int length = jArr5.length - 2;
            if (length >= 0) {
                contentDataType = null;
                toggleableState2 = null;
                contentType = null;
                bool = null;
                role = null;
                num = null;
                annotatedString = null;
                int i = 0;
                z = false;
                z2 = false;
                while (true) {
                    long j2 = jArr5[i];
                    String str5 = str4;
                    if ((((~j2) << c2) & j2 & j) != j) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        int i3 = 0;
                        while (i3 < i2) {
                            if ((j2 & 255) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj = objArr3[i4];
                                Object obj2 = objArr4[i4];
                                SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) obj;
                                if (Intrinsics.areEqual(semanticsPropertyKey, semanticsProperties.getContentDataType())) {
                                    str3 = str5;
                                    Intrinsics.checkNotNull(obj2, str3);
                                    contentDataType = (ContentDataType) obj2;
                                } else {
                                    str3 = str5;
                                    jArr4 = jArr5;
                                    if (Intrinsics.areEqual(semanticsPropertyKey, semanticsProperties.getContentDescription())) {
                                        Intrinsics.checkNotNull(obj2, str3);
                                        String str6 = (String) CollectionsKt.firstOrNull((List) obj2);
                                        if (str6 != null) {
                                            autofillApi26Helper.setContentDescription(viewStructure, str6);
                                        }
                                    } else if (Intrinsics.areEqual(semanticsPropertyKey, semanticsProperties.getContentType())) {
                                        Intrinsics.checkNotNull(obj2, str3);
                                        contentType = (ContentType) obj2;
                                    } else if (Intrinsics.areEqual(semanticsPropertyKey, semanticsProperties.getEditableText())) {
                                        Intrinsics.checkNotNull(obj2, str3);
                                        annotatedString = (AnnotatedString) obj2;
                                    } else if (Intrinsics.areEqual(semanticsPropertyKey, semanticsProperties.getFocused())) {
                                        Intrinsics.checkNotNull(obj2, str3);
                                        autofillApi26Helper.setFocused(viewStructure, ((Boolean) obj2).booleanValue());
                                    } else if (Intrinsics.areEqual(semanticsPropertyKey, semanticsProperties.getMaxTextLength())) {
                                        Intrinsics.checkNotNull(obj2, str3);
                                        num = (Integer) obj2;
                                    } else if (Intrinsics.areEqual(semanticsPropertyKey, semanticsProperties.getPassword())) {
                                        c = '\b';
                                        z2 = true;
                                    } else if (Intrinsics.areEqual(semanticsPropertyKey, semanticsProperties.getRole())) {
                                        Intrinsics.checkNotNull(obj2, str3);
                                        role = (Role) obj2;
                                    } else if (Intrinsics.areEqual(semanticsPropertyKey, semanticsProperties.getSelected())) {
                                        Intrinsics.checkNotNull(obj2, str3);
                                        bool = (Boolean) obj2;
                                    } else if (Intrinsics.areEqual(semanticsPropertyKey, semanticsProperties.getToggleableState())) {
                                        Intrinsics.checkNotNull(obj2, str3);
                                        toggleableState2 = (ToggleableState) obj2;
                                    } else if (Intrinsics.areEqual(semanticsPropertyKey, semanticsActions.getOnClick())) {
                                        autofillApi26Helper.setClickable(viewStructure, true);
                                    } else if (Intrinsics.areEqual(semanticsPropertyKey, semanticsActions.getOnLongClick())) {
                                        autofillApi26Helper.setLongClickable(viewStructure, true);
                                    } else if (Intrinsics.areEqual(semanticsPropertyKey, semanticsActions.getRequestFocus())) {
                                        autofillApi26Helper.setFocusable(viewStructure, true);
                                    } else if (Intrinsics.areEqual(semanticsPropertyKey, semanticsActions.getSetText())) {
                                        c = '\b';
                                        z = true;
                                    }
                                    c = '\b';
                                }
                                j2 >>= c;
                                i3++;
                                jArr5 = jArr4;
                                str5 = str3;
                            } else {
                                str3 = str5;
                            }
                            jArr4 = jArr5;
                            c = '\b';
                            j2 >>= c;
                            i3++;
                            jArr5 = jArr4;
                            str5 = str3;
                        }
                        str2 = str5;
                        jArr3 = jArr5;
                        if (i2 != 8) {
                            break;
                        }
                    } else {
                        str2 = str5;
                        jArr3 = jArr5;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                    str4 = str2;
                    jArr5 = jArr3;
                    c2 = 7;
                    j = -9187201950435737472L;
                }
            } else {
                str2 = "";
                contentDataType = null;
                toggleableState2 = null;
                contentType = null;
                bool = null;
                role = null;
                num = null;
                annotatedString = null;
                z = false;
                z2 = false;
            }
            toggleableState = toggleableState2;
        }
        SemanticsConfiguration semanticsConfigurationMergedSemanticsConfiguration = SemanticsInfoKt.mergedSemanticsConfiguration(semanticsInfo);
        if (semanticsConfigurationMergedSemanticsConfiguration == null || (props$ui_release = semanticsConfigurationMergedSemanticsConfiguration.getProps$ui_release()) == null) {
            list = null;
        } else {
            MutableScatterMap<SemanticsPropertyKey<?>, Object> mutableScatterMap2 = props$ui_release;
            Object[] objArr5 = mutableScatterMap2.keys;
            Object[] objArr6 = mutableScatterMap2.values;
            long[] jArr6 = mutableScatterMap2.metadata;
            int length2 = jArr6.length - 2;
            if (length2 >= 0) {
                list = null;
                int i5 = 0;
                while (true) {
                    long j3 = jArr6[i5];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length2)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j3 & 255) < 128) {
                                int i8 = (i5 << 3) + i7;
                                Object obj3 = objArr5[i8];
                                Object obj4 = objArr6[i8];
                                jArr2 = jArr6;
                                SemanticsPropertyKey semanticsPropertyKey2 = (SemanticsPropertyKey) obj3;
                                objArr2 = objArr5;
                                if (Intrinsics.areEqual(semanticsPropertyKey2, semanticsProperties.getDisabled())) {
                                    autofillApi26Helper.setEnabled(viewStructure, false);
                                } else if (Intrinsics.areEqual(semanticsPropertyKey2, semanticsProperties.getText())) {
                                    Intrinsics.checkNotNull(obj4, str2);
                                    list = (List) obj4;
                                }
                            } else {
                                jArr2 = jArr6;
                                objArr2 = objArr5;
                            }
                            j3 >>= 8;
                            i7++;
                            jArr6 = jArr2;
                            objArr5 = objArr2;
                        }
                        jArr = jArr6;
                        objArr = objArr5;
                        if (i6 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr6;
                        objArr = objArr5;
                    }
                    if (i5 == length2) {
                        break;
                    }
                    i5++;
                    jArr6 = jArr;
                    objArr5 = objArr;
                }
            } else {
                list = null;
            }
        }
        Integer numValueOf2 = Integer.valueOf(semanticsInfo.getSemanticsId());
        if (semanticsInfo.getParentInfo() == null) {
            numValueOf2 = null;
        }
        int iIntValue = numValueOf2 != null ? numValueOf2.intValue() : -1;
        autofillApi26Helper.setAutofillId(viewStructure, autofillId, iIntValue);
        String str7 = str2;
        autofillApi26Helper.setId(viewStructure, iIntValue, str, null, null);
        if (contentDataType != null) {
            numValueOf = Integer.valueOf(ContentDataType_androidKt.getDataType(contentDataType));
        } else if (z) {
            numValueOf = 1;
        } else if (toggleableState != null) {
            numValueOf = 2;
        }
        if (numValueOf != null) {
            autofillApi26Helper.setAutofillType(viewStructure, numValueOf.intValue());
        }
        if (contentType != null && (contentHints2 = ContentType_androidKt.getContentHints(contentType)) != null) {
            autofillApi26Helper.setAutofillHints(viewStructure, contentHints2);
        }
        rectManager.getRects().withRect(semanticsInfo.getSemanticsId(), new Function4<Integer, Integer, Integer, Integer, Unit>() { // from class: androidx.compose.ui.autofill.PopulateViewStructure_androidKt.populate.5
            @Override // kotlin.jvm.functions.Function4
            public final /* bridge */ /* synthetic */ Unit invoke(Integer num2, Integer num3, Integer num4, Integer num5) {
                invoke(num2.intValue(), num3.intValue(), num4.intValue(), num5.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i9, int i10, int i11, int i12) {
                autofillApi26Helper.setDimens(viewStructure, i9, i10, 0, 0, i11 - i9, i12 - i10);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }
        });
        if (bool != null) {
            autofillApi26Helper.setSelected(viewStructure, bool.booleanValue());
        }
        if (toggleableState != null) {
            autofillApi26Helper.setCheckable(viewStructure, true);
            autofillApi26Helper.setChecked(viewStructure, toggleableState == ToggleableState.On);
        } else if (bool != null) {
            int iM6151getTabo7Vup1c = Role.INSTANCE.m6151getTabo7Vup1c();
            if (role == null || !Role.m6140equalsimpl0(role.getValue(), iM6151getTabo7Vup1c)) {
                autofillApi26Helper.setCheckable(viewStructure, true);
                autofillApi26Helper.setChecked(viewStructure, bool.booleanValue());
            }
        }
        boolean z3 = z2 || (contentType != null && (contentHints = ContentType_androidKt.getContentHints(contentType)) != null && ArraysKt.contains(contentHints, (String) ArraysKt.first(ContentType_androidKt.getContentHints(ContentType.INSTANCE.getPassword()))));
        if (z3) {
            autofillApi26Helper.setDataIsSensitive(viewStructure, true);
        }
        autofillApi26Helper.setVisibility(viewStructure, semanticsInfo.isTransparent() ? 4 : 0);
        if (list != null) {
            int size = list.size();
            String string = str7;
            for (int i9 = 0; i9 < size; i9++) {
                AnnotatedString annotatedString2 = (AnnotatedString) list.get(i9);
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(annotatedString2.getText());
                sb.append('\n');
                string = sb.toString();
            }
            autofillApi26Helper.setText(viewStructure, string);
            autofillApi26Helper.setClassName(viewStructure, AndroidComposeViewAccessibilityDelegateCompat.TextClassName);
        }
        if (semanticsInfo.getChildrenInfo().isEmpty() && role != null && (strM6119toLegacyClassNameV4PA4sw = SemanticsUtils_androidKt.m6119toLegacyClassNameV4PA4sw(role.getValue())) != null) {
            autofillApi26Helper.setClassName(viewStructure, strM6119toLegacyClassNameV4PA4sw);
        }
        if (z) {
            autofillApi26Helper.setClassName(viewStructure, AndroidComposeViewAccessibilityDelegateCompat.TextFieldClassName);
            if (Build.VERSION.SDK_INT >= 28 && num != null) {
                AutofillApi28Helper.INSTANCE.setMaxTextLength(viewStructure, num.intValue());
            }
            if (annotatedString != null) {
                autofillApi26Helper.setAutofillValue(viewStructure, autofillApi26Helper.getAutofillTextValue(annotatedString.getText()));
            }
            if (z3) {
                autofillApi26Helper.setInputType(viewStructure, 129);
            }
        }
    }
}
