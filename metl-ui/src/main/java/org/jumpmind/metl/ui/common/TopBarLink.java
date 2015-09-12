package org.jumpmind.metl.ui.common;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.jumpmind.metl.ui.init.AppUI;

import com.vaadin.server.FontAwesome;
import com.vaadin.ui.UI;

@Target({java.lang.annotation.ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface TopBarLink {
    
    String id();
    
    String name();
    
    Class<? extends UI> uiClass() default AppUI.class;
    
    Category category() default Category.DESIGN;
    
    int menuOrder() default 10;
    
    boolean useAsDefault() default false;
    
    FontAwesome icon() default FontAwesome.ASTERISK;

}
