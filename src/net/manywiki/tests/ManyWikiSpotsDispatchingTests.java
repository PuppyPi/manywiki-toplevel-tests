package net.manywiki.tests;

import static rebound.testing.WidespreadTestingUtilities.*;
import static rebound.util.collections.BasicCollectionUtilities.*;
import static rebound.util.objectutil.BasicObjectUtilities.*;
import net.manywiki.ToplevelServletForManyWiki;
import net.manywiki.jee.actions.other.DefaultAction;
import net.manywiki.jee.actions.pub.Wiki_jsp;
import net.manywiki.jee.actions.pub.scripts.haddock_js;
import net.manywiki.jee.actions.pub.templates.def.haddock_css;
import org.junit.Test;

public class ManyWikiSpotsDispatchingTests
{
	@Test
	public void testManuals()
	{
		asrt(eq(ToplevelServletForManyWiki.getActionBeanClassAndViewResourcePathname("/"), pair(DefaultAction.class, "/")));
		asrt(eq(ToplevelServletForManyWiki.getActionBeanClassAndViewResourcePathname("/Wiki.jsp"), pair(Wiki_jsp.class, "/Wiki.jsp")));
		asrt(eq(ToplevelServletForManyWiki.getActionBeanClassAndViewResourcePathname("/scripts/haddock.js"), pair(haddock_js.class, "/scripts/haddock.js")));
		asrt(eq(ToplevelServletForManyWiki.getActionBeanClassAndViewResourcePathname("/templates/default/haddock.css"), pair(haddock_css.class, "/templates/default/haddock.css")));
	}
}
