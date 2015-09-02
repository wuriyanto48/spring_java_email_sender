/*
 **********************************************************************
 **********************************************************************
 ** By Wuriyanto                                                     **
 ** EMAIL/FACEBOOK : wuriyanto48@yahoo.co.id  OR  Prince Wury        **
 ** WEBSITE : wuriyantoinformatika.blogspot.com                      **
 ** CITY : BANJARNEGARA CENTRAL JAVA INDONESIA                       **
 ** COMPUTER SCIENCE                                                 **
 ** MUHAMMADIYAH UNIVERSITY OF PURWOKERTO                            **
 ** NB:BEBAS DIDISTRIBUSIKAN UNTUK TUJUAN BELAJAR                    **      
 **                                                                  **
 **                                     JMAT.inc & Black Code Studio **
 **********************************************************************
 **********************************************************************

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wury.app.service;

import com.wury.app.model.EmailSenderModel;
import java.util.List;

/**
 *
 * @author WURI
 */
public interface EmailSenderModelService {

    void save(EmailSenderModel e);

    void update(EmailSenderModel e);

    void delete(int id);

    EmailSenderModel findOne(int id);

    List<EmailSenderModel> findAll();

}
