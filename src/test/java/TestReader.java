import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests of XML reader
 * @author Mehwish

 */
public class TestReader {
    /**
     * Create dataSet with records from XML file
     */
    @Test
    public void testCreateAnimalsCollection() {
        // Arrange
        Reader reader = new Reader();
        // Act
        Data fetchedData = reader.readXmlFile("src/main/resources/bars.xml");
        double firstBarFett = fetchedData.getBars().get(0).getFett();
        String firstReviewScore = fetchedData.getReviews().get(0).getScore();
        // Assert
        assertEquals(19.57, firstBarFett);
        assertEquals("3", firstReviewScore);
    }
}
