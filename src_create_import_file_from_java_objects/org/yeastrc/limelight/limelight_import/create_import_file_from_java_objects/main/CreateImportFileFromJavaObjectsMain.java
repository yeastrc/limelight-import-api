package org.yeastrc.limelight.limelight_import.create_import_file_from_java_objects.main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.yeastrc.limelight.limelight_import.api.xml_dto.LimelightInput;


/**
 * 
 *
 */
public class CreateImportFileFromJavaObjectsMain {
	
//	private static final Logger log = Logger.getLogger(CreateImportFileFromJavaObjectsMain.class);

	// private constructor
	private CreateImportFileFromJavaObjectsMain() { }
	
	public static CreateImportFileFromJavaObjectsMain getInstance() { 
		return new CreateImportFileFromJavaObjectsMain(); 
	}
	
	
	/**
	 * @param outputFile
	 * @param proxlInput
	 * @throws Exception
	 */
	public void createImportFileFromJavaObjectsMain( File outputFile, LimelightInput limelightInput ) throws Exception {
		

		OutputStream outputStream = null;
		
		try {

			outputStream = new FileOutputStream(outputFile);
			
			createImportFileFromJavaObjectsMain( outputStream, limelightInput );
		} finally {
			
			if ( outputStream != null ) {
				
				outputStream.close();
			}
		}
	}
	
	

	/**
	 * @param outputStream
	 * @param proxlInput
	 * @throws Exception
	 */
	public void createImportFileFromJavaObjectsMain( OutputStream outputStream, LimelightInput limelightInput ) throws Exception {
		
		JAXBContext jaxbContext = JAXBContext.newInstance( LimelightInput.class );

		Marshaller marshaller = jaxbContext.createMarshaller();


		marshaller.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE );

//		marshaller.setProperty( Marshaller.JAXB_ENCODING, CommonConstants.FILE_ENCODING );


		
		try {
			
			marshaller.marshal( limelightInput, outputStream );
			
		} finally {
			
		}
		
		
	}
}
