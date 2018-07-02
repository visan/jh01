import { NgModule } from '@angular/core';

import { Jh01SharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [Jh01SharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [Jh01SharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class Jh01SharedCommonModule {}
