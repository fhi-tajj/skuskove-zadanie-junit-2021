package sk.euba.fhi.tajj.desat;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Igor Banduric.
 */
public class BlizkoTest {

	private Blizko blizko; //FIXME

	@Test
	public void testDveTri() {
		assertEquals( true, blizko.blizko10( 12 ) );
		assertEquals( false, blizko.blizko10( 17 ) );
		assertEquals( true, blizko.blizko10( 19 ) );
		assertEquals( false, blizko.blizko10( 23 ) );
		assertEquals( true, blizko.blizko10( 38 ) );
		assertEquals( true, blizko.blizko10( 40 ) );
	}
}
