/**
 * PortletDisplay.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.evolveum.polygon.connector.liferay.organization;

public class PortletDisplay  implements java.io.Serializable {
    private java.lang.String URLBack;

    private java.lang.String URLClose;

    private java.lang.String URLConfiguration;

    private java.lang.String URLConfigurationJS;

    private java.lang.String URLEdit;

    private java.lang.String URLEditDefaults;

    private java.lang.String URLEditGuest;

    private java.lang.String URLExportImport;

    private java.lang.String URLHelp;

    private java.lang.String URLMax;

    private java.lang.String URLMin;

    private java.lang.String URLPortlet;

    private java.lang.String URLPortletCss;

    private java.lang.String URLPrint;

    private java.lang.String URLRefresh;

    private boolean access;

    private boolean active;

    private int columnCount;

    private java.lang.String columnId;

    private int columnPos;

    private com.evolveum.polygon.connector.liferay.organization.StringBundler content;

    private java.lang.String controlPanelCategory;

    private java.lang.String customCSSClassName;

    private java.lang.String description;

    private boolean focused;

    private java.lang.String id;

    private java.lang.String instanceId;

    private boolean modeAbout;

    private boolean modeConfig;

    private boolean modeEdit;

    private boolean modeEditDefaults;

    private boolean modeEditGuest;

    private boolean modeHelp;

    private boolean modePreview;

    private boolean modePrint;

    private boolean modeView;

    private java.lang.String namespace;

    private java.lang.String portletName;

    private java.lang.Object portletSetup;

    private java.lang.String resourcePK;

    private boolean restoreCurrentView;

    private java.lang.String rootPortletId;

    private boolean showBackIcon;

    private boolean showCloseIcon;

    private boolean showConfigurationIcon;

    private boolean showEditDefaultsIcon;

    private boolean showEditGuestIcon;

    private boolean showEditIcon;

    private boolean showExportImportIcon;

    private boolean showHelpIcon;

    private boolean showMaxIcon;

    private boolean showMinIcon;

    private boolean showMoveIcon;

    private boolean showPortletCssIcon;

    private boolean showPortletIcon;

    private boolean showPrintIcon;

    private boolean showRefreshIcon;

    private boolean stateExclusive;

    private boolean stateMax;

    private boolean stateMin;

    private boolean stateNormal;

    private boolean statePopUp;

    private com.evolveum.polygon.connector.liferay.organization.ThemeDisplay themeDisplay;

    private java.lang.String title;

    private boolean webDAVEnabled;

    public PortletDisplay() {
    }

    public PortletDisplay(
           java.lang.String URLBack,
           java.lang.String URLClose,
           java.lang.String URLConfiguration,
           java.lang.String URLConfigurationJS,
           java.lang.String URLEdit,
           java.lang.String URLEditDefaults,
           java.lang.String URLEditGuest,
           java.lang.String URLExportImport,
           java.lang.String URLHelp,
           java.lang.String URLMax,
           java.lang.String URLMin,
           java.lang.String URLPortlet,
           java.lang.String URLPortletCss,
           java.lang.String URLPrint,
           java.lang.String URLRefresh,
           boolean access,
           boolean active,
           int columnCount,
           java.lang.String columnId,
           int columnPos,
           com.evolveum.polygon.connector.liferay.organization.StringBundler content,
           java.lang.String controlPanelCategory,
           java.lang.String customCSSClassName,
           java.lang.String description,
           boolean focused,
           java.lang.String id,
           java.lang.String instanceId,
           boolean modeAbout,
           boolean modeConfig,
           boolean modeEdit,
           boolean modeEditDefaults,
           boolean modeEditGuest,
           boolean modeHelp,
           boolean modePreview,
           boolean modePrint,
           boolean modeView,
           java.lang.String namespace,
           java.lang.String portletName,
           java.lang.Object portletSetup,
           java.lang.String resourcePK,
           boolean restoreCurrentView,
           java.lang.String rootPortletId,
           boolean showBackIcon,
           boolean showCloseIcon,
           boolean showConfigurationIcon,
           boolean showEditDefaultsIcon,
           boolean showEditGuestIcon,
           boolean showEditIcon,
           boolean showExportImportIcon,
           boolean showHelpIcon,
           boolean showMaxIcon,
           boolean showMinIcon,
           boolean showMoveIcon,
           boolean showPortletCssIcon,
           boolean showPortletIcon,
           boolean showPrintIcon,
           boolean showRefreshIcon,
           boolean stateExclusive,
           boolean stateMax,
           boolean stateMin,
           boolean stateNormal,
           boolean statePopUp,
           com.evolveum.polygon.connector.liferay.organization.ThemeDisplay themeDisplay,
           java.lang.String title,
           boolean webDAVEnabled) {
           this.URLBack = URLBack;
           this.URLClose = URLClose;
           this.URLConfiguration = URLConfiguration;
           this.URLConfigurationJS = URLConfigurationJS;
           this.URLEdit = URLEdit;
           this.URLEditDefaults = URLEditDefaults;
           this.URLEditGuest = URLEditGuest;
           this.URLExportImport = URLExportImport;
           this.URLHelp = URLHelp;
           this.URLMax = URLMax;
           this.URLMin = URLMin;
           this.URLPortlet = URLPortlet;
           this.URLPortletCss = URLPortletCss;
           this.URLPrint = URLPrint;
           this.URLRefresh = URLRefresh;
           this.access = access;
           this.active = active;
           this.columnCount = columnCount;
           this.columnId = columnId;
           this.columnPos = columnPos;
           this.content = content;
           this.controlPanelCategory = controlPanelCategory;
           this.customCSSClassName = customCSSClassName;
           this.description = description;
           this.focused = focused;
           this.id = id;
           this.instanceId = instanceId;
           this.modeAbout = modeAbout;
           this.modeConfig = modeConfig;
           this.modeEdit = modeEdit;
           this.modeEditDefaults = modeEditDefaults;
           this.modeEditGuest = modeEditGuest;
           this.modeHelp = modeHelp;
           this.modePreview = modePreview;
           this.modePrint = modePrint;
           this.modeView = modeView;
           this.namespace = namespace;
           this.portletName = portletName;
           this.portletSetup = portletSetup;
           this.resourcePK = resourcePK;
           this.restoreCurrentView = restoreCurrentView;
           this.rootPortletId = rootPortletId;
           this.showBackIcon = showBackIcon;
           this.showCloseIcon = showCloseIcon;
           this.showConfigurationIcon = showConfigurationIcon;
           this.showEditDefaultsIcon = showEditDefaultsIcon;
           this.showEditGuestIcon = showEditGuestIcon;
           this.showEditIcon = showEditIcon;
           this.showExportImportIcon = showExportImportIcon;
           this.showHelpIcon = showHelpIcon;
           this.showMaxIcon = showMaxIcon;
           this.showMinIcon = showMinIcon;
           this.showMoveIcon = showMoveIcon;
           this.showPortletCssIcon = showPortletCssIcon;
           this.showPortletIcon = showPortletIcon;
           this.showPrintIcon = showPrintIcon;
           this.showRefreshIcon = showRefreshIcon;
           this.stateExclusive = stateExclusive;
           this.stateMax = stateMax;
           this.stateMin = stateMin;
           this.stateNormal = stateNormal;
           this.statePopUp = statePopUp;
           this.themeDisplay = themeDisplay;
           this.title = title;
           this.webDAVEnabled = webDAVEnabled;
    }


    /**
     * Gets the URLBack value for this PortletDisplay.
     * 
     * @return URLBack
     */
    public java.lang.String getURLBack() {
        return URLBack;
    }


    /**
     * Sets the URLBack value for this PortletDisplay.
     * 
     * @param URLBack
     */
    public void setURLBack(java.lang.String URLBack) {
        this.URLBack = URLBack;
    }


    /**
     * Gets the URLClose value for this PortletDisplay.
     * 
     * @return URLClose
     */
    public java.lang.String getURLClose() {
        return URLClose;
    }


    /**
     * Sets the URLClose value for this PortletDisplay.
     * 
     * @param URLClose
     */
    public void setURLClose(java.lang.String URLClose) {
        this.URLClose = URLClose;
    }


    /**
     * Gets the URLConfiguration value for this PortletDisplay.
     * 
     * @return URLConfiguration
     */
    public java.lang.String getURLConfiguration() {
        return URLConfiguration;
    }


    /**
     * Sets the URLConfiguration value for this PortletDisplay.
     * 
     * @param URLConfiguration
     */
    public void setURLConfiguration(java.lang.String URLConfiguration) {
        this.URLConfiguration = URLConfiguration;
    }


    /**
     * Gets the URLConfigurationJS value for this PortletDisplay.
     * 
     * @return URLConfigurationJS
     */
    public java.lang.String getURLConfigurationJS() {
        return URLConfigurationJS;
    }


    /**
     * Sets the URLConfigurationJS value for this PortletDisplay.
     * 
     * @param URLConfigurationJS
     */
    public void setURLConfigurationJS(java.lang.String URLConfigurationJS) {
        this.URLConfigurationJS = URLConfigurationJS;
    }


    /**
     * Gets the URLEdit value for this PortletDisplay.
     * 
     * @return URLEdit
     */
    public java.lang.String getURLEdit() {
        return URLEdit;
    }


    /**
     * Sets the URLEdit value for this PortletDisplay.
     * 
     * @param URLEdit
     */
    public void setURLEdit(java.lang.String URLEdit) {
        this.URLEdit = URLEdit;
    }


    /**
     * Gets the URLEditDefaults value for this PortletDisplay.
     * 
     * @return URLEditDefaults
     */
    public java.lang.String getURLEditDefaults() {
        return URLEditDefaults;
    }


    /**
     * Sets the URLEditDefaults value for this PortletDisplay.
     * 
     * @param URLEditDefaults
     */
    public void setURLEditDefaults(java.lang.String URLEditDefaults) {
        this.URLEditDefaults = URLEditDefaults;
    }


    /**
     * Gets the URLEditGuest value for this PortletDisplay.
     * 
     * @return URLEditGuest
     */
    public java.lang.String getURLEditGuest() {
        return URLEditGuest;
    }


    /**
     * Sets the URLEditGuest value for this PortletDisplay.
     * 
     * @param URLEditGuest
     */
    public void setURLEditGuest(java.lang.String URLEditGuest) {
        this.URLEditGuest = URLEditGuest;
    }


    /**
     * Gets the URLExportImport value for this PortletDisplay.
     * 
     * @return URLExportImport
     */
    public java.lang.String getURLExportImport() {
        return URLExportImport;
    }


    /**
     * Sets the URLExportImport value for this PortletDisplay.
     * 
     * @param URLExportImport
     */
    public void setURLExportImport(java.lang.String URLExportImport) {
        this.URLExportImport = URLExportImport;
    }


    /**
     * Gets the URLHelp value for this PortletDisplay.
     * 
     * @return URLHelp
     */
    public java.lang.String getURLHelp() {
        return URLHelp;
    }


    /**
     * Sets the URLHelp value for this PortletDisplay.
     * 
     * @param URLHelp
     */
    public void setURLHelp(java.lang.String URLHelp) {
        this.URLHelp = URLHelp;
    }


    /**
     * Gets the URLMax value for this PortletDisplay.
     * 
     * @return URLMax
     */
    public java.lang.String getURLMax() {
        return URLMax;
    }


    /**
     * Sets the URLMax value for this PortletDisplay.
     * 
     * @param URLMax
     */
    public void setURLMax(java.lang.String URLMax) {
        this.URLMax = URLMax;
    }


    /**
     * Gets the URLMin value for this PortletDisplay.
     * 
     * @return URLMin
     */
    public java.lang.String getURLMin() {
        return URLMin;
    }


    /**
     * Sets the URLMin value for this PortletDisplay.
     * 
     * @param URLMin
     */
    public void setURLMin(java.lang.String URLMin) {
        this.URLMin = URLMin;
    }


    /**
     * Gets the URLPortlet value for this PortletDisplay.
     * 
     * @return URLPortlet
     */
    public java.lang.String getURLPortlet() {
        return URLPortlet;
    }


    /**
     * Sets the URLPortlet value for this PortletDisplay.
     * 
     * @param URLPortlet
     */
    public void setURLPortlet(java.lang.String URLPortlet) {
        this.URLPortlet = URLPortlet;
    }


    /**
     * Gets the URLPortletCss value for this PortletDisplay.
     * 
     * @return URLPortletCss
     */
    public java.lang.String getURLPortletCss() {
        return URLPortletCss;
    }


    /**
     * Sets the URLPortletCss value for this PortletDisplay.
     * 
     * @param URLPortletCss
     */
    public void setURLPortletCss(java.lang.String URLPortletCss) {
        this.URLPortletCss = URLPortletCss;
    }


    /**
     * Gets the URLPrint value for this PortletDisplay.
     * 
     * @return URLPrint
     */
    public java.lang.String getURLPrint() {
        return URLPrint;
    }


    /**
     * Sets the URLPrint value for this PortletDisplay.
     * 
     * @param URLPrint
     */
    public void setURLPrint(java.lang.String URLPrint) {
        this.URLPrint = URLPrint;
    }


    /**
     * Gets the URLRefresh value for this PortletDisplay.
     * 
     * @return URLRefresh
     */
    public java.lang.String getURLRefresh() {
        return URLRefresh;
    }


    /**
     * Sets the URLRefresh value for this PortletDisplay.
     * 
     * @param URLRefresh
     */
    public void setURLRefresh(java.lang.String URLRefresh) {
        this.URLRefresh = URLRefresh;
    }


    /**
     * Gets the access value for this PortletDisplay.
     * 
     * @return access
     */
    public boolean isAccess() {
        return access;
    }


    /**
     * Sets the access value for this PortletDisplay.
     * 
     * @param access
     */
    public void setAccess(boolean access) {
        this.access = access;
    }


    /**
     * Gets the active value for this PortletDisplay.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this PortletDisplay.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }


    /**
     * Gets the columnCount value for this PortletDisplay.
     * 
     * @return columnCount
     */
    public int getColumnCount() {
        return columnCount;
    }


    /**
     * Sets the columnCount value for this PortletDisplay.
     * 
     * @param columnCount
     */
    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }


    /**
     * Gets the columnId value for this PortletDisplay.
     * 
     * @return columnId
     */
    public java.lang.String getColumnId() {
        return columnId;
    }


    /**
     * Sets the columnId value for this PortletDisplay.
     * 
     * @param columnId
     */
    public void setColumnId(java.lang.String columnId) {
        this.columnId = columnId;
    }


    /**
     * Gets the columnPos value for this PortletDisplay.
     * 
     * @return columnPos
     */
    public int getColumnPos() {
        return columnPos;
    }


    /**
     * Sets the columnPos value for this PortletDisplay.
     * 
     * @param columnPos
     */
    public void setColumnPos(int columnPos) {
        this.columnPos = columnPos;
    }


    /**
     * Gets the content value for this PortletDisplay.
     * 
     * @return content
     */
    public com.evolveum.polygon.connector.liferay.organization.StringBundler getContent() {
        return content;
    }


    /**
     * Sets the content value for this PortletDisplay.
     * 
     * @param content
     */
    public void setContent(com.evolveum.polygon.connector.liferay.organization.StringBundler content) {
        this.content = content;
    }


    /**
     * Gets the controlPanelCategory value for this PortletDisplay.
     * 
     * @return controlPanelCategory
     */
    public java.lang.String getControlPanelCategory() {
        return controlPanelCategory;
    }


    /**
     * Sets the controlPanelCategory value for this PortletDisplay.
     * 
     * @param controlPanelCategory
     */
    public void setControlPanelCategory(java.lang.String controlPanelCategory) {
        this.controlPanelCategory = controlPanelCategory;
    }


    /**
     * Gets the customCSSClassName value for this PortletDisplay.
     * 
     * @return customCSSClassName
     */
    public java.lang.String getCustomCSSClassName() {
        return customCSSClassName;
    }


    /**
     * Sets the customCSSClassName value for this PortletDisplay.
     * 
     * @param customCSSClassName
     */
    public void setCustomCSSClassName(java.lang.String customCSSClassName) {
        this.customCSSClassName = customCSSClassName;
    }


    /**
     * Gets the description value for this PortletDisplay.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this PortletDisplay.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the focused value for this PortletDisplay.
     * 
     * @return focused
     */
    public boolean isFocused() {
        return focused;
    }


    /**
     * Sets the focused value for this PortletDisplay.
     * 
     * @param focused
     */
    public void setFocused(boolean focused) {
        this.focused = focused;
    }


    /**
     * Gets the id value for this PortletDisplay.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this PortletDisplay.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the instanceId value for this PortletDisplay.
     * 
     * @return instanceId
     */
    public java.lang.String getInstanceId() {
        return instanceId;
    }


    /**
     * Sets the instanceId value for this PortletDisplay.
     * 
     * @param instanceId
     */
    public void setInstanceId(java.lang.String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * Gets the modeAbout value for this PortletDisplay.
     * 
     * @return modeAbout
     */
    public boolean isModeAbout() {
        return modeAbout;
    }


    /**
     * Sets the modeAbout value for this PortletDisplay.
     * 
     * @param modeAbout
     */
    public void setModeAbout(boolean modeAbout) {
        this.modeAbout = modeAbout;
    }


    /**
     * Gets the modeConfig value for this PortletDisplay.
     * 
     * @return modeConfig
     */
    public boolean isModeConfig() {
        return modeConfig;
    }


    /**
     * Sets the modeConfig value for this PortletDisplay.
     * 
     * @param modeConfig
     */
    public void setModeConfig(boolean modeConfig) {
        this.modeConfig = modeConfig;
    }


    /**
     * Gets the modeEdit value for this PortletDisplay.
     * 
     * @return modeEdit
     */
    public boolean isModeEdit() {
        return modeEdit;
    }


    /**
     * Sets the modeEdit value for this PortletDisplay.
     * 
     * @param modeEdit
     */
    public void setModeEdit(boolean modeEdit) {
        this.modeEdit = modeEdit;
    }


    /**
     * Gets the modeEditDefaults value for this PortletDisplay.
     * 
     * @return modeEditDefaults
     */
    public boolean isModeEditDefaults() {
        return modeEditDefaults;
    }


    /**
     * Sets the modeEditDefaults value for this PortletDisplay.
     * 
     * @param modeEditDefaults
     */
    public void setModeEditDefaults(boolean modeEditDefaults) {
        this.modeEditDefaults = modeEditDefaults;
    }


    /**
     * Gets the modeEditGuest value for this PortletDisplay.
     * 
     * @return modeEditGuest
     */
    public boolean isModeEditGuest() {
        return modeEditGuest;
    }


    /**
     * Sets the modeEditGuest value for this PortletDisplay.
     * 
     * @param modeEditGuest
     */
    public void setModeEditGuest(boolean modeEditGuest) {
        this.modeEditGuest = modeEditGuest;
    }


    /**
     * Gets the modeHelp value for this PortletDisplay.
     * 
     * @return modeHelp
     */
    public boolean isModeHelp() {
        return modeHelp;
    }


    /**
     * Sets the modeHelp value for this PortletDisplay.
     * 
     * @param modeHelp
     */
    public void setModeHelp(boolean modeHelp) {
        this.modeHelp = modeHelp;
    }


    /**
     * Gets the modePreview value for this PortletDisplay.
     * 
     * @return modePreview
     */
    public boolean isModePreview() {
        return modePreview;
    }


    /**
     * Sets the modePreview value for this PortletDisplay.
     * 
     * @param modePreview
     */
    public void setModePreview(boolean modePreview) {
        this.modePreview = modePreview;
    }


    /**
     * Gets the modePrint value for this PortletDisplay.
     * 
     * @return modePrint
     */
    public boolean isModePrint() {
        return modePrint;
    }


    /**
     * Sets the modePrint value for this PortletDisplay.
     * 
     * @param modePrint
     */
    public void setModePrint(boolean modePrint) {
        this.modePrint = modePrint;
    }


    /**
     * Gets the modeView value for this PortletDisplay.
     * 
     * @return modeView
     */
    public boolean isModeView() {
        return modeView;
    }


    /**
     * Sets the modeView value for this PortletDisplay.
     * 
     * @param modeView
     */
    public void setModeView(boolean modeView) {
        this.modeView = modeView;
    }


    /**
     * Gets the namespace value for this PortletDisplay.
     * 
     * @return namespace
     */
    public java.lang.String getNamespace() {
        return namespace;
    }


    /**
     * Sets the namespace value for this PortletDisplay.
     * 
     * @param namespace
     */
    public void setNamespace(java.lang.String namespace) {
        this.namespace = namespace;
    }


    /**
     * Gets the portletName value for this PortletDisplay.
     * 
     * @return portletName
     */
    public java.lang.String getPortletName() {
        return portletName;
    }


    /**
     * Sets the portletName value for this PortletDisplay.
     * 
     * @param portletName
     */
    public void setPortletName(java.lang.String portletName) {
        this.portletName = portletName;
    }


    /**
     * Gets the portletSetup value for this PortletDisplay.
     * 
     * @return portletSetup
     */
    public java.lang.Object getPortletSetup() {
        return portletSetup;
    }


    /**
     * Sets the portletSetup value for this PortletDisplay.
     * 
     * @param portletSetup
     */
    public void setPortletSetup(java.lang.Object portletSetup) {
        this.portletSetup = portletSetup;
    }


    /**
     * Gets the resourcePK value for this PortletDisplay.
     * 
     * @return resourcePK
     */
    public java.lang.String getResourcePK() {
        return resourcePK;
    }


    /**
     * Sets the resourcePK value for this PortletDisplay.
     * 
     * @param resourcePK
     */
    public void setResourcePK(java.lang.String resourcePK) {
        this.resourcePK = resourcePK;
    }


    /**
     * Gets the restoreCurrentView value for this PortletDisplay.
     * 
     * @return restoreCurrentView
     */
    public boolean isRestoreCurrentView() {
        return restoreCurrentView;
    }


    /**
     * Sets the restoreCurrentView value for this PortletDisplay.
     * 
     * @param restoreCurrentView
     */
    public void setRestoreCurrentView(boolean restoreCurrentView) {
        this.restoreCurrentView = restoreCurrentView;
    }


    /**
     * Gets the rootPortletId value for this PortletDisplay.
     * 
     * @return rootPortletId
     */
    public java.lang.String getRootPortletId() {
        return rootPortletId;
    }


    /**
     * Sets the rootPortletId value for this PortletDisplay.
     * 
     * @param rootPortletId
     */
    public void setRootPortletId(java.lang.String rootPortletId) {
        this.rootPortletId = rootPortletId;
    }


    /**
     * Gets the showBackIcon value for this PortletDisplay.
     * 
     * @return showBackIcon
     */
    public boolean isShowBackIcon() {
        return showBackIcon;
    }


    /**
     * Sets the showBackIcon value for this PortletDisplay.
     * 
     * @param showBackIcon
     */
    public void setShowBackIcon(boolean showBackIcon) {
        this.showBackIcon = showBackIcon;
    }


    /**
     * Gets the showCloseIcon value for this PortletDisplay.
     * 
     * @return showCloseIcon
     */
    public boolean isShowCloseIcon() {
        return showCloseIcon;
    }


    /**
     * Sets the showCloseIcon value for this PortletDisplay.
     * 
     * @param showCloseIcon
     */
    public void setShowCloseIcon(boolean showCloseIcon) {
        this.showCloseIcon = showCloseIcon;
    }


    /**
     * Gets the showConfigurationIcon value for this PortletDisplay.
     * 
     * @return showConfigurationIcon
     */
    public boolean isShowConfigurationIcon() {
        return showConfigurationIcon;
    }


    /**
     * Sets the showConfigurationIcon value for this PortletDisplay.
     * 
     * @param showConfigurationIcon
     */
    public void setShowConfigurationIcon(boolean showConfigurationIcon) {
        this.showConfigurationIcon = showConfigurationIcon;
    }


    /**
     * Gets the showEditDefaultsIcon value for this PortletDisplay.
     * 
     * @return showEditDefaultsIcon
     */
    public boolean isShowEditDefaultsIcon() {
        return showEditDefaultsIcon;
    }


    /**
     * Sets the showEditDefaultsIcon value for this PortletDisplay.
     * 
     * @param showEditDefaultsIcon
     */
    public void setShowEditDefaultsIcon(boolean showEditDefaultsIcon) {
        this.showEditDefaultsIcon = showEditDefaultsIcon;
    }


    /**
     * Gets the showEditGuestIcon value for this PortletDisplay.
     * 
     * @return showEditGuestIcon
     */
    public boolean isShowEditGuestIcon() {
        return showEditGuestIcon;
    }


    /**
     * Sets the showEditGuestIcon value for this PortletDisplay.
     * 
     * @param showEditGuestIcon
     */
    public void setShowEditGuestIcon(boolean showEditGuestIcon) {
        this.showEditGuestIcon = showEditGuestIcon;
    }


    /**
     * Gets the showEditIcon value for this PortletDisplay.
     * 
     * @return showEditIcon
     */
    public boolean isShowEditIcon() {
        return showEditIcon;
    }


    /**
     * Sets the showEditIcon value for this PortletDisplay.
     * 
     * @param showEditIcon
     */
    public void setShowEditIcon(boolean showEditIcon) {
        this.showEditIcon = showEditIcon;
    }


    /**
     * Gets the showExportImportIcon value for this PortletDisplay.
     * 
     * @return showExportImportIcon
     */
    public boolean isShowExportImportIcon() {
        return showExportImportIcon;
    }


    /**
     * Sets the showExportImportIcon value for this PortletDisplay.
     * 
     * @param showExportImportIcon
     */
    public void setShowExportImportIcon(boolean showExportImportIcon) {
        this.showExportImportIcon = showExportImportIcon;
    }


    /**
     * Gets the showHelpIcon value for this PortletDisplay.
     * 
     * @return showHelpIcon
     */
    public boolean isShowHelpIcon() {
        return showHelpIcon;
    }


    /**
     * Sets the showHelpIcon value for this PortletDisplay.
     * 
     * @param showHelpIcon
     */
    public void setShowHelpIcon(boolean showHelpIcon) {
        this.showHelpIcon = showHelpIcon;
    }


    /**
     * Gets the showMaxIcon value for this PortletDisplay.
     * 
     * @return showMaxIcon
     */
    public boolean isShowMaxIcon() {
        return showMaxIcon;
    }


    /**
     * Sets the showMaxIcon value for this PortletDisplay.
     * 
     * @param showMaxIcon
     */
    public void setShowMaxIcon(boolean showMaxIcon) {
        this.showMaxIcon = showMaxIcon;
    }


    /**
     * Gets the showMinIcon value for this PortletDisplay.
     * 
     * @return showMinIcon
     */
    public boolean isShowMinIcon() {
        return showMinIcon;
    }


    /**
     * Sets the showMinIcon value for this PortletDisplay.
     * 
     * @param showMinIcon
     */
    public void setShowMinIcon(boolean showMinIcon) {
        this.showMinIcon = showMinIcon;
    }


    /**
     * Gets the showMoveIcon value for this PortletDisplay.
     * 
     * @return showMoveIcon
     */
    public boolean isShowMoveIcon() {
        return showMoveIcon;
    }


    /**
     * Sets the showMoveIcon value for this PortletDisplay.
     * 
     * @param showMoveIcon
     */
    public void setShowMoveIcon(boolean showMoveIcon) {
        this.showMoveIcon = showMoveIcon;
    }


    /**
     * Gets the showPortletCssIcon value for this PortletDisplay.
     * 
     * @return showPortletCssIcon
     */
    public boolean isShowPortletCssIcon() {
        return showPortletCssIcon;
    }


    /**
     * Sets the showPortletCssIcon value for this PortletDisplay.
     * 
     * @param showPortletCssIcon
     */
    public void setShowPortletCssIcon(boolean showPortletCssIcon) {
        this.showPortletCssIcon = showPortletCssIcon;
    }


    /**
     * Gets the showPortletIcon value for this PortletDisplay.
     * 
     * @return showPortletIcon
     */
    public boolean isShowPortletIcon() {
        return showPortletIcon;
    }


    /**
     * Sets the showPortletIcon value for this PortletDisplay.
     * 
     * @param showPortletIcon
     */
    public void setShowPortletIcon(boolean showPortletIcon) {
        this.showPortletIcon = showPortletIcon;
    }


    /**
     * Gets the showPrintIcon value for this PortletDisplay.
     * 
     * @return showPrintIcon
     */
    public boolean isShowPrintIcon() {
        return showPrintIcon;
    }


    /**
     * Sets the showPrintIcon value for this PortletDisplay.
     * 
     * @param showPrintIcon
     */
    public void setShowPrintIcon(boolean showPrintIcon) {
        this.showPrintIcon = showPrintIcon;
    }


    /**
     * Gets the showRefreshIcon value for this PortletDisplay.
     * 
     * @return showRefreshIcon
     */
    public boolean isShowRefreshIcon() {
        return showRefreshIcon;
    }


    /**
     * Sets the showRefreshIcon value for this PortletDisplay.
     * 
     * @param showRefreshIcon
     */
    public void setShowRefreshIcon(boolean showRefreshIcon) {
        this.showRefreshIcon = showRefreshIcon;
    }


    /**
     * Gets the stateExclusive value for this PortletDisplay.
     * 
     * @return stateExclusive
     */
    public boolean isStateExclusive() {
        return stateExclusive;
    }


    /**
     * Sets the stateExclusive value for this PortletDisplay.
     * 
     * @param stateExclusive
     */
    public void setStateExclusive(boolean stateExclusive) {
        this.stateExclusive = stateExclusive;
    }


    /**
     * Gets the stateMax value for this PortletDisplay.
     * 
     * @return stateMax
     */
    public boolean isStateMax() {
        return stateMax;
    }


    /**
     * Sets the stateMax value for this PortletDisplay.
     * 
     * @param stateMax
     */
    public void setStateMax(boolean stateMax) {
        this.stateMax = stateMax;
    }


    /**
     * Gets the stateMin value for this PortletDisplay.
     * 
     * @return stateMin
     */
    public boolean isStateMin() {
        return stateMin;
    }


    /**
     * Sets the stateMin value for this PortletDisplay.
     * 
     * @param stateMin
     */
    public void setStateMin(boolean stateMin) {
        this.stateMin = stateMin;
    }


    /**
     * Gets the stateNormal value for this PortletDisplay.
     * 
     * @return stateNormal
     */
    public boolean isStateNormal() {
        return stateNormal;
    }


    /**
     * Sets the stateNormal value for this PortletDisplay.
     * 
     * @param stateNormal
     */
    public void setStateNormal(boolean stateNormal) {
        this.stateNormal = stateNormal;
    }


    /**
     * Gets the statePopUp value for this PortletDisplay.
     * 
     * @return statePopUp
     */
    public boolean isStatePopUp() {
        return statePopUp;
    }


    /**
     * Sets the statePopUp value for this PortletDisplay.
     * 
     * @param statePopUp
     */
    public void setStatePopUp(boolean statePopUp) {
        this.statePopUp = statePopUp;
    }


    /**
     * Gets the themeDisplay value for this PortletDisplay.
     * 
     * @return themeDisplay
     */
    public com.evolveum.polygon.connector.liferay.organization.ThemeDisplay getThemeDisplay() {
        return themeDisplay;
    }


    /**
     * Sets the themeDisplay value for this PortletDisplay.
     * 
     * @param themeDisplay
     */
    public void setThemeDisplay(com.evolveum.polygon.connector.liferay.organization.ThemeDisplay themeDisplay) {
        this.themeDisplay = themeDisplay;
    }


    /**
     * Gets the title value for this PortletDisplay.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this PortletDisplay.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the webDAVEnabled value for this PortletDisplay.
     * 
     * @return webDAVEnabled
     */
    public boolean isWebDAVEnabled() {
        return webDAVEnabled;
    }


    /**
     * Sets the webDAVEnabled value for this PortletDisplay.
     * 
     * @param webDAVEnabled
     */
    public void setWebDAVEnabled(boolean webDAVEnabled) {
        this.webDAVEnabled = webDAVEnabled;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PortletDisplay)) return false;
        PortletDisplay other = (PortletDisplay) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.URLBack==null && other.getURLBack()==null) || 
             (this.URLBack!=null &&
              this.URLBack.equals(other.getURLBack()))) &&
            ((this.URLClose==null && other.getURLClose()==null) || 
             (this.URLClose!=null &&
              this.URLClose.equals(other.getURLClose()))) &&
            ((this.URLConfiguration==null && other.getURLConfiguration()==null) || 
             (this.URLConfiguration!=null &&
              this.URLConfiguration.equals(other.getURLConfiguration()))) &&
            ((this.URLConfigurationJS==null && other.getURLConfigurationJS()==null) || 
             (this.URLConfigurationJS!=null &&
              this.URLConfigurationJS.equals(other.getURLConfigurationJS()))) &&
            ((this.URLEdit==null && other.getURLEdit()==null) || 
             (this.URLEdit!=null &&
              this.URLEdit.equals(other.getURLEdit()))) &&
            ((this.URLEditDefaults==null && other.getURLEditDefaults()==null) || 
             (this.URLEditDefaults!=null &&
              this.URLEditDefaults.equals(other.getURLEditDefaults()))) &&
            ((this.URLEditGuest==null && other.getURLEditGuest()==null) || 
             (this.URLEditGuest!=null &&
              this.URLEditGuest.equals(other.getURLEditGuest()))) &&
            ((this.URLExportImport==null && other.getURLExportImport()==null) || 
             (this.URLExportImport!=null &&
              this.URLExportImport.equals(other.getURLExportImport()))) &&
            ((this.URLHelp==null && other.getURLHelp()==null) || 
             (this.URLHelp!=null &&
              this.URLHelp.equals(other.getURLHelp()))) &&
            ((this.URLMax==null && other.getURLMax()==null) || 
             (this.URLMax!=null &&
              this.URLMax.equals(other.getURLMax()))) &&
            ((this.URLMin==null && other.getURLMin()==null) || 
             (this.URLMin!=null &&
              this.URLMin.equals(other.getURLMin()))) &&
            ((this.URLPortlet==null && other.getURLPortlet()==null) || 
             (this.URLPortlet!=null &&
              this.URLPortlet.equals(other.getURLPortlet()))) &&
            ((this.URLPortletCss==null && other.getURLPortletCss()==null) || 
             (this.URLPortletCss!=null &&
              this.URLPortletCss.equals(other.getURLPortletCss()))) &&
            ((this.URLPrint==null && other.getURLPrint()==null) || 
             (this.URLPrint!=null &&
              this.URLPrint.equals(other.getURLPrint()))) &&
            ((this.URLRefresh==null && other.getURLRefresh()==null) || 
             (this.URLRefresh!=null &&
              this.URLRefresh.equals(other.getURLRefresh()))) &&
            this.access == other.isAccess() &&
            this.active == other.isActive() &&
            this.columnCount == other.getColumnCount() &&
            ((this.columnId==null && other.getColumnId()==null) || 
             (this.columnId!=null &&
              this.columnId.equals(other.getColumnId()))) &&
            this.columnPos == other.getColumnPos() &&
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              this.content.equals(other.getContent()))) &&
            ((this.controlPanelCategory==null && other.getControlPanelCategory()==null) || 
             (this.controlPanelCategory!=null &&
              this.controlPanelCategory.equals(other.getControlPanelCategory()))) &&
            ((this.customCSSClassName==null && other.getCustomCSSClassName()==null) || 
             (this.customCSSClassName!=null &&
              this.customCSSClassName.equals(other.getCustomCSSClassName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.focused == other.isFocused() &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.instanceId==null && other.getInstanceId()==null) || 
             (this.instanceId!=null &&
              this.instanceId.equals(other.getInstanceId()))) &&
            this.modeAbout == other.isModeAbout() &&
            this.modeConfig == other.isModeConfig() &&
            this.modeEdit == other.isModeEdit() &&
            this.modeEditDefaults == other.isModeEditDefaults() &&
            this.modeEditGuest == other.isModeEditGuest() &&
            this.modeHelp == other.isModeHelp() &&
            this.modePreview == other.isModePreview() &&
            this.modePrint == other.isModePrint() &&
            this.modeView == other.isModeView() &&
            ((this.namespace==null && other.getNamespace()==null) || 
             (this.namespace!=null &&
              this.namespace.equals(other.getNamespace()))) &&
            ((this.portletName==null && other.getPortletName()==null) || 
             (this.portletName!=null &&
              this.portletName.equals(other.getPortletName()))) &&
            ((this.portletSetup==null && other.getPortletSetup()==null) || 
             (this.portletSetup!=null &&
              this.portletSetup.equals(other.getPortletSetup()))) &&
            ((this.resourcePK==null && other.getResourcePK()==null) || 
             (this.resourcePK!=null &&
              this.resourcePK.equals(other.getResourcePK()))) &&
            this.restoreCurrentView == other.isRestoreCurrentView() &&
            ((this.rootPortletId==null && other.getRootPortletId()==null) || 
             (this.rootPortletId!=null &&
              this.rootPortletId.equals(other.getRootPortletId()))) &&
            this.showBackIcon == other.isShowBackIcon() &&
            this.showCloseIcon == other.isShowCloseIcon() &&
            this.showConfigurationIcon == other.isShowConfigurationIcon() &&
            this.showEditDefaultsIcon == other.isShowEditDefaultsIcon() &&
            this.showEditGuestIcon == other.isShowEditGuestIcon() &&
            this.showEditIcon == other.isShowEditIcon() &&
            this.showExportImportIcon == other.isShowExportImportIcon() &&
            this.showHelpIcon == other.isShowHelpIcon() &&
            this.showMaxIcon == other.isShowMaxIcon() &&
            this.showMinIcon == other.isShowMinIcon() &&
            this.showMoveIcon == other.isShowMoveIcon() &&
            this.showPortletCssIcon == other.isShowPortletCssIcon() &&
            this.showPortletIcon == other.isShowPortletIcon() &&
            this.showPrintIcon == other.isShowPrintIcon() &&
            this.showRefreshIcon == other.isShowRefreshIcon() &&
            this.stateExclusive == other.isStateExclusive() &&
            this.stateMax == other.isStateMax() &&
            this.stateMin == other.isStateMin() &&
            this.stateNormal == other.isStateNormal() &&
            this.statePopUp == other.isStatePopUp() &&
            ((this.themeDisplay==null && other.getThemeDisplay()==null) || 
             (this.themeDisplay!=null &&
              this.themeDisplay.equals(other.getThemeDisplay()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            this.webDAVEnabled == other.isWebDAVEnabled();
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
        if (getURLBack() != null) {
            _hashCode += getURLBack().hashCode();
        }
        if (getURLClose() != null) {
            _hashCode += getURLClose().hashCode();
        }
        if (getURLConfiguration() != null) {
            _hashCode += getURLConfiguration().hashCode();
        }
        if (getURLConfigurationJS() != null) {
            _hashCode += getURLConfigurationJS().hashCode();
        }
        if (getURLEdit() != null) {
            _hashCode += getURLEdit().hashCode();
        }
        if (getURLEditDefaults() != null) {
            _hashCode += getURLEditDefaults().hashCode();
        }
        if (getURLEditGuest() != null) {
            _hashCode += getURLEditGuest().hashCode();
        }
        if (getURLExportImport() != null) {
            _hashCode += getURLExportImport().hashCode();
        }
        if (getURLHelp() != null) {
            _hashCode += getURLHelp().hashCode();
        }
        if (getURLMax() != null) {
            _hashCode += getURLMax().hashCode();
        }
        if (getURLMin() != null) {
            _hashCode += getURLMin().hashCode();
        }
        if (getURLPortlet() != null) {
            _hashCode += getURLPortlet().hashCode();
        }
        if (getURLPortletCss() != null) {
            _hashCode += getURLPortletCss().hashCode();
        }
        if (getURLPrint() != null) {
            _hashCode += getURLPrint().hashCode();
        }
        if (getURLRefresh() != null) {
            _hashCode += getURLRefresh().hashCode();
        }
        _hashCode += (isAccess() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getColumnCount();
        if (getColumnId() != null) {
            _hashCode += getColumnId().hashCode();
        }
        _hashCode += getColumnPos();
        if (getContent() != null) {
            _hashCode += getContent().hashCode();
        }
        if (getControlPanelCategory() != null) {
            _hashCode += getControlPanelCategory().hashCode();
        }
        if (getCustomCSSClassName() != null) {
            _hashCode += getCustomCSSClassName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += (isFocused() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getInstanceId() != null) {
            _hashCode += getInstanceId().hashCode();
        }
        _hashCode += (isModeAbout() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isModeConfig() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isModeEdit() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isModeEditDefaults() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isModeEditGuest() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isModeHelp() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isModePreview() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isModePrint() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isModeView() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getNamespace() != null) {
            _hashCode += getNamespace().hashCode();
        }
        if (getPortletName() != null) {
            _hashCode += getPortletName().hashCode();
        }
        if (getPortletSetup() != null) {
            _hashCode += getPortletSetup().hashCode();
        }
        if (getResourcePK() != null) {
            _hashCode += getResourcePK().hashCode();
        }
        _hashCode += (isRestoreCurrentView() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRootPortletId() != null) {
            _hashCode += getRootPortletId().hashCode();
        }
        _hashCode += (isShowBackIcon() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isShowCloseIcon() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isShowConfigurationIcon() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isShowEditDefaultsIcon() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isShowEditGuestIcon() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isShowEditIcon() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isShowExportImportIcon() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isShowHelpIcon() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isShowMaxIcon() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isShowMinIcon() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isShowMoveIcon() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isShowPortletCssIcon() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isShowPortletIcon() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isShowPrintIcon() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isShowRefreshIcon() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isStateExclusive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isStateMax() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isStateMin() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isStateNormal() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isStatePopUp() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getThemeDisplay() != null) {
            _hashCode += getThemeDisplay().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        _hashCode += (isWebDAVEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PortletDisplay.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://theme.portal.liferay.com", "PortletDisplay"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URLBack");
        elemField.setXmlName(new javax.xml.namespace.QName("", "URLBack"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URLClose");
        elemField.setXmlName(new javax.xml.namespace.QName("", "URLClose"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URLConfiguration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "URLConfiguration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URLConfigurationJS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "URLConfigurationJS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URLEdit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "URLEdit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URLEditDefaults");
        elemField.setXmlName(new javax.xml.namespace.QName("", "URLEditDefaults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URLEditGuest");
        elemField.setXmlName(new javax.xml.namespace.QName("", "URLEditGuest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URLExportImport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "URLExportImport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URLHelp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "URLHelp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URLMax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "URLMax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URLMin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "URLMin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URLPortlet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "URLPortlet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URLPortletCss");
        elemField.setXmlName(new javax.xml.namespace.QName("", "URLPortletCss"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URLPrint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "URLPrint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URLRefresh");
        elemField.setXmlName(new javax.xml.namespace.QName("", "URLRefresh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("access");
        elemField.setXmlName(new javax.xml.namespace.QName("", "access"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columnCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "columnCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columnId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "columnId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columnPos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "columnPos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content");
        elemField.setXmlName(new javax.xml.namespace.QName("", "content"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://util.kernel.portal.liferay.com", "StringBundler"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controlPanelCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "controlPanelCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customCSSClassName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customCSSClassName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("focused");
        elemField.setXmlName(new javax.xml.namespace.QName("", "focused"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instanceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instanceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modeAbout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modeAbout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modeConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modeConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modeEdit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modeEdit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modeEditDefaults");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modeEditDefaults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modeEditGuest");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modeEditGuest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modeHelp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modeHelp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modePreview");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modePreview"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modePrint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modePrint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modeView");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modeView"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("namespace");
        elemField.setXmlName(new javax.xml.namespace.QName("", "namespace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portletName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "portletName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portletSetup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "portletSetup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourcePK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resourcePK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restoreCurrentView");
        elemField.setXmlName(new javax.xml.namespace.QName("", "restoreCurrentView"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rootPortletId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rootPortletId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showBackIcon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showBackIcon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showCloseIcon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showCloseIcon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showConfigurationIcon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showConfigurationIcon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showEditDefaultsIcon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showEditDefaultsIcon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showEditGuestIcon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showEditGuestIcon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showEditIcon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showEditIcon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showExportImportIcon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showExportImportIcon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showHelpIcon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showHelpIcon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showMaxIcon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showMaxIcon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showMinIcon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showMinIcon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showMoveIcon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showMoveIcon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showPortletCssIcon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showPortletCssIcon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showPortletIcon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showPortletIcon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showPrintIcon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showPrintIcon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showRefreshIcon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showRefreshIcon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateExclusive");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stateExclusive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateMax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stateMax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateMin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stateMin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateNormal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stateNormal"));
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
        elemField.setFieldName("themeDisplay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "themeDisplay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://theme.portal.liferay.com", "ThemeDisplay"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webDAVEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "webDAVEnabled"));
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
