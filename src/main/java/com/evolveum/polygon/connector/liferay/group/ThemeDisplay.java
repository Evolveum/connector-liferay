/**
 * ThemeDisplay.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.evolveum.polygon.connector.liferay.group;

public class ThemeDisplay  implements java.io.Serializable {
    private java.lang.String CDNBaseURL;

    private java.lang.String CDNDynamicResourcesHost;

    private java.lang.String CDNHost;

    private java.lang.Object MDRRuleGroupInstance;

    private java.lang.String URLAddContent;

    private java.lang.String URLControlPanel;

    private java.lang.String URLCurrent;

    private java.lang.String URLHome;

    private java.lang.String URLLayoutTemplates;

    private java.lang.Object URLManageSiteMemberships;

    private java.lang.Object URLMyAccount;

    private java.lang.Object URLPageSettings;

    private java.lang.String URLPortal;

    private java.lang.Object URLPublishToLive;

    private java.lang.String URLSignIn;

    private java.lang.String URLSignOut;

    private java.lang.String URLSiteAdministration;

    private java.lang.String URLSiteContent;

    private java.lang.Object URLSiteMapSettings;

    private java.lang.Object URLSiteSettings;

    private java.lang.Object URLUpdateManager;

    private java.lang.Object account;

    private boolean addSessionIdToURL;

    private boolean ajax;

    private java.lang.Object colorScheme;

    private java.lang.String colorSchemeId;

    private java.lang.Object company;

    private long companyGroupId;

    private long companyId;

    private java.lang.String companyLogo;

    private int companyLogoHeight;

    private int companyLogoWidth;

    private java.lang.Object contact;

    private java.lang.String controlPanelCategory;

    private java.lang.Object defaultUser;

    private long defaultUserId;

    private java.lang.Object device;

    private long doAsGroupId;

    private java.lang.String doAsUserId;

    private java.lang.String doAsUserLanguageId;

    private boolean facebook;

    private java.lang.String facebookCanvasPageURL;

    private boolean freeformLayout;

    private boolean i18N;

    private java.lang.String i18NLanguageId;

    private java.lang.String i18NPath;

    private boolean impersonated;

    private boolean includePortletCssJs;

    private boolean isolated;

    private java.lang.String languageId;

    private java.lang.Object layout;

    private java.lang.Object layoutSet;

    private java.lang.String layoutSetLogo;

    private java.lang.Object layoutTypePortlet;

    private java.lang.Object[] layouts;

    private java.lang.String lifecycle;

    private boolean lifecycleAction;

    private boolean lifecycleEvent;

    private boolean lifecycleRender;

    private boolean lifecycleResource;

    private java.lang.Object locale;

    private java.lang.Object parentGroup;

    private long parentGroupId;

    private java.lang.String parentGroupName;

    private java.lang.String pathApplet;

    private java.lang.String pathCms;

    private java.lang.String pathColorSchemeImages;

    private java.lang.String pathContext;

    private java.lang.String pathFlash;

    private java.lang.String pathFriendlyURLPrivateGroup;

    private java.lang.String pathFriendlyURLPrivateUser;

    private java.lang.String pathFriendlyURLPublic;

    private java.lang.String pathImage;

    private java.lang.String pathJavaScript;

    private java.lang.String pathMain;

    private java.lang.String pathSound;

    private java.lang.String pathThemeCss;

    private java.lang.String pathThemeImage;

    private java.lang.String pathThemeImages;

    private java.lang.String pathThemeJavaScript;

    private java.lang.String pathThemeRoot;

    private java.lang.String pathThemeTemplates;

    private java.lang.Object permissionChecker;

    private long plid;

    private java.lang.String portalURL;

    private com.evolveum.polygon.connector.liferay.group.PortletDisplay portletDisplay;

    private long portletGroupId;

    private java.lang.String ppid;

    private java.lang.String realCompanyLogo;

    private int realCompanyLogoHeight;

    private int realCompanyLogoWidth;

    private java.lang.Object realUser;

    private long realUserId;

    private long refererGroupId;

    private long refererPlid;

    private java.lang.Object request;

    private java.lang.Object scopeGroup;

    private long scopeGroupId;

    private long scopeGroupIdOrLiveGroupId;

    private java.lang.String scopeGroupName;

    private java.lang.Object scopeLayout;

    private boolean secure;

    private java.lang.String serverName;

    private int serverPort;

    private java.lang.String sessionId;

    private boolean showAddContentIcon;

    private boolean showAddContentIconPermission;

    private boolean showControlPanelIcon;

    private boolean showHomeIcon;

    private boolean showLayoutTemplatesIcon;

    private boolean showManageSiteMembershipsIcon;

    private boolean showMyAccountIcon;

    private boolean showPageCustomizationIcon;

    private boolean showPageSettingsIcon;

    private boolean showPortalIcon;

    private boolean showSignInIcon;

    private boolean showSignOutIcon;

    private boolean showSiteAdministrationIcon;

    private boolean showSiteContentIcon;

    private boolean showSiteMapSettingsIcon;

    private boolean showSiteSettingsIcon;

    private boolean showStagingIcon;

    private boolean signedIn;

    private java.lang.Object siteDefaultLocale;

    private java.lang.Object siteGroup;

    private long siteGroupId;

    private long siteGroupIdOrLiveGroupId;

    private java.lang.String siteGroupName;

    private boolean stateExclusive;

    private boolean stateMaximized;

    private boolean statePopUp;

    private java.lang.Object theme;

    private boolean themeCssFastLoad;

    private java.lang.String themeId;

    private boolean themeImagesFastLoad;

    private boolean themeJsBarebone;

    private boolean themeJsFastLoad;

    private java.lang.Object themeSettings;

    private java.lang.String tilesContent;

    private boolean tilesSelectable;

    private java.lang.String tilesTitle;

    private java.lang.Object timeZone;

    private java.lang.Object[] unfilteredLayouts;

    private java.lang.Object user;

    private long userId;

    private boolean wapTheme;

    private boolean widget;

    public ThemeDisplay() {
    }

    public ThemeDisplay(
           java.lang.String CDNBaseURL,
           java.lang.String CDNDynamicResourcesHost,
           java.lang.String CDNHost,
           java.lang.Object MDRRuleGroupInstance,
           java.lang.String URLAddContent,
           java.lang.String URLControlPanel,
           java.lang.String URLCurrent,
           java.lang.String URLHome,
           java.lang.String URLLayoutTemplates,
           java.lang.Object URLManageSiteMemberships,
           java.lang.Object URLMyAccount,
           java.lang.Object URLPageSettings,
           java.lang.String URLPortal,
           java.lang.Object URLPublishToLive,
           java.lang.String URLSignIn,
           java.lang.String URLSignOut,
           java.lang.String URLSiteAdministration,
           java.lang.String URLSiteContent,
           java.lang.Object URLSiteMapSettings,
           java.lang.Object URLSiteSettings,
           java.lang.Object URLUpdateManager,
           java.lang.Object account,
           boolean addSessionIdToURL,
           boolean ajax,
           java.lang.Object colorScheme,
           java.lang.String colorSchemeId,
           java.lang.Object company,
           long companyGroupId,
           long companyId,
           java.lang.String companyLogo,
           int companyLogoHeight,
           int companyLogoWidth,
           java.lang.Object contact,
           java.lang.String controlPanelCategory,
           java.lang.Object defaultUser,
           long defaultUserId,
           java.lang.Object device,
           long doAsGroupId,
           java.lang.String doAsUserId,
           java.lang.String doAsUserLanguageId,
           boolean facebook,
           java.lang.String facebookCanvasPageURL,
           boolean freeformLayout,
           boolean i18N,
           java.lang.String i18NLanguageId,
           java.lang.String i18NPath,
           boolean impersonated,
           boolean includePortletCssJs,
           boolean isolated,
           java.lang.String languageId,
           java.lang.Object layout,
           java.lang.Object layoutSet,
           java.lang.String layoutSetLogo,
           java.lang.Object layoutTypePortlet,
           java.lang.Object[] layouts,
           java.lang.String lifecycle,
           boolean lifecycleAction,
           boolean lifecycleEvent,
           boolean lifecycleRender,
           boolean lifecycleResource,
           java.lang.Object locale,
           java.lang.Object parentGroup,
           long parentGroupId,
           java.lang.String parentGroupName,
           java.lang.String pathApplet,
           java.lang.String pathCms,
           java.lang.String pathColorSchemeImages,
           java.lang.String pathContext,
           java.lang.String pathFlash,
           java.lang.String pathFriendlyURLPrivateGroup,
           java.lang.String pathFriendlyURLPrivateUser,
           java.lang.String pathFriendlyURLPublic,
           java.lang.String pathImage,
           java.lang.String pathJavaScript,
           java.lang.String pathMain,
           java.lang.String pathSound,
           java.lang.String pathThemeCss,
           java.lang.String pathThemeImage,
           java.lang.String pathThemeImages,
           java.lang.String pathThemeJavaScript,
           java.lang.String pathThemeRoot,
           java.lang.String pathThemeTemplates,
           java.lang.Object permissionChecker,
           long plid,
           java.lang.String portalURL,
           com.evolveum.polygon.connector.liferay.group.PortletDisplay portletDisplay,
           long portletGroupId,
           java.lang.String ppid,
           java.lang.String realCompanyLogo,
           int realCompanyLogoHeight,
           int realCompanyLogoWidth,
           java.lang.Object realUser,
           long realUserId,
           long refererGroupId,
           long refererPlid,
           java.lang.Object request,
           java.lang.Object scopeGroup,
           long scopeGroupId,
           long scopeGroupIdOrLiveGroupId,
           java.lang.String scopeGroupName,
           java.lang.Object scopeLayout,
           boolean secure,
           java.lang.String serverName,
           int serverPort,
           java.lang.String sessionId,
           boolean showAddContentIcon,
           boolean showAddContentIconPermission,
           boolean showControlPanelIcon,
           boolean showHomeIcon,
           boolean showLayoutTemplatesIcon,
           boolean showManageSiteMembershipsIcon,
           boolean showMyAccountIcon,
           boolean showPageCustomizationIcon,
           boolean showPageSettingsIcon,
           boolean showPortalIcon,
           boolean showSignInIcon,
           boolean showSignOutIcon,
           boolean showSiteAdministrationIcon,
           boolean showSiteContentIcon,
           boolean showSiteMapSettingsIcon,
           boolean showSiteSettingsIcon,
           boolean showStagingIcon,
           boolean signedIn,
           java.lang.Object siteDefaultLocale,
           java.lang.Object siteGroup,
           long siteGroupId,
           long siteGroupIdOrLiveGroupId,
           java.lang.String siteGroupName,
           boolean stateExclusive,
           boolean stateMaximized,
           boolean statePopUp,
           java.lang.Object theme,
           boolean themeCssFastLoad,
           java.lang.String themeId,
           boolean themeImagesFastLoad,
           boolean themeJsBarebone,
           boolean themeJsFastLoad,
           java.lang.Object themeSettings,
           java.lang.String tilesContent,
           boolean tilesSelectable,
           java.lang.String tilesTitle,
           java.lang.Object timeZone,
           java.lang.Object[] unfilteredLayouts,
           java.lang.Object user,
           long userId,
           boolean wapTheme,
           boolean widget) {
           this.CDNBaseURL = CDNBaseURL;
           this.CDNDynamicResourcesHost = CDNDynamicResourcesHost;
           this.CDNHost = CDNHost;
           this.MDRRuleGroupInstance = MDRRuleGroupInstance;
           this.URLAddContent = URLAddContent;
           this.URLControlPanel = URLControlPanel;
           this.URLCurrent = URLCurrent;
           this.URLHome = URLHome;
           this.URLLayoutTemplates = URLLayoutTemplates;
           this.URLManageSiteMemberships = URLManageSiteMemberships;
           this.URLMyAccount = URLMyAccount;
           this.URLPageSettings = URLPageSettings;
           this.URLPortal = URLPortal;
           this.URLPublishToLive = URLPublishToLive;
           this.URLSignIn = URLSignIn;
           this.URLSignOut = URLSignOut;
           this.URLSiteAdministration = URLSiteAdministration;
           this.URLSiteContent = URLSiteContent;
           this.URLSiteMapSettings = URLSiteMapSettings;
           this.URLSiteSettings = URLSiteSettings;
           this.URLUpdateManager = URLUpdateManager;
           this.account = account;
           this.addSessionIdToURL = addSessionIdToURL;
           this.ajax = ajax;
           this.colorScheme = colorScheme;
           this.colorSchemeId = colorSchemeId;
           this.company = company;
           this.companyGroupId = companyGroupId;
           this.companyId = companyId;
           this.companyLogo = companyLogo;
           this.companyLogoHeight = companyLogoHeight;
           this.companyLogoWidth = companyLogoWidth;
           this.contact = contact;
           this.controlPanelCategory = controlPanelCategory;
           this.defaultUser = defaultUser;
           this.defaultUserId = defaultUserId;
           this.device = device;
           this.doAsGroupId = doAsGroupId;
           this.doAsUserId = doAsUserId;
           this.doAsUserLanguageId = doAsUserLanguageId;
           this.facebook = facebook;
           this.facebookCanvasPageURL = facebookCanvasPageURL;
           this.freeformLayout = freeformLayout;
           this.i18N = i18N;
           this.i18NLanguageId = i18NLanguageId;
           this.i18NPath = i18NPath;
           this.impersonated = impersonated;
           this.includePortletCssJs = includePortletCssJs;
           this.isolated = isolated;
           this.languageId = languageId;
           this.layout = layout;
           this.layoutSet = layoutSet;
           this.layoutSetLogo = layoutSetLogo;
           this.layoutTypePortlet = layoutTypePortlet;
           this.layouts = layouts;
           this.lifecycle = lifecycle;
           this.lifecycleAction = lifecycleAction;
           this.lifecycleEvent = lifecycleEvent;
           this.lifecycleRender = lifecycleRender;
           this.lifecycleResource = lifecycleResource;
           this.locale = locale;
           this.parentGroup = parentGroup;
           this.parentGroupId = parentGroupId;
           this.parentGroupName = parentGroupName;
           this.pathApplet = pathApplet;
           this.pathCms = pathCms;
           this.pathColorSchemeImages = pathColorSchemeImages;
           this.pathContext = pathContext;
           this.pathFlash = pathFlash;
           this.pathFriendlyURLPrivateGroup = pathFriendlyURLPrivateGroup;
           this.pathFriendlyURLPrivateUser = pathFriendlyURLPrivateUser;
           this.pathFriendlyURLPublic = pathFriendlyURLPublic;
           this.pathImage = pathImage;
           this.pathJavaScript = pathJavaScript;
           this.pathMain = pathMain;
           this.pathSound = pathSound;
           this.pathThemeCss = pathThemeCss;
           this.pathThemeImage = pathThemeImage;
           this.pathThemeImages = pathThemeImages;
           this.pathThemeJavaScript = pathThemeJavaScript;
           this.pathThemeRoot = pathThemeRoot;
           this.pathThemeTemplates = pathThemeTemplates;
           this.permissionChecker = permissionChecker;
           this.plid = plid;
           this.portalURL = portalURL;
           this.portletDisplay = portletDisplay;
           this.portletGroupId = portletGroupId;
           this.ppid = ppid;
           this.realCompanyLogo = realCompanyLogo;
           this.realCompanyLogoHeight = realCompanyLogoHeight;
           this.realCompanyLogoWidth = realCompanyLogoWidth;
           this.realUser = realUser;
           this.realUserId = realUserId;
           this.refererGroupId = refererGroupId;
           this.refererPlid = refererPlid;
           this.request = request;
           this.scopeGroup = scopeGroup;
           this.scopeGroupId = scopeGroupId;
           this.scopeGroupIdOrLiveGroupId = scopeGroupIdOrLiveGroupId;
           this.scopeGroupName = scopeGroupName;
           this.scopeLayout = scopeLayout;
           this.secure = secure;
           this.serverName = serverName;
           this.serverPort = serverPort;
           this.sessionId = sessionId;
           this.showAddContentIcon = showAddContentIcon;
           this.showAddContentIconPermission = showAddContentIconPermission;
           this.showControlPanelIcon = showControlPanelIcon;
           this.showHomeIcon = showHomeIcon;
           this.showLayoutTemplatesIcon = showLayoutTemplatesIcon;
           this.showManageSiteMembershipsIcon = showManageSiteMembershipsIcon;
           this.showMyAccountIcon = showMyAccountIcon;
           this.showPageCustomizationIcon = showPageCustomizationIcon;
           this.showPageSettingsIcon = showPageSettingsIcon;
           this.showPortalIcon = showPortalIcon;
           this.showSignInIcon = showSignInIcon;
           this.showSignOutIcon = showSignOutIcon;
           this.showSiteAdministrationIcon = showSiteAdministrationIcon;
           this.showSiteContentIcon = showSiteContentIcon;
           this.showSiteMapSettingsIcon = showSiteMapSettingsIcon;
           this.showSiteSettingsIcon = showSiteSettingsIcon;
           this.showStagingIcon = showStagingIcon;
           this.signedIn = signedIn;
           this.siteDefaultLocale = siteDefaultLocale;
           this.siteGroup = siteGroup;
           this.siteGroupId = siteGroupId;
           this.siteGroupIdOrLiveGroupId = siteGroupIdOrLiveGroupId;
           this.siteGroupName = siteGroupName;
           this.stateExclusive = stateExclusive;
           this.stateMaximized = stateMaximized;
           this.statePopUp = statePopUp;
           this.theme = theme;
           this.themeCssFastLoad = themeCssFastLoad;
           this.themeId = themeId;
           this.themeImagesFastLoad = themeImagesFastLoad;
           this.themeJsBarebone = themeJsBarebone;
           this.themeJsFastLoad = themeJsFastLoad;
           this.themeSettings = themeSettings;
           this.tilesContent = tilesContent;
           this.tilesSelectable = tilesSelectable;
           this.tilesTitle = tilesTitle;
           this.timeZone = timeZone;
           this.unfilteredLayouts = unfilteredLayouts;
           this.user = user;
           this.userId = userId;
           this.wapTheme = wapTheme;
           this.widget = widget;
    }


    /**
     * Gets the CDNBaseURL value for this ThemeDisplay.
     * 
     * @return CDNBaseURL
     */
    public java.lang.String getCDNBaseURL() {
        return CDNBaseURL;
    }


    /**
     * Sets the CDNBaseURL value for this ThemeDisplay.
     * 
     * @param CDNBaseURL
     */
    public void setCDNBaseURL(java.lang.String CDNBaseURL) {
        this.CDNBaseURL = CDNBaseURL;
    }


    /**
     * Gets the CDNDynamicResourcesHost value for this ThemeDisplay.
     * 
     * @return CDNDynamicResourcesHost
     */
    public java.lang.String getCDNDynamicResourcesHost() {
        return CDNDynamicResourcesHost;
    }


    /**
     * Sets the CDNDynamicResourcesHost value for this ThemeDisplay.
     * 
     * @param CDNDynamicResourcesHost
     */
    public void setCDNDynamicResourcesHost(java.lang.String CDNDynamicResourcesHost) {
        this.CDNDynamicResourcesHost = CDNDynamicResourcesHost;
    }


    /**
     * Gets the CDNHost value for this ThemeDisplay.
     * 
     * @return CDNHost
     */
    public java.lang.String getCDNHost() {
        return CDNHost;
    }


    /**
     * Sets the CDNHost value for this ThemeDisplay.
     * 
     * @param CDNHost
     */
    public void setCDNHost(java.lang.String CDNHost) {
        this.CDNHost = CDNHost;
    }


    /**
     * Gets the MDRRuleGroupInstance value for this ThemeDisplay.
     * 
     * @return MDRRuleGroupInstance
     */
    public java.lang.Object getMDRRuleGroupInstance() {
        return MDRRuleGroupInstance;
    }


    /**
     * Sets the MDRRuleGroupInstance value for this ThemeDisplay.
     * 
     * @param MDRRuleGroupInstance
     */
    public void setMDRRuleGroupInstance(java.lang.Object MDRRuleGroupInstance) {
        this.MDRRuleGroupInstance = MDRRuleGroupInstance;
    }


    /**
     * Gets the URLAddContent value for this ThemeDisplay.
     * 
     * @return URLAddContent
     */
    public java.lang.String getURLAddContent() {
        return URLAddContent;
    }


    /**
     * Sets the URLAddContent value for this ThemeDisplay.
     * 
     * @param URLAddContent
     */
    public void setURLAddContent(java.lang.String URLAddContent) {
        this.URLAddContent = URLAddContent;
    }


    /**
     * Gets the URLControlPanel value for this ThemeDisplay.
     * 
     * @return URLControlPanel
     */
    public java.lang.String getURLControlPanel() {
        return URLControlPanel;
    }


    /**
     * Sets the URLControlPanel value for this ThemeDisplay.
     * 
     * @param URLControlPanel
     */
    public void setURLControlPanel(java.lang.String URLControlPanel) {
        this.URLControlPanel = URLControlPanel;
    }


    /**
     * Gets the URLCurrent value for this ThemeDisplay.
     * 
     * @return URLCurrent
     */
    public java.lang.String getURLCurrent() {
        return URLCurrent;
    }


    /**
     * Sets the URLCurrent value for this ThemeDisplay.
     * 
     * @param URLCurrent
     */
    public void setURLCurrent(java.lang.String URLCurrent) {
        this.URLCurrent = URLCurrent;
    }


    /**
     * Gets the URLHome value for this ThemeDisplay.
     * 
     * @return URLHome
     */
    public java.lang.String getURLHome() {
        return URLHome;
    }


    /**
     * Sets the URLHome value for this ThemeDisplay.
     * 
     * @param URLHome
     */
    public void setURLHome(java.lang.String URLHome) {
        this.URLHome = URLHome;
    }


    /**
     * Gets the URLLayoutTemplates value for this ThemeDisplay.
     * 
     * @return URLLayoutTemplates
     */
    public java.lang.String getURLLayoutTemplates() {
        return URLLayoutTemplates;
    }


    /**
     * Sets the URLLayoutTemplates value for this ThemeDisplay.
     * 
     * @param URLLayoutTemplates
     */
    public void setURLLayoutTemplates(java.lang.String URLLayoutTemplates) {
        this.URLLayoutTemplates = URLLayoutTemplates;
    }


    /**
     * Gets the URLManageSiteMemberships value for this ThemeDisplay.
     * 
     * @return URLManageSiteMemberships
     */
    public java.lang.Object getURLManageSiteMemberships() {
        return URLManageSiteMemberships;
    }


    /**
     * Sets the URLManageSiteMemberships value for this ThemeDisplay.
     * 
     * @param URLManageSiteMemberships
     */
    public void setURLManageSiteMemberships(java.lang.Object URLManageSiteMemberships) {
        this.URLManageSiteMemberships = URLManageSiteMemberships;
    }


    /**
     * Gets the URLMyAccount value for this ThemeDisplay.
     * 
     * @return URLMyAccount
     */
    public java.lang.Object getURLMyAccount() {
        return URLMyAccount;
    }


    /**
     * Sets the URLMyAccount value for this ThemeDisplay.
     * 
     * @param URLMyAccount
     */
    public void setURLMyAccount(java.lang.Object URLMyAccount) {
        this.URLMyAccount = URLMyAccount;
    }


    /**
     * Gets the URLPageSettings value for this ThemeDisplay.
     * 
     * @return URLPageSettings
     */
    public java.lang.Object getURLPageSettings() {
        return URLPageSettings;
    }


    /**
     * Sets the URLPageSettings value for this ThemeDisplay.
     * 
     * @param URLPageSettings
     */
    public void setURLPageSettings(java.lang.Object URLPageSettings) {
        this.URLPageSettings = URLPageSettings;
    }


    /**
     * Gets the URLPortal value for this ThemeDisplay.
     * 
     * @return URLPortal
     */
    public java.lang.String getURLPortal() {
        return URLPortal;
    }


    /**
     * Sets the URLPortal value for this ThemeDisplay.
     * 
     * @param URLPortal
     */
    public void setURLPortal(java.lang.String URLPortal) {
        this.URLPortal = URLPortal;
    }


    /**
     * Gets the URLPublishToLive value for this ThemeDisplay.
     * 
     * @return URLPublishToLive
     */
    public java.lang.Object getURLPublishToLive() {
        return URLPublishToLive;
    }


    /**
     * Sets the URLPublishToLive value for this ThemeDisplay.
     * 
     * @param URLPublishToLive
     */
    public void setURLPublishToLive(java.lang.Object URLPublishToLive) {
        this.URLPublishToLive = URLPublishToLive;
    }


    /**
     * Gets the URLSignIn value for this ThemeDisplay.
     * 
     * @return URLSignIn
     */
    public java.lang.String getURLSignIn() {
        return URLSignIn;
    }


    /**
     * Sets the URLSignIn value for this ThemeDisplay.
     * 
     * @param URLSignIn
     */
    public void setURLSignIn(java.lang.String URLSignIn) {
        this.URLSignIn = URLSignIn;
    }


    /**
     * Gets the URLSignOut value for this ThemeDisplay.
     * 
     * @return URLSignOut
     */
    public java.lang.String getURLSignOut() {
        return URLSignOut;
    }


    /**
     * Sets the URLSignOut value for this ThemeDisplay.
     * 
     * @param URLSignOut
     */
    public void setURLSignOut(java.lang.String URLSignOut) {
        this.URLSignOut = URLSignOut;
    }


    /**
     * Gets the URLSiteAdministration value for this ThemeDisplay.
     * 
     * @return URLSiteAdministration
     */
    public java.lang.String getURLSiteAdministration() {
        return URLSiteAdministration;
    }


    /**
     * Sets the URLSiteAdministration value for this ThemeDisplay.
     * 
     * @param URLSiteAdministration
     */
    public void setURLSiteAdministration(java.lang.String URLSiteAdministration) {
        this.URLSiteAdministration = URLSiteAdministration;
    }


    /**
     * Gets the URLSiteContent value for this ThemeDisplay.
     * 
     * @return URLSiteContent
     */
    public java.lang.String getURLSiteContent() {
        return URLSiteContent;
    }


    /**
     * Sets the URLSiteContent value for this ThemeDisplay.
     * 
     * @param URLSiteContent
     */
    public void setURLSiteContent(java.lang.String URLSiteContent) {
        this.URLSiteContent = URLSiteContent;
    }


    /**
     * Gets the URLSiteMapSettings value for this ThemeDisplay.
     * 
     * @return URLSiteMapSettings
     */
    public java.lang.Object getURLSiteMapSettings() {
        return URLSiteMapSettings;
    }


    /**
     * Sets the URLSiteMapSettings value for this ThemeDisplay.
     * 
     * @param URLSiteMapSettings
     */
    public void setURLSiteMapSettings(java.lang.Object URLSiteMapSettings) {
        this.URLSiteMapSettings = URLSiteMapSettings;
    }


    /**
     * Gets the URLSiteSettings value for this ThemeDisplay.
     * 
     * @return URLSiteSettings
     */
    public java.lang.Object getURLSiteSettings() {
        return URLSiteSettings;
    }


    /**
     * Sets the URLSiteSettings value for this ThemeDisplay.
     * 
     * @param URLSiteSettings
     */
    public void setURLSiteSettings(java.lang.Object URLSiteSettings) {
        this.URLSiteSettings = URLSiteSettings;
    }


    /**
     * Gets the URLUpdateManager value for this ThemeDisplay.
     * 
     * @return URLUpdateManager
     */
    public java.lang.Object getURLUpdateManager() {
        return URLUpdateManager;
    }


    /**
     * Sets the URLUpdateManager value for this ThemeDisplay.
     * 
     * @param URLUpdateManager
     */
    public void setURLUpdateManager(java.lang.Object URLUpdateManager) {
        this.URLUpdateManager = URLUpdateManager;
    }


    /**
     * Gets the account value for this ThemeDisplay.
     * 
     * @return account
     */
    public java.lang.Object getAccount() {
        return account;
    }


    /**
     * Sets the account value for this ThemeDisplay.
     * 
     * @param account
     */
    public void setAccount(java.lang.Object account) {
        this.account = account;
    }


    /**
     * Gets the addSessionIdToURL value for this ThemeDisplay.
     * 
     * @return addSessionIdToURL
     */
    public boolean isAddSessionIdToURL() {
        return addSessionIdToURL;
    }


    /**
     * Sets the addSessionIdToURL value for this ThemeDisplay.
     * 
     * @param addSessionIdToURL
     */
    public void setAddSessionIdToURL(boolean addSessionIdToURL) {
        this.addSessionIdToURL = addSessionIdToURL;
    }


    /**
     * Gets the ajax value for this ThemeDisplay.
     * 
     * @return ajax
     */
    public boolean isAjax() {
        return ajax;
    }


    /**
     * Sets the ajax value for this ThemeDisplay.
     * 
     * @param ajax
     */
    public void setAjax(boolean ajax) {
        this.ajax = ajax;
    }


    /**
     * Gets the colorScheme value for this ThemeDisplay.
     * 
     * @return colorScheme
     */
    public java.lang.Object getColorScheme() {
        return colorScheme;
    }


    /**
     * Sets the colorScheme value for this ThemeDisplay.
     * 
     * @param colorScheme
     */
    public void setColorScheme(java.lang.Object colorScheme) {
        this.colorScheme = colorScheme;
    }


    /**
     * Gets the colorSchemeId value for this ThemeDisplay.
     * 
     * @return colorSchemeId
     */
    public java.lang.String getColorSchemeId() {
        return colorSchemeId;
    }


    /**
     * Sets the colorSchemeId value for this ThemeDisplay.
     * 
     * @param colorSchemeId
     */
    public void setColorSchemeId(java.lang.String colorSchemeId) {
        this.colorSchemeId = colorSchemeId;
    }


    /**
     * Gets the company value for this ThemeDisplay.
     * 
     * @return company
     */
    public java.lang.Object getCompany() {
        return company;
    }


    /**
     * Sets the company value for this ThemeDisplay.
     * 
     * @param company
     */
    public void setCompany(java.lang.Object company) {
        this.company = company;
    }


    /**
     * Gets the companyGroupId value for this ThemeDisplay.
     * 
     * @return companyGroupId
     */
    public long getCompanyGroupId() {
        return companyGroupId;
    }


    /**
     * Sets the companyGroupId value for this ThemeDisplay.
     * 
     * @param companyGroupId
     */
    public void setCompanyGroupId(long companyGroupId) {
        this.companyGroupId = companyGroupId;
    }


    /**
     * Gets the companyId value for this ThemeDisplay.
     * 
     * @return companyId
     */
    public long getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this ThemeDisplay.
     * 
     * @param companyId
     */
    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the companyLogo value for this ThemeDisplay.
     * 
     * @return companyLogo
     */
    public java.lang.String getCompanyLogo() {
        return companyLogo;
    }


    /**
     * Sets the companyLogo value for this ThemeDisplay.
     * 
     * @param companyLogo
     */
    public void setCompanyLogo(java.lang.String companyLogo) {
        this.companyLogo = companyLogo;
    }


    /**
     * Gets the companyLogoHeight value for this ThemeDisplay.
     * 
     * @return companyLogoHeight
     */
    public int getCompanyLogoHeight() {
        return companyLogoHeight;
    }


    /**
     * Sets the companyLogoHeight value for this ThemeDisplay.
     * 
     * @param companyLogoHeight
     */
    public void setCompanyLogoHeight(int companyLogoHeight) {
        this.companyLogoHeight = companyLogoHeight;
    }


    /**
     * Gets the companyLogoWidth value for this ThemeDisplay.
     * 
     * @return companyLogoWidth
     */
    public int getCompanyLogoWidth() {
        return companyLogoWidth;
    }


    /**
     * Sets the companyLogoWidth value for this ThemeDisplay.
     * 
     * @param companyLogoWidth
     */
    public void setCompanyLogoWidth(int companyLogoWidth) {
        this.companyLogoWidth = companyLogoWidth;
    }


    /**
     * Gets the contact value for this ThemeDisplay.
     * 
     * @return contact
     */
    public java.lang.Object getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this ThemeDisplay.
     * 
     * @param contact
     */
    public void setContact(java.lang.Object contact) {
        this.contact = contact;
    }


    /**
     * Gets the controlPanelCategory value for this ThemeDisplay.
     * 
     * @return controlPanelCategory
     */
    public java.lang.String getControlPanelCategory() {
        return controlPanelCategory;
    }


    /**
     * Sets the controlPanelCategory value for this ThemeDisplay.
     * 
     * @param controlPanelCategory
     */
    public void setControlPanelCategory(java.lang.String controlPanelCategory) {
        this.controlPanelCategory = controlPanelCategory;
    }


    /**
     * Gets the defaultUser value for this ThemeDisplay.
     * 
     * @return defaultUser
     */
    public java.lang.Object getDefaultUser() {
        return defaultUser;
    }


    /**
     * Sets the defaultUser value for this ThemeDisplay.
     * 
     * @param defaultUser
     */
    public void setDefaultUser(java.lang.Object defaultUser) {
        this.defaultUser = defaultUser;
    }


    /**
     * Gets the defaultUserId value for this ThemeDisplay.
     * 
     * @return defaultUserId
     */
    public long getDefaultUserId() {
        return defaultUserId;
    }


    /**
     * Sets the defaultUserId value for this ThemeDisplay.
     * 
     * @param defaultUserId
     */
    public void setDefaultUserId(long defaultUserId) {
        this.defaultUserId = defaultUserId;
    }


    /**
     * Gets the device value for this ThemeDisplay.
     * 
     * @return device
     */
    public java.lang.Object getDevice() {
        return device;
    }


    /**
     * Sets the device value for this ThemeDisplay.
     * 
     * @param device
     */
    public void setDevice(java.lang.Object device) {
        this.device = device;
    }


    /**
     * Gets the doAsGroupId value for this ThemeDisplay.
     * 
     * @return doAsGroupId
     */
    public long getDoAsGroupId() {
        return doAsGroupId;
    }


    /**
     * Sets the doAsGroupId value for this ThemeDisplay.
     * 
     * @param doAsGroupId
     */
    public void setDoAsGroupId(long doAsGroupId) {
        this.doAsGroupId = doAsGroupId;
    }


    /**
     * Gets the doAsUserId value for this ThemeDisplay.
     * 
     * @return doAsUserId
     */
    public java.lang.String getDoAsUserId() {
        return doAsUserId;
    }


    /**
     * Sets the doAsUserId value for this ThemeDisplay.
     * 
     * @param doAsUserId
     */
    public void setDoAsUserId(java.lang.String doAsUserId) {
        this.doAsUserId = doAsUserId;
    }


    /**
     * Gets the doAsUserLanguageId value for this ThemeDisplay.
     * 
     * @return doAsUserLanguageId
     */
    public java.lang.String getDoAsUserLanguageId() {
        return doAsUserLanguageId;
    }


    /**
     * Sets the doAsUserLanguageId value for this ThemeDisplay.
     * 
     * @param doAsUserLanguageId
     */
    public void setDoAsUserLanguageId(java.lang.String doAsUserLanguageId) {
        this.doAsUserLanguageId = doAsUserLanguageId;
    }


    /**
     * Gets the facebook value for this ThemeDisplay.
     * 
     * @return facebook
     */
    public boolean isFacebook() {
        return facebook;
    }


    /**
     * Sets the facebook value for this ThemeDisplay.
     * 
     * @param facebook
     */
    public void setFacebook(boolean facebook) {
        this.facebook = facebook;
    }


    /**
     * Gets the facebookCanvasPageURL value for this ThemeDisplay.
     * 
     * @return facebookCanvasPageURL
     */
    public java.lang.String getFacebookCanvasPageURL() {
        return facebookCanvasPageURL;
    }


    /**
     * Sets the facebookCanvasPageURL value for this ThemeDisplay.
     * 
     * @param facebookCanvasPageURL
     */
    public void setFacebookCanvasPageURL(java.lang.String facebookCanvasPageURL) {
        this.facebookCanvasPageURL = facebookCanvasPageURL;
    }


    /**
     * Gets the freeformLayout value for this ThemeDisplay.
     * 
     * @return freeformLayout
     */
    public boolean isFreeformLayout() {
        return freeformLayout;
    }


    /**
     * Sets the freeformLayout value for this ThemeDisplay.
     * 
     * @param freeformLayout
     */
    public void setFreeformLayout(boolean freeformLayout) {
        this.freeformLayout = freeformLayout;
    }


    /**
     * Gets the i18N value for this ThemeDisplay.
     * 
     * @return i18N
     */
    public boolean isI18N() {
        return i18N;
    }


    /**
     * Sets the i18N value for this ThemeDisplay.
     * 
     * @param i18N
     */
    public void setI18N(boolean i18N) {
        this.i18N = i18N;
    }


    /**
     * Gets the i18NLanguageId value for this ThemeDisplay.
     * 
     * @return i18NLanguageId
     */
    public java.lang.String getI18NLanguageId() {
        return i18NLanguageId;
    }


    /**
     * Sets the i18NLanguageId value for this ThemeDisplay.
     * 
     * @param i18NLanguageId
     */
    public void setI18NLanguageId(java.lang.String i18NLanguageId) {
        this.i18NLanguageId = i18NLanguageId;
    }


    /**
     * Gets the i18NPath value for this ThemeDisplay.
     * 
     * @return i18NPath
     */
    public java.lang.String getI18NPath() {
        return i18NPath;
    }


    /**
     * Sets the i18NPath value for this ThemeDisplay.
     * 
     * @param i18NPath
     */
    public void setI18NPath(java.lang.String i18NPath) {
        this.i18NPath = i18NPath;
    }


    /**
     * Gets the impersonated value for this ThemeDisplay.
     * 
     * @return impersonated
     */
    public boolean isImpersonated() {
        return impersonated;
    }


    /**
     * Sets the impersonated value for this ThemeDisplay.
     * 
     * @param impersonated
     */
    public void setImpersonated(boolean impersonated) {
        this.impersonated = impersonated;
    }


    /**
     * Gets the includePortletCssJs value for this ThemeDisplay.
     * 
     * @return includePortletCssJs
     */
    public boolean isIncludePortletCssJs() {
        return includePortletCssJs;
    }


    /**
     * Sets the includePortletCssJs value for this ThemeDisplay.
     * 
     * @param includePortletCssJs
     */
    public void setIncludePortletCssJs(boolean includePortletCssJs) {
        this.includePortletCssJs = includePortletCssJs;
    }


    /**
     * Gets the isolated value for this ThemeDisplay.
     * 
     * @return isolated
     */
    public boolean isIsolated() {
        return isolated;
    }


    /**
     * Sets the isolated value for this ThemeDisplay.
     * 
     * @param isolated
     */
    public void setIsolated(boolean isolated) {
        this.isolated = isolated;
    }


    /**
     * Gets the languageId value for this ThemeDisplay.
     * 
     * @return languageId
     */
    public java.lang.String getLanguageId() {
        return languageId;
    }


    /**
     * Sets the languageId value for this ThemeDisplay.
     * 
     * @param languageId
     */
    public void setLanguageId(java.lang.String languageId) {
        this.languageId = languageId;
    }


    /**
     * Gets the layout value for this ThemeDisplay.
     * 
     * @return layout
     */
    public java.lang.Object getLayout() {
        return layout;
    }


    /**
     * Sets the layout value for this ThemeDisplay.
     * 
     * @param layout
     */
    public void setLayout(java.lang.Object layout) {
        this.layout = layout;
    }


    /**
     * Gets the layoutSet value for this ThemeDisplay.
     * 
     * @return layoutSet
     */
    public java.lang.Object getLayoutSet() {
        return layoutSet;
    }


    /**
     * Sets the layoutSet value for this ThemeDisplay.
     * 
     * @param layoutSet
     */
    public void setLayoutSet(java.lang.Object layoutSet) {
        this.layoutSet = layoutSet;
    }


    /**
     * Gets the layoutSetLogo value for this ThemeDisplay.
     * 
     * @return layoutSetLogo
     */
    public java.lang.String getLayoutSetLogo() {
        return layoutSetLogo;
    }


    /**
     * Sets the layoutSetLogo value for this ThemeDisplay.
     * 
     * @param layoutSetLogo
     */
    public void setLayoutSetLogo(java.lang.String layoutSetLogo) {
        this.layoutSetLogo = layoutSetLogo;
    }


    /**
     * Gets the layoutTypePortlet value for this ThemeDisplay.
     * 
     * @return layoutTypePortlet
     */
    public java.lang.Object getLayoutTypePortlet() {
        return layoutTypePortlet;
    }


    /**
     * Sets the layoutTypePortlet value for this ThemeDisplay.
     * 
     * @param layoutTypePortlet
     */
    public void setLayoutTypePortlet(java.lang.Object layoutTypePortlet) {
        this.layoutTypePortlet = layoutTypePortlet;
    }


    /**
     * Gets the layouts value for this ThemeDisplay.
     * 
     * @return layouts
     */
    public java.lang.Object[] getLayouts() {
        return layouts;
    }


    /**
     * Sets the layouts value for this ThemeDisplay.
     * 
     * @param layouts
     */
    public void setLayouts(java.lang.Object[] layouts) {
        this.layouts = layouts;
    }


    /**
     * Gets the lifecycle value for this ThemeDisplay.
     * 
     * @return lifecycle
     */
    public java.lang.String getLifecycle() {
        return lifecycle;
    }


    /**
     * Sets the lifecycle value for this ThemeDisplay.
     * 
     * @param lifecycle
     */
    public void setLifecycle(java.lang.String lifecycle) {
        this.lifecycle = lifecycle;
    }


    /**
     * Gets the lifecycleAction value for this ThemeDisplay.
     * 
     * @return lifecycleAction
     */
    public boolean isLifecycleAction() {
        return lifecycleAction;
    }


    /**
     * Sets the lifecycleAction value for this ThemeDisplay.
     * 
     * @param lifecycleAction
     */
    public void setLifecycleAction(boolean lifecycleAction) {
        this.lifecycleAction = lifecycleAction;
    }


    /**
     * Gets the lifecycleEvent value for this ThemeDisplay.
     * 
     * @return lifecycleEvent
     */
    public boolean isLifecycleEvent() {
        return lifecycleEvent;
    }


    /**
     * Sets the lifecycleEvent value for this ThemeDisplay.
     * 
     * @param lifecycleEvent
     */
    public void setLifecycleEvent(boolean lifecycleEvent) {
        this.lifecycleEvent = lifecycleEvent;
    }


    /**
     * Gets the lifecycleRender value for this ThemeDisplay.
     * 
     * @return lifecycleRender
     */
    public boolean isLifecycleRender() {
        return lifecycleRender;
    }


    /**
     * Sets the lifecycleRender value for this ThemeDisplay.
     * 
     * @param lifecycleRender
     */
    public void setLifecycleRender(boolean lifecycleRender) {
        this.lifecycleRender = lifecycleRender;
    }


    /**
     * Gets the lifecycleResource value for this ThemeDisplay.
     * 
     * @return lifecycleResource
     */
    public boolean isLifecycleResource() {
        return lifecycleResource;
    }


    /**
     * Sets the lifecycleResource value for this ThemeDisplay.
     * 
     * @param lifecycleResource
     */
    public void setLifecycleResource(boolean lifecycleResource) {
        this.lifecycleResource = lifecycleResource;
    }


    /**
     * Gets the locale value for this ThemeDisplay.
     * 
     * @return locale
     */
    public java.lang.Object getLocale() {
        return locale;
    }


    /**
     * Sets the locale value for this ThemeDisplay.
     * 
     * @param locale
     */
    public void setLocale(java.lang.Object locale) {
        this.locale = locale;
    }


    /**
     * Gets the parentGroup value for this ThemeDisplay.
     * 
     * @return parentGroup
     */
    public java.lang.Object getParentGroup() {
        return parentGroup;
    }


    /**
     * Sets the parentGroup value for this ThemeDisplay.
     * 
     * @param parentGroup
     */
    public void setParentGroup(java.lang.Object parentGroup) {
        this.parentGroup = parentGroup;
    }


    /**
     * Gets the parentGroupId value for this ThemeDisplay.
     * 
     * @return parentGroupId
     */
    public long getParentGroupId() {
        return parentGroupId;
    }


    /**
     * Sets the parentGroupId value for this ThemeDisplay.
     * 
     * @param parentGroupId
     */
    public void setParentGroupId(long parentGroupId) {
        this.parentGroupId = parentGroupId;
    }


    /**
     * Gets the parentGroupName value for this ThemeDisplay.
     * 
     * @return parentGroupName
     */
    public java.lang.String getParentGroupName() {
        return parentGroupName;
    }


    /**
     * Sets the parentGroupName value for this ThemeDisplay.
     * 
     * @param parentGroupName
     */
    public void setParentGroupName(java.lang.String parentGroupName) {
        this.parentGroupName = parentGroupName;
    }


    /**
     * Gets the pathApplet value for this ThemeDisplay.
     * 
     * @return pathApplet
     */
    public java.lang.String getPathApplet() {
        return pathApplet;
    }


    /**
     * Sets the pathApplet value for this ThemeDisplay.
     * 
     * @param pathApplet
     */
    public void setPathApplet(java.lang.String pathApplet) {
        this.pathApplet = pathApplet;
    }


    /**
     * Gets the pathCms value for this ThemeDisplay.
     * 
     * @return pathCms
     */
    public java.lang.String getPathCms() {
        return pathCms;
    }


    /**
     * Sets the pathCms value for this ThemeDisplay.
     * 
     * @param pathCms
     */
    public void setPathCms(java.lang.String pathCms) {
        this.pathCms = pathCms;
    }


    /**
     * Gets the pathColorSchemeImages value for this ThemeDisplay.
     * 
     * @return pathColorSchemeImages
     */
    public java.lang.String getPathColorSchemeImages() {
        return pathColorSchemeImages;
    }


    /**
     * Sets the pathColorSchemeImages value for this ThemeDisplay.
     * 
     * @param pathColorSchemeImages
     */
    public void setPathColorSchemeImages(java.lang.String pathColorSchemeImages) {
        this.pathColorSchemeImages = pathColorSchemeImages;
    }


    /**
     * Gets the pathContext value for this ThemeDisplay.
     * 
     * @return pathContext
     */
    public java.lang.String getPathContext() {
        return pathContext;
    }


    /**
     * Sets the pathContext value for this ThemeDisplay.
     * 
     * @param pathContext
     */
    public void setPathContext(java.lang.String pathContext) {
        this.pathContext = pathContext;
    }


    /**
     * Gets the pathFlash value for this ThemeDisplay.
     * 
     * @return pathFlash
     */
    public java.lang.String getPathFlash() {
        return pathFlash;
    }


    /**
     * Sets the pathFlash value for this ThemeDisplay.
     * 
     * @param pathFlash
     */
    public void setPathFlash(java.lang.String pathFlash) {
        this.pathFlash = pathFlash;
    }


    /**
     * Gets the pathFriendlyURLPrivateGroup value for this ThemeDisplay.
     * 
     * @return pathFriendlyURLPrivateGroup
     */
    public java.lang.String getPathFriendlyURLPrivateGroup() {
        return pathFriendlyURLPrivateGroup;
    }


    /**
     * Sets the pathFriendlyURLPrivateGroup value for this ThemeDisplay.
     * 
     * @param pathFriendlyURLPrivateGroup
     */
    public void setPathFriendlyURLPrivateGroup(java.lang.String pathFriendlyURLPrivateGroup) {
        this.pathFriendlyURLPrivateGroup = pathFriendlyURLPrivateGroup;
    }


    /**
     * Gets the pathFriendlyURLPrivateUser value for this ThemeDisplay.
     * 
     * @return pathFriendlyURLPrivateUser
     */
    public java.lang.String getPathFriendlyURLPrivateUser() {
        return pathFriendlyURLPrivateUser;
    }


    /**
     * Sets the pathFriendlyURLPrivateUser value for this ThemeDisplay.
     * 
     * @param pathFriendlyURLPrivateUser
     */
    public void setPathFriendlyURLPrivateUser(java.lang.String pathFriendlyURLPrivateUser) {
        this.pathFriendlyURLPrivateUser = pathFriendlyURLPrivateUser;
    }


    /**
     * Gets the pathFriendlyURLPublic value for this ThemeDisplay.
     * 
     * @return pathFriendlyURLPublic
     */
    public java.lang.String getPathFriendlyURLPublic() {
        return pathFriendlyURLPublic;
    }


    /**
     * Sets the pathFriendlyURLPublic value for this ThemeDisplay.
     * 
     * @param pathFriendlyURLPublic
     */
    public void setPathFriendlyURLPublic(java.lang.String pathFriendlyURLPublic) {
        this.pathFriendlyURLPublic = pathFriendlyURLPublic;
    }


    /**
     * Gets the pathImage value for this ThemeDisplay.
     * 
     * @return pathImage
     */
    public java.lang.String getPathImage() {
        return pathImage;
    }


    /**
     * Sets the pathImage value for this ThemeDisplay.
     * 
     * @param pathImage
     */
    public void setPathImage(java.lang.String pathImage) {
        this.pathImage = pathImage;
    }


    /**
     * Gets the pathJavaScript value for this ThemeDisplay.
     * 
     * @return pathJavaScript
     */
    public java.lang.String getPathJavaScript() {
        return pathJavaScript;
    }


    /**
     * Sets the pathJavaScript value for this ThemeDisplay.
     * 
     * @param pathJavaScript
     */
    public void setPathJavaScript(java.lang.String pathJavaScript) {
        this.pathJavaScript = pathJavaScript;
    }


    /**
     * Gets the pathMain value for this ThemeDisplay.
     * 
     * @return pathMain
     */
    public java.lang.String getPathMain() {
        return pathMain;
    }


    /**
     * Sets the pathMain value for this ThemeDisplay.
     * 
     * @param pathMain
     */
    public void setPathMain(java.lang.String pathMain) {
        this.pathMain = pathMain;
    }


    /**
     * Gets the pathSound value for this ThemeDisplay.
     * 
     * @return pathSound
     */
    public java.lang.String getPathSound() {
        return pathSound;
    }


    /**
     * Sets the pathSound value for this ThemeDisplay.
     * 
     * @param pathSound
     */
    public void setPathSound(java.lang.String pathSound) {
        this.pathSound = pathSound;
    }


    /**
     * Gets the pathThemeCss value for this ThemeDisplay.
     * 
     * @return pathThemeCss
     */
    public java.lang.String getPathThemeCss() {
        return pathThemeCss;
    }


    /**
     * Sets the pathThemeCss value for this ThemeDisplay.
     * 
     * @param pathThemeCss
     */
    public void setPathThemeCss(java.lang.String pathThemeCss) {
        this.pathThemeCss = pathThemeCss;
    }


    /**
     * Gets the pathThemeImage value for this ThemeDisplay.
     * 
     * @return pathThemeImage
     */
    public java.lang.String getPathThemeImage() {
        return pathThemeImage;
    }


    /**
     * Sets the pathThemeImage value for this ThemeDisplay.
     * 
     * @param pathThemeImage
     */
    public void setPathThemeImage(java.lang.String pathThemeImage) {
        this.pathThemeImage = pathThemeImage;
    }


    /**
     * Gets the pathThemeImages value for this ThemeDisplay.
     * 
     * @return pathThemeImages
     */
    public java.lang.String getPathThemeImages() {
        return pathThemeImages;
    }


    /**
     * Sets the pathThemeImages value for this ThemeDisplay.
     * 
     * @param pathThemeImages
     */
    public void setPathThemeImages(java.lang.String pathThemeImages) {
        this.pathThemeImages = pathThemeImages;
    }


    /**
     * Gets the pathThemeJavaScript value for this ThemeDisplay.
     * 
     * @return pathThemeJavaScript
     */
    public java.lang.String getPathThemeJavaScript() {
        return pathThemeJavaScript;
    }


    /**
     * Sets the pathThemeJavaScript value for this ThemeDisplay.
     * 
     * @param pathThemeJavaScript
     */
    public void setPathThemeJavaScript(java.lang.String pathThemeJavaScript) {
        this.pathThemeJavaScript = pathThemeJavaScript;
    }


    /**
     * Gets the pathThemeRoot value for this ThemeDisplay.
     * 
     * @return pathThemeRoot
     */
    public java.lang.String getPathThemeRoot() {
        return pathThemeRoot;
    }


    /**
     * Sets the pathThemeRoot value for this ThemeDisplay.
     * 
     * @param pathThemeRoot
     */
    public void setPathThemeRoot(java.lang.String pathThemeRoot) {
        this.pathThemeRoot = pathThemeRoot;
    }


    /**
     * Gets the pathThemeTemplates value for this ThemeDisplay.
     * 
     * @return pathThemeTemplates
     */
    public java.lang.String getPathThemeTemplates() {
        return pathThemeTemplates;
    }


    /**
     * Sets the pathThemeTemplates value for this ThemeDisplay.
     * 
     * @param pathThemeTemplates
     */
    public void setPathThemeTemplates(java.lang.String pathThemeTemplates) {
        this.pathThemeTemplates = pathThemeTemplates;
    }


    /**
     * Gets the permissionChecker value for this ThemeDisplay.
     * 
     * @return permissionChecker
     */
    public java.lang.Object getPermissionChecker() {
        return permissionChecker;
    }


    /**
     * Sets the permissionChecker value for this ThemeDisplay.
     * 
     * @param permissionChecker
     */
    public void setPermissionChecker(java.lang.Object permissionChecker) {
        this.permissionChecker = permissionChecker;
    }


    /**
     * Gets the plid value for this ThemeDisplay.
     * 
     * @return plid
     */
    public long getPlid() {
        return plid;
    }


    /**
     * Sets the plid value for this ThemeDisplay.
     * 
     * @param plid
     */
    public void setPlid(long plid) {
        this.plid = plid;
    }


    /**
     * Gets the portalURL value for this ThemeDisplay.
     * 
     * @return portalURL
     */
    public java.lang.String getPortalURL() {
        return portalURL;
    }


    /**
     * Sets the portalURL value for this ThemeDisplay.
     * 
     * @param portalURL
     */
    public void setPortalURL(java.lang.String portalURL) {
        this.portalURL = portalURL;
    }


    /**
     * Gets the portletDisplay value for this ThemeDisplay.
     * 
     * @return portletDisplay
     */
    public com.evolveum.polygon.connector.liferay.group.PortletDisplay getPortletDisplay() {
        return portletDisplay;
    }


    /**
     * Sets the portletDisplay value for this ThemeDisplay.
     * 
     * @param portletDisplay
     */
    public void setPortletDisplay(com.evolveum.polygon.connector.liferay.group.PortletDisplay portletDisplay) {
        this.portletDisplay = portletDisplay;
    }


    /**
     * Gets the portletGroupId value for this ThemeDisplay.
     * 
     * @return portletGroupId
     */
    public long getPortletGroupId() {
        return portletGroupId;
    }


    /**
     * Sets the portletGroupId value for this ThemeDisplay.
     * 
     * @param portletGroupId
     */
    public void setPortletGroupId(long portletGroupId) {
        this.portletGroupId = portletGroupId;
    }


    /**
     * Gets the ppid value for this ThemeDisplay.
     * 
     * @return ppid
     */
    public java.lang.String getPpid() {
        return ppid;
    }


    /**
     * Sets the ppid value for this ThemeDisplay.
     * 
     * @param ppid
     */
    public void setPpid(java.lang.String ppid) {
        this.ppid = ppid;
    }


    /**
     * Gets the realCompanyLogo value for this ThemeDisplay.
     * 
     * @return realCompanyLogo
     */
    public java.lang.String getRealCompanyLogo() {
        return realCompanyLogo;
    }


    /**
     * Sets the realCompanyLogo value for this ThemeDisplay.
     * 
     * @param realCompanyLogo
     */
    public void setRealCompanyLogo(java.lang.String realCompanyLogo) {
        this.realCompanyLogo = realCompanyLogo;
    }


    /**
     * Gets the realCompanyLogoHeight value for this ThemeDisplay.
     * 
     * @return realCompanyLogoHeight
     */
    public int getRealCompanyLogoHeight() {
        return realCompanyLogoHeight;
    }


    /**
     * Sets the realCompanyLogoHeight value for this ThemeDisplay.
     * 
     * @param realCompanyLogoHeight
     */
    public void setRealCompanyLogoHeight(int realCompanyLogoHeight) {
        this.realCompanyLogoHeight = realCompanyLogoHeight;
    }


    /**
     * Gets the realCompanyLogoWidth value for this ThemeDisplay.
     * 
     * @return realCompanyLogoWidth
     */
    public int getRealCompanyLogoWidth() {
        return realCompanyLogoWidth;
    }


    /**
     * Sets the realCompanyLogoWidth value for this ThemeDisplay.
     * 
     * @param realCompanyLogoWidth
     */
    public void setRealCompanyLogoWidth(int realCompanyLogoWidth) {
        this.realCompanyLogoWidth = realCompanyLogoWidth;
    }


    /**
     * Gets the realUser value for this ThemeDisplay.
     * 
     * @return realUser
     */
    public java.lang.Object getRealUser() {
        return realUser;
    }


    /**
     * Sets the realUser value for this ThemeDisplay.
     * 
     * @param realUser
     */
    public void setRealUser(java.lang.Object realUser) {
        this.realUser = realUser;
    }


    /**
     * Gets the realUserId value for this ThemeDisplay.
     * 
     * @return realUserId
     */
    public long getRealUserId() {
        return realUserId;
    }


    /**
     * Sets the realUserId value for this ThemeDisplay.
     * 
     * @param realUserId
     */
    public void setRealUserId(long realUserId) {
        this.realUserId = realUserId;
    }


    /**
     * Gets the refererGroupId value for this ThemeDisplay.
     * 
     * @return refererGroupId
     */
    public long getRefererGroupId() {
        return refererGroupId;
    }


    /**
     * Sets the refererGroupId value for this ThemeDisplay.
     * 
     * @param refererGroupId
     */
    public void setRefererGroupId(long refererGroupId) {
        this.refererGroupId = refererGroupId;
    }


    /**
     * Gets the refererPlid value for this ThemeDisplay.
     * 
     * @return refererPlid
     */
    public long getRefererPlid() {
        return refererPlid;
    }


    /**
     * Sets the refererPlid value for this ThemeDisplay.
     * 
     * @param refererPlid
     */
    public void setRefererPlid(long refererPlid) {
        this.refererPlid = refererPlid;
    }


    /**
     * Gets the request value for this ThemeDisplay.
     * 
     * @return request
     */
    public java.lang.Object getRequest() {
        return request;
    }


    /**
     * Sets the request value for this ThemeDisplay.
     * 
     * @param request
     */
    public void setRequest(java.lang.Object request) {
        this.request = request;
    }


    /**
     * Gets the scopeGroup value for this ThemeDisplay.
     * 
     * @return scopeGroup
     */
    public java.lang.Object getScopeGroup() {
        return scopeGroup;
    }


    /**
     * Sets the scopeGroup value for this ThemeDisplay.
     * 
     * @param scopeGroup
     */
    public void setScopeGroup(java.lang.Object scopeGroup) {
        this.scopeGroup = scopeGroup;
    }


    /**
     * Gets the scopeGroupId value for this ThemeDisplay.
     * 
     * @return scopeGroupId
     */
    public long getScopeGroupId() {
        return scopeGroupId;
    }


    /**
     * Sets the scopeGroupId value for this ThemeDisplay.
     * 
     * @param scopeGroupId
     */
    public void setScopeGroupId(long scopeGroupId) {
        this.scopeGroupId = scopeGroupId;
    }


    /**
     * Gets the scopeGroupIdOrLiveGroupId value for this ThemeDisplay.
     * 
     * @return scopeGroupIdOrLiveGroupId
     */
    public long getScopeGroupIdOrLiveGroupId() {
        return scopeGroupIdOrLiveGroupId;
    }


    /**
     * Sets the scopeGroupIdOrLiveGroupId value for this ThemeDisplay.
     * 
     * @param scopeGroupIdOrLiveGroupId
     */
    public void setScopeGroupIdOrLiveGroupId(long scopeGroupIdOrLiveGroupId) {
        this.scopeGroupIdOrLiveGroupId = scopeGroupIdOrLiveGroupId;
    }


    /**
     * Gets the scopeGroupName value for this ThemeDisplay.
     * 
     * @return scopeGroupName
     */
    public java.lang.String getScopeGroupName() {
        return scopeGroupName;
    }


    /**
     * Sets the scopeGroupName value for this ThemeDisplay.
     * 
     * @param scopeGroupName
     */
    public void setScopeGroupName(java.lang.String scopeGroupName) {
        this.scopeGroupName = scopeGroupName;
    }


    /**
     * Gets the scopeLayout value for this ThemeDisplay.
     * 
     * @return scopeLayout
     */
    public java.lang.Object getScopeLayout() {
        return scopeLayout;
    }


    /**
     * Sets the scopeLayout value for this ThemeDisplay.
     * 
     * @param scopeLayout
     */
    public void setScopeLayout(java.lang.Object scopeLayout) {
        this.scopeLayout = scopeLayout;
    }


    /**
     * Gets the secure value for this ThemeDisplay.
     * 
     * @return secure
     */
    public boolean isSecure() {
        return secure;
    }


    /**
     * Sets the secure value for this ThemeDisplay.
     * 
     * @param secure
     */
    public void setSecure(boolean secure) {
        this.secure = secure;
    }


    /**
     * Gets the serverName value for this ThemeDisplay.
     * 
     * @return serverName
     */
    public java.lang.String getServerName() {
        return serverName;
    }


    /**
     * Sets the serverName value for this ThemeDisplay.
     * 
     * @param serverName
     */
    public void setServerName(java.lang.String serverName) {
        this.serverName = serverName;
    }


    /**
     * Gets the serverPort value for this ThemeDisplay.
     * 
     * @return serverPort
     */
    public int getServerPort() {
        return serverPort;
    }


    /**
     * Sets the serverPort value for this ThemeDisplay.
     * 
     * @param serverPort
     */
    public void setServerPort(int serverPort) {
        this.serverPort = serverPort;
    }


    /**
     * Gets the sessionId value for this ThemeDisplay.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this ThemeDisplay.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the showAddContentIcon value for this ThemeDisplay.
     * 
     * @return showAddContentIcon
     */
    public boolean isShowAddContentIcon() {
        return showAddContentIcon;
    }


    /**
     * Sets the showAddContentIcon value for this ThemeDisplay.
     * 
     * @param showAddContentIcon
     */
    public void setShowAddContentIcon(boolean showAddContentIcon) {
        this.showAddContentIcon = showAddContentIcon;
    }


    /**
     * Gets the showAddContentIconPermission value for this ThemeDisplay.
     * 
     * @return showAddContentIconPermission
     */
    public boolean isShowAddContentIconPermission() {
        return showAddContentIconPermission;
    }


    /**
     * Sets the showAddContentIconPermission value for this ThemeDisplay.
     * 
     * @param showAddContentIconPermission
     */
    public void setShowAddContentIconPermission(boolean showAddContentIconPermission) {
        this.showAddContentIconPermission = showAddContentIconPermission;
    }


    /**
     * Gets the showControlPanelIcon value for this ThemeDisplay.
     * 
     * @return showControlPanelIcon
     */
    public boolean isShowControlPanelIcon() {
        return showControlPanelIcon;
    }


    /**
     * Sets the showControlPanelIcon value for this ThemeDisplay.
     * 
     * @param showControlPanelIcon
     */
    public void setShowControlPanelIcon(boolean showControlPanelIcon) {
        this.showControlPanelIcon = showControlPanelIcon;
    }


    /**
     * Gets the showHomeIcon value for this ThemeDisplay.
     * 
     * @return showHomeIcon
     */
    public boolean isShowHomeIcon() {
        return showHomeIcon;
    }


    /**
     * Sets the showHomeIcon value for this ThemeDisplay.
     * 
     * @param showHomeIcon
     */
    public void setShowHomeIcon(boolean showHomeIcon) {
        this.showHomeIcon = showHomeIcon;
    }


    /**
     * Gets the showLayoutTemplatesIcon value for this ThemeDisplay.
     * 
     * @return showLayoutTemplatesIcon
     */
    public boolean isShowLayoutTemplatesIcon() {
        return showLayoutTemplatesIcon;
    }


    /**
     * Sets the showLayoutTemplatesIcon value for this ThemeDisplay.
     * 
     * @param showLayoutTemplatesIcon
     */
    public void setShowLayoutTemplatesIcon(boolean showLayoutTemplatesIcon) {
        this.showLayoutTemplatesIcon = showLayoutTemplatesIcon;
    }


    /**
     * Gets the showManageSiteMembershipsIcon value for this ThemeDisplay.
     * 
     * @return showManageSiteMembershipsIcon
     */
    public boolean isShowManageSiteMembershipsIcon() {
        return showManageSiteMembershipsIcon;
    }


    /**
     * Sets the showManageSiteMembershipsIcon value for this ThemeDisplay.
     * 
     * @param showManageSiteMembershipsIcon
     */
    public void setShowManageSiteMembershipsIcon(boolean showManageSiteMembershipsIcon) {
        this.showManageSiteMembershipsIcon = showManageSiteMembershipsIcon;
    }


    /**
     * Gets the showMyAccountIcon value for this ThemeDisplay.
     * 
     * @return showMyAccountIcon
     */
    public boolean isShowMyAccountIcon() {
        return showMyAccountIcon;
    }


    /**
     * Sets the showMyAccountIcon value for this ThemeDisplay.
     * 
     * @param showMyAccountIcon
     */
    public void setShowMyAccountIcon(boolean showMyAccountIcon) {
        this.showMyAccountIcon = showMyAccountIcon;
    }


    /**
     * Gets the showPageCustomizationIcon value for this ThemeDisplay.
     * 
     * @return showPageCustomizationIcon
     */
    public boolean isShowPageCustomizationIcon() {
        return showPageCustomizationIcon;
    }


    /**
     * Sets the showPageCustomizationIcon value for this ThemeDisplay.
     * 
     * @param showPageCustomizationIcon
     */
    public void setShowPageCustomizationIcon(boolean showPageCustomizationIcon) {
        this.showPageCustomizationIcon = showPageCustomizationIcon;
    }


    /**
     * Gets the showPageSettingsIcon value for this ThemeDisplay.
     * 
     * @return showPageSettingsIcon
     */
    public boolean isShowPageSettingsIcon() {
        return showPageSettingsIcon;
    }


    /**
     * Sets the showPageSettingsIcon value for this ThemeDisplay.
     * 
     * @param showPageSettingsIcon
     */
    public void setShowPageSettingsIcon(boolean showPageSettingsIcon) {
        this.showPageSettingsIcon = showPageSettingsIcon;
    }


    /**
     * Gets the showPortalIcon value for this ThemeDisplay.
     * 
     * @return showPortalIcon
     */
    public boolean isShowPortalIcon() {
        return showPortalIcon;
    }


    /**
     * Sets the showPortalIcon value for this ThemeDisplay.
     * 
     * @param showPortalIcon
     */
    public void setShowPortalIcon(boolean showPortalIcon) {
        this.showPortalIcon = showPortalIcon;
    }


    /**
     * Gets the showSignInIcon value for this ThemeDisplay.
     * 
     * @return showSignInIcon
     */
    public boolean isShowSignInIcon() {
        return showSignInIcon;
    }


    /**
     * Sets the showSignInIcon value for this ThemeDisplay.
     * 
     * @param showSignInIcon
     */
    public void setShowSignInIcon(boolean showSignInIcon) {
        this.showSignInIcon = showSignInIcon;
    }


    /**
     * Gets the showSignOutIcon value for this ThemeDisplay.
     * 
     * @return showSignOutIcon
     */
    public boolean isShowSignOutIcon() {
        return showSignOutIcon;
    }


    /**
     * Sets the showSignOutIcon value for this ThemeDisplay.
     * 
     * @param showSignOutIcon
     */
    public void setShowSignOutIcon(boolean showSignOutIcon) {
        this.showSignOutIcon = showSignOutIcon;
    }


    /**
     * Gets the showSiteAdministrationIcon value for this ThemeDisplay.
     * 
     * @return showSiteAdministrationIcon
     */
    public boolean isShowSiteAdministrationIcon() {
        return showSiteAdministrationIcon;
    }


    /**
     * Sets the showSiteAdministrationIcon value for this ThemeDisplay.
     * 
     * @param showSiteAdministrationIcon
     */
    public void setShowSiteAdministrationIcon(boolean showSiteAdministrationIcon) {
        this.showSiteAdministrationIcon = showSiteAdministrationIcon;
    }


    /**
     * Gets the showSiteContentIcon value for this ThemeDisplay.
     * 
     * @return showSiteContentIcon
     */
    public boolean isShowSiteContentIcon() {
        return showSiteContentIcon;
    }


    /**
     * Sets the showSiteContentIcon value for this ThemeDisplay.
     * 
     * @param showSiteContentIcon
     */
    public void setShowSiteContentIcon(boolean showSiteContentIcon) {
        this.showSiteContentIcon = showSiteContentIcon;
    }


    /**
     * Gets the showSiteMapSettingsIcon value for this ThemeDisplay.
     * 
     * @return showSiteMapSettingsIcon
     */
    public boolean isShowSiteMapSettingsIcon() {
        return showSiteMapSettingsIcon;
    }


    /**
     * Sets the showSiteMapSettingsIcon value for this ThemeDisplay.
     * 
     * @param showSiteMapSettingsIcon
     */
    public void setShowSiteMapSettingsIcon(boolean showSiteMapSettingsIcon) {
        this.showSiteMapSettingsIcon = showSiteMapSettingsIcon;
    }


    /**
     * Gets the showSiteSettingsIcon value for this ThemeDisplay.
     * 
     * @return showSiteSettingsIcon
     */
    public boolean isShowSiteSettingsIcon() {
        return showSiteSettingsIcon;
    }


    /**
     * Sets the showSiteSettingsIcon value for this ThemeDisplay.
     * 
     * @param showSiteSettingsIcon
     */
    public void setShowSiteSettingsIcon(boolean showSiteSettingsIcon) {
        this.showSiteSettingsIcon = showSiteSettingsIcon;
    }


    /**
     * Gets the showStagingIcon value for this ThemeDisplay.
     * 
     * @return showStagingIcon
     */
    public boolean isShowStagingIcon() {
        return showStagingIcon;
    }


    /**
     * Sets the showStagingIcon value for this ThemeDisplay.
     * 
     * @param showStagingIcon
     */
    public void setShowStagingIcon(boolean showStagingIcon) {
        this.showStagingIcon = showStagingIcon;
    }


    /**
     * Gets the signedIn value for this ThemeDisplay.
     * 
     * @return signedIn
     */
    public boolean isSignedIn() {
        return signedIn;
    }


    /**
     * Sets the signedIn value for this ThemeDisplay.
     * 
     * @param signedIn
     */
    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }


    /**
     * Gets the siteDefaultLocale value for this ThemeDisplay.
     * 
     * @return siteDefaultLocale
     */
    public java.lang.Object getSiteDefaultLocale() {
        return siteDefaultLocale;
    }


    /**
     * Sets the siteDefaultLocale value for this ThemeDisplay.
     * 
     * @param siteDefaultLocale
     */
    public void setSiteDefaultLocale(java.lang.Object siteDefaultLocale) {
        this.siteDefaultLocale = siteDefaultLocale;
    }


    /**
     * Gets the siteGroup value for this ThemeDisplay.
     * 
     * @return siteGroup
     */
    public java.lang.Object getSiteGroup() {
        return siteGroup;
    }


    /**
     * Sets the siteGroup value for this ThemeDisplay.
     * 
     * @param siteGroup
     */
    public void setSiteGroup(java.lang.Object siteGroup) {
        this.siteGroup = siteGroup;
    }


    /**
     * Gets the siteGroupId value for this ThemeDisplay.
     * 
     * @return siteGroupId
     */
    public long getSiteGroupId() {
        return siteGroupId;
    }


    /**
     * Sets the siteGroupId value for this ThemeDisplay.
     * 
     * @param siteGroupId
     */
    public void setSiteGroupId(long siteGroupId) {
        this.siteGroupId = siteGroupId;
    }


    /**
     * Gets the siteGroupIdOrLiveGroupId value for this ThemeDisplay.
     * 
     * @return siteGroupIdOrLiveGroupId
     */
    public long getSiteGroupIdOrLiveGroupId() {
        return siteGroupIdOrLiveGroupId;
    }


    /**
     * Sets the siteGroupIdOrLiveGroupId value for this ThemeDisplay.
     * 
     * @param siteGroupIdOrLiveGroupId
     */
    public void setSiteGroupIdOrLiveGroupId(long siteGroupIdOrLiveGroupId) {
        this.siteGroupIdOrLiveGroupId = siteGroupIdOrLiveGroupId;
    }


    /**
     * Gets the siteGroupName value for this ThemeDisplay.
     * 
     * @return siteGroupName
     */
    public java.lang.String getSiteGroupName() {
        return siteGroupName;
    }


    /**
     * Sets the siteGroupName value for this ThemeDisplay.
     * 
     * @param siteGroupName
     */
    public void setSiteGroupName(java.lang.String siteGroupName) {
        this.siteGroupName = siteGroupName;
    }


    /**
     * Gets the stateExclusive value for this ThemeDisplay.
     * 
     * @return stateExclusive
     */
    public boolean isStateExclusive() {
        return stateExclusive;
    }


    /**
     * Sets the stateExclusive value for this ThemeDisplay.
     * 
     * @param stateExclusive
     */
    public void setStateExclusive(boolean stateExclusive) {
        this.stateExclusive = stateExclusive;
    }


    /**
     * Gets the stateMaximized value for this ThemeDisplay.
     * 
     * @return stateMaximized
     */
    public boolean isStateMaximized() {
        return stateMaximized;
    }


    /**
     * Sets the stateMaximized value for this ThemeDisplay.
     * 
     * @param stateMaximized
     */
    public void setStateMaximized(boolean stateMaximized) {
        this.stateMaximized = stateMaximized;
    }


    /**
     * Gets the statePopUp value for this ThemeDisplay.
     * 
     * @return statePopUp
     */
    public boolean isStatePopUp() {
        return statePopUp;
    }


    /**
     * Sets the statePopUp value for this ThemeDisplay.
     * 
     * @param statePopUp
     */
    public void setStatePopUp(boolean statePopUp) {
        this.statePopUp = statePopUp;
    }


    /**
     * Gets the theme value for this ThemeDisplay.
     * 
     * @return theme
     */
    public java.lang.Object getTheme() {
        return theme;
    }


    /**
     * Sets the theme value for this ThemeDisplay.
     * 
     * @param theme
     */
    public void setTheme(java.lang.Object theme) {
        this.theme = theme;
    }


    /**
     * Gets the themeCssFastLoad value for this ThemeDisplay.
     * 
     * @return themeCssFastLoad
     */
    public boolean isThemeCssFastLoad() {
        return themeCssFastLoad;
    }


    /**
     * Sets the themeCssFastLoad value for this ThemeDisplay.
     * 
     * @param themeCssFastLoad
     */
    public void setThemeCssFastLoad(boolean themeCssFastLoad) {
        this.themeCssFastLoad = themeCssFastLoad;
    }


    /**
     * Gets the themeId value for this ThemeDisplay.
     * 
     * @return themeId
     */
    public java.lang.String getThemeId() {
        return themeId;
    }


    /**
     * Sets the themeId value for this ThemeDisplay.
     * 
     * @param themeId
     */
    public void setThemeId(java.lang.String themeId) {
        this.themeId = themeId;
    }


    /**
     * Gets the themeImagesFastLoad value for this ThemeDisplay.
     * 
     * @return themeImagesFastLoad
     */
    public boolean isThemeImagesFastLoad() {
        return themeImagesFastLoad;
    }


    /**
     * Sets the themeImagesFastLoad value for this ThemeDisplay.
     * 
     * @param themeImagesFastLoad
     */
    public void setThemeImagesFastLoad(boolean themeImagesFastLoad) {
        this.themeImagesFastLoad = themeImagesFastLoad;
    }


    /**
     * Gets the themeJsBarebone value for this ThemeDisplay.
     * 
     * @return themeJsBarebone
     */
    public boolean isThemeJsBarebone() {
        return themeJsBarebone;
    }


    /**
     * Sets the themeJsBarebone value for this ThemeDisplay.
     * 
     * @param themeJsBarebone
     */
    public void setThemeJsBarebone(boolean themeJsBarebone) {
        this.themeJsBarebone = themeJsBarebone;
    }


    /**
     * Gets the themeJsFastLoad value for this ThemeDisplay.
     * 
     * @return themeJsFastLoad
     */
    public boolean isThemeJsFastLoad() {
        return themeJsFastLoad;
    }


    /**
     * Sets the themeJsFastLoad value for this ThemeDisplay.
     * 
     * @param themeJsFastLoad
     */
    public void setThemeJsFastLoad(boolean themeJsFastLoad) {
        this.themeJsFastLoad = themeJsFastLoad;
    }


    /**
     * Gets the themeSettings value for this ThemeDisplay.
     * 
     * @return themeSettings
     */
    public java.lang.Object getThemeSettings() {
        return themeSettings;
    }


    /**
     * Sets the themeSettings value for this ThemeDisplay.
     * 
     * @param themeSettings
     */
    public void setThemeSettings(java.lang.Object themeSettings) {
        this.themeSettings = themeSettings;
    }


    /**
     * Gets the tilesContent value for this ThemeDisplay.
     * 
     * @return tilesContent
     */
    public java.lang.String getTilesContent() {
        return tilesContent;
    }


    /**
     * Sets the tilesContent value for this ThemeDisplay.
     * 
     * @param tilesContent
     */
    public void setTilesContent(java.lang.String tilesContent) {
        this.tilesContent = tilesContent;
    }


    /**
     * Gets the tilesSelectable value for this ThemeDisplay.
     * 
     * @return tilesSelectable
     */
    public boolean isTilesSelectable() {
        return tilesSelectable;
    }


    /**
     * Sets the tilesSelectable value for this ThemeDisplay.
     * 
     * @param tilesSelectable
     */
    public void setTilesSelectable(boolean tilesSelectable) {
        this.tilesSelectable = tilesSelectable;
    }


    /**
     * Gets the tilesTitle value for this ThemeDisplay.
     * 
     * @return tilesTitle
     */
    public java.lang.String getTilesTitle() {
        return tilesTitle;
    }


    /**
     * Sets the tilesTitle value for this ThemeDisplay.
     * 
     * @param tilesTitle
     */
    public void setTilesTitle(java.lang.String tilesTitle) {
        this.tilesTitle = tilesTitle;
    }


    /**
     * Gets the timeZone value for this ThemeDisplay.
     * 
     * @return timeZone
     */
    public java.lang.Object getTimeZone() {
        return timeZone;
    }


    /**
     * Sets the timeZone value for this ThemeDisplay.
     * 
     * @param timeZone
     */
    public void setTimeZone(java.lang.Object timeZone) {
        this.timeZone = timeZone;
    }


    /**
     * Gets the unfilteredLayouts value for this ThemeDisplay.
     * 
     * @return unfilteredLayouts
     */
    public java.lang.Object[] getUnfilteredLayouts() {
        return unfilteredLayouts;
    }


    /**
     * Sets the unfilteredLayouts value for this ThemeDisplay.
     * 
     * @param unfilteredLayouts
     */
    public void setUnfilteredLayouts(java.lang.Object[] unfilteredLayouts) {
        this.unfilteredLayouts = unfilteredLayouts;
    }


    /**
     * Gets the user value for this ThemeDisplay.
     * 
     * @return user
     */
    public java.lang.Object getUser() {
        return user;
    }


    /**
     * Sets the user value for this ThemeDisplay.
     * 
     * @param user
     */
    public void setUser(java.lang.Object user) {
        this.user = user;
    }


    /**
     * Gets the userId value for this ThemeDisplay.
     * 
     * @return userId
     */
    public long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this ThemeDisplay.
     * 
     * @param userId
     */
    public void setUserId(long userId) {
        this.userId = userId;
    }


    /**
     * Gets the wapTheme value for this ThemeDisplay.
     * 
     * @return wapTheme
     */
    public boolean isWapTheme() {
        return wapTheme;
    }


    /**
     * Sets the wapTheme value for this ThemeDisplay.
     * 
     * @param wapTheme
     */
    public void setWapTheme(boolean wapTheme) {
        this.wapTheme = wapTheme;
    }


    /**
     * Gets the widget value for this ThemeDisplay.
     * 
     * @return widget
     */
    public boolean isWidget() {
        return widget;
    }


    /**
     * Sets the widget value for this ThemeDisplay.
     * 
     * @param widget
     */
    public void setWidget(boolean widget) {
        this.widget = widget;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ThemeDisplay)) return false;
        ThemeDisplay other = (ThemeDisplay) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CDNBaseURL==null && other.getCDNBaseURL()==null) || 
             (this.CDNBaseURL!=null &&
              this.CDNBaseURL.equals(other.getCDNBaseURL()))) &&
            ((this.CDNDynamicResourcesHost==null && other.getCDNDynamicResourcesHost()==null) || 
             (this.CDNDynamicResourcesHost!=null &&
              this.CDNDynamicResourcesHost.equals(other.getCDNDynamicResourcesHost()))) &&
            ((this.CDNHost==null && other.getCDNHost()==null) || 
             (this.CDNHost!=null &&
              this.CDNHost.equals(other.getCDNHost()))) &&
            ((this.MDRRuleGroupInstance==null && other.getMDRRuleGroupInstance()==null) || 
             (this.MDRRuleGroupInstance!=null &&
              this.MDRRuleGroupInstance.equals(other.getMDRRuleGroupInstance()))) &&
            ((this.URLAddContent==null && other.getURLAddContent()==null) || 
             (this.URLAddContent!=null &&
              this.URLAddContent.equals(other.getURLAddContent()))) &&
            ((this.URLControlPanel==null && other.getURLControlPanel()==null) || 
             (this.URLControlPanel!=null &&
              this.URLControlPanel.equals(other.getURLControlPanel()))) &&
            ((this.URLCurrent==null && other.getURLCurrent()==null) || 
             (this.URLCurrent!=null &&
              this.URLCurrent.equals(other.getURLCurrent()))) &&
            ((this.URLHome==null && other.getURLHome()==null) || 
             (this.URLHome!=null &&
              this.URLHome.equals(other.getURLHome()))) &&
            ((this.URLLayoutTemplates==null && other.getURLLayoutTemplates()==null) || 
             (this.URLLayoutTemplates!=null &&
              this.URLLayoutTemplates.equals(other.getURLLayoutTemplates()))) &&
            ((this.URLManageSiteMemberships==null && other.getURLManageSiteMemberships()==null) || 
             (this.URLManageSiteMemberships!=null &&
              this.URLManageSiteMemberships.equals(other.getURLManageSiteMemberships()))) &&
            ((this.URLMyAccount==null && other.getURLMyAccount()==null) || 
             (this.URLMyAccount!=null &&
              this.URLMyAccount.equals(other.getURLMyAccount()))) &&
            ((this.URLPageSettings==null && other.getURLPageSettings()==null) || 
             (this.URLPageSettings!=null &&
              this.URLPageSettings.equals(other.getURLPageSettings()))) &&
            ((this.URLPortal==null && other.getURLPortal()==null) || 
             (this.URLPortal!=null &&
              this.URLPortal.equals(other.getURLPortal()))) &&
            ((this.URLPublishToLive==null && other.getURLPublishToLive()==null) || 
             (this.URLPublishToLive!=null &&
              this.URLPublishToLive.equals(other.getURLPublishToLive()))) &&
            ((this.URLSignIn==null && other.getURLSignIn()==null) || 
             (this.URLSignIn!=null &&
              this.URLSignIn.equals(other.getURLSignIn()))) &&
            ((this.URLSignOut==null && other.getURLSignOut()==null) || 
             (this.URLSignOut!=null &&
              this.URLSignOut.equals(other.getURLSignOut()))) &&
            ((this.URLSiteAdministration==null && other.getURLSiteAdministration()==null) || 
             (this.URLSiteAdministration!=null &&
              this.URLSiteAdministration.equals(other.getURLSiteAdministration()))) &&
            ((this.URLSiteContent==null && other.getURLSiteContent()==null) || 
             (this.URLSiteContent!=null &&
              this.URLSiteContent.equals(other.getURLSiteContent()))) &&
            ((this.URLSiteMapSettings==null && other.getURLSiteMapSettings()==null) || 
             (this.URLSiteMapSettings!=null &&
              this.URLSiteMapSettings.equals(other.getURLSiteMapSettings()))) &&
            ((this.URLSiteSettings==null && other.getURLSiteSettings()==null) || 
             (this.URLSiteSettings!=null &&
              this.URLSiteSettings.equals(other.getURLSiteSettings()))) &&
            ((this.URLUpdateManager==null && other.getURLUpdateManager()==null) || 
             (this.URLUpdateManager!=null &&
              this.URLUpdateManager.equals(other.getURLUpdateManager()))) &&
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            this.addSessionIdToURL == other.isAddSessionIdToURL() &&
            this.ajax == other.isAjax() &&
            ((this.colorScheme==null && other.getColorScheme()==null) || 
             (this.colorScheme!=null &&
              this.colorScheme.equals(other.getColorScheme()))) &&
            ((this.colorSchemeId==null && other.getColorSchemeId()==null) || 
             (this.colorSchemeId!=null &&
              this.colorSchemeId.equals(other.getColorSchemeId()))) &&
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              this.company.equals(other.getCompany()))) &&
            this.companyGroupId == other.getCompanyGroupId() &&
            this.companyId == other.getCompanyId() &&
            ((this.companyLogo==null && other.getCompanyLogo()==null) || 
             (this.companyLogo!=null &&
              this.companyLogo.equals(other.getCompanyLogo()))) &&
            this.companyLogoHeight == other.getCompanyLogoHeight() &&
            this.companyLogoWidth == other.getCompanyLogoWidth() &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              this.contact.equals(other.getContact()))) &&
            ((this.controlPanelCategory==null && other.getControlPanelCategory()==null) || 
             (this.controlPanelCategory!=null &&
              this.controlPanelCategory.equals(other.getControlPanelCategory()))) &&
            ((this.defaultUser==null && other.getDefaultUser()==null) || 
             (this.defaultUser!=null &&
              this.defaultUser.equals(other.getDefaultUser()))) &&
            this.defaultUserId == other.getDefaultUserId() &&
            ((this.device==null && other.getDevice()==null) || 
             (this.device!=null &&
              this.device.equals(other.getDevice()))) &&
            this.doAsGroupId == other.getDoAsGroupId() &&
            ((this.doAsUserId==null && other.getDoAsUserId()==null) || 
             (this.doAsUserId!=null &&
              this.doAsUserId.equals(other.getDoAsUserId()))) &&
            ((this.doAsUserLanguageId==null && other.getDoAsUserLanguageId()==null) || 
             (this.doAsUserLanguageId!=null &&
              this.doAsUserLanguageId.equals(other.getDoAsUserLanguageId()))) &&
            this.facebook == other.isFacebook() &&
            ((this.facebookCanvasPageURL==null && other.getFacebookCanvasPageURL()==null) || 
             (this.facebookCanvasPageURL!=null &&
              this.facebookCanvasPageURL.equals(other.getFacebookCanvasPageURL()))) &&
            this.freeformLayout == other.isFreeformLayout() &&
            this.i18N == other.isI18N() &&
            ((this.i18NLanguageId==null && other.getI18NLanguageId()==null) || 
             (this.i18NLanguageId!=null &&
              this.i18NLanguageId.equals(other.getI18NLanguageId()))) &&
            ((this.i18NPath==null && other.getI18NPath()==null) || 
             (this.i18NPath!=null &&
              this.i18NPath.equals(other.getI18NPath()))) &&
            this.impersonated == other.isImpersonated() &&
            this.includePortletCssJs == other.isIncludePortletCssJs() &&
            this.isolated == other.isIsolated() &&
            ((this.languageId==null && other.getLanguageId()==null) || 
             (this.languageId!=null &&
              this.languageId.equals(other.getLanguageId()))) &&
            ((this.layout==null && other.getLayout()==null) || 
             (this.layout!=null &&
              this.layout.equals(other.getLayout()))) &&
            ((this.layoutSet==null && other.getLayoutSet()==null) || 
             (this.layoutSet!=null &&
              this.layoutSet.equals(other.getLayoutSet()))) &&
            ((this.layoutSetLogo==null && other.getLayoutSetLogo()==null) || 
             (this.layoutSetLogo!=null &&
              this.layoutSetLogo.equals(other.getLayoutSetLogo()))) &&
            ((this.layoutTypePortlet==null && other.getLayoutTypePortlet()==null) || 
             (this.layoutTypePortlet!=null &&
              this.layoutTypePortlet.equals(other.getLayoutTypePortlet()))) &&
            ((this.layouts==null && other.getLayouts()==null) || 
             (this.layouts!=null &&
              java.util.Arrays.equals(this.layouts, other.getLayouts()))) &&
            ((this.lifecycle==null && other.getLifecycle()==null) || 
             (this.lifecycle!=null &&
              this.lifecycle.equals(other.getLifecycle()))) &&
            this.lifecycleAction == other.isLifecycleAction() &&
            this.lifecycleEvent == other.isLifecycleEvent() &&
            this.lifecycleRender == other.isLifecycleRender() &&
            this.lifecycleResource == other.isLifecycleResource() &&
            ((this.locale==null && other.getLocale()==null) || 
             (this.locale!=null &&
              this.locale.equals(other.getLocale()))) &&
            ((this.parentGroup==null && other.getParentGroup()==null) || 
             (this.parentGroup!=null &&
              this.parentGroup.equals(other.getParentGroup()))) &&
            this.parentGroupId == other.getParentGroupId() &&
            ((this.parentGroupName==null && other.getParentGroupName()==null) || 
             (this.parentGroupName!=null &&
              this.parentGroupName.equals(other.getParentGroupName()))) &&
            ((this.pathApplet==null && other.getPathApplet()==null) || 
             (this.pathApplet!=null &&
              this.pathApplet.equals(other.getPathApplet()))) &&
            ((this.pathCms==null && other.getPathCms()==null) || 
             (this.pathCms!=null &&
              this.pathCms.equals(other.getPathCms()))) &&
            ((this.pathColorSchemeImages==null && other.getPathColorSchemeImages()==null) || 
             (this.pathColorSchemeImages!=null &&
              this.pathColorSchemeImages.equals(other.getPathColorSchemeImages()))) &&
            ((this.pathContext==null && other.getPathContext()==null) || 
             (this.pathContext!=null &&
              this.pathContext.equals(other.getPathContext()))) &&
            ((this.pathFlash==null && other.getPathFlash()==null) || 
             (this.pathFlash!=null &&
              this.pathFlash.equals(other.getPathFlash()))) &&
            ((this.pathFriendlyURLPrivateGroup==null && other.getPathFriendlyURLPrivateGroup()==null) || 
             (this.pathFriendlyURLPrivateGroup!=null &&
              this.pathFriendlyURLPrivateGroup.equals(other.getPathFriendlyURLPrivateGroup()))) &&
            ((this.pathFriendlyURLPrivateUser==null && other.getPathFriendlyURLPrivateUser()==null) || 
             (this.pathFriendlyURLPrivateUser!=null &&
              this.pathFriendlyURLPrivateUser.equals(other.getPathFriendlyURLPrivateUser()))) &&
            ((this.pathFriendlyURLPublic==null && other.getPathFriendlyURLPublic()==null) || 
             (this.pathFriendlyURLPublic!=null &&
              this.pathFriendlyURLPublic.equals(other.getPathFriendlyURLPublic()))) &&
            ((this.pathImage==null && other.getPathImage()==null) || 
             (this.pathImage!=null &&
              this.pathImage.equals(other.getPathImage()))) &&
            ((this.pathJavaScript==null && other.getPathJavaScript()==null) || 
             (this.pathJavaScript!=null &&
              this.pathJavaScript.equals(other.getPathJavaScript()))) &&
            ((this.pathMain==null && other.getPathMain()==null) || 
             (this.pathMain!=null &&
              this.pathMain.equals(other.getPathMain()))) &&
            ((this.pathSound==null && other.getPathSound()==null) || 
             (this.pathSound!=null &&
              this.pathSound.equals(other.getPathSound()))) &&
            ((this.pathThemeCss==null && other.getPathThemeCss()==null) || 
             (this.pathThemeCss!=null &&
              this.pathThemeCss.equals(other.getPathThemeCss()))) &&
            ((this.pathThemeImage==null && other.getPathThemeImage()==null) || 
             (this.pathThemeImage!=null &&
              this.pathThemeImage.equals(other.getPathThemeImage()))) &&
            ((this.pathThemeImages==null && other.getPathThemeImages()==null) || 
             (this.pathThemeImages!=null &&
              this.pathThemeImages.equals(other.getPathThemeImages()))) &&
            ((this.pathThemeJavaScript==null && other.getPathThemeJavaScript()==null) || 
             (this.pathThemeJavaScript!=null &&
              this.pathThemeJavaScript.equals(other.getPathThemeJavaScript()))) &&
            ((this.pathThemeRoot==null && other.getPathThemeRoot()==null) || 
             (this.pathThemeRoot!=null &&
              this.pathThemeRoot.equals(other.getPathThemeRoot()))) &&
            ((this.pathThemeTemplates==null && other.getPathThemeTemplates()==null) || 
             (this.pathThemeTemplates!=null &&
              this.pathThemeTemplates.equals(other.getPathThemeTemplates()))) &&
            ((this.permissionChecker==null && other.getPermissionChecker()==null) || 
             (this.permissionChecker!=null &&
              this.permissionChecker.equals(other.getPermissionChecker()))) &&
            this.plid == other.getPlid() &&
            ((this.portalURL==null && other.getPortalURL()==null) || 
             (this.portalURL!=null &&
              this.portalURL.equals(other.getPortalURL()))) &&
            ((this.portletDisplay==null && other.getPortletDisplay()==null) || 
             (this.portletDisplay!=null &&
              this.portletDisplay.equals(other.getPortletDisplay()))) &&
            this.portletGroupId == other.getPortletGroupId() &&
            ((this.ppid==null && other.getPpid()==null) || 
             (this.ppid!=null &&
              this.ppid.equals(other.getPpid()))) &&
            ((this.realCompanyLogo==null && other.getRealCompanyLogo()==null) || 
             (this.realCompanyLogo!=null &&
              this.realCompanyLogo.equals(other.getRealCompanyLogo()))) &&
            this.realCompanyLogoHeight == other.getRealCompanyLogoHeight() &&
            this.realCompanyLogoWidth == other.getRealCompanyLogoWidth() &&
            ((this.realUser==null && other.getRealUser()==null) || 
             (this.realUser!=null &&
              this.realUser.equals(other.getRealUser()))) &&
            this.realUserId == other.getRealUserId() &&
            this.refererGroupId == other.getRefererGroupId() &&
            this.refererPlid == other.getRefererPlid() &&
            ((this.request==null && other.getRequest()==null) || 
             (this.request!=null &&
              this.request.equals(other.getRequest()))) &&
            ((this.scopeGroup==null && other.getScopeGroup()==null) || 
             (this.scopeGroup!=null &&
              this.scopeGroup.equals(other.getScopeGroup()))) &&
            this.scopeGroupId == other.getScopeGroupId() &&
            this.scopeGroupIdOrLiveGroupId == other.getScopeGroupIdOrLiveGroupId() &&
            ((this.scopeGroupName==null && other.getScopeGroupName()==null) || 
             (this.scopeGroupName!=null &&
              this.scopeGroupName.equals(other.getScopeGroupName()))) &&
            ((this.scopeLayout==null && other.getScopeLayout()==null) || 
             (this.scopeLayout!=null &&
              this.scopeLayout.equals(other.getScopeLayout()))) &&
            this.secure == other.isSecure() &&
            ((this.serverName==null && other.getServerName()==null) || 
             (this.serverName!=null &&
              this.serverName.equals(other.getServerName()))) &&
            this.serverPort == other.getServerPort() &&
            ((this.sessionId==null && other.getSessionId()==null) || 
             (this.sessionId!=null &&
              this.sessionId.equals(other.getSessionId()))) &&
            this.showAddContentIcon == other.isShowAddContentIcon() &&
            this.showAddContentIconPermission == other.isShowAddContentIconPermission() &&
            this.showControlPanelIcon == other.isShowControlPanelIcon() &&
            this.showHomeIcon == other.isShowHomeIcon() &&
            this.showLayoutTemplatesIcon == other.isShowLayoutTemplatesIcon() &&
            this.showManageSiteMembershipsIcon == other.isShowManageSiteMembershipsIcon() &&
            this.showMyAccountIcon == other.isShowMyAccountIcon() &&
            this.showPageCustomizationIcon == other.isShowPageCustomizationIcon() &&
            this.showPageSettingsIcon == other.isShowPageSettingsIcon() &&
            this.showPortalIcon == other.isShowPortalIcon() &&
            this.showSignInIcon == other.isShowSignInIcon() &&
            this.showSignOutIcon == other.isShowSignOutIcon() &&
            this.showSiteAdministrationIcon == other.isShowSiteAdministrationIcon() &&
            this.showSiteContentIcon == other.isShowSiteContentIcon() &&
            this.showSiteMapSettingsIcon == other.isShowSiteMapSettingsIcon() &&
            this.showSiteSettingsIcon == other.isShowSiteSettingsIcon() &&
            this.showStagingIcon == other.isShowStagingIcon() &&
            this.signedIn == other.isSignedIn() &&
            ((this.siteDefaultLocale==null && other.getSiteDefaultLocale()==null) || 
             (this.siteDefaultLocale!=null &&
              this.siteDefaultLocale.equals(other.getSiteDefaultLocale()))) &&
            ((this.siteGroup==null && other.getSiteGroup()==null) || 
             (this.siteGroup!=null &&
              this.siteGroup.equals(other.getSiteGroup()))) &&
            this.siteGroupId == other.getSiteGroupId() &&
            this.siteGroupIdOrLiveGroupId == other.getSiteGroupIdOrLiveGroupId() &&
            ((this.siteGroupName==null && other.getSiteGroupName()==null) || 
             (this.siteGroupName!=null &&
              this.siteGroupName.equals(other.getSiteGroupName()))) &&
            this.stateExclusive == other.isStateExclusive() &&
            this.stateMaximized == other.isStateMaximized() &&
            this.statePopUp == other.isStatePopUp() &&
            ((this.theme==null && other.getTheme()==null) || 
             (this.theme!=null &&
              this.theme.equals(other.getTheme()))) &&
            this.themeCssFastLoad == other.isThemeCssFastLoad() &&
            ((this.themeId==null && other.getThemeId()==null) || 
             (this.themeId!=null &&
              this.themeId.equals(other.getThemeId()))) &&
            this.themeImagesFastLoad == other.isThemeImagesFastLoad() &&
            this.themeJsBarebone == other.isThemeJsBarebone() &&
            this.themeJsFastLoad == other.isThemeJsFastLoad() &&
            ((this.themeSettings==null && other.getThemeSettings()==null) || 
             (this.themeSettings!=null &&
              this.themeSettings.equals(other.getThemeSettings()))) &&
            ((this.tilesContent==null && other.getTilesContent()==null) || 
             (this.tilesContent!=null &&
              this.tilesContent.equals(other.getTilesContent()))) &&
            this.tilesSelectable == other.isTilesSelectable() &&
            ((this.tilesTitle==null && other.getTilesTitle()==null) || 
             (this.tilesTitle!=null &&
              this.tilesTitle.equals(other.getTilesTitle()))) &&
            ((this.timeZone==null && other.getTimeZone()==null) || 
             (this.timeZone!=null &&
              this.timeZone.equals(other.getTimeZone()))) &&
            ((this.unfilteredLayouts==null && other.getUnfilteredLayouts()==null) || 
             (this.unfilteredLayouts!=null &&
              java.util.Arrays.equals(this.unfilteredLayouts, other.getUnfilteredLayouts()))) &&
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser()))) &&
            this.userId == other.getUserId() &&
            this.wapTheme == other.isWapTheme() &&
            this.widget == other.isWidget();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCDNBaseURL() != null) {
            _hashCode += getCDNBaseURL().hashCode();
        }
        if (getCDNDynamicResourcesHost() != null) {
            _hashCode += getCDNDynamicResourcesHost().hashCode();
        }
        if (getCDNHost() != null) {
            _hashCode += getCDNHost().hashCode();
        }
        if (getMDRRuleGroupInstance() != null) {
            _hashCode += getMDRRuleGroupInstance().hashCode();
        }
        if (getURLAddContent() != null) {
            _hashCode += getURLAddContent().hashCode();
        }
        if (getURLControlPanel() != null) {
            _hashCode += getURLControlPanel().hashCode();
        }
        if (getURLCurrent() != null) {
            _hashCode += getURLCurrent().hashCode();
        }
        if (getURLHome() != null) {
            _hashCode += getURLHome().hashCode();
        }
        if (getURLLayoutTemplates() != null) {
            _hashCode += getURLLayoutTemplates().hashCode();
        }
        if (getURLManageSiteMemberships() != null) {
            _hashCode += getURLManageSiteMemberships().hashCode();
        }
        if (getURLMyAccount() != null) {
            _hashCode += getURLMyAccount().hashCode();
        }
        if (getURLPageSettings() != null) {
            _hashCode += getURLPageSettings().hashCode();
        }
        if (getURLPortal() != null) {
            _hashCode += getURLPortal().hashCode();
        }
        if (getURLPublishToLive() != null) {
            _hashCode += getURLPublishToLive().hashCode();
        }
        if (getURLSignIn() != null) {
            _hashCode += getURLSignIn().hashCode();
        }
        if (getURLSignOut() != null) {
            _hashCode += getURLSignOut().hashCode();
        }
        if (getURLSiteAdministration() != null) {
            _hashCode += getURLSiteAdministration().hashCode();
        }
        if (getURLSiteContent() != null) {
            _hashCode += getURLSiteContent().hashCode();
        }
        if (getURLSiteMapSettings() != null) {
            _hashCode += getURLSiteMapSettings().hashCode();
        }
        if (getURLSiteSettings() != null) {
            _hashCode += getURLSiteSettings().hashCode();
        }
        if (getURLUpdateManager() != null) {
            _hashCode += getURLUpdateManager().hashCode();
        }
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        _hashCode += (isAddSessionIdToURL() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAjax() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getColorScheme() != null) {
            _hashCode += getColorScheme().hashCode();
        }
        if (getColorSchemeId() != null) {
            _hashCode += getColorSchemeId().hashCode();
        }
        if (getCompany() != null) {
            _hashCode += getCompany().hashCode();
        }
        _hashCode += new Long(getCompanyGroupId()).hashCode();
        _hashCode += new Long(getCompanyId()).hashCode();
        if (getCompanyLogo() != null) {
            _hashCode += getCompanyLogo().hashCode();
        }
        _hashCode += getCompanyLogoHeight();
        _hashCode += getCompanyLogoWidth();
        if (getContact() != null) {
            _hashCode += getContact().hashCode();
        }
        if (getControlPanelCategory() != null) {
            _hashCode += getControlPanelCategory().hashCode();
        }
        if (getDefaultUser() != null) {
            _hashCode += getDefaultUser().hashCode();
        }
        _hashCode += new Long(getDefaultUserId()).hashCode();
        if (getDevice() != null) {
            _hashCode += getDevice().hashCode();
        }
        _hashCode += new Long(getDoAsGroupId()).hashCode();
        if (getDoAsUserId() != null) {
            _hashCode += getDoAsUserId().hashCode();
        }
        if (getDoAsUserLanguageId() != null) {
            _hashCode += getDoAsUserLanguageId().hashCode();
        }
        _hashCode += (isFacebook() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getFacebookCanvasPageURL() != null) {
            _hashCode += getFacebookCanvasPageURL().hashCode();
        }
        _hashCode += (isFreeformLayout() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isI18N() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getI18NLanguageId() != null) {
            _hashCode += getI18NLanguageId().hashCode();
        }
        if (getI18NPath() != null) {
            _hashCode += getI18NPath().hashCode();
        }
        _hashCode += (isImpersonated() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIncludePortletCssJs() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsolated() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getLanguageId() != null) {
            _hashCode += getLanguageId().hashCode();
        }
        if (getLayout() != null) {
            _hashCode += getLayout().hashCode();
        }
        if (getLayoutSet() != null) {
            _hashCode += getLayoutSet().hashCode();
        }
        if (getLayoutSetLogo() != null) {
            _hashCode += getLayoutSetLogo().hashCode();
        }
        if (getLayoutTypePortlet() != null) {
            _hashCode += getLayoutTypePortlet().hashCode();
        }
        if (getLayouts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLayouts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLayouts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLifecycle() != null) {
            _hashCode += getLifecycle().hashCode();
        }
        _hashCode += (isLifecycleAction() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isLifecycleEvent() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isLifecycleRender() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isLifecycleResource() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getLocale() != null) {
            _hashCode += getLocale().hashCode();
        }
        if (getParentGroup() != null) {
            _hashCode += getParentGroup().hashCode();
        }
        _hashCode += new Long(getParentGroupId()).hashCode();
        if (getParentGroupName() != null) {
            _hashCode += getParentGroupName().hashCode();
        }
        if (getPathApplet() != null) {
            _hashCode += getPathApplet().hashCode();
        }
        if (getPathCms() != null) {
            _hashCode += getPathCms().hashCode();
        }
        if (getPathColorSchemeImages() != null) {
            _hashCode += getPathColorSchemeImages().hashCode();
        }
        if (getPathContext() != null) {
            _hashCode += getPathContext().hashCode();
        }
        if (getPathFlash() != null) {
            _hashCode += getPathFlash().hashCode();
        }
        if (getPathFriendlyURLPrivateGroup() != null) {
            _hashCode += getPathFriendlyURLPrivateGroup().hashCode();
        }
        if (getPathFriendlyURLPrivateUser() != null) {
            _hashCode += getPathFriendlyURLPrivateUser().hashCode();
        }
        if (getPathFriendlyURLPublic() != null) {
            _hashCode += getPathFriendlyURLPublic().hashCode();
        }
        if (getPathImage() != null) {
            _hashCode += getPathImage().hashCode();
        }
        if (getPathJavaScript() != null) {
            _hashCode += getPathJavaScript().hashCode();
        }
        if (getPathMain() != null) {
            _hashCode += getPathMain().hashCode();
        }
        if (getPathSound() != null) {
            _hashCode += getPathSound().hashCode();
        }
        if (getPathThemeCss() != null) {
            _hashCode += getPathThemeCss().hashCode();
        }
        if (getPathThemeImage() != null) {
            _hashCode += getPathThemeImage().hashCode();
        }
        if (getPathThemeImages() != null) {
            _hashCode += getPathThemeImages().hashCode();
        }
        if (getPathThemeJavaScript() != null) {
            _hashCode += getPathThemeJavaScript().hashCode();
        }
        if (getPathThemeRoot() != null) {
            _hashCode += getPathThemeRoot().hashCode();
        }
        if (getPathThemeTemplates() != null) {
            _hashCode += getPathThemeTemplates().hashCode();
        }
        if (getPermissionChecker() != null) {
            _hashCode += getPermissionChecker().hashCode();
        }
        _hashCode += new Long(getPlid()).hashCode();
        if (getPortalURL() != null) {
            _hashCode += getPortalURL().hashCode();
        }
        if (getPortletDisplay() != null) {
            _hashCode += getPortletDisplay().hashCode();
        }
        _hashCode += new Long(getPortletGroupId()).hashCode();
        if (getPpid() != null) {
            _hashCode += getPpid().hashCode();
        }
        if (getRealCompanyLogo() != null) {
            _hashCode += getRealCompanyLogo().hashCode();
        }
        _hashCode += getRealCompanyLogoHeight();
        _hashCode += getRealCompanyLogoWidth();
        if (getRealUser() != null) {
            _hashCode += getRealUser().hashCode();
        }
        _hashCode += new Long(getRealUserId()).hashCode();
        _hashCode += new Long(getRefererGroupId()).hashCode();
        _hashCode += new Long(getRefererPlid()).hashCode();
        if (getRequest() != null) {
            _hashCode += getRequest().hashCode();
        }
        if (getScopeGroup() != null) {
            _hashCode += getScopeGroup().hashCode();
        }
        _hashCode += new Long(getScopeGroupId()).hashCode();
        _hashCode += new Long(getScopeGroupIdOrLiveGroupId()).hashCode();
        if (getScopeGroupName() != null) {
            _hashCode += getScopeGroupName().hashCode();
        }
        if (getScopeLayout() != null) {
            _hashCode += getScopeLayout().hashCode();
        }
        _hashCode += (isSecure() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getServerName() != null) {
            _hashCode += getServerName().hashCode();
        }
        _hashCode += getServerPort();
        if (getSessionId() != null) {
            _hashCode += getSessionId().hashCode();
        }
        _hashCode += (isShowAddContentIcon() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isShowAddContentIconPermission() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isShowControlPanelIcon() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isShowHomeIcon() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isShowLayoutTemplatesIcon() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isShowManageSiteMembershipsIcon() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isShowMyAccountIcon() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isShowPageCustomizationIcon() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isShowPageSettingsIcon() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isShowPortalIcon() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isShowSignInIcon() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isShowSignOutIcon() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isShowSiteAdministrationIcon() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isShowSiteContentIcon() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isShowSiteMapSettingsIcon() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isShowSiteSettingsIcon() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isShowStagingIcon() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSignedIn() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSiteDefaultLocale() != null) {
            _hashCode += getSiteDefaultLocale().hashCode();
        }
        if (getSiteGroup() != null) {
            _hashCode += getSiteGroup().hashCode();
        }
        _hashCode += new Long(getSiteGroupId()).hashCode();
        _hashCode += new Long(getSiteGroupIdOrLiveGroupId()).hashCode();
        if (getSiteGroupName() != null) {
            _hashCode += getSiteGroupName().hashCode();
        }
        _hashCode += (isStateExclusive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isStateMaximized() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isStatePopUp() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTheme() != null) {
            _hashCode += getTheme().hashCode();
        }
        _hashCode += (isThemeCssFastLoad() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getThemeId() != null) {
            _hashCode += getThemeId().hashCode();
        }
        _hashCode += (isThemeImagesFastLoad() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isThemeJsBarebone() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isThemeJsFastLoad() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getThemeSettings() != null) {
            _hashCode += getThemeSettings().hashCode();
        }
        if (getTilesContent() != null) {
            _hashCode += getTilesContent().hashCode();
        }
        _hashCode += (isTilesSelectable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTilesTitle() != null) {
            _hashCode += getTilesTitle().hashCode();
        }
        if (getTimeZone() != null) {
            _hashCode += getTimeZone().hashCode();
        }
        if (getUnfilteredLayouts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnfilteredLayouts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnfilteredLayouts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        _hashCode += new Long(getUserId()).hashCode();
        _hashCode += (isWapTheme() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isWidget() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ThemeDisplay.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://theme.portal.liferay.com", "ThemeDisplay"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDNBaseURL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CDNBaseURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDNDynamicResourcesHost");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CDNDynamicResourcesHost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDNHost");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CDNHost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MDRRuleGroupInstance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MDRRuleGroupInstance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URLAddContent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "URLAddContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URLControlPanel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "URLControlPanel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URLCurrent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "URLCurrent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URLHome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "URLHome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URLLayoutTemplates");
        elemField.setXmlName(new javax.xml.namespace.QName("", "URLLayoutTemplates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URLManageSiteMemberships");
        elemField.setXmlName(new javax.xml.namespace.QName("", "URLManageSiteMemberships"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URLMyAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "URLMyAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URLPageSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "URLPageSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URLPortal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "URLPortal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URLPublishToLive");
        elemField.setXmlName(new javax.xml.namespace.QName("", "URLPublishToLive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URLSignIn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "URLSignIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URLSignOut");
        elemField.setXmlName(new javax.xml.namespace.QName("", "URLSignOut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URLSiteAdministration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "URLSiteAdministration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URLSiteContent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "URLSiteContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URLSiteMapSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "URLSiteMapSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URLSiteSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "URLSiteSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URLUpdateManager");
        elemField.setXmlName(new javax.xml.namespace.QName("", "URLUpdateManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addSessionIdToURL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addSessionIdToURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ajax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ajax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colorScheme");
        elemField.setXmlName(new javax.xml.namespace.QName("", "colorScheme"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colorSchemeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "colorSchemeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companyGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyLogo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companyLogo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyLogoHeight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companyLogoHeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyLogoWidth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companyLogoWidth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controlPanelCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "controlPanelCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("device");
        elemField.setXmlName(new javax.xml.namespace.QName("", "device"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doAsGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "doAsGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doAsUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "doAsUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doAsUserLanguageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "doAsUserLanguageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("facebook");
        elemField.setXmlName(new javax.xml.namespace.QName("", "facebook"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("facebookCanvasPageURL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "facebookCanvasPageURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeformLayout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freeformLayout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("i18N");
        elemField.setXmlName(new javax.xml.namespace.QName("", "i18n"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("i18NLanguageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "i18nLanguageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("i18NPath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "i18nPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impersonated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "impersonated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includePortletCssJs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "includePortletCssJs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isolated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isolated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "languageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("layout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "layout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("layoutSet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "layoutSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("layoutSetLogo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "layoutSetLogo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("layoutTypePortlet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "layoutTypePortlet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("layouts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "layouts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lifecycle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lifecycle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lifecycleAction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lifecycleAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lifecycleEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lifecycleEvent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lifecycleRender");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lifecycleRender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lifecycleResource");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lifecycleResource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locale");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parentGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parentGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentGroupName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parentGroupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pathApplet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pathApplet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pathCms");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pathCms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pathColorSchemeImages");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pathColorSchemeImages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pathContext");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pathContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pathFlash");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pathFlash"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pathFriendlyURLPrivateGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pathFriendlyURLPrivateGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pathFriendlyURLPrivateUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pathFriendlyURLPrivateUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pathFriendlyURLPublic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pathFriendlyURLPublic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pathImage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pathImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pathJavaScript");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pathJavaScript"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pathMain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pathMain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pathSound");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pathSound"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pathThemeCss");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pathThemeCss"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pathThemeImage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pathThemeImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pathThemeImages");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pathThemeImages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pathThemeJavaScript");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pathThemeJavaScript"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pathThemeRoot");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pathThemeRoot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pathThemeTemplates");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pathThemeTemplates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionChecker");
        elemField.setXmlName(new javax.xml.namespace.QName("", "permissionChecker"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "plid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portalURL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "portalURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portletDisplay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "portletDisplay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://theme.portal.liferay.com", "PortletDisplay"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portletGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "portletGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ppid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ppid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realCompanyLogo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "realCompanyLogo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realCompanyLogoHeight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "realCompanyLogoHeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realCompanyLogoWidth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "realCompanyLogoWidth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "realUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "realUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refererGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refererGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refererPlid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refererPlid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("request");
        elemField.setXmlName(new javax.xml.namespace.QName("", "request"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scopeGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scopeGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scopeGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scopeGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scopeGroupIdOrLiveGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scopeGroupIdOrLiveGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scopeGroupName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scopeGroupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scopeLayout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scopeLayout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secure");
        elemField.setXmlName(new javax.xml.namespace.QName("", "secure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverPort");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showAddContentIcon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showAddContentIcon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showAddContentIconPermission");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showAddContentIconPermission"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showControlPanelIcon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showControlPanelIcon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showHomeIcon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showHomeIcon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showLayoutTemplatesIcon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showLayoutTemplatesIcon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showManageSiteMembershipsIcon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showManageSiteMembershipsIcon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showMyAccountIcon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showMyAccountIcon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showPageCustomizationIcon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showPageCustomizationIcon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showPageSettingsIcon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showPageSettingsIcon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showPortalIcon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showPortalIcon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showSignInIcon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showSignInIcon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showSignOutIcon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showSignOutIcon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showSiteAdministrationIcon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showSiteAdministrationIcon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showSiteContentIcon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showSiteContentIcon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showSiteMapSettingsIcon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showSiteMapSettingsIcon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showSiteSettingsIcon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showSiteSettingsIcon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showStagingIcon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showStagingIcon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signedIn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signedIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteDefaultLocale");
        elemField.setXmlName(new javax.xml.namespace.QName("", "siteDefaultLocale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "siteGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "siteGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteGroupIdOrLiveGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "siteGroupIdOrLiveGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteGroupName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "siteGroupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateExclusive");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stateExclusive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateMaximized");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stateMaximized"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statePopUp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statePopUp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("theme");
        elemField.setXmlName(new javax.xml.namespace.QName("", "theme"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("themeCssFastLoad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "themeCssFastLoad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("themeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "themeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("themeImagesFastLoad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "themeImagesFastLoad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("themeJsBarebone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "themeJsBarebone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("themeJsFastLoad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "themeJsFastLoad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("themeSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "themeSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tilesContent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tilesContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tilesSelectable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tilesSelectable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tilesTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tilesTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unfilteredLayouts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unfilteredLayouts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wapTheme");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wapTheme"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("widget");
        elemField.setXmlName(new javax.xml.namespace.QName("", "widget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
