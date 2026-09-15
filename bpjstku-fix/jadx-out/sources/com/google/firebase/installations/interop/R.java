package com.google.firebase.installations.interop;

import java.util.Random;

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

    public static final class layout {
        public static final int custom_dialog = 0x7f0e012b;
        public static final int notification_action = 0x7f0e02c2;
        public static final int notification_action_tombstone = 0x7f0e02c3;
        public static final int notification_template_custom_big = 0x7f0e02ca;
        public static final int notification_template_icon_group = 0x7f0e02cb;
        public static final int notification_template_part_chronometer = 0x7f0e02cf;
        public static final int notification_template_part_time = 0x7f0e02d0;

        private layout() {
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
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0x00000000;
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0x00000000;
        public static final int Widget_Compat_NotificationActionContainer = 0x7f150439;
        public static final int Widget_Compat_NotificationActionText = 0x7f15043a;
        public static final int Widget_Support_CoordinatorLayout = 0x7f15056f;

        private style() {
        }

        public static int TuitionPaymentFragmentbindingInflater1() {
            int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i2 = i % 5506069;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i + 1;
            if (i2 != 0) {
                return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            }
            int iNextInt = new Random().nextInt(1744361768);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iNextInt;
            return iNextInt;
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
}
