package com.liferay.ide.portlet.core.operation;

import java.util.*;
import com.liferay.ide.portlet.core.operation.*;
import org.eclipse.jst.j2ee.internal.common.operations.*;

/*******************************************************************************
 * Copyright (c) 2000-2014 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 *******************************************************************************/
 
/**
 * @author Greg Amerson
 */
@SuppressWarnings({"restriction","unused"})
public class PortletTemplate implements INewPortletClassDataModelProperties
 {
  protected static String nl;
  public static synchronized PortletTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    PortletTemplate result = new PortletTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";";
  protected final String TEXT_3 = NL;
  protected final String TEXT_4 = NL + "import ";
  protected final String TEXT_5 = "/**" + NL + " * Portlet implementation class ";
  protected final String TEXT_6 = NL + " */";
  protected final String TEXT_7 = NL + "public ";
  protected final String TEXT_8 = "abstract ";
  protected final String TEXT_9 = "final ";
  protected final String TEXT_10 = "class ";
  protected final String TEXT_11 = " extends ";
  protected final String TEXT_12 = " implements ";
  protected final String TEXT_13 = ", ";
  protected final String TEXT_14 = " {";
  protected final String TEXT_15 = NL + NL + "    /**" + NL + "     * Default constructor. " + NL + "     */" + NL + "    public ";
  protected final String TEXT_16 = "() {" + NL + "    }";
  protected final String TEXT_17 = NL + "       " + NL + "    /**" + NL + "     * @see ";
  protected final String TEXT_18 = "#";
  protected final String TEXT_19 = "(";
  protected final String TEXT_20 = ")" + NL + "     */" + NL + "    public ";
  protected final String TEXT_21 = ") {" + NL + "        super(";
  protected final String TEXT_22 = ");" + NL + "    }";
  protected final String TEXT_23 = NL + NL + "\t/**" + NL + "     * @see ";
  protected final String TEXT_24 = " ";
  protected final String TEXT_25 = ") {" + NL + "        // TODO Auto-generated method stub";
  protected final String TEXT_26 = NL + "\t\t\treturn ";
  protected final String TEXT_27 = NL + "    }";
  protected final String TEXT_28 = NL + "    public void init() {";
  protected final String TEXT_29 = NL + "        aboutTemplate = getInitParameter(\"about-";
  protected final String TEXT_30 = "\");";
  protected final String TEXT_31 = NL + "        configTemplate = getInitParameter(\"config-";
  protected final String TEXT_32 = NL + "        editDefaultsTemplate = getInitParameter(\"edit-defaults-";
  protected final String TEXT_33 = NL + "        editGuestTemplate = getInitParameter(\"edit-guest-";
  protected final String TEXT_34 = NL + "        previewTemplate = getInitParameter(\"preview-";
  protected final String TEXT_35 = NL + "        printTemplate = getInitParameter(\"print-";
  protected final String TEXT_36 = NL + "        editTemplate = getInitParameter(\"edit-";
  protected final String TEXT_37 = NL + "        helpTemplate = getInitParameter(\"help-";
  protected final String TEXT_38 = NL + "        viewTemplate = getInitParameter(\"view-";
  protected final String TEXT_39 = NL + NL + "    public void destroy() {" + NL + "        super.destroy();" + NL + "    }";
  protected final String TEXT_40 = NL + NL + "    public void processAction(" + NL + "            ActionRequest actionRequest, ActionResponse actionResponse)" + NL + "        throws IOException, PortletException {" + NL + "" + NL + "        super.processAction(actionRequest, actionResponse);" + NL + "    }";
  protected final String TEXT_41 = NL + NL + "    public void serveResource(" + NL + "            ResourceRequest request, ResourceResponse response)" + NL + "        throws PortletException, IOException {" + NL + "" + NL + "        super.serveResource(request, response);" + NL + "    }";
  protected final String TEXT_42 = NL + NL + "    public void doAbout(" + NL + "            RenderRequest renderRequest, RenderResponse renderResponse)" + NL + "        throws IOException, PortletException {" + NL + "        " + NL + "        super.doAbout(renderRequest, renderResponse);" + NL + "    }";
  protected final String TEXT_43 = NL + NL + "    public void doConfig(" + NL + "            RenderRequest renderRequest, RenderResponse renderResponse)" + NL + "        throws IOException, PortletException {" + NL + "" + NL + "        super.doConfig(renderRequest, renderResponse);" + NL + "    }";
  protected final String TEXT_44 = NL + "    " + NL + "    public void doEdit(" + NL + "            RenderRequest renderRequest, RenderResponse renderResponse)" + NL + "        throws IOException, PortletException {" + NL + "" + NL + "        super.doEdit(renderRequest, renderResponse);" + NL + "    }";
  protected final String TEXT_45 = NL + "    " + NL + "    public void doEditDefaults(" + NL + "            RenderRequest renderRequest, RenderResponse renderResponse)" + NL + "        throws IOException, PortletException {" + NL + "" + NL + "        super.doEditDefaults(renderRequest, renderResponse);" + NL + "    }";
  protected final String TEXT_46 = NL + "    " + NL + "    public void doEditGuest(" + NL + "            RenderRequest renderRequest, RenderResponse renderResponse)" + NL + "        throws IOException, PortletException {" + NL + "        " + NL + "        super.doEditGuest(renderRequest, renderResponse);" + NL + "    }";
  protected final String TEXT_47 = NL + "    " + NL + "    public void doHelp(" + NL + "            RenderRequest renderRequest, RenderResponse renderResponse)" + NL + "        throws IOException, PortletException {" + NL + "" + NL + "        super.doHelp(renderRequest, renderResponse);" + NL + "    }";
  protected final String TEXT_48 = NL + NL + "    public void doPreview(" + NL + "            RenderRequest renderRequest, RenderResponse renderResponse)" + NL + "        throws IOException, PortletException {" + NL + "" + NL + "        super.doPreview(renderRequest, renderResponse);" + NL + "    }";
  protected final String TEXT_49 = NL + NL + "    public void doPrint(" + NL + "            RenderRequest renderRequest, RenderResponse renderResponse)" + NL + "        throws IOException, PortletException {" + NL + "" + NL + "        super.doPrint(renderRequest, renderResponse);" + NL + "    }";
  protected final String TEXT_50 = NL + "    " + NL + "    public void doView(" + NL + "            RenderRequest renderRequest, RenderResponse renderResponse)" + NL + "        throws IOException, PortletException {" + NL + "" + NL + "        super.doView(renderRequest, renderResponse);" + NL + "    }";
  protected final String TEXT_51 = NL + NL + "    public void doAbout(" + NL + "            RenderRequest renderRequest, RenderResponse renderResponse)" + NL + "        throws IOException, PortletException {" + NL + "" + NL + "        include(aboutTemplate, renderRequest, renderResponse);" + NL + "    }";
  protected final String TEXT_52 = NL + NL + "    public void doConfig(" + NL + "            RenderRequest renderRequest, RenderResponse renderResponse)" + NL + "        throws IOException, PortletException {" + NL + "" + NL + "        include(configTemplate, renderRequest, renderResponse);" + NL + "    }";
  protected final String TEXT_53 = NL + NL + "    public void doEdit(" + NL + "            RenderRequest renderRequest, RenderResponse renderResponse)" + NL + "        throws IOException, PortletException {" + NL + "" + NL + "        include(editTemplate, renderRequest, renderResponse);" + NL + "    }";
  protected final String TEXT_54 = NL + NL + "    public void doEditDefaults(" + NL + "            RenderRequest renderRequest, RenderResponse renderResponse)" + NL + "        throws IOException, PortletException {" + NL + "" + NL + "        if (renderRequest.getPreferences() == null) {" + NL + "            super.doEdit(renderRequest, renderResponse);" + NL + "        }" + NL + "        else {" + NL + "            include(editDefaultsTemplate, renderRequest, renderResponse);" + NL + "        }" + NL + "    }";
  protected final String TEXT_55 = NL + NL + "\tpublic void doEditGuest(" + NL + "            RenderRequest renderRequest, RenderResponse renderResponse)" + NL + "        throws IOException, PortletException {" + NL + "" + NL + "        if (renderRequest.getPreferences() == null) {" + NL + "            super.doEdit(renderRequest, renderResponse);" + NL + "        }" + NL + "        else {" + NL + "            include(editGuestTemplate, renderRequest, renderResponse);" + NL + "        }" + NL + "    }";
  protected final String TEXT_56 = NL + NL + "    public void doHelp(" + NL + "            RenderRequest renderRequest, RenderResponse renderResponse)" + NL + "        throws IOException, PortletException {" + NL + "" + NL + "        include(helpTemplate, renderRequest, renderResponse);" + NL + "    }";
  protected final String TEXT_57 = NL + NL + "    public void doPreview(" + NL + "            RenderRequest renderRequest, RenderResponse renderResponse)" + NL + "        throws IOException, PortletException {" + NL + "" + NL + "        include(previewTemplate, renderRequest, renderResponse);" + NL + "    }";
  protected final String TEXT_58 = NL + NL + "    public void doPrint(" + NL + "            RenderRequest renderRequest, RenderResponse renderResponse)" + NL + "        throws IOException, PortletException {" + NL + "" + NL + "        include(printTemplate, renderRequest, renderResponse);" + NL + "    }";
  protected final String TEXT_59 = NL + NL + "    public void doView(" + NL + "            RenderRequest renderRequest, RenderResponse renderResponse)" + NL + "        throws IOException, PortletException {" + NL + "" + NL + "        include(viewTemplate, renderRequest, renderResponse);" + NL + "    }";
  protected final String TEXT_60 = NL + NL + "    public void doEdit(" + NL + "            RenderRequest renderRequest, RenderResponse renderResponse)" + NL + "        throws IOException, PortletException {" + NL + "" + NL + "        include(editTemplate, renderRequest, renderResponse);" + NL + "    }";
  protected final String TEXT_61 = NL + NL + "    public void doHelp(" + NL + "            RenderRequest renderRequest, RenderResponse renderResponse)" + NL + "        throws IOException, PortletException {" + NL + "" + NL + "        include(helpTemplate, renderRequest, renderResponse);" + NL + "    }";
  protected final String TEXT_62 = NL + NL + "    public void doView(" + NL + "            RenderRequest renderRequest, RenderResponse renderResponse)" + NL + "        throws IOException, PortletException {" + NL + "" + NL + "        include(viewTemplate, renderRequest, renderResponse);" + NL + "    }";
  protected final String TEXT_63 = NL + NL + "    protected void include(" + NL + "            String path, RenderRequest renderRequest," + NL + "            RenderResponse renderResponse)" + NL + "        throws IOException, PortletException {" + NL + "" + NL + "        PortletRequestDispatcher portletRequestDispatcher =" + NL + "            getPortletContext().getRequestDispatcher(path);" + NL + "" + NL + "        if (portletRequestDispatcher == null) {" + NL + "            _log.error(path + \" is not a valid include\");" + NL + "        }" + NL + "        else {" + NL + "            portletRequestDispatcher.include(renderRequest, renderResponse);" + NL + "        }" + NL + "    }" + NL;
  protected final String TEXT_64 = NL + "    protected String aboutTemplate;";
  protected final String TEXT_65 = NL + "    protected String configTemplate;";
  protected final String TEXT_66 = NL + "    protected String editDefaultsTemplate;";
  protected final String TEXT_67 = NL + "    protected String editGuestTemplate;";
  protected final String TEXT_68 = NL + "    protected String previewTemplate;";
  protected final String TEXT_69 = NL + "    protected String printTemplate;";
  protected final String TEXT_70 = NL + "    protected String editTemplate;";
  protected final String TEXT_71 = NL + "    protected String helpTemplate;";
  protected final String TEXT_72 = NL + "    protected String viewTemplate;";
  protected final String TEXT_73 = NL + NL + "    private static Log _log = LogFactoryUtil.getLog(";
  protected final String TEXT_74 = ".class);";
  protected final String TEXT_75 = NL + NL + "}";

   public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     CreatePortletTemplateModel model = (CreatePortletTemplateModel) argument; 
    
	model.removeFlags(CreateJavaEEArtifactTemplateModel.FLAG_QUALIFIED_SUPERCLASS_NAME); 

    
	if (model.getJavaPackageName() != null && model.getJavaPackageName().length() > 0) {

    stringBuffer.append(TEXT_1);
    stringBuffer.append( model.getJavaPackageName() );
    stringBuffer.append(TEXT_2);
    
	}

    stringBuffer.append(TEXT_3);
     
	Collection<String> imports = model.getImports();
	for (String anImport : imports) { 

    stringBuffer.append(TEXT_4);
    stringBuffer.append( anImport );
    stringBuffer.append(TEXT_2);
     
	}

    stringBuffer.append(TEXT_3);
    stringBuffer.append(TEXT_3);
    stringBuffer.append(TEXT_5);
    stringBuffer.append( model.getClassName() );
    stringBuffer.append(TEXT_6);
    
	if (model.isPublic()) { 

    stringBuffer.append(TEXT_7);
     
	} 

	if (model.isAbstract()) { 

    stringBuffer.append(TEXT_8);
    
	}

	if (model.isFinal()) {

    stringBuffer.append(TEXT_9);
    
	}

    stringBuffer.append(TEXT_10);
    stringBuffer.append( model.getClassName() );
    
	String superClass = model.getSuperclassName();
 	if (superClass != null && superClass.length() > 0) {

    stringBuffer.append(TEXT_11);
    stringBuffer.append( superClass );
    
	}

	List<String> interfaces = model.getInterfaces(); 
 	if ( interfaces.size() > 0) { 

    stringBuffer.append(TEXT_12);
    
	}
	
 	for (int i = 0; i < interfaces.size(); i++) {
   		String INTERFACE = (String) interfaces.get(i);
   		if (i > 0) {

    stringBuffer.append(TEXT_13);
    
		}

    stringBuffer.append( INTERFACE );
    
	}

    stringBuffer.append(TEXT_14);
     
	if (!model.hasEmptySuperclassConstructor()) { 

    stringBuffer.append(TEXT_15);
    stringBuffer.append( model.getClassName() );
    stringBuffer.append(TEXT_16);
     
	} 

	if (model.shouldGenSuperclassConstructors()) {
		List<Constructor> constructors = model.getConstructors();
		for (Constructor constructor : constructors) {
			if (constructor.isPublic() || constructor.isProtected()) { 

    stringBuffer.append(TEXT_17);
    stringBuffer.append( model.getSuperclassName() );
    stringBuffer.append(TEXT_18);
    stringBuffer.append( model.getSuperclassName() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( constructor.getParamsForJavadoc() );
    stringBuffer.append(TEXT_20);
    stringBuffer.append( model.getClassName() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( constructor.getParamsForDeclaration() );
    stringBuffer.append(TEXT_21);
    stringBuffer.append( constructor.getParamsForCall() );
    stringBuffer.append(TEXT_22);
    
			} 
		} 
	} 

    
	if (model.shouldImplementAbstractMethods()) {
		for (Method method : model.getUnimplementedMethods()) { 

    stringBuffer.append(TEXT_23);
    stringBuffer.append( method.getContainingJavaClass() );
    stringBuffer.append(TEXT_18);
    stringBuffer.append( method.getName() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( method.getParamsForJavadoc() );
    stringBuffer.append(TEXT_20);
    stringBuffer.append( method.getReturnType() );
    stringBuffer.append(TEXT_24);
    stringBuffer.append( method.getName() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( method.getParamsForDeclaration() );
    stringBuffer.append(TEXT_25);
     
			String defaultReturnValue = method.getDefaultReturnValue();
			if (defaultReturnValue != null) { 

    stringBuffer.append(TEXT_26);
    stringBuffer.append( defaultReturnValue );
    stringBuffer.append(TEXT_2);
    
			} 

    stringBuffer.append(TEXT_27);
     
		}
	} 

    stringBuffer.append(TEXT_3);
      if (model.shouldGenerateOverride(INIT_OVERRIDE) && model.isLiferayPortletSuperclass()) {
    stringBuffer.append(TEXT_28);
          if (model.hasPortletMode(ABOUT_MODE)) {
    stringBuffer.append(TEXT_29);
    stringBuffer.append(model.getInitParameterName());
    stringBuffer.append(TEXT_30);
          } 
          if (model.hasPortletMode(CONFIG_MODE)) {
    stringBuffer.append(TEXT_31);
    stringBuffer.append(model.getInitParameterName());
    stringBuffer.append(TEXT_30);
          } 
          if (model.hasPortletMode(EDITDEFAULTS_MODE)) {
    stringBuffer.append(TEXT_32);
    stringBuffer.append(model.getInitParameterName());
    stringBuffer.append(TEXT_30);
          } 
          if (model.hasPortletMode(EDITGUEST_MODE)) {
    stringBuffer.append(TEXT_33);
    stringBuffer.append(model.getInitParameterName());
    stringBuffer.append(TEXT_30);
          } 
          if (model.hasPortletMode(PREVIEW_MODE)) {
    stringBuffer.append(TEXT_34);
    stringBuffer.append(model.getInitParameterName());
    stringBuffer.append(TEXT_30);
          } 
          if (model.hasPortletMode(PRINT_MODE)) {
    stringBuffer.append(TEXT_35);
    stringBuffer.append(model.getInitParameterName());
    stringBuffer.append(TEXT_30);
          }
          if (model.hasPortletMode(EDIT_MODE)) {
    stringBuffer.append(TEXT_36);
    stringBuffer.append(model.getInitParameterName());
    stringBuffer.append(TEXT_30);
          } 
          if (model.hasPortletMode(HELP_MODE)) {
    stringBuffer.append(TEXT_37);
    stringBuffer.append(model.getInitParameterName());
    stringBuffer.append(TEXT_30);
          } 
          if (model.hasPortletMode(VIEW_MODE)) {
    stringBuffer.append(TEXT_38);
    stringBuffer.append(model.getInitParameterName());
    stringBuffer.append(TEXT_30);
          }
    stringBuffer.append(TEXT_27);
      } else if (model.shouldGenerateOverride(INIT_OVERRIDE) && !model.isMVCPortletSuperclass()) {
    stringBuffer.append(TEXT_28);
          if (model.hasPortletMode(EDIT_MODE)) {
    stringBuffer.append(TEXT_36);
    stringBuffer.append(model.getInitParameterName());
    stringBuffer.append(TEXT_30);
          } 
          if (model.hasPortletMode(HELP_MODE)) {
    stringBuffer.append(TEXT_37);
    stringBuffer.append(model.getInitParameterName());
    stringBuffer.append(TEXT_30);
          } 
          if (model.hasPortletMode(VIEW_MODE)) {
    stringBuffer.append(TEXT_38);
    stringBuffer.append(model.getInitParameterName());
    stringBuffer.append(TEXT_30);
          }
    stringBuffer.append(TEXT_27);
      }
      if (model.shouldGenerateOverride(DESTROY_OVERRIDE)) { 
    stringBuffer.append(TEXT_39);
     } 
      if (model.shouldGenerateOverride(PROCESSACTION_OVERRIDE)) { 
    stringBuffer.append(TEXT_40);
      } 
      if (model.shouldGenerateOverride(SERVERESOURCE_OVERRIDE)) { 
    stringBuffer.append(TEXT_41);
     } 
      if (model.isMVCPortletSuperclass()) { 
      if (model.shouldGenerateOverride(DOABOUT_OVERRIDE)) { 
    stringBuffer.append(TEXT_42);
      } else if (model.shouldGenerateOverride(DOCONFIG_OVERRIDE)) { 
    stringBuffer.append(TEXT_43);
      } else if (model.shouldGenerateOverride(DOEDIT_OVERRIDE)) { 
    stringBuffer.append(TEXT_44);
      } else if (model.shouldGenerateOverride(DOEDITDEFAULTS_OVERRIDE)) { 
    stringBuffer.append(TEXT_45);
      } else if (model.shouldGenerateOverride(DOEDITGUEST_OVERRIDE)) { 
    stringBuffer.append(TEXT_46);
      } else if (model.shouldGenerateOverride(DOHELP_OVERRIDE)) { 
    stringBuffer.append(TEXT_47);
      } else if (model.shouldGenerateOverride(DOPREVIEW_OVERRIDE)) { 
    stringBuffer.append(TEXT_48);
      } else if (model.shouldGenerateOverride(DOPRINT_OVERRIDE)) { 
    stringBuffer.append(TEXT_49);
      } else if (model.shouldGenerateOverride(DOVIEW_OVERRIDE)) { 
    stringBuffer.append(TEXT_50);
      } 
      } else if (model.isLiferayPortletSuperclass()) {
      if (model.hasPortletMode(ABOUT_MODE)) { 
    stringBuffer.append(TEXT_51);
          model.setGenerateGenericInclude(true);
    }
    if (model.hasPortletMode(CONFIG_MODE)) { 
    stringBuffer.append(TEXT_52);
          model.setGenerateGenericInclude(true);
    }
    if (model.hasPortletMode(EDIT_MODE)) { 
    stringBuffer.append(TEXT_53);
          model.setGenerateGenericInclude(true);
    }
    if (model.hasPortletMode(EDITDEFAULTS_MODE)) { 
    stringBuffer.append(TEXT_54);
          model.setGenerateGenericInclude(true);
    }
    if (model.hasPortletMode(EDITGUEST_MODE)) { 
    stringBuffer.append(TEXT_55);
          model.setGenerateGenericInclude(true);
    }
    if (model.hasPortletMode(HELP_MODE)) { 
    stringBuffer.append(TEXT_56);
          model.setGenerateGenericInclude(true);
    }
    if (model.hasPortletMode(PREVIEW_MODE)) { 
    stringBuffer.append(TEXT_57);
          model.setGenerateGenericInclude(true);
    }
    if (model.hasPortletMode(PRINT_MODE)) { 
    stringBuffer.append(TEXT_58);
          model.setGenerateGenericInclude(true);
    }
    if (model.hasPortletMode(VIEW_MODE)) { 
    stringBuffer.append(TEXT_59);
      model.setGenerateGenericInclude(true);
    } 
      } else if (model.isGenericPortletSuperclass()) {
      if (model.hasPortletMode(EDIT_MODE)) { 
    stringBuffer.append(TEXT_60);
          model.setGenerateGenericInclude(true);
    } 
    if (model.hasPortletMode(HELP_MODE)) { 
    stringBuffer.append(TEXT_61);
          model.setGenerateGenericInclude(true);
    } 
    if (model.hasPortletMode(VIEW_MODE)) { 
    stringBuffer.append(TEXT_62);
          model.setGenerateGenericInclude(true);
    } 
      } 
      if (model.shouldGenerateGenericInclude()) {
    stringBuffer.append(TEXT_63);
      } 
      if (model.isLiferayPortletSuperclass()) {
          if (model.hasPortletMode(ABOUT_MODE)) {
    stringBuffer.append(TEXT_64);
          } 
          if (model.hasPortletMode(CONFIG_MODE)) {
    stringBuffer.append(TEXT_65);
          } 
          if (model.hasPortletMode(EDITDEFAULTS_MODE)) {
    stringBuffer.append(TEXT_66);
          } 
          if (model.hasPortletMode(EDITGUEST_MODE)) {
    stringBuffer.append(TEXT_67);
          } 
          if (model.hasPortletMode(PREVIEW_MODE)) {
    stringBuffer.append(TEXT_68);
          } 
          if (model.hasPortletMode(PRINT_MODE)) {
    stringBuffer.append(TEXT_69);
          }
      } 
    stringBuffer.append(TEXT_24);
      if (!model.isMVCPortletSuperclass()) {
          if (model.hasPortletMode(EDIT_MODE)) {
    stringBuffer.append(TEXT_70);
          } 
          if (model.hasPortletMode(HELP_MODE)) {
    stringBuffer.append(TEXT_71);
          } 
          if (model.hasPortletMode(VIEW_MODE)) {
    stringBuffer.append(TEXT_72);
          }
      }
      if (model.shouldGenerateGenericInclude()) { 
    stringBuffer.append(TEXT_73);
    stringBuffer.append(model.getClassName());
    stringBuffer.append(TEXT_74);
      } 
    stringBuffer.append(TEXT_75);
    stringBuffer.append(TEXT_3);
    return stringBuffer.toString();
  }
}