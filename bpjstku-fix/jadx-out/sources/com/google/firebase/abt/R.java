package com.google.firebase.abt;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import defpackage.SessionProcessor;
import defpackage.initSession;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class R {

    public static final class attr {
        public static final int alpha = 0x7f040035;
        public static final int coordinatorLayoutStyle = 0x7f04016b;
        public static final int font = 0x7f040261;
        public static final int fontProviderAuthority = 0x7f040263;
        public static final int fontProviderCerts = 0x7f040264;
        public static final int fontProviderFetchStrategy = 0x7f040266;
        public static final int fontProviderFetchTimeout = 0x7f040267;
        public static final int fontProviderPackage = 0x7f040268;
        public static final int fontProviderQuery = 0x7f040269;
        public static final int fontStyle = 0x7f04026b;
        public static final int fontVariationSettings = 0x7f04026c;
        public static final int fontWeight = 0x7f04026d;
        public static final int keylines = 0x7f0402e9;
        public static final int layout_anchor = 0x7f0402fa;
        public static final int layout_anchorGravity = 0x7f0402fb;
        public static final int layout_behavior = 0x7f0402fc;
        public static final int layout_dodgeInsetEdges = 0x7f04032d;
        public static final int layout_insetEdge = 0x7f040337;
        public static final int layout_keyline = 0x7f040338;
        public static final int statusBarBackground = 0x7f040515;
        public static final int ttcIndex = 0x7f0405ee;

        private attr() {
        }
    }

    public static final class color {
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0xffffffffd0e85219;
        public static final int notification_action_color_filter = 0x7f060697;
        public static final int notification_icon_bg_color = 0x7f060699;
        public static final int ripple_material_light = 0x7f06082e;
        public static final int secondary_text_default_material_light = 0x7f060833;

        private color() {
        }
    }

    public static final class dimen {
        public static final int compat_button_inset_horizontal_material = 0x7f070066;
        public static final int compat_button_inset_vertical_material = 0x7f070067;
        public static final int compat_button_padding_horizontal_material = 0x7f070068;
        public static final int compat_button_padding_vertical_material = 0x7f070069;
        public static final int compat_control_corner_material = 0x7f07006a;
        public static final int compat_notification_large_icon_max_height = 0x7f07006b;
        public static final int compat_notification_large_icon_max_width = 0x7f07006c;
        public static final int notification_action_icon_size = 0x7f070427;
        public static final int notification_action_text_size = 0x7f070428;
        public static final int notification_big_circle_margin = 0x7f070429;
        public static final int notification_content_margin_start = 0x7f07042a;
        public static final int notification_large_icon_height = 0x7f07042b;
        public static final int notification_large_icon_width = 0x7f07042c;
        public static final int notification_main_column_padding_top = 0x7f07042d;
        public static final int notification_media_narrow_margin = 0x7f07042e;
        public static final int notification_right_icon_size = 0x7f07042f;
        public static final int notification_right_side_padding_top = 0x7f070430;
        public static final int notification_small_icon_background_padding = 0x7f070431;
        public static final int notification_small_icon_size_as_large = 0x7f070432;
        public static final int notification_subtext_size = 0x7f070433;
        public static final int notification_top_pad = 0x7f070434;
        public static final int notification_top_pad_large_text = 0x7f070435;

        private dimen() {
        }
    }

    public static final class drawable {
        public static final int notification_action_background = 0x7f0803a1;
        public static final int notification_bg = 0x7f0803a2;
        public static final int notification_bg_low = 0x7f0803a3;
        public static final int notification_bg_low_normal = 0x7f0803a4;
        public static final int notification_bg_low_pressed = 0x7f0803a5;
        public static final int notification_bg_normal = 0x7f0803a6;
        public static final int notification_bg_normal_pressed = 0x7f0803a7;
        public static final int notification_icon_background = 0x7f0803a8;
        public static final int notification_template_icon_bg = 0x7f0803aa;
        public static final int notification_template_icon_low_bg = 0x7f0803ab;
        public static final int notification_tile_bg = 0x7f0803ac;
        public static final int notify_panel_notification_icon_bg = 0x7f0803ad;

        private drawable() {
        }
    }

    public static final class id {
        public static final int accessibility_action_clickable_span = 0x7f0b001f;
        public static final int accessibility_custom_action_0 = 0x7f0b0020;
        public static final int accessibility_custom_action_1 = 0x7f0b0021;
        public static final int accessibility_custom_action_10 = 0x7f0b0022;
        public static final int accessibility_custom_action_11 = 0x7f0b0023;
        public static final int accessibility_custom_action_12 = 0x7f0b0024;
        public static final int accessibility_custom_action_13 = 0x7f0b0025;
        public static final int accessibility_custom_action_14 = 0x7f0b0026;
        public static final int accessibility_custom_action_15 = 0x7f0b0027;
        public static final int accessibility_custom_action_16 = 0x7f0b0028;
        public static final int accessibility_custom_action_17 = 0x7f0b0029;
        public static final int accessibility_custom_action_18 = 0x7f0b002a;
        public static final int accessibility_custom_action_19 = 0x7f0b002b;
        public static final int accessibility_custom_action_2 = 0x7f0b002c;
        public static final int accessibility_custom_action_20 = 0x7f0b002d;
        public static final int accessibility_custom_action_21 = 0x7f0b002e;
        public static final int accessibility_custom_action_22 = 0x7f0b002f;
        public static final int accessibility_custom_action_23 = 0x7f0b0030;
        public static final int accessibility_custom_action_24 = 0x7f0b0031;
        public static final int accessibility_custom_action_25 = 0x7f0b0032;
        public static final int accessibility_custom_action_26 = 0x7f0b0033;
        public static final int accessibility_custom_action_27 = 0x7f0b0034;
        public static final int accessibility_custom_action_28 = 0x7f0b0035;
        public static final int accessibility_custom_action_29 = 0x7f0b0036;
        public static final int accessibility_custom_action_3 = 0x7f0b0037;
        public static final int accessibility_custom_action_30 = 0x7f0b0038;
        public static final int accessibility_custom_action_31 = 0x7f0b0039;
        public static final int accessibility_custom_action_4 = 0x7f0b003a;
        public static final int accessibility_custom_action_5 = 0x7f0b003b;
        public static final int accessibility_custom_action_6 = 0x7f0b003c;
        public static final int accessibility_custom_action_7 = 0x7f0b003d;
        public static final int accessibility_custom_action_8 = 0x7f0b003e;
        public static final int accessibility_custom_action_9 = 0x7f0b003f;
        public static final int action_container = 0x7f0b0055;
        public static final int action_divider = 0x7f0b0057;
        public static final int action_image = 0x7f0b0058;
        public static final int action_text = 0x7f0b0061;
        public static final int actions = 0x7f0b0062;
        public static final int async = 0x7f0b0091;
        public static final int blocking = 0x7f0b00c4;
        public static final int bottom = 0x7f0b00c7;
        public static final int chronometer = 0x7f0b019c;
        public static final int dialog_button = 0x7f0b0269;
        public static final int end = 0x7f0b0315;
        public static final int forever = 0x7f0b0363;
        public static final int icon = 0x7f0b03f5;
        public static final int icon_group = 0x7f0b03f9;
        public static final int info = 0x7f0b04e7;
        public static final int italic = 0x7f0b04f8;
        public static final int left = 0x7f0b0565;
        public static final int line1 = 0x7f0b056f;
        public static final int line3 = 0x7f0b0571;
        public static final int none = 0x7f0b064a;
        public static final int normal = 0x7f0b064b;
        public static final int notification_background = 0x7f0b064d;
        public static final int notification_main_column = 0x7f0b064e;
        public static final int notification_main_column_container = 0x7f0b064f;
        public static final int right = 0x7f0b0755;
        public static final int right_icon = 0x7f0b0757;
        public static final int right_side = 0x7f0b0758;
        public static final int start = 0x7f0b0828;
        public static final int tag_accessibility_actions = 0x7f0b0848;
        public static final int tag_accessibility_clickable_spans = 0x7f0b0849;
        public static final int tag_accessibility_heading = 0x7f0b084a;
        public static final int tag_accessibility_pane_title = 0x7f0b084b;
        public static final int tag_screen_reader_focusable = 0x7f0b0850;
        public static final int tag_transition_group = 0x7f0b0853;
        public static final int tag_unhandled_key_event_manager = 0x7f0b0854;
        public static final int tag_unhandled_key_listeners = 0x7f0b0855;
        public static final int text = 0x7f0b085e;
        public static final int text2 = 0x7f0b085f;
        public static final int time = 0x7f0b096c;
        public static final int title = 0x7f0b096f;
        public static final int top = 0x7f0b0985;

        private id() {
        }
    }

    public static final class integer {
        public static final int google_play_services_version = 0x7f0c000a;
        public static final int status_bar_notification_info_maxnum = 0x7f0c0048;

        private integer() {
        }
    }

    public static final class raw {
        public static final int firebase_common_keep = 0x7f130003;

        private raw() {
        }
    }

    public static final class string {
        public static final int common_google_play_services_unknown_issue = 0x7f140177;
        public static final int status_bar_notification_info_overflow = 0x7f140ab6;

        private string() {
        }
    }

    public static final class style {
        public static final int TextAppearance_Compat_Notification = 0x7f1502af;
        public static final int TextAppearance_Compat_Notification_Info = 0x7f1502b0;
        public static final int TextAppearance_Compat_Notification_Line2 = 0x7f1502b2;
        public static final int TextAppearance_Compat_Notification_Time = 0x7f1502b5;
        public static final int TextAppearance_Compat_Notification_Title = 0x7f1502b7;
        public static final int Widget_Compat_NotificationActionContainer = 0x7f150439;
        public static final int Widget_Compat_NotificationActionText = 0x7f15043a;
        public static final int Widget_Support_CoordinatorLayout = 0x7f15056f;

        private style() {
        }
    }

    public static final class styleable {
        public static final int ColorStateListItem_alpha = 0x00000003;
        public static final int ColorStateListItem_android_alpha = 0x00000001;
        public static final int ColorStateListItem_android_color = 0x00000000;
        public static final int ColorStateListItem_android_lStar = 0x00000002;
        public static final int ColorStateListItem_lStar = 0x00000004;
        public static final int CoordinatorLayout_Layout_android_layout_gravity = 0x00000000;
        public static final int CoordinatorLayout_Layout_layout_anchor = 0x00000001;
        public static final int CoordinatorLayout_Layout_layout_anchorGravity = 0x00000002;
        public static final int CoordinatorLayout_Layout_layout_behavior = 0x00000003;
        public static final int CoordinatorLayout_Layout_layout_dodgeInsetEdges = 0x00000004;
        public static final int CoordinatorLayout_Layout_layout_insetEdge = 0x00000005;
        public static final int CoordinatorLayout_Layout_layout_keyline = 0x00000006;
        public static final int CoordinatorLayout_keylines = 0x00000000;
        public static final int CoordinatorLayout_statusBarBackground = 0x00000001;
        public static final int FontFamilyFont_android_font = 0x00000000;
        public static final int FontFamilyFont_android_fontStyle = 0x00000002;
        public static final int FontFamilyFont_android_fontVariationSettings = 0x00000004;
        public static final int FontFamilyFont_android_fontWeight = 0x00000001;
        public static final int FontFamilyFont_android_ttcIndex = 0x00000003;
        public static final int FontFamilyFont_font = 0x00000005;
        public static final int FontFamilyFont_fontStyle = 0x00000006;
        public static final int FontFamilyFont_fontVariationSettings = 0x00000007;
        public static final int FontFamilyFont_fontWeight = 0x00000008;
        public static final int FontFamilyFont_ttcIndex = 0x00000009;
        public static final int FontFamily_fontProviderAuthority = 0x00000000;
        public static final int FontFamily_fontProviderCerts = 0x00000001;
        public static final int FontFamily_fontProviderFallbackQuery = 0x00000002;
        public static final int FontFamily_fontProviderFetchStrategy = 0x00000003;
        public static final int FontFamily_fontProviderFetchTimeout = 0x00000004;
        public static final int FontFamily_fontProviderPackage = 0x00000005;
        public static final int FontFamily_fontProviderQuery = 0x00000006;
        public static final int FontFamily_fontProviderSystemFontFamily = 0x00000007;
        public static final int GradientColorItem_android_color = 0x00000000;
        public static final int GradientColorItem_android_offset = 0x00000001;
        public static final int GradientColor_android_centerColor = 0x00000007;
        public static final int GradientColor_android_centerX = 0x00000003;
        public static final int GradientColor_android_centerY = 0x00000004;
        public static final int GradientColor_android_endColor = 0x00000001;
        public static final int GradientColor_android_endX = 0x0000000a;
        public static final int GradientColor_android_endY = 0x0000000b;
        public static final int GradientColor_android_gradientRadius = 0x00000005;
        public static final int GradientColor_android_startColor = 0x00000000;
        public static final int GradientColor_android_startX = 0x00000008;
        public static final int GradientColor_android_startY = 0x00000009;
        public static final int GradientColor_android_tileMode = 0x00000006;
        public static final int GradientColor_android_type = 0x00000002;
        public static final int[] ColorStateListItem = {android.R.attr.color, android.R.attr.alpha, android.R.attr.lStar, com.bpjstku.R.attr.alpha, com.bpjstku.R.attr.lStar};
        public static final int[] CoordinatorLayout = {com.bpjstku.R.attr.keylines, com.bpjstku.R.attr.statusBarBackground};
        public static final int[] CoordinatorLayout_Layout = {android.R.attr.layout_gravity, com.bpjstku.R.attr.layout_anchor, com.bpjstku.R.attr.layout_anchorGravity, com.bpjstku.R.attr.layout_behavior, com.bpjstku.R.attr.layout_dodgeInsetEdges, com.bpjstku.R.attr.layout_insetEdge, com.bpjstku.R.attr.layout_keyline};
        public static final int[] FontFamily = {com.bpjstku.R.attr.fontProviderAuthority, com.bpjstku.R.attr.fontProviderCerts, com.bpjstku.R.attr.fontProviderFallbackQuery, com.bpjstku.R.attr.fontProviderFetchStrategy, com.bpjstku.R.attr.fontProviderFetchTimeout, com.bpjstku.R.attr.fontProviderPackage, com.bpjstku.R.attr.fontProviderQuery, com.bpjstku.R.attr.fontProviderSystemFontFamily};
        public static final int[] FontFamilyFont = {android.R.attr.font, android.R.attr.fontWeight, android.R.attr.fontStyle, android.R.attr.ttcIndex, android.R.attr.fontVariationSettings, com.bpjstku.R.attr.font, com.bpjstku.R.attr.fontStyle, com.bpjstku.R.attr.fontVariationSettings, com.bpjstku.R.attr.fontWeight, com.bpjstku.R.attr.ttcIndex};
        public static final int[] GradientColor = {android.R.attr.startColor, android.R.attr.endColor, android.R.attr.type, android.R.attr.centerX, android.R.attr.centerY, android.R.attr.gradientRadius, android.R.attr.tileMode, android.R.attr.centerColor, android.R.attr.startX, android.R.attr.startY, android.R.attr.endX, android.R.attr.endY};
        public static final int[] GradientColorItem = {android.R.attr.color, android.R.attr.offset};

        private styleable() {
        }
    }

    private R() {
    }

    public static final class layout {
        public static final int custom_dialog = 0x7f0e012b;
        public static final int notification_action = 0x7f0e02c2;
        public static final int notification_action_tombstone = 0x7f0e02c3;
        public static final int notification_template_custom_big = 0x7f0e02ca;
        public static final int notification_template_icon_group = 0x7f0e02cb;
        public static final int notification_template_part_chronometer = 0x7f0e02cf;
        public static final int notification_template_part_time = 0x7f0e02d0;
        private static final byte[] $$c = {14, 70, 6, -35};
        private static final int $$f = 214;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {94, -1, 37, -59};
        private static final int $$e = 134;
        private static final byte[] $$a = {39, 27, 2, 54, 11, -19, 23, 53, -60, 13, -11, 9, 59, -36, -18, -8, 15, 6, -1, 1, 21, -15, 0};
        private static final int $$b = 131;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        private static int asInterface = 1;
        private static long b = -6377398940819159759L;
        private static int TuitionPaymentFragmentbindingInflater1 = -450043410;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 34097;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -83722241;

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(byte r7, short r8, short r9, java.lang.Object[] r10) {
            /*
                int r8 = r8 + 97
                int r7 = r7 * 2
                int r7 = r7 + 1
                byte[] r0 = com.google.firebase.abt.R.layout.$$d
                int r9 = r9 * 2
                int r9 = 3 - r9
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L14
                r3 = r9
                r4 = r2
                goto L2c
            L14:
                r3 = r2
            L15:
                int r9 = r9 + 1
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r7) goto L26
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L26:
                r3 = r0[r9]
                r6 = r9
                r9 = r8
                r8 = r3
                r3 = r6
            L2c:
                int r8 = -r8
                int r8 = r8 + r9
                r9 = r3
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.abt.R.layout.a(byte, short, short, java.lang.Object[]):void");
        }

        private static void e(short s, byte b2, byte b3, Object[] objArr) {
            byte[] bArr = $$a;
            int i = b3 * 11;
            int i2 = b2 + 4;
            int i3 = 115 - (s * 9);
            byte[] bArr2 = new byte[16 - i];
            int i4 = 15 - i;
            int i5 = -1;
            if (bArr == null) {
                i3 = i2 + (-i3) + 2;
                i2 = i2;
                i5 = -1;
            }
            while (true) {
                int i6 = i5 + 1;
                int i7 = i2 + 1;
                bArr2[i6] = (byte) i3;
                if (i6 == i4) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i3 = i3 + (-bArr[i7]) + 2;
                i2 = i7;
                i5 = i6;
            }
        }

        private static void c(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2;
            int i4 = 2 % 2;
            SessionProcessor sessionProcessor = new SessionProcessor();
            int length = cArr2.length;
            char[] cArr4 = new char[length];
            int length2 = cArr.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr2, 0, cArr4, 0, length);
            System.arraycopy(cArr, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr3.length;
            char[] cArr6 = new char[length3];
            sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            int i5 = $10 + 61;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
                int i7 = $10 + 37;
                $11 = i7 % 128;
                int i8 = i7 % i3;
                try {
                    Object[] objArr2 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8329 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 1235 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 34, -653973969, false, $$g((byte) ($$f & 59), b2, b2), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    try {
                        Object[] objArr3 = {sessionProcessor};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b3 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getEdgeSlop() >> 16), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2764, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 14, 1504416861, false, $$g((byte) ($$f & 56), b3, b3), new Class[]{Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        try {
                            Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43324 - MotionEvent.axisFromString("")), 252 - TextUtils.lastIndexOf("", '0', 0), 23 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                            try {
                                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    byte b4 = (byte) 0;
                                    i2 = 2;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 65200), (ViewConfiguration.getJumpTapTimeout() >> 16) + 2891, TextUtils.lastIndexOf("", '0', 0, 0) + 18, 2012627446, false, $$g((byte) 17, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                                } else {
                                    i2 = 2;
                                }
                                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                                cArr4[iIntValue2] = sessionProcessor.b;
                                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (b ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ (-6377398940819159759L)))));
                                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                                i3 = i2;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
            objArr[0] = new String(cArr6);
        }

        private static void d(char[] cArr, boolean z, int i, int i2, int i3, Object[] objArr) throws Throwable {
            int i4 = 2 % 2;
            setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
            char[] cArr2 = new char[i];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i) {
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i2 + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                int i5 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ('0' - AndroidCharacter.getMirror('0')), 3290 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 31 - KeyEvent.getDeadChar(0, 0), 1199271174, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 1;
                        byte b5 = (byte) (b4 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.getCapsMode("", 0, 0), 651 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 44 - TextUtils.getTrimmedLength(""), -450685997, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            if (i3 > 0) {
                int i6 = $10 + 71;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
                char[] cArr3 = new char[i];
                System.arraycopy(cArr2, 0, cArr3, 0, i);
                System.arraycopy(cArr3, 0, cArr2, i - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            }
            if (z) {
                int i8 = $11 + 29;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                char[] cArr4 = new char[i];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                int i10 = $11 + 79;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i) {
                    int i12 = $10 + 61;
                    $11 = i12 % 128;
                    if (i12 % 2 == 0) {
                        cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 * i) << 1];
                        Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 1;
                            byte b7 = (byte) (b6 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 650 - Process.getGidForName(""), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 44, -450685997, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    } else {
                        cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                        Object[] objArr5 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b8 = (byte) 1;
                            byte b9 = (byte) (b8 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 651, 44 - View.getDefaultSize(0, 0), -450685997, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    }
                }
                int i13 = $11 + 65;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }

        private layout() {
        }

        /* JADX WARN: Code duplicated, block: B:137:0x1890  */
        /* JADX WARN: Code duplicated, block: B:140:0x18a3  */
        /* JADX WARN: Code duplicated, block: B:143:0x18ea A[Catch: all -> 0x45b4, TryCatch #11 {all -> 0x45b4, blocks: (B:3:0x000d, B:6:0x0019, B:7:0x004a, B:11:0x015d, B:13:0x016a, B:14:0x01ad, B:23:0x0266, B:25:0x0273, B:26:0x02bc, B:28:0x02f7, B:30:0x0304, B:31:0x034d, B:33:0x0356, B:35:0x036e, B:37:0x03c0, B:70:0x07d6, B:72:0x07e3, B:73:0x0825, B:90:0x1270, B:92:0x127d, B:93:0x12c3, B:96:0x1337, B:98:0x1344, B:99:0x1396, B:107:0x14a4, B:109:0x14b1, B:110:0x14fa, B:116:0x1618, B:118:0x1625, B:119:0x166e, B:121:0x1677, B:123:0x168f, B:124:0x16d9, B:141:0x18dd, B:143:0x18ea, B:144:0x1935, B:160:0x1aab, B:162:0x1ab8, B:163:0x1af4, B:165:0x1bea, B:167:0x1bf7, B:169:0x1c4a, B:183:0x1d98, B:185:0x1da5, B:187:0x1de6, B:189:0x1ec3, B:191:0x1ed0, B:192:0x1f19, B:205:0x2239, B:207:0x2246, B:208:0x228a, B:288:0x2765, B:290:0x2772, B:291:0x27b6, B:307:0x2bf3, B:309:0x2c00, B:310:0x2c4b, B:317:0x2db2, B:319:0x2dd5, B:320:0x2e2c, B:375:0x313b, B:377:0x315e, B:378:0x31b7, B:384:0x32aa, B:386:0x32b0, B:387:0x32ef, B:393:0x33df, B:395:0x33e5, B:396:0x3420, B:403:0x34e3, B:405:0x34e9, B:406:0x3522, B:414:0x36f6, B:416:0x36fc, B:418:0x3742, B:420:0x3820, B:422:0x3826, B:423:0x386e, B:428:0x3975, B:430:0x3982, B:431:0x39be, B:433:0x3ba3, B:435:0x3bb6, B:436:0x3bfe, B:438:0x3cdf, B:440:0x3ce5, B:442:0x3d2c, B:444:0x3e82, B:446:0x3ea6, B:447:0x3eff, B:452:0x3ffc, B:454:0x4009, B:456:0x4055, B:464:0x4127, B:466:0x412d, B:467:0x416b, B:471:0x423f, B:473:0x4245, B:474:0x428d, B:476:0x433e, B:478:0x434b, B:479:0x4395, B:481:0x445e, B:483:0x448a, B:484:0x44e5, B:408:0x35c9, B:410:0x35cf, B:411:0x3614, B:131:0x1791, B:133:0x17a8, B:134:0x17f6, B:78:0x0911, B:80:0x091e, B:81:0x0967, B:44:0x0466, B:46:0x047d, B:47:0x04cd, B:52:0x0582, B:54:0x0599, B:55:0x05e6, B:60:0x06ab, B:62:0x06c2, B:64:0x070f), top: B:523:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:147:0x19d8  */
        /* JADX WARN: Code duplicated, block: B:148:0x19da  */
        /* JADX WARN: Code duplicated, block: B:152:0x1a38  */
        /* JADX WARN: Code duplicated, block: B:200:0x1fdc  */
        /* JADX WARN: Code duplicated, block: B:290:0x2772 A[Catch: all -> 0x45b4, TryCatch #11 {all -> 0x45b4, blocks: (B:3:0x000d, B:6:0x0019, B:7:0x004a, B:11:0x015d, B:13:0x016a, B:14:0x01ad, B:23:0x0266, B:25:0x0273, B:26:0x02bc, B:28:0x02f7, B:30:0x0304, B:31:0x034d, B:33:0x0356, B:35:0x036e, B:37:0x03c0, B:70:0x07d6, B:72:0x07e3, B:73:0x0825, B:90:0x1270, B:92:0x127d, B:93:0x12c3, B:96:0x1337, B:98:0x1344, B:99:0x1396, B:107:0x14a4, B:109:0x14b1, B:110:0x14fa, B:116:0x1618, B:118:0x1625, B:119:0x166e, B:121:0x1677, B:123:0x168f, B:124:0x16d9, B:141:0x18dd, B:143:0x18ea, B:144:0x1935, B:160:0x1aab, B:162:0x1ab8, B:163:0x1af4, B:165:0x1bea, B:167:0x1bf7, B:169:0x1c4a, B:183:0x1d98, B:185:0x1da5, B:187:0x1de6, B:189:0x1ec3, B:191:0x1ed0, B:192:0x1f19, B:205:0x2239, B:207:0x2246, B:208:0x228a, B:288:0x2765, B:290:0x2772, B:291:0x27b6, B:307:0x2bf3, B:309:0x2c00, B:310:0x2c4b, B:317:0x2db2, B:319:0x2dd5, B:320:0x2e2c, B:375:0x313b, B:377:0x315e, B:378:0x31b7, B:384:0x32aa, B:386:0x32b0, B:387:0x32ef, B:393:0x33df, B:395:0x33e5, B:396:0x3420, B:403:0x34e3, B:405:0x34e9, B:406:0x3522, B:414:0x36f6, B:416:0x36fc, B:418:0x3742, B:420:0x3820, B:422:0x3826, B:423:0x386e, B:428:0x3975, B:430:0x3982, B:431:0x39be, B:433:0x3ba3, B:435:0x3bb6, B:436:0x3bfe, B:438:0x3cdf, B:440:0x3ce5, B:442:0x3d2c, B:444:0x3e82, B:446:0x3ea6, B:447:0x3eff, B:452:0x3ffc, B:454:0x4009, B:456:0x4055, B:464:0x4127, B:466:0x412d, B:467:0x416b, B:471:0x423f, B:473:0x4245, B:474:0x428d, B:476:0x433e, B:478:0x434b, B:479:0x4395, B:481:0x445e, B:483:0x448a, B:484:0x44e5, B:408:0x35c9, B:410:0x35cf, B:411:0x3614, B:131:0x1791, B:133:0x17a8, B:134:0x17f6, B:78:0x0911, B:80:0x091e, B:81:0x0967, B:44:0x0466, B:46:0x047d, B:47:0x04cd, B:52:0x0582, B:54:0x0599, B:55:0x05e6, B:60:0x06ab, B:62:0x06c2, B:64:0x070f), top: B:523:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:293:0x27c1  */
        /* JADX WARN: Code duplicated, block: B:295:0x27d8  */
        /* JADX WARN: Code duplicated, block: B:296:0x27e5  */
        /* JADX WARN: Code duplicated, block: B:299:0x2827  */
        /* JADX WARN: Code duplicated, block: B:302:0x2831 A[LOOP:3: B:298:0x2825->B:302:0x2831, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:306:0x2b9e  */
        /* JADX WARN: Code duplicated, block: B:309:0x2c00 A[Catch: all -> 0x45b4, TryCatch #11 {all -> 0x45b4, blocks: (B:3:0x000d, B:6:0x0019, B:7:0x004a, B:11:0x015d, B:13:0x016a, B:14:0x01ad, B:23:0x0266, B:25:0x0273, B:26:0x02bc, B:28:0x02f7, B:30:0x0304, B:31:0x034d, B:33:0x0356, B:35:0x036e, B:37:0x03c0, B:70:0x07d6, B:72:0x07e3, B:73:0x0825, B:90:0x1270, B:92:0x127d, B:93:0x12c3, B:96:0x1337, B:98:0x1344, B:99:0x1396, B:107:0x14a4, B:109:0x14b1, B:110:0x14fa, B:116:0x1618, B:118:0x1625, B:119:0x166e, B:121:0x1677, B:123:0x168f, B:124:0x16d9, B:141:0x18dd, B:143:0x18ea, B:144:0x1935, B:160:0x1aab, B:162:0x1ab8, B:163:0x1af4, B:165:0x1bea, B:167:0x1bf7, B:169:0x1c4a, B:183:0x1d98, B:185:0x1da5, B:187:0x1de6, B:189:0x1ec3, B:191:0x1ed0, B:192:0x1f19, B:205:0x2239, B:207:0x2246, B:208:0x228a, B:288:0x2765, B:290:0x2772, B:291:0x27b6, B:307:0x2bf3, B:309:0x2c00, B:310:0x2c4b, B:317:0x2db2, B:319:0x2dd5, B:320:0x2e2c, B:375:0x313b, B:377:0x315e, B:378:0x31b7, B:384:0x32aa, B:386:0x32b0, B:387:0x32ef, B:393:0x33df, B:395:0x33e5, B:396:0x3420, B:403:0x34e3, B:405:0x34e9, B:406:0x3522, B:414:0x36f6, B:416:0x36fc, B:418:0x3742, B:420:0x3820, B:422:0x3826, B:423:0x386e, B:428:0x3975, B:430:0x3982, B:431:0x39be, B:433:0x3ba3, B:435:0x3bb6, B:436:0x3bfe, B:438:0x3cdf, B:440:0x3ce5, B:442:0x3d2c, B:444:0x3e82, B:446:0x3ea6, B:447:0x3eff, B:452:0x3ffc, B:454:0x4009, B:456:0x4055, B:464:0x4127, B:466:0x412d, B:467:0x416b, B:471:0x423f, B:473:0x4245, B:474:0x428d, B:476:0x433e, B:478:0x434b, B:479:0x4395, B:481:0x445e, B:483:0x448a, B:484:0x44e5, B:408:0x35c9, B:410:0x35cf, B:411:0x3614, B:131:0x1791, B:133:0x17a8, B:134:0x17f6, B:78:0x0911, B:80:0x091e, B:81:0x0967, B:44:0x0466, B:46:0x047d, B:47:0x04cd, B:52:0x0582, B:54:0x0599, B:55:0x05e6, B:60:0x06ab, B:62:0x06c2, B:64:0x070f), top: B:523:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:314:0x2d51 A[LOOP:4: B:304:0x2b9a->B:314:0x2d51, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:315:0x2d55 A[EDGE_INSN: B:315:0x2d55->B:316:0x2d56 BREAK  A[LOOP:3: B:298:0x2825->B:302:0x2831]] */
        /* JADX WARN: Code duplicated, block: B:319:0x2dd5 A[Catch: all -> 0x45b4, TryCatch #11 {all -> 0x45b4, blocks: (B:3:0x000d, B:6:0x0019, B:7:0x004a, B:11:0x015d, B:13:0x016a, B:14:0x01ad, B:23:0x0266, B:25:0x0273, B:26:0x02bc, B:28:0x02f7, B:30:0x0304, B:31:0x034d, B:33:0x0356, B:35:0x036e, B:37:0x03c0, B:70:0x07d6, B:72:0x07e3, B:73:0x0825, B:90:0x1270, B:92:0x127d, B:93:0x12c3, B:96:0x1337, B:98:0x1344, B:99:0x1396, B:107:0x14a4, B:109:0x14b1, B:110:0x14fa, B:116:0x1618, B:118:0x1625, B:119:0x166e, B:121:0x1677, B:123:0x168f, B:124:0x16d9, B:141:0x18dd, B:143:0x18ea, B:144:0x1935, B:160:0x1aab, B:162:0x1ab8, B:163:0x1af4, B:165:0x1bea, B:167:0x1bf7, B:169:0x1c4a, B:183:0x1d98, B:185:0x1da5, B:187:0x1de6, B:189:0x1ec3, B:191:0x1ed0, B:192:0x1f19, B:205:0x2239, B:207:0x2246, B:208:0x228a, B:288:0x2765, B:290:0x2772, B:291:0x27b6, B:307:0x2bf3, B:309:0x2c00, B:310:0x2c4b, B:317:0x2db2, B:319:0x2dd5, B:320:0x2e2c, B:375:0x313b, B:377:0x315e, B:378:0x31b7, B:384:0x32aa, B:386:0x32b0, B:387:0x32ef, B:393:0x33df, B:395:0x33e5, B:396:0x3420, B:403:0x34e3, B:405:0x34e9, B:406:0x3522, B:414:0x36f6, B:416:0x36fc, B:418:0x3742, B:420:0x3820, B:422:0x3826, B:423:0x386e, B:428:0x3975, B:430:0x3982, B:431:0x39be, B:433:0x3ba3, B:435:0x3bb6, B:436:0x3bfe, B:438:0x3cdf, B:440:0x3ce5, B:442:0x3d2c, B:444:0x3e82, B:446:0x3ea6, B:447:0x3eff, B:452:0x3ffc, B:454:0x4009, B:456:0x4055, B:464:0x4127, B:466:0x412d, B:467:0x416b, B:471:0x423f, B:473:0x4245, B:474:0x428d, B:476:0x433e, B:478:0x434b, B:479:0x4395, B:481:0x445e, B:483:0x448a, B:484:0x44e5, B:408:0x35c9, B:410:0x35cf, B:411:0x3614, B:131:0x1791, B:133:0x17a8, B:134:0x17f6, B:78:0x0911, B:80:0x091e, B:81:0x0967, B:44:0x0466, B:46:0x047d, B:47:0x04cd, B:52:0x0582, B:54:0x0599, B:55:0x05e6, B:60:0x06ab, B:62:0x06c2, B:64:0x070f), top: B:523:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:323:0x2ee1  */
        /* JADX WARN: Code duplicated, block: B:324:0x2ee8  */
        /* JADX WARN: Code duplicated, block: B:326:0x2eee  */
        /* JADX WARN: Code duplicated, block: B:328:0x2ef3  */
        /* JADX WARN: Code duplicated, block: B:330:0x2fc9  */
        /* JADX WARN: Code duplicated, block: B:50:0x057f A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:51:0x0581  */
        /* JADX WARN: Code duplicated, block: B:540:0x283f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:541:0x2d55 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:542:0x2d55 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:543:0x2ce7 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:54:0x0599 A[Catch: all -> 0x45b4, TryCatch #11 {all -> 0x45b4, blocks: (B:3:0x000d, B:6:0x0019, B:7:0x004a, B:11:0x015d, B:13:0x016a, B:14:0x01ad, B:23:0x0266, B:25:0x0273, B:26:0x02bc, B:28:0x02f7, B:30:0x0304, B:31:0x034d, B:33:0x0356, B:35:0x036e, B:37:0x03c0, B:70:0x07d6, B:72:0x07e3, B:73:0x0825, B:90:0x1270, B:92:0x127d, B:93:0x12c3, B:96:0x1337, B:98:0x1344, B:99:0x1396, B:107:0x14a4, B:109:0x14b1, B:110:0x14fa, B:116:0x1618, B:118:0x1625, B:119:0x166e, B:121:0x1677, B:123:0x168f, B:124:0x16d9, B:141:0x18dd, B:143:0x18ea, B:144:0x1935, B:160:0x1aab, B:162:0x1ab8, B:163:0x1af4, B:165:0x1bea, B:167:0x1bf7, B:169:0x1c4a, B:183:0x1d98, B:185:0x1da5, B:187:0x1de6, B:189:0x1ec3, B:191:0x1ed0, B:192:0x1f19, B:205:0x2239, B:207:0x2246, B:208:0x228a, B:288:0x2765, B:290:0x2772, B:291:0x27b6, B:307:0x2bf3, B:309:0x2c00, B:310:0x2c4b, B:317:0x2db2, B:319:0x2dd5, B:320:0x2e2c, B:375:0x313b, B:377:0x315e, B:378:0x31b7, B:384:0x32aa, B:386:0x32b0, B:387:0x32ef, B:393:0x33df, B:395:0x33e5, B:396:0x3420, B:403:0x34e3, B:405:0x34e9, B:406:0x3522, B:414:0x36f6, B:416:0x36fc, B:418:0x3742, B:420:0x3820, B:422:0x3826, B:423:0x386e, B:428:0x3975, B:430:0x3982, B:431:0x39be, B:433:0x3ba3, B:435:0x3bb6, B:436:0x3bfe, B:438:0x3cdf, B:440:0x3ce5, B:442:0x3d2c, B:444:0x3e82, B:446:0x3ea6, B:447:0x3eff, B:452:0x3ffc, B:454:0x4009, B:456:0x4055, B:464:0x4127, B:466:0x412d, B:467:0x416b, B:471:0x423f, B:473:0x4245, B:474:0x428d, B:476:0x433e, B:478:0x434b, B:479:0x4395, B:481:0x445e, B:483:0x448a, B:484:0x44e5, B:408:0x35c9, B:410:0x35cf, B:411:0x3614, B:131:0x1791, B:133:0x17a8, B:134:0x17f6, B:78:0x0911, B:80:0x091e, B:81:0x0967, B:44:0x0466, B:46:0x047d, B:47:0x04cd, B:52:0x0582, B:54:0x0599, B:55:0x05e6, B:60:0x06ab, B:62:0x06c2, B:64:0x070f), top: B:523:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:58:0x069f A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:59:0x06a1  */
        /* JADX WARN: Code duplicated, block: B:62:0x06c2 A[Catch: all -> 0x45b4, TryCatch #11 {all -> 0x45b4, blocks: (B:3:0x000d, B:6:0x0019, B:7:0x004a, B:11:0x015d, B:13:0x016a, B:14:0x01ad, B:23:0x0266, B:25:0x0273, B:26:0x02bc, B:28:0x02f7, B:30:0x0304, B:31:0x034d, B:33:0x0356, B:35:0x036e, B:37:0x03c0, B:70:0x07d6, B:72:0x07e3, B:73:0x0825, B:90:0x1270, B:92:0x127d, B:93:0x12c3, B:96:0x1337, B:98:0x1344, B:99:0x1396, B:107:0x14a4, B:109:0x14b1, B:110:0x14fa, B:116:0x1618, B:118:0x1625, B:119:0x166e, B:121:0x1677, B:123:0x168f, B:124:0x16d9, B:141:0x18dd, B:143:0x18ea, B:144:0x1935, B:160:0x1aab, B:162:0x1ab8, B:163:0x1af4, B:165:0x1bea, B:167:0x1bf7, B:169:0x1c4a, B:183:0x1d98, B:185:0x1da5, B:187:0x1de6, B:189:0x1ec3, B:191:0x1ed0, B:192:0x1f19, B:205:0x2239, B:207:0x2246, B:208:0x228a, B:288:0x2765, B:290:0x2772, B:291:0x27b6, B:307:0x2bf3, B:309:0x2c00, B:310:0x2c4b, B:317:0x2db2, B:319:0x2dd5, B:320:0x2e2c, B:375:0x313b, B:377:0x315e, B:378:0x31b7, B:384:0x32aa, B:386:0x32b0, B:387:0x32ef, B:393:0x33df, B:395:0x33e5, B:396:0x3420, B:403:0x34e3, B:405:0x34e9, B:406:0x3522, B:414:0x36f6, B:416:0x36fc, B:418:0x3742, B:420:0x3820, B:422:0x3826, B:423:0x386e, B:428:0x3975, B:430:0x3982, B:431:0x39be, B:433:0x3ba3, B:435:0x3bb6, B:436:0x3bfe, B:438:0x3cdf, B:440:0x3ce5, B:442:0x3d2c, B:444:0x3e82, B:446:0x3ea6, B:447:0x3eff, B:452:0x3ffc, B:454:0x4009, B:456:0x4055, B:464:0x4127, B:466:0x412d, B:467:0x416b, B:471:0x423f, B:473:0x4245, B:474:0x428d, B:476:0x433e, B:478:0x434b, B:479:0x4395, B:481:0x445e, B:483:0x448a, B:484:0x44e5, B:408:0x35c9, B:410:0x35cf, B:411:0x3614, B:131:0x1791, B:133:0x17a8, B:134:0x17f6, B:78:0x0911, B:80:0x091e, B:81:0x0967, B:44:0x0466, B:46:0x047d, B:47:0x04cd, B:52:0x0582, B:54:0x0599, B:55:0x05e6, B:60:0x06ab, B:62:0x06c2, B:64:0x070f), top: B:523:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:63:0x070d  */
        /* JADX WARN: Code duplicated, block: B:67:0x0797 A[PHI: r30 r33 r34
  0x0797: PHI (r30v12 int) = (r30v10 int), (r30v10 int), (r30v10 int), (r3v21 int) binds: [B:66:0x0795, B:57:0x069d, B:49:0x057d, B:39:0x0458] A[DONT_GENERATE, DONT_INLINE]
  0x0797: PHI (r33v7 java.lang.String) = (r33v5 java.lang.String), (r33v4 java.lang.String), (r33v4 java.lang.String), (r33v9 java.lang.String) binds: [B:66:0x0795, B:57:0x069d, B:49:0x057d, B:39:0x0458] A[DONT_GENERATE, DONT_INLINE]
  0x0797: PHI (r34v38 int) = (r34v36 int), (r34v36 int), (r34v36 int), (r34v39 int) binds: [B:66:0x0795, B:57:0x069d, B:49:0x057d, B:39:0x0458] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:69:0x079d  */
        /* JADX WARN: Code duplicated, block: B:72:0x07e3 A[Catch: all -> 0x45b4, TryCatch #11 {all -> 0x45b4, blocks: (B:3:0x000d, B:6:0x0019, B:7:0x004a, B:11:0x015d, B:13:0x016a, B:14:0x01ad, B:23:0x0266, B:25:0x0273, B:26:0x02bc, B:28:0x02f7, B:30:0x0304, B:31:0x034d, B:33:0x0356, B:35:0x036e, B:37:0x03c0, B:70:0x07d6, B:72:0x07e3, B:73:0x0825, B:90:0x1270, B:92:0x127d, B:93:0x12c3, B:96:0x1337, B:98:0x1344, B:99:0x1396, B:107:0x14a4, B:109:0x14b1, B:110:0x14fa, B:116:0x1618, B:118:0x1625, B:119:0x166e, B:121:0x1677, B:123:0x168f, B:124:0x16d9, B:141:0x18dd, B:143:0x18ea, B:144:0x1935, B:160:0x1aab, B:162:0x1ab8, B:163:0x1af4, B:165:0x1bea, B:167:0x1bf7, B:169:0x1c4a, B:183:0x1d98, B:185:0x1da5, B:187:0x1de6, B:189:0x1ec3, B:191:0x1ed0, B:192:0x1f19, B:205:0x2239, B:207:0x2246, B:208:0x228a, B:288:0x2765, B:290:0x2772, B:291:0x27b6, B:307:0x2bf3, B:309:0x2c00, B:310:0x2c4b, B:317:0x2db2, B:319:0x2dd5, B:320:0x2e2c, B:375:0x313b, B:377:0x315e, B:378:0x31b7, B:384:0x32aa, B:386:0x32b0, B:387:0x32ef, B:393:0x33df, B:395:0x33e5, B:396:0x3420, B:403:0x34e3, B:405:0x34e9, B:406:0x3522, B:414:0x36f6, B:416:0x36fc, B:418:0x3742, B:420:0x3820, B:422:0x3826, B:423:0x386e, B:428:0x3975, B:430:0x3982, B:431:0x39be, B:433:0x3ba3, B:435:0x3bb6, B:436:0x3bfe, B:438:0x3cdf, B:440:0x3ce5, B:442:0x3d2c, B:444:0x3e82, B:446:0x3ea6, B:447:0x3eff, B:452:0x3ffc, B:454:0x4009, B:456:0x4055, B:464:0x4127, B:466:0x412d, B:467:0x416b, B:471:0x423f, B:473:0x4245, B:474:0x428d, B:476:0x433e, B:478:0x434b, B:479:0x4395, B:481:0x445e, B:483:0x448a, B:484:0x44e5, B:408:0x35c9, B:410:0x35cf, B:411:0x3614, B:131:0x1791, B:133:0x17a8, B:134:0x17f6, B:78:0x0911, B:80:0x091e, B:81:0x0967, B:44:0x0466, B:46:0x047d, B:47:0x04cd, B:52:0x0582, B:54:0x0599, B:55:0x05e6, B:60:0x06ab, B:62:0x06c2, B:64:0x070f), top: B:523:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:76:0x08cf  */
        /* JADX WARN: Code duplicated, block: B:77:0x08d3  */
        /* JADX WARN: Code duplicated, block: B:80:0x091e A[Catch: all -> 0x45b4, TryCatch #11 {all -> 0x45b4, blocks: (B:3:0x000d, B:6:0x0019, B:7:0x004a, B:11:0x015d, B:13:0x016a, B:14:0x01ad, B:23:0x0266, B:25:0x0273, B:26:0x02bc, B:28:0x02f7, B:30:0x0304, B:31:0x034d, B:33:0x0356, B:35:0x036e, B:37:0x03c0, B:70:0x07d6, B:72:0x07e3, B:73:0x0825, B:90:0x1270, B:92:0x127d, B:93:0x12c3, B:96:0x1337, B:98:0x1344, B:99:0x1396, B:107:0x14a4, B:109:0x14b1, B:110:0x14fa, B:116:0x1618, B:118:0x1625, B:119:0x166e, B:121:0x1677, B:123:0x168f, B:124:0x16d9, B:141:0x18dd, B:143:0x18ea, B:144:0x1935, B:160:0x1aab, B:162:0x1ab8, B:163:0x1af4, B:165:0x1bea, B:167:0x1bf7, B:169:0x1c4a, B:183:0x1d98, B:185:0x1da5, B:187:0x1de6, B:189:0x1ec3, B:191:0x1ed0, B:192:0x1f19, B:205:0x2239, B:207:0x2246, B:208:0x228a, B:288:0x2765, B:290:0x2772, B:291:0x27b6, B:307:0x2bf3, B:309:0x2c00, B:310:0x2c4b, B:317:0x2db2, B:319:0x2dd5, B:320:0x2e2c, B:375:0x313b, B:377:0x315e, B:378:0x31b7, B:384:0x32aa, B:386:0x32b0, B:387:0x32ef, B:393:0x33df, B:395:0x33e5, B:396:0x3420, B:403:0x34e3, B:405:0x34e9, B:406:0x3522, B:414:0x36f6, B:416:0x36fc, B:418:0x3742, B:420:0x3820, B:422:0x3826, B:423:0x386e, B:428:0x3975, B:430:0x3982, B:431:0x39be, B:433:0x3ba3, B:435:0x3bb6, B:436:0x3bfe, B:438:0x3cdf, B:440:0x3ce5, B:442:0x3d2c, B:444:0x3e82, B:446:0x3ea6, B:447:0x3eff, B:452:0x3ffc, B:454:0x4009, B:456:0x4055, B:464:0x4127, B:466:0x412d, B:467:0x416b, B:471:0x423f, B:473:0x4245, B:474:0x428d, B:476:0x433e, B:478:0x434b, B:479:0x4395, B:481:0x445e, B:483:0x448a, B:484:0x44e5, B:408:0x35c9, B:410:0x35cf, B:411:0x3614, B:131:0x1791, B:133:0x17a8, B:134:0x17f6, B:78:0x0911, B:80:0x091e, B:81:0x0967, B:44:0x0466, B:46:0x047d, B:47:0x04cd, B:52:0x0582, B:54:0x0599, B:55:0x05e6, B:60:0x06ab, B:62:0x06c2, B:64:0x070f), top: B:523:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:88:0x09b3 A[PHI: r6 r30 r34
  0x09b3: PHI (r6v1 java.lang.String) = (r6v0 java.lang.String), (r6v555 java.lang.String), (r6v556 java.lang.String) binds: [B:87:0x09af, B:85:0x09a4, B:83:0x09a0] A[DONT_GENERATE, DONT_INLINE]
  0x09b3: PHI (r30v1 int) = (r30v0 int), (r30v11 int), (r30v12 int) binds: [B:87:0x09af, B:85:0x09a4, B:83:0x09a0] A[DONT_GENERATE, DONT_INLINE]
  0x09b3: PHI (r34v1 int) = (r34v0 int), (r34v37 int), (r34v38 int) binds: [B:87:0x09af, B:85:0x09a4, B:83:0x09a0] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Multi-variable search skipped. Vars limit reached: 7127 (expected less than 5000) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r37v15 */
        /* JADX WARN: Type inference failed for: r37v16 */
        /* JADX WARN: Type inference failed for: r5v1455 */
        /* JADX WARN: Type inference failed for: r5v1456 */
        /* JADX WARN: Type inference failed for: r5v587 */
        /* JADX WARN: Type inference failed for: r5v588 */
        /* JADX WARN: Type inference failed for: r5v728 */
        /* JADX WARN: Type inference failed for: r5v729 */
        /* JADX WARN: Type inference failed for: r5v942, types: [java.lang.CharSequence] */
        /* JADX WARN: Type inference failed for: r5v970, types: [java.lang.CharSequence] */
        /* JADX WARN: Type inference failed for: r6v106 */
        /* JADX WARN: Type inference failed for: r6v107 */
        /* JADX WARN: Type inference failed for: r6v108, types: [java.lang.CharSequence, java.lang.String] */
        /* JADX WARN: Type inference failed for: r6v424 */
        /* JADX WARN: Type inference failed for: r6v425 */
        /* JADX WARN: Type inference failed for: r6v429 */
        /* JADX WARN: Type inference failed for: r6v430, types: [java.lang.CharSequence] */
        /* JADX WARN: Type inference failed for: r6v590 */
        /* JADX WARN: Type inference failed for: r6v591 */
        /* JADX WARN: Type inference failed for: r6v592 */
        /* JADX WARN: Type inference failed for: r9v172, types: [java.util.regex.Pattern] */
        /* JADX WARN: Type inference failed for: r9v379 */
        /* JADX WARN: Type inference failed for: r9v380, types: [java.lang.CharSequence, java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v386, types: [java.lang.CharSequence] */
        /* JADX WARN: Type inference failed for: r9v852 */
        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:332:0x2fcc
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
            */
        public static java.lang.Object[] TuitionPaymentFragmentbindingInflater1$5f1425da(int r60, java.lang.Object r61, int r62) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 19829
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.abt.R.layout.TuitionPaymentFragmentbindingInflater1$5f1425da(int, java.lang.Object, int):java.lang.Object[]");
        }

        private static String $$g(int i, int i2, short s) {
            int i3 = (i2 * 2) + 4;
            int i4 = s * 2;
            byte[] bArr = $$c;
            int i5 = 120 - i;
            byte[] bArr2 = new byte[i4 + 1];
            int i6 = -1;
            if (bArr == null) {
                i5 += i3;
                i3++;
                i6 = -1;
            }
            while (true) {
                int i7 = i6 + 1;
                bArr2[i7] = (byte) i5;
                if (i7 == i4) {
                    return new String(bArr2, 0);
                }
                int i8 = i3;
                i5 += bArr[i3];
                i3 = i8 + 1;
                i6 = i7;
            }
        }
    }
}
